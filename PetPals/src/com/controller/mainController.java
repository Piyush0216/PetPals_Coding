package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dto.EventDto;
import com.exception.InvalidInputException;
import com.exception.InvalidPetAgeException;
import com.model.AdoptionEvent;
import com.model.Donation;
import com.model.Pets;
import com.service.AdoptionService;
import com.service.DonationService;

import com.service.PetPalsService;

public class mainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdoptionService adoptionService = new AdoptionService();
		DonationService donationService = new DonationService();
		PetPalsService petService = new PetPalsService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("\n------------Pet Pals-------------");
			
			System.out.println("Press 1. Add Pet");
			System.out.println("Press 2. Delete Pet  ");
			System.out.println("Press 3. View All Available Pets");
			System.out.println("Press 4. Make Donation");
			System.out.println("Press 5. View All Donations");
			System.out.println("Press 6. View All Adoption Events");
			System.out.println("Press 7. View Events and Participants");
			System.out.println("Press 0. To Exit");

			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting from PetPals");
				break;
			}

			switch (input) {

			case 1:
				Random random = new Random();
				int randomNumber = random.nextInt();
				int id = randomNumber < 0 ? randomNumber * -1 : randomNumber;

				System.out.println("Enter Name");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Enter Age");
				int age = sc.nextInt();

				System.out.println("Enter breed");
				String breed = sc.next();

				System.out.println("Enter Available for Adoption (Yes/ No) ");
				String available = sc.next();

				Pets pt = new Pets(id, name, age, breed, available);

				try {
					int status = petService.save(pt);
					if (status == 1)
						System.out.println(" Pet is Added Successfully");
					else
						System.out.println("Insert failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}catch (InvalidPetAgeException e) {
					System.out.println(e.getMessage());
				}
				break;
		
			case 2:
				try {
					List<Pets> list = petService.findAll();
					for (Pets p : list) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

				System.out.println("Enter Pet ID");
				int petid = sc.nextInt();

				try {
					petService.DeleteById(petid);
					System.out.println("Pet is Removed ");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}

				break;
		
			case 3:
				try {
					List<Pets> list = petService.findAllAvailable();
					for (Pets p : list) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				Random randomid = new Random();
				int randomNumberid = randomid.nextInt();
				int doid = randomNumberid < 0 ? randomNumberid * -1 : randomNumberid;

				System.out.println("Enter Donor Name");
				sc.nextLine();
				String donor = sc.nextLine();

				System.out.println("Enter amount");
				double amount = sc.nextDouble();

				try {
					List<Pets> list = petService.findAllAvailable();
					for (Pets p : list) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

				System.out.println("Enter pet Id");
				int petId = sc.nextInt();

				Donation donation = new Donation(doid, donor, amount, petId);

				try {
					int status = donationService.makeDonation(donation);
					if (status == 1)
						System.out.println("Donation Done Successfully");
					else
						System.out.println("Insert failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

				break;

			case 5:
				try {
					List<Donation> list = donationService.findAllDonation();
					for (Donation d : list) {
						System.out.println(d);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			break;

			case 6:
				try {
					List<AdoptionEvent> list = adoptionService.findAllEvent();
					for (AdoptionEvent d : list) {
						System.out.println(d);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			break;
			
		case 7:
				try {
					List<EventDto> list=adoptionService.getParticipation();
					
					for(EventDto e:list) {
						System.out.println(e);
					}
				}catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			break;
			}

		}
		sc.close();
	}
}
