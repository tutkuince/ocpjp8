package com.oracle.javacert.professional.chapter02._02functionalprogramming;

public class Tiger implements Sprint{

	@Override
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast!" + animal.toString());
	}

}
