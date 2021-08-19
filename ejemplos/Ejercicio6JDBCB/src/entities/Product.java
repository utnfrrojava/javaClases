package entities;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Product {
	final private String dateFormat="dd/MM/yyyy";
	final private String timeFormat="HH:mm:ss";
	final private String dateTimeFormat=dateFormat+" "+timeFormat;
	private int id;
	private String name;
	private String description;
	private double price;
	private int stock;
	private boolean shippingIncluded;
	private LocalDateTime disabledOn;
	private LocalDate disabledDate;
	private LocalTime disabledTime;
	private ZonedDateTime disabledOnZoned;
	
	public ZonedDateTime getDisabledOnZoned() {
		return disabledOnZoned;
	}
	public void setDisabledOnZoned(ZonedDateTime disabledOnZoned) {
		this.disabledOnZoned = disabledOnZoned;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isShippingIncluded() {
		return shippingIncluded;
	}
	public void setShippingIncluded(boolean shippingIncluded) {
		this.shippingIncluded = shippingIncluded;
	}	
	public LocalDateTime getDisabledOn() {
		return disabledOn;
	}
	public void setDisabledOn(LocalDateTime disabledOn) {
		this.disabledOn = disabledOn;
	}
	public LocalDate getDisabledDate() {
		return disabledDate;
	}
	public void setDisabledDate(LocalDate disabledDate) {
		this.disabledDate = disabledDate;
	}
	public LocalTime getDisabledTime() {
		return disabledTime;
	}
	public void setDisabledTime(LocalTime disabledTime) {
		this.disabledTime = disabledTime;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern(dateTimeFormat);
		DateTimeFormatter dFormat = DateTimeFormatter.ofPattern(dateFormat);
		DateTimeFormatter tFormat = DateTimeFormatter.ofPattern(timeFormat);
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", stock=" + stock+ ", shippingIncluded=" + shippingIncluded
				+ ", disabledOn=" + (disabledOn==null?null:disabledOn.format(dtFormat))
				+ ", disabledDate=" + (disabledDate==null?null:disabledDate.format(dFormat))
				+ ", disabledTime=" + (disabledTime==null?null:disabledTime.format(tFormat))
				+ ", disabledOnZoned=" + (disabledOnZoned==null?null:disabledOnZoned.format(dtFormat.withZone(ZoneId.of("UTC"))))+ "]\n";
	}
	
	

}
