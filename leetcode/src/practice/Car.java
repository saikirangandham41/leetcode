package practice;

public class Car {
	String name;
	String model;
	String company;
	Double rate;
	
	public Car(String name, String model, String company, Double rate) {
		this.name = name;
		this.model = model;
		this.company = company;
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
}
