// utils/Helper.java
package ch0.pack;

public class Cat {
	private String aName;

	public void sayName() {
		System.out.printf("I'm a Cat (%s), Meaow\n", aName);
	}

	public Cat(String pName) {
		aName = pName;
	}

}
