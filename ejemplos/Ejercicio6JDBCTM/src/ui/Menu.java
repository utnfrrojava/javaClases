package ui;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import data.DbHandler;
import entities.Product;

public class Menu {

	private Scanner scan;
	private DbHandler db=new DbHandler();
	private String dateFormat = "dd/MM/yyyy";
	private String timeFormat = "HH:mm:ss";
	private String dateTimeFormat = dateFormat + " "+timeFormat;
	public void start() {
		
		
		scan = new Scanner(System.in);

		// muestran las opciones y según que elija el usuario
		String rta="";

		do {
		rta=menu();	
		
			switch (rta) {
			case "list":
				list();
				break;
			case "search":
				search();
				break;
			case "new":
				newProduct();
				break;
			case "delete":
				delete();
				break;
			case "update":
				update();
				break;
			case "exit":
				System.out.println("Sore ja, mata ne, byebye");
				break;
			default:
				System.out.println("command not found...try again");
				break;
			}
		
		} while (!rta.equals("exit"));
		
		scan.close();
		
	}
	
	private void update() {
		Product updPrd = new Product();
		System.out.print("Input the id of the product to be modified: ");
		updPrd.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Current data: ");
		System.out.println(db.search(updPrd));
		
		loadData(updPrd);
		
		db.update(updPrd);
		
	}

	private void delete() {
		Product delPrd = new Product();
		System.out.println("Current products:");
		this.list();
		System.out.print("Input the id of the product to be deleted: ");
		delPrd.setId(Integer.parseInt(scan.nextLine()));
		db.delete(delPrd);
	}

	private void newProduct() {
		Product newPrd= new Product();
		
		System.out.println("Input new product data:");
		
		loadData(newPrd);
		
		db.newProduct(newPrd);
		
		System.out.println("The new product's id is: " + newPrd.getId());
		
	}

	private void loadData(Product prd) {
		System.out.print("Name: ");
		prd.setName(scan.nextLine());
		
		System.out.print("Description: ");
		prd.setDescription(scan.nextLine());
		
		System.out.print("Price: ");
		prd.setPrice(Double.parseDouble(scan.nextLine()));
		
		System.out.print("Stock: ");
		prd.setStock(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Include Shipping? (Y/N): ");
		prd.setShippingIncluded(scan.nextLine().trim().equalsIgnoreCase("Y"));
		
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern(dateTimeFormat);
		System.out.print("Disabled On ("+dateTimeFormat+"): ");
		prd.setDisabledOn(LocalDateTime.parse(scan.nextLine(), dtFormat) );
		
		DateTimeFormatter dFormat = DateTimeFormatter.ofPattern(dateFormat);
		System.out.print("Disabled Date ("+dateFormat+"): ");
		prd.setDisabledDate(LocalDate.parse(scan.nextLine(), dFormat) );
		
		DateTimeFormatter tFormat = DateTimeFormatter.ofPattern(timeFormat);
		System.out.print("Disabled Time ("+timeFormat+"): ");
		prd.setDisabledTime(LocalTime.parse(scan.nextLine(), tFormat) );
		
		System.out.print("Disabled On Zoned("+dateTimeFormat+"): ");
		prd.setDisabledOnZoned(ZonedDateTime.parse(scan.nextLine(), dtFormat.withZone(ZoneId.of("UTC-3"))) );
	}

	private String menu() {
		
		System.out.println("Input command: list/search/new/delete/update/exit");
		return scan.nextLine();
	}
	
	private void list() {
//		for(Product p: db.list()) {
//			System.out.println(p);
//		}
		System.out.println(db.list());
	}
	
	private void search() {
		Product p = new Product();
		System.out.print("Input search id: ");
		p.setId(Integer.parseInt(scan.nextLine()));
		Product prod=db.search(p);
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("404 - Not found");
		}
	}

}
