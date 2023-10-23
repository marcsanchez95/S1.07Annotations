package n2ex01;

import java.io.IOException;

public class N2ex01 {

	public static void main(String[] args) throws IllegalAccessException, IOException {
		
		Student student = new Student("Pepe", 22);
		
        try {
            JsonSerializer.serialize(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	}
