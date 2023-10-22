package n1ex02;

public class Worker {
	private String name;
	private String surname;
	protected final float pricePerHour = 9.72f;

	public float getPricePerHour() {
		return pricePerHour;
	}

	public float calculateSalary(float hours) {
		
		float salary = pricePerHour * hours;
	
		return salary;
	}
}
