package State_Pattern.Vending_machine;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(5);
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println(vendingMachine);

			System.out.print("Enter amount: ");
			int a = Integer.parseInt(scanner.nextLine());
			if(a < 0) break;
			boolean isSoldOut = vendingMachine.insertAmount(a);

			if(isSoldOut){
				System.out.print("\nRefill?(y/n): ");
				if(scanner.nextLine().equalsIgnoreCase("y")){
					System.out.print("Enter number of cold drinks: ");
					vendingMachine.refill(Integer.parseInt(scanner.nextLine()));
				}
			}
		}
	}
}
