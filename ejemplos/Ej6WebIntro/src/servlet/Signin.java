package servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Persona;
import logic.Login;

/**
 * Servlet implementation class Signin
 */
@WebServlet({ "/signin", "/SIGNIN", "/Signin", "/SignIn", "/signIn" })
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("get at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona per = new Persona();
		Login ctrl = new Login();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//validar email y password
		
		per.setEmail(email);
		per.setPassword(password);
		
		per=ctrl.validate(per);
		LinkedList<Persona> personas = ctrl.getAll();
		
		
		request.getSession().setAttribute("usuario", per);
		request.setAttribute("listaPersonas", personas);
		
		request.getRequestDispatcher("WEB-INF/UserManagement.jsp").forward(request, response);
		
	}

}
