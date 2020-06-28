package ui;

import entities.*;
import java.sql.*;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		
		// registrar el conector
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		recuperarTodos();
		
		recuperarPorParametro();

		insertarNuevo();
	}

	private static void recuperarTodos() {
		Connection conn = null;
		LinkedList<Persona> personas = new LinkedList<>();
		try {
			// crear una conexión
			conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/javaTest","java","himitsu");
			 //DriverManager.getConnection("jdbc:mysql://localhost/javaTest?user=java&password=himitsu");

			// ejecutar la query
            Statement stmt = conn.createStatement();
            ResultSet rs= stmt.executeQuery("select * from persona");

            // mapear de resultset a objeto
            while(rs.next()) {
            	Persona p=new Persona();
                Documento d=new Documento();
                p.setDocumento(d);

                p.setId(rs.getInt("id"));
                d.setNro(rs.getInt("nro_doc"));
                d.setTipo(rs.getString("tipo_doc"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setHabilitado(rs.getBoolean("estaHabilitado"));

                personas.add(p);

            }
            //cerrar recursos
            if(rs!=null){rs.close();}
            if(stmt!=null){stmt.close();}

		    conn.close();
		    
		    // mostrar info
		    System.out.println("Listado Completo");
		    System.out.println(personas);
		    System.out.println();System.out.println();

		} catch (SQLException ex) {
		    // Manejo de errores
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	private static void recuperarPorParametro() {
		Connection conn = null;
		
		try {
			// crear una conexión
			conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/javaTest","java","himitsu");

			// definir la query
            PreparedStatement stmt = conn.prepareStatement("select * from persona where id=?");
            
            // setear el/los parámetros
            stmt.setInt(1, 2);

            Persona p=new Persona();
            Documento d=new Documento();
            p.setDocumento(d);

            // ejecutar query y obtener resultados
            ResultSet rs= stmt.executeQuery();

            // mapear de resultset a objeto
            if(rs.next()) {
                p.setId(rs.getInt("id"));
                d.setNro(rs.getInt("nro_doc"));
                d.setTipo(rs.getString("tipo_doc"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setHabilitado(rs.getBoolean("estaHabilitado"));

            }
            //cerrar recursos
            if(rs!=null){rs.close();}
            if(stmt!=null){stmt.close();}

		    conn.close();
		    
		    // mostrar objeto
		    System.out.println("Buscar por id");
		    System.out.println(p);
		    System.out.println();System.out.println();

		} catch (SQLException ex) {
		    // Manejo de errores
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	private static void insertarNuevo() {
		Connection conn = null;
		Persona pIns= new Persona();
		Documento documento= new Documento();
		
		documento.setTipo("dni");
		documento.setNro(33333333);
		pIns.setDocumento(documento);
		
		pIns.setNombre("Someone");
		pIns.setApellido("Else");
		pIns.setHabilitado(true);
		
		try {
			// crear una conexión
			conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/javaTest","java","himitsu");

			// definir la query
            PreparedStatement pstmt = conn.prepareStatement(
            		"insert into persona(tipo_doc,nro_doc,nombre,apellido,estaHabilitado) values (?,?,?,?,?)"
            		,PreparedStatement.RETURN_GENERATED_KEYS
            		);
            
            
            pstmt.setString(1, pIns.getDocumento().getTipo());
            pstmt.setInt(2, pIns.getDocumento().getNro());
            pstmt.setString(3, pIns.getNombre());
            pstmt.setString(4, pIns.getApellido());
            pstmt.setBoolean(5, pIns.isHabilitado());
            
            pstmt.executeUpdate();
            
            ResultSet keyResultSet=pstmt.getGeneratedKeys();

            if(keyResultSet!=null && keyResultSet.next()) {
                    int id=keyResultSet.getInt(1);
                    System.out.println("ID: "+id);
                    pIns.setId(id);
            }


            if(keyResultSet!=null){keyResultSet.close();}
            if(pstmt!=null){pstmt.close();}

		    conn.close();
		    
		    // mostrar objeto
		    System.out.println("Nueva Persona");
		    System.out.println(pIns);
		    System.out.println();System.out.println();

		} catch (SQLException ex) {
		    // Manejo de errores
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
}
