package myapp;

/*
 * Students who work in this project:
 * 
 * Mohammed Alokaily 446104790
 * 
 * Jamal Adil Bawayan 446106464
 * 
 * Nasser Abdulaziz Alsahdhan 446105583
 */

public class Member {
	private int id;// Member attributes
	private String name;
	private int borrowedCount;
	private int numViewBorrowed;
	private int numBorrows;
	private int numReturns;
	private double sessionFees;
	public static double TotalRevenue;
	public static int TotalViewBorrowed;
	public static int TotalBorrows;
	public static int  TotalReturns;

	public Member(int id, String name, int borrowedCount) {// constructor
		this.id=id;
		this.name=name;
		this.borrowedCount=borrowedCount;


	}

	private boolean canBorrow() {// check if the user can borrow
		return borrowedCount<5;
	}

	private boolean canReturn() {// check if the user can return
		return borrowedCount>0;
	}

	public void viewBorrowedCount() {// shows how many books the user have
	System.out.printf("Hello %s          you have: %d books borrowed",this.name,this.borrowedCount);
		numViewBorrowed++;
		TotalViewBorrowed++;
	}

	public boolean borrowOne() {// simulating borrow 
		if (canBorrow()) {
			borrowedCount++;
			TotalBorrows++;
			sessionFees += 0.5;
			TotalRevenue += 0.5;
			numBorrows++;
			return true;
		} else {
			System.out.println("You can not borrow more than 5 books");
			
			return false;
		}
	}

	public boolean returnOne() {//simulating return
		if (canReturn()) {
			borrowedCount--;
			TotalReturns++;
			numReturns++;
			return true;
		} else {
			System.out.println("you do not have books to return");
			return false;}
		

	}

	public void displayStatics() {// to display stats
		System.out.println("You borrowed: "+this.numBorrows+" books\tand returnd: "+this.numReturns+" books\tand your fee is: "+this.sessionFees);


	}

	public void reset() {
		this.numBorrows=0;
		this.numReturns=0;
		this.numViewBorrowed =0;
		this.sessionFees=0;
		

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBorrowedCount() {
		return borrowedCount;
	}

	public void setBorrowedCount(int borrowedCount) {
		this.borrowedCount = borrowedCount;
	}

	public int getNumViewBorrowed() {
		return numViewBorrowed;
	}

	public void setNumViewBorrowed(int numViewBorrowed) {
		this.numViewBorrowed = numViewBorrowed;
	}

	public int getNumBorrows() {
		return numBorrows;
	}

	public void setNumBorrows(int numBorrows) {
		this.numBorrows = numBorrows;
	}

	public int getNumReturns() {
		return numReturns;
	}

	public void setNumReturns(int numReturns) {
		this.numReturns = numReturns;
	}

	public double getSessionFees() {
		return sessionFees;
	}

	public void setSessionFees(double sessionFees) {
		this.sessionFees = sessionFees;
	}
	 

}
