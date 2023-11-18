package com.section2.account;


abstract class Main  
{  
	  abstract void deposit(); 
	  abstract void withDraw();
	  abstract void checkBalance();
}  

//  ICICI Class
	class ICICI extends Main 
	{
		double iciciBalance=45000.0;
		void welcomeICICI() 
		{
			System.out.println("=&=& =&= &= &          Welcome to ICICI Bank               & =& =&= &==& ");
			System.out.println("       &=& =& =  \"We are there, for your every thought\"  = &= &=& ");
			System.out.println(" \t What transcation do you wish to do :\n\t 1-Deposit\n\t 2-WithDraw\n\t 3-Check Balance ");
			System.out.println("\tEnter your choice");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			int userICICI=mr1.nextInt();
			if(userICICI==1) {
				deposit();
			}else if(userICICI==2) {
				withDraw();
			}else if(userICICI==3) {
				checkBalance();
			}else {
				welcomeICICI();
			}
		}
		
		void deposit()
		{
			System.out.println(" === = == Enter the money you wish to deposit == = ===");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			double iciciDeposit=mr1.nextDouble();
			System.out.println("You Deposited :"+iciciDeposit);
			thankYou();
		}
		void withDraw()
		{
			System.out.println(" === = == Enter the money you wish to withdraw ===");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			double iciciWithDraw=mr1.nextDouble();
			System.out.println("You with draw :" +iciciWithDraw);
			thankYou();
	    } 
		void checkBalance()
		{
			System.out.println("Your Present Balance :"+ iciciBalance);
			thankYou();
		}
		void thankYou()
		{
			System.out.println();
			System.out.println("\t\t@=@=@=@=@   Hurry You Succesfully used ICICI Portal @=@=@=@=@ .");
			System.out.println("\t\t  @=@=@=@    Thank You for your Banking and time.   @=@=@=@ ");
			System.out.println("\t\t    @=@=@       Thank You for choosing us.          @=@=@ \n\t\t      @=@           Have a nice Day.       \t    @=@\n\t\t\t@             Visit Again.                  @");
		}
	}
	
// SBI Class
	class SBI extends Main
	{
		double sbiBalance=50000.0;
		void welcomeSBI() 
		{
			System.out.println("\t $=$= $=$ == $        Welcome to SBI             $ == $=$ =$=$ ");
			System.out.println("\t      =$= $= =  \"Pure Banking, Nothing Else\"!  = =$ =$= ");
			//ring name=userName;
			//stem.out.println("Your Name is :"+
			System.out.println(" \t What transcation do you wish to do :\n\t1-Deposit\n\t2-WithDraw\n\t3-Check Balance ");
			System.out.println("\tEnter your choice");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			int userSBIChoice=mr1.nextInt();
			if(userSBIChoice==1) {
				deposit();
			}else if(userSBIChoice==2) {
				withDraw();
			}else if(userSBIChoice==3) {
				checkBalance();
			}else {
				welcomeSBI();
			}
		}
		void deposit()
		{
			System.out.println(" === = == Enter the money you wish to deposit == = ===");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			double sbiDeposit=mr1.nextDouble();
			System.out.println("You Deposited :"+sbiDeposit);
			thankYou();
		}
		void withDraw()
		{
			System.out.println(" === = == Enter the money you wish to withdraw ===");
			java.util.Scanner r1=new java.util.Scanner(System.in);
			double sbiWithDraw=r1.nextDouble();
			System.out.println("You with draw :" +sbiWithDraw);
			thankYou();
	    } 
		void checkBalance()
		{
			
			System.out.println("Your Present Balance :"+ sbiBalance);
			thankYou();
			
		}
		void thankYou()
		{
			System.out.println();
			System.out.println("\t\t@=@=@=@=@   Hurry You Succesfully used SBI Portal   @=@=@=@=@ .");
			System.out.println("\t\t  @=@=@=@    Thank You for your Banking and time.   @=@=@=@ ");
			System.out.println("\t\t    @=@=@       Thank You for choosing us.          @=@=@ \n\t\t      @=@           Have a nice Day.       \t    @=@\n\t\t\t@             Visit Again.                  @");
		}
	}
	
// HDFC Class
	class HDFC extends Main
	{
		private static final String userName1 = null;
		double hdfcBalance=60000.0;
		void welcome()
		{
			System.out.println("\t #==# #=# == #       Welcome to HDFC           # == #=# #==# ");
			System.out.println("\t      =#= =# =  \"We Understand Your World!\"  = #= =#= ");
			System.out.println(" \t What transcation do you wish to do ? :\n\t1-Deposit\n\t2-WithDraw\n\t3-Check Balance ");
			System.out.println("\tEnter your choice : ");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			int userHDFCChoice=mr1.nextInt();
			if(userHDFCChoice==1)
			{
				deposit();
			}else if(userHDFCChoice==2)
			{
				withDraw();
			}else if(userHDFCChoice==3)
			{
				checkBalance();
			}else 
			{
				welcome();
			}
		}
		void deposit()
		{
			System.out.println(" === = == Enter the money you wish to deposit == = ===");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			double hdfcDeposit=mr1.nextDouble();
			System.out.println("You Deposited :"+hdfcDeposit);
			thankYou();
		}
		void withDraw()
		{
			System.out.println(" === = == Enter the money you wish to withdraw ===");
			java.util.Scanner r1=new java.util.Scanner(System.in);
			double sbiWithDraw=r1.nextDouble();
			System.out.println("You with draw :" +sbiWithDraw);
			thankYou();
	    } 
		void checkBalance()
		{
			
			System.out.println("Your Present Balance : "+ hdfcBalance);
			thankYou();
		}
		static void thankYou()
		{
			//String userName = null;
			//Number nu=new Number();
			//nu.userName;
			//nu.details();
			//userName1;
			//System.out.println("We hope " + userName );
			System.out.println("\t\t@=@=@=@=@   Hurry You Succesfully used HDFC Portal  @=@=@=@=@ .");
			System.out.println("\t\t  @=@=@=@    Thank You for your Banking and time.   @=@=@=@ ");
			System.out.println("\t\t    @=@=@       Thank You for choosing us.          @=@=@ \n\t\t      @=@           Have a nice Day.       \t    @=@\n\t\t\t@             Visit Again.                  @");
		}
	}
	
	class ATMChoice
	{
		void choice()
			{
			System.out.println();
				System.out.println("\tIn which branch ATM do you wish to do transcation");
				System.out.println(" \n\t 1 - ICICI\n\t 2 - SBI\n\t 3 - HDFC ");
				java.util.Scanner mr=new java.util.Scanner(System.in);
				int userChoice=mr.nextInt();
				if(userChoice==1) 
				{
					ICICI obj = new ICICI(); 
					 obj.welcomeICICI();
				}else if(userChoice==2)
				{
					SBI s=new SBI();
					s.welcomeSBI();
				}else if(userChoice==3)
				{
					HDFC h=new HDFC();
					h.welcome();
				}else 
				{
					System.err.println(" \t\t---- --- - Invalid Choice ! - -- --- ---- ");
					choice();
				
				}
	
	
			}
	}
	
	class Number extends UserDetails 
	{
		public Object userName;

		public static void phoneNumber()
		{
			System.out.println("\t Enter your valid 10 digit phone number : ");
			java.util.Scanner num=new java.util.Scanner(System.in);
			long userNumber=num.nextLong();


			int count=0;
			long userCheck=userNumber; 
			long userCheck2=userNumber;
			long firstDigit = 0;

				while(userCheck!=0) // To check if number contains 10 digit
			{
	  			count++;
	  			userCheck/=10;
			}

			if(count==10)
			{
					while(userNumber!=0)  // To Check Starting digit of the number
						{
							firstDigit=Math.abs(userNumber % 10);
							userNumber/=10;
						}

			}else if(count!=10)
			{  // If number does'nt contain 10 digit again the process continues by taking a 10 digit number
	  				System.out.println("   ==  \nPhone Number Entered Not Valid");
	  				System.out.println("  \t Enter Valid 10 digit Phone  Number Again -");
	  				phoneNumber();
			}

			
			if(firstDigit==9 || firstDigit==8|| firstDigit==7)
			{
				System.out.println("\t\t\t===========================================\t\t\t");
	  				System.out.println("\n Your entered number contains 10 digits and it starts with "+firstDigit+".\n\tSo, its valid India Regristration Number. ");
	  				System.out.println(" \t\n ==== Therefore ,Phone Number Validation Successfull. ==== \t");
	  				ATMChoice ac=new ATMChoice();
	  				ac.choice();
	  				
	  				
	  		}else
			{
	  				System.out.println(" \nEntered Number contains 10 digits but it does'nt start with\n 9 or 8 or 7 to confirm that number belongs to India Regristration.  ");
	  				System.out.println("\n");
	  				System.out.println("Enter Valid 10 digit Phone  Number Again -");
	  				phoneNumber();
			}

		}
		
	}

	class UserDetails
	{
		public static String userName1;
		String userName;
		void details()
		{
			this.userName=userName;
			System.out.println(" \t\tCreate Account First : ");
			System.out.println("\tEnter your name : ");
			java.util.Scanner mr2=new java.util.Scanner(System.in);
			String userName11=mr2.nextLine();
			String userName1=userName11;
			Number nu=new Number();
			nu.phoneNumber();
			
		}
	}
	
class ATM
{
	public static void main(String args[])
	{  
		System.out.println();
		System.out.println(" \t==== === == = Welcome To Online Banking ==== === == = ");
		UserDetails ud=new UserDetails();
		ud.details();
		
	 
	   
	} 
}
	 
