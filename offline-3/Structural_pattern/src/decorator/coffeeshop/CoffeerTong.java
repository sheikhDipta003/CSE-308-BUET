package decorator.coffeeshop;

import java.util.Scanner;

public class CoffeerTong {
 
	public static void main(String args[]) {
		Beverage [] bev_arr = new Beverage[4];
		Scanner scanner = new Scanner(System.in);
		int orderNo = 1;
		int quantity;
		double bill = 0.0;
		while(true){
			System.out.print("\nEnter quantity (0 if not required)\n");

			do{
				System.out.print("Americano : ");
				quantity = Integer.parseInt(scanner.nextLine());
				if(quantity < 0)	{System.out.print("Quantity cannot be negative.\n");}
				else break;
			}while(true);
			bev_arr[0] = (quantity == 0) ? null : new CoffeeBeans(new Americano(quantity));

			do{
				System.out.print("Espresso : ");
				quantity = Integer.parseInt(scanner.nextLine());
				if(quantity < 0)	{System.out.print("Quantity cannot be negative.\n");}
				else break;
			}while(true);
			bev_arr[1] = (quantity == 0) ? null : new DairyCream(new Espresso(quantity));

			do{
				System.out.print("Cappuccino : ");
				quantity = Integer.parseInt(scanner.nextLine());
				if(quantity < 0)	{System.out.print("Quantity cannot be negative.\n");}
				else break;
			}while(true);
			bev_arr[2] = (quantity == 0) ? null : new Cinnamon(new Cappuccino(quantity));

			do{
				System.out.print("Mocha : ");
				quantity = Integer.parseInt(scanner.nextLine());
				if(quantity < 0)	{System.out.print("Quantity cannot be negative.\n");}
				else break;
			}while(true);
			bev_arr[3] = (quantity == 0) ? null : new ChocolateSauce(new Mocha(quantity));

			//description
			System.out.print("\n<------------Order No. " + orderNo + "------------>\n");
			for(int i = 0; i < 4; i++){
				if(bev_arr[i] != null){
					System.out.print(bev_arr[i].getDescription() + "\n");
					bill += bev_arr[i].cost();
				}
			}
			System.out.print("Total price = " + bill + "\n\n");

			System.out.print("Place another order(y/n): ");
			if(scanner.nextLine().equalsIgnoreCase("n"))	break;
			orderNo++;
		}
	}
}
