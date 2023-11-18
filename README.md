# ATM
This repository provides a Java-based ATM program that incorporates the principles of inheritance to generate a basic ATM user interface that makes it possible to deposit, 
withdraw, and check the balance for three banks: ICICI, SBI, and HDFC.

This repository provides a Java-based ATM program that incorporates the principles of inheritance to generate a basic ATM user interface that makes it possible to deposit, withdraw, and check the balance for three banks: ICICI, SBI, and HDFC.

Features:
  * This system leverages Java inheritance to construct a hierarchical structure for bank classes (ICICI, SBI, HDFC).
  * User identity is affirmed by prompting the user for a name and then validating a 10-digit phone number.
  * The user can choose one of the presented banks (ICICI, SBI, HDFC) to proceed with transactions.
  * Options to make deposits, check balance, or withdrawal for the chosen bank are available.
  * Various balance totals are maintained for each bank (dummy balances).
  * After a successful transaction completion, a thank you message is displayed.

Implementation:
  * The program starts by prompting the user for their name and a 10-digit phone number for authentication.
  * Upon successful identification, the user is provided various banking options (ICICI, SBI, HDFC).
  * Using inheritance, the program navigates to the chosen bank class to conduct transactions.
  * Within each bank class, options to make deposits, check balance, or withdrawals are displayed, as inherited from the base class.
  * For deposits and withdrawals, the user is asked to provide the relevant transaction amount, before executing it with the inherited methods.
  * Checking the balance simply displays a dummy balance amount inherited by the chosen bank from the base class.
  * Once any transaction is finished, a thank you message is displayed.
  
How to Use:
  * Download the relevant repository to your local machine.
  * Confirm you have a Java Development Kit (JDK) installed.
  * Compile and run the main ATM program using an IDE or command line.
  * Follow the on-screen prompts to interact with the ATM interface.
  
Note:
  This program is a demonstration of Java inheritance concepts used to develop a basic ATM simulation. It does not incorporate genuine banking 
  operations or follow real-world security protocols. This repository is meant for educational purposes only.

 Contributor:
    Name: Manish J R
    Email: manishjr26@gmail.com
    
Submissions, reactions, and refinements to advance the execution and organization of this ATM program are invited and supported.
