package n1ex01;

public class OnSiteWorker extends Worker {
	private String name;
	private String surname;	
	static float fuel = 200.5f;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public OnSiteWorker(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;		
	}


	@Override
	public float calculateSalary(float hours) {
	
		return super.calculateSalary(hours)+(fuel);
	}


	
}