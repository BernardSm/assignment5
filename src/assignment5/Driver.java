package assignment5;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		GiftList linkedlist = new GiftList();
		GiftBasket g;
		Scanner in = new Scanner(System.in);
		int id;
		String type;
		float cost;
		
		int i = 0;
		while(i<3) {
			
			System.out.println("Please enter a giftbasket id");
			id = in.nextInt();
			System.out.println("Please enter the type of giftbasket");
			type = in.next();
			System.out.println("Please enter cost of giftbasket");
			cost = in.nextFloat();
			
			g = new GiftBasket(id, type, cost);
			linkedlist.addGiftBasketToEnd(g);
			i++;
		}
		in.close();
		linkedlist.showAllGiftBaskets();

	}

}
