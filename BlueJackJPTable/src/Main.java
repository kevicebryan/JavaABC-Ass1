import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BJ - JPTable");
		Integer choice = -1;
		do {
			System.out.println("1. Start the Simulation!");
			System.out.println("2. Close App");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			scan.nextLine();
			if (choice == 1) {
				
				Integer first = 0;
				do {
					System.out.println("Input 1st num [1-100]");
					first = scan.nextInt();
					scan.nextLine();
				}while(first > 100 || first < 1);
				
				Integer second = 0;
				do {
					System.out.println("Input 2nd num [1-100]");
					second = scan.nextInt();
					scan.nextLine();
				}while(second > 100 || second < 1);
				
				String firstS = first.toString();
				String secondS = second.toString();
				System.out.println("========================================");
				System.out.println("String: "+firstS+" "+secondS);
				System.out.printf("Char: %c %c\n", first, second);
				System.out.printf("Int: %d\n", first*second);
				System.out.printf("Float: %.3f\n", (first.floatValue()/second.floatValue()));
				System.out.println("Bool: "+(first == second));
				System.out.println("========================================");
				System.out.println("Press enter to continue....");scan.nextLine();
				System.out.println("========================================");
				System.out.println("+: "+(first+second));
				System.out.println("-: "+(first-second));
				System.out.println("*: "+(first*second));
				System.out.println("/: "+(first/second));
				System.out.println("%: "+(first%second));
				System.out.println("========================================");
				System.out.println("Press enter to continue....");scan.nextLine();
				
				
				boolean p1 = false;
				boolean p2 = false;
				boolean validbool1 = false;
				boolean validbool2 = false;
				do {
					System.out.println("Give me value for p1 [true|false]: ");
					try{
						validbool1 = true;
						p1 = scan.nextBoolean();
						scan.nextLine();
					}catch(Exception e) {
						scan.nextLine();
						System.out.println("Input must be true or false");
						validbool1 = false;
					}
				}while(!validbool1);
				do {
					System.out.println("Give me value for p2 [true|false]: ");
					try{
						validbool2 = true;
						p2 = scan.nextBoolean();
						scan.nextLine();
					}catch(Exception e) {
						scan.nextLine();
						System.out.println("Input must be true or false");
						validbool2 = false;
					}
				}while(!validbool2);
				char p1c, p2c;
				if(p1) {
					p1c = 'T';
				}else {
					p1c = 'F';
				}
				if(p2) {
					p2c = 'T';
				}else {
					p2c = 'F';
				}
				System.out.println("=======================================================");
				System.out.println("P1 = "+p1c+" , P2 = "+p2c);
				System.out.println("=======================================================");
				System.out.print("!P1 = " +(!p1));
				System.out.print("  !P2 = " +(!p2));
				System.out.print("  &&  = " +(p1&&p2));
				System.out.println("  ||  = " +(p1||p2));
				System.out.println("=======================================================");
			}else if (choice == 2) {
				System.out.println("Thank you for using the apps!!");
			}else {
				System.out.println("Wrong Input Bro!");
			}
		}while( choice != 2);
	}

}
