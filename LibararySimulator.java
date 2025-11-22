package Libarary;

import java.util.Scanner;

public class LibararySimulator {

	public static void main(String[] args) {
		/*
		 * Students who work in this project:
		 * 
		 * Group C
		 * 
		 * Mohammed Alokaily 446104790
		 * 
		 * Jamal Adil Bawayan 446106464
		 * 
		 * Nasser Abdulaziz Alsahdhan 446105583
		 */

		Scanner input = new Scanner(System.in);

		final double CreditFee = 0.5;

		final String user1NAME = "Mohammed"; // defining every user ID Name borrow return
		final int user1ID = 12345;
		int user1Books = 0;
		int user1Borrow = 0, user1Return = 0;//to use in show stats

		final String user2NAME = "Jamal";
		final int user2ID = 54321;
		int user2Books = 5;
		int user2Borrow = 0, user2Return = 0;

		final String user3NAME = "Nasser";
		final int user3ID = 51234;
		int user3Books = 3;
		int user3Borrow = 0, user3Return = 0;

		int TotalBorrow = 0;//to use it in admin
		int TotalReturn = 0;

		boolean isvalid = true;// to put in the loop if false shutdown the program

		System.out.println("Welcom to ksu digital library");

		while (isvalid) {

			System.out.printf("Menu: %n 1.login as an user %n 2.login as an admin %n 3.Exit %n");// Main menu
			System.out.print("Please select the operation number: ");
			String MenuSelection = input.nextLine();

			if (MenuSelection.equals("1")) {// to login as a user

				System.out.printf("%nUseres menu :%n 1.user1: %s %d %n 2.user2: %s    %d %n 3.user3: %s   %d %n",
						user1NAME, user1ID, user2NAME, user2ID, user3NAME, user3ID);// Users menu
				System.out.print(" select the user number please : ");

				String UserSelection = input.nextLine();

				if (UserSelection.equals("1")) {// Operations for user1
					System.out.printf("%nHello %s    you have: %d books borrowed ", user1NAME, user1Books);

					while (isvalid) {// To ask the user1 what operation he wants until he exit

						System.out.println("\n Operations: \n1.Borrow \n2.Retuen\n3.Show session stats\n4.Exit");
						System.out.print("select the operation number please: ");
						String OperationSelection = input.nextLine();

						if (OperationSelection.equals("1")) {// Borrow
							if (user1Books >= 5)// To show the user he cant borrow more than 5

								System.out.println("you can not borrow more than 5 books");

							else {
								++user1Books;// to count how many he borrow and  to show in stats
								++user1Borrow;
								++TotalBorrow;// to count total borrow to use in admin

							}
						} else if (OperationSelection.equals("2")) {// Return
							if (user1Books == 0)// he cant return if he has nothing
								System.out.println("You do not have books to return");

							else {
								--user1Books;
								++user1Return;// to count how many he return and  to show in stats
								++TotalReturn;// to count total return to use in admin 

							}
						} else if (OperationSelection.equals("3"))//to show stats for user 1
							System.out.println("you borrowed:" + user1Borrow + " books" + "\t and returned:  "
									+ user1Return + " books" + " \tand your fee is: " + CreditFee * user1Borrow);

						else if (OperationSelection.equals("4")) {//Exit to main menu
							System.out.println();
							break;
						} else
							System.out.println("enter an integer number between 1 & 4 ");// if the user enter an invalid num or ch
					}

				}

				else if (UserSelection.equals("2")) {// same user1 operations but for user2
					System.out.printf("%nHello %s    you have: %d books borrowed ", user2NAME, user2Books);

					while (isvalid) {

						System.out.println("\n Operations: \n1.Borrow \n2.Retuen\n3.Show session stats\n4.Exit");
						System.out.print("select the operation number please: ");
						String OperationSelection = input.nextLine();

						if (OperationSelection.equals("1")) {
							if (user2Books >= 5)
								System.out.println("you can not borrow more than 5 books");

							else {
								++user2Books;
								++user2Borrow;
								++TotalBorrow;

							}
						} else if (OperationSelection.equals("2")) {
							if (user2Books == 0)
								System.out.println("You do not have books to return");

							else {
								--user2Books;
								++user2Return;
								++TotalReturn;

							}
						} else if (OperationSelection.equals("3")) {
							System.out.println("you borrowed:" + user2Borrow + " books" + "\t and returned:  "
									+ user2Return + " books" + " \tand your fee is: " + CreditFee * user2Borrow);

						} else if (OperationSelection.equals("4")) {
							System.out.println();
							break;
						} else
							System.out.println("Enter an integer number between 1 & 4 ");// if invalid num or ch for user2

					}

				}

				else if (UserSelection.equals("3")) {// same user1&2 operations but for user3
					System.out.printf("%nHello %s    you have: %d books borrowed ", user3NAME, user3Books);

					while (isvalid) {

						System.out.println("\n Operations \n1.Borrow \n2.Retuen\n3.Show session stats\n4.Exit");
						System.out.print("select the operation number please: ");
						String OperationSelection = input.nextLine();

						if (OperationSelection.equals("1")) {
							if (user3Books >= 5)
								System.out.println("you can not borrow more than 5 books");

							else {
								++user3Books;
								++user3Borrow;
								++TotalBorrow;

							}
						} else if (OperationSelection.equals("2")) {
							if (user3Books == 0) {
								System.out.println("You do not have books to return");
								continue;
							} else {
								--user3Books;
								++user3Return;
								++TotalReturn;

							}
						} else if (OperationSelection.equals("3"))
							System.out.println("you borrowed:" + user3Borrow + " books" + "\t and returned:  "
									+ user3Return + " books" + " \tand your fee is: " + CreditFee * user3Borrow);

						else if (OperationSelection.equals("4")) {
							System.out.println();
							break;
						} else
							System.out.println("Enter an integer number between 1 & 4 ");// if invalid num or ch for user3
					}

				} else
					System.out.println("Enter a user number\n ");
			} else if (MenuSelection.equals("2")) {// to login as admin

				while (isvalid) {
					System.out
							.println("\n Operations:\n 1.Show most frequent operation \n 2.View total revenue \n 3.Exit");
					System.out.print("Please select operation number:");
					String OperationSelection = input.nextLine();
					if (OperationSelection.equals("1")) {// to show most frequent operation
						if (TotalBorrow > TotalReturn)
							System.out.println("Most frequent operation is borrow : " + TotalBorrow + " books \n");
						else if (TotalBorrow < TotalReturn)
							System.out.println("Most frequent operation is return : " + TotalReturn + " books \n");
						else
							System.out.println("Borrow and retuen are equal :  " + TotalBorrow + " books each \n");

					} else if (OperationSelection.equals("2")) {// to show total revenue
						System.out.println("Toatal revenue = " + TotalBorrow * CreditFee);
						
					} else if (OperationSelection.equals("3")) {//Exit to main menu
						System.out.println();
						break;
					} else
						System.out.println("Enter an integer number between 1 & 3 ");//if the user enter an invalid num or ch in admin menu
				}
			} else if (MenuSelection.equals("3"))//Exit the program
				isvalid = false;//Shutdown program
			else
				System.out.println("enter an integer number between 1 & 3 \n");//if the user enter an invalid num or ch in main menu

		}

		input.close();// closing the Scanner
	}
}
