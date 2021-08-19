package ui;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

import data.DbProduct;
import entities.Product;

public class Menu {
	
	private String dateFormat ="dd/MM/yyyy";
	private String timeFormat ="HH:mm:ss";
	private String dateTimeFormat = dateFormat+" "+timeFormat;
	
	Scanner scan = new Scanner(System.in);
	DbProduct db= new DbProduct();
	public void start() {
		String rta=null;
		do {
			rta=inputCommand();
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
			case "update":
				update();
				break;
			case "delete":
				delete();
				break;
			case "exit":
				close();
				break;
			default:
				System.out.println("Invalid command try again.");
				break;
			}
			
		} while (!rta.equals("exit"));
	}

	private void update() {
		Product updPrd = new Product();
		
		System.out.print("Input the if of the Product to be modified: ");
		updPrd.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Product "+ updPrd.getId() + " current data:");
		System.out.println(db.search(updPrd));
		System.out.println();
		System.out.println();
		this.loadData(updPrd);
		
		db.update(updPrd);
		
		System.out.println();
		System.out.println(updPrd);
	}

	private void delete() {
		Product delPrd = new Product();
		
		System.out.println("Current products:");
		this.list();
		System.out.println();
		System.out.println();
		System.out.print("Input to be deleted Product's id: ");
		
		delPrd.setId(Integer.parseInt(scan.nextLine()));
		
		db.delete(delPrd);
	}

	private void newProduct() {
	    Product newPrd = new Product();
		
	    System.out.println("New product data: ");
	    
	    this.loadData(newPrd);
	    
	    db.newProduct(newPrd);
	    
	    System.out.print("Generated id: ");
	    System.out.println(newPrd.getId());
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
	    
	    System.out.print("Is shipping included (Y/N): ");
	    prd.setShippingIncluded(scan.nextLine().trim().equalsIgnoreCase("Y"));
	    
	    System.out.print("Disabled on: ");
	    DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern(dateTimeFormat);
	    prd.setDisabledOn(LocalDateTime.parse(scan.nextLine(),dtFormat));
	    
	    System.out.print("Disabled date: ");
	    DateTimeFormatter dFormat = DateTimeFormatter.ofPattern(dateFormat);
	    prd.setDisabledDate(LocalDate.parse(scan.nextLine(),dFormat));
	    
	    System.out.print("Disabled time: ");
	    DateTimeFormatter tFormat = DateTimeFormatter.ofPattern(timeFormat);
	    prd.setDisabledTime(LocalTime.parse(scan.nextLine(),tFormat));
	    
	    System.out.print("Disabled on zoned: ");
	    prd.setDisabledOnZoned(ZonedDateTime.parse(scan.nextLine(),dtFormat.withZone(ZoneId.of("UTC-3"))));
	}

	private String inputCommand() {
		System.out.println("Please insert the command (list/search/new/update/delete/exit):");
		return scan.nextLine();
	}
	
	private void list() {
		System.out.println(db.list());
//		LinkedList<Product> prods = db.list();
//		for(Product p: prods) {
//			System.out.println(p);
//		}
	}
	
	private void search() {
		System.out.print("Insert seach id: ");
		Product searchPrd = new Product();
		searchPrd.setId(Integer.parseInt(scan.nextLine()));
		System.out.println(db.search(searchPrd));
	}
	
	
	private void close() {
		scan.close();
		System.out.println("Sore ja, mata ne, byebye");
	}
}
