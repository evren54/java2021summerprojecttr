package day40_Overriding02;

public class Arac {

	
	
	private String renk;
	private double  motor;
	protected String  model;
	public Arac(String renk, double motor, String model) {
		setModel(model);
		setMotor(motor);
		setRenk(renk);
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	
	
}
