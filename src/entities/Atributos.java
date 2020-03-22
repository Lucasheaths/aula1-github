package entities;

import java.util.Locale;
import java.util.Scanner;

public class Atributos {

	String name;
	int number;
	double value;

	public Atributos(String name, int number, double value) {
		this.name = name;
		this.number = number;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}