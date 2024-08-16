package edu.kec.covid;

import java.util.Random;
import java.util.Scanner;

import edu.kec.covid.model.Patient;

public class Covid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Patient patient = new Patient();

		System.out.println("Enter name:");
		String name = scanner.nextLine();

		System.out.println("Enter AadhaarId:");
		Long aadhaarId = scanner.nextLong();

		System.out.println("Enter Latitude:");
		Double latitude = scanner.nextDouble();

		System.out.println("Enter Longitude:");
		Double longitude = scanner.nextDouble();

		Random random = new Random();
		boolean ispositive = (random.nextInt(1, 10) > 5) ? true : false;

		if (ispositive) {
			System.out.println("Positive");
		} else {
			System.out.println("negative");
		}

	}

}
