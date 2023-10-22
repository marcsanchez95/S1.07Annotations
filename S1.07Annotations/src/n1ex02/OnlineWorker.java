package n1ex02;

public class OnlineWorker extends Worker {
	private String name;
	private String surname;
	static float internet = 50.6f;
	

	public String getName() {
		return name;
	}
	@Deprecated
	public String getName2() {
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

	public OnlineWorker(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		
	}

	@Override
	public float calculateSalary(float hours) {
		
		return super.calculateSalary(hours)+(internet);
	}

}
