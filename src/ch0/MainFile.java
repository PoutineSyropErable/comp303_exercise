package ch0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// MainFile.java
import ch0.utils.Helper;
import ch0.pack.*;

public class MainFile {
	public static void main(String[] args) {
		Helper.sayHello();
		int result = Helper.multiply(4, 5);
		System.out.println("Result: " + result);

		Dog.bark();
		System.out.println("New shit2");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter your name: ");
			String name = reader.readLine(); // Reads a full line of text
			System.out.println("Hello, " + name + "!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
