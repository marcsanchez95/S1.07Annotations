package n2ex01;
// cambiar el path on es vulgui guardar l'archiu a un valid.
@JsonSerialize(directory = "C:\\Users\\marcs\\git\\S1.07Annotations\\S1.07Annotations\\src\\n2ex01")
public class Student {	
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
