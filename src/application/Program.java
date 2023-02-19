package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dept = new Department(1, "IT");
		System.out.println(dept);
		
		Seller seller = new Seller(20, "John", "john@gmail.com", new Date(), 3500.0, dept);
		System.out.println(seller);

	}

}
