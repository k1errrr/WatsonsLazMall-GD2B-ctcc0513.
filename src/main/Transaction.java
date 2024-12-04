package main;

import java.util.Scanner;

public class Transaction extends Operations {

	Transaction(){

		askOrder();
	}

	// Scanner for user input
	Scanner scan = new Scanner(System.in);
	// Arrays to store product names and prices
	private String drinks[] = {"Sprite", "Coke", "Royal", "Mogu2x", "SmartC", "Water","Coffee", "Cobra"};
	private float drinksPrice[] = {20.25f,20.25f,20.25f,45.50f,30.75f,10.25f,25.75f,30.00f};
	private float drinksLPrice[] = {75.25f,75.25f,75.25f,100.00f,80.75f,25.75f,50.75f,50.75f};

	private String snacks[] = {"Pillows", "Overload", "DingDong", "Fita", "Loaded", "Tattoos", "Chippy", "Piatoss"};
	private float snacksPrice[] = {12.75f, 12.75f, 12.75f, 10.75f, 15.75f, 20.75f, 18.75f, 18.75f};
	private float snacksLPrice[] = {20.50f, 20.50f, 22.50f, 25.25f, 30.25f, 32.25f, 36.25f, 36.25f};

	private String supplies[] = {"Paper", "Ballpen", "Pencil" ,"Bond Paper", "Envelope", "Crayon"};
	private float suppliesPrice[] = {10, 17, 10, 2, 14, 20}; 
	private float suppliesLPrice[] = {0, 0, 0, 3, 18, 32}; 

	// Arrays to store load names and prices
	private String promoLoadSmart[] = {"Giga 50", "Giga 99", "All Out 200", "Ultra 500"};
	private float promoLoadPriceSmart[] = {55, 105,220,520};

	private String promoLoadGlobe[] = {"Go 75", "GoGo 149", "GoGoGo 229", "Go= Max 349"};
	private float promoLoadPriceGlobe[] = {80.75f, 160.75f,245.00f,370.00f};

	// Method to handle the order process
	void askOrder() {
		System.out.println("Good Day customer, select the product you would like to buy.");
		// Loop to allow the user to buy multiple products
		do {
			// Prompt user to select a product category
			System.out.println("\nDrinks, Snacks, Supplies, and Load.");
			System.out.print("\nSelect Product : ");
			String category = scan.nextLine();

			// Handling different product categories
			if(category.equalsIgnoreCase("Drinks"))
			{
				System.out.println("\nHere are the available drinks.");

				for(int i = 0; i < drinks.length; i++)
				{
					System.out.print((drinks[i]) + "           ");
				}

				System.out.println();

				for(int i = 0; i < drinksPrice.length; i++) {

					System.out.print((drinksPrice[i]) + "s/" + (drinksLPrice[i]) + "l" + "   ");
				}

				System.out.print("\n\nSelect a drink : ");
				typeOfProduct = scan.nextLine();
				boolean productValid = false;

				for(int j = 0; j <drinks.length; j++)
				{
					if(typeOfProduct.equalsIgnoreCase(drinks[j]))
					{
						System.out.print("Small or Large : ");
						size = scan.nextLine();

						if(size.equalsIgnoreCase("Small"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *= drinksPrice[j];
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else if(size.equalsIgnoreCase("Large"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *= drinksLPrice[j];
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else
						{
							System.out.println("\nInvalid Size!!!");
							productValid = true;
							break;
						}
					}
				}
				if(!productValid)
				{
					System.out.println("Invalid drink!!!");
				}
			}
			else if(category.equalsIgnoreCase("Snacks"))
			{
				System.out.println("\nHere are the available snacks.");

				for(int i = 0; i < snacks.length; i++)
				{
					System.out.print((snacks[i]) + "         ");
				}

				System.out.println();

				for(int i = 0; i < snacksPrice.length; i++) {

					System.out.print((snacksPrice[i]) + "s/" + (snacksLPrice[i]) + "l" + "   ");
				}

				System.out.print("\n\nSelect a snack : ");
				typeOfProduct = scan.nextLine();
				boolean productValid = false;

				for(int j = 0; j <snacks.length; j++)
				{
					if(typeOfProduct.equalsIgnoreCase(snacks[j]))
					{
						System.out.print("Small or Large : ");
						size = scan.nextLine();

						if(size.equalsIgnoreCase("Small"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *=  snacksPrice[j];
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else if(size.equalsIgnoreCase("Large"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *=  snacksLPrice[j];
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else
						{	
							System.out.println("\nInvalid Size!!!");
							productValid = true;
							break;
						}
					}
				}
				if(!productValid)
				{
					System.out.println("Invalid snack!!!");
				}
			}
			else if(category.equalsIgnoreCase("Supplies"))
			{
				System.out.println("\nHere are the available supplies.");

				for(int i = 0; i < supplies.length; i++)
				{
					System.out.print((supplies[i]) + "  ");
				}
				System.out.print("\n\nSelect a supply : ");
				typeOfProduct = scan.nextLine();
				boolean productValid = false;
				for(int j = 0; j < supplies.length; j++)
				{
					if(typeOfProduct.equalsIgnoreCase(supplies[j]) 
							&& !typeOfProduct.equalsIgnoreCase("Paper")
							&& !typeOfProduct.equalsIgnoreCase("Ballpen") 
							&& !typeOfProduct.equalsIgnoreCase("Pencil") 
							&& !typeOfProduct.equalsIgnoreCase("Crayon"))
					{
						System.out.print("Short or Long : ");
						size = scan.nextLine();

						if(size.equalsIgnoreCase("Short"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *= suppliesPrice[j];
							System.out.println("\nThis cost " + qty + "php");
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else if(size.equalsIgnoreCase("Long"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *= suppliesLPrice[j];
							System.out.println("\nThis cost " + qty + "php");
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else
						{
							System.out.println("\nInvalid Size!!!");
							productValid = true;
							break;
						}
					}
					else if (typeOfProduct.equalsIgnoreCase(supplies[j]) 
							&& !typeOfProduct.equalsIgnoreCase("Paper") 
							&& !typeOfProduct.equalsIgnoreCase("Ballpen")
							&& !typeOfProduct.equalsIgnoreCase("Pencil")
							&& !typeOfProduct.equalsIgnoreCase("Bond Paper") 
							&& !typeOfProduct.equalsIgnoreCase("Envelope"))
					{
						System.out.print("16 colors or 32 colors : ");
						size = scan.nextLine();

						if(size.equalsIgnoreCase("16 colors"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *= suppliesPrice[j];
							System.out.println("\nThis cost " + qty + "php");
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else if(size.equalsIgnoreCase("32 colors"))
						{
							System.out.print("Enter qty : ");
							qty = scan.nextInt();
							qty *= suppliesLPrice[j]; 
							System.out.println("\nThis cost " + qty + "php");
							total += qty;
							productValid = true;
							invalid = false;
							break;
						}
						else
						{
							System.out.println("\nInvalid Size!!!");
							productValid = true;
							break;
						}
					}
					else if (typeOfProduct.equalsIgnoreCase(supplies[j]) 
							&& !typeOfProduct.equalsIgnoreCase("Bond Paper") 
							&& !typeOfProduct.equalsIgnoreCase("Envelope") 
							&& !typeOfProduct.equalsIgnoreCase("Crayon"))
					{
						System.out.print("Enter qty : ");
						qty = scan.nextInt();
						qty *= suppliesPrice[j];
						System.out.println("\nThis cost " + qty + "php");
						total += qty;
						productValid = true;
						invalid = false;
						break;
					}
				}
				if (!productValid)
				{
					System.out.println("Invalid supply!!!");
				}
			}	
			else if(category.equalsIgnoreCase("Load"))
			{
				System.out.print("\nEnter Mobile No. : ");
				String num = scan.nextLine();

				if(num.length() == 11 && num.charAt(0) == '0' && num.charAt(1) == '9')
				{
					System.out.print("\nRegular or Promo : ");
					loadType = scan.nextLine();

					if(loadType.equalsIgnoreCase("Regular"))
					{
						System.out.print("Smart or Globe : ");
						String telecom = scan.nextLine();

						if(telecom.equalsIgnoreCase("Smart") ||  telecom.equalsIgnoreCase("Globe"))
						{
							System.out.print("\nEnter Amount : ");

							int amount = scan.nextInt();

							if(amount <= 1000 && amount >= 15)
							{
								int loadFee = 10;
								System.out.println("This cost " + amount + "php + " + loadFee + "php load fee");
								total += amount + loadFee;
								invalid = false;
							}
							else 
							{
								System.out.println("Invalid Amount!!!");
								scan.nextLine();
							}
						}
						else
						{
							System.out.println("Invalid Telecom!!!");
						}
					}
					else if (loadType.equalsIgnoreCase("Promo"))
					{
						System.out.print("Smart or Globe : ");
						String telecom = scan.nextLine();

						if(telecom.equalsIgnoreCase("Smart"))
						{
							System.out.println("\nHere are the available promo loads for Smart.");
							for(int i = 0; i < promoLoadSmart.length; i++)
							{
								System.out.print(promoLoadSmart[i] + "  ");
							}
							System.out.print("\n\nSelect promo load : ");
							typeOfProduct = scan.nextLine();
							boolean productValid = false;

							for(int j = 0; j < promoLoadSmart.length; j++)
							{	
								if (typeOfProduct.equalsIgnoreCase(promoLoadSmart[j]))
								{
									System.out.println("\nThis cost " + promoLoadPriceSmart[j] + "php");
									total += promoLoadPriceSmart[j];
									System.out.print("Press Enter to proceed.");
									productValid = true;
									invalid = false;
									break;
								}
							}
							if(!productValid)
							{
								System.out.println("\nInvalid promo!!!");
							}
						}
						else if(telecom.equalsIgnoreCase("Globe"))
						{
							System.out.println("\nHere are the available promo loads for Globe.");
							for(int i = 0; i < promoLoadGlobe.length; i++)
							{
								System.out.print(promoLoadGlobe[i] + "  ");
							}
							System.out.print("\n\nSelect promo load : ");
							typeOfProduct = scan.nextLine();
							boolean productValid = false;

							for(int j = 0; j < promoLoadGlobe.length; j++)
							{	
								if (typeOfProduct.equalsIgnoreCase(promoLoadGlobe[j]))
								{
									System.out.println("\nThis cost " + promoLoadPriceGlobe[j] + "php");
									total += promoLoadPriceGlobe[j];
									System.out.print("Press Enter to proceed.");
									productValid = true;
									invalid = false;
									break;
								}
							}
							if(!productValid)
							{
								System.out.println("\nInvalid promo!!!");
							}
						}
						else
						{
							System.out.println("Invalid Telecom!!!");
						}
					}
					else
					{
						System.out.println("Invalid load type!!!");
					}
				}
				else System.out.println("Invalid Mobile No.!!!");
			}
			else
			{
				System.out.println("\nProduct is not available.");
			}

			if(invalid)
			{
				System.out.print("\nPress Enter to proceed.");
			}
			scan.nextLine();
			// Check if the user wants to buy more products
			System.out.print("\nType Yes if you like to buy again No if you are done : ");
			response = scan.nextLine();
		}
		while(response.equalsIgnoreCase("Yes"));

		// Calculate and complete the transaction
		calculate();

	}

	// Method to calculate total, receive payment, and provide change
	void calculate()
	{
		// Check if the user has bought any products
		boolean hasBought = true;
		if(total == 0)
		{
			System.out.println("\nThank you for coming :)))");
			hasBought = false;
		}

		// Proceed with transaction if the user has bought something
		if(hasBought)
		{
			System.out.println("\nTotal Amount : " + total );	
			System.out.print("\nEnter Amount : ");
			receive = scan.nextFloat();

			// Check if the received amount is sufficient
			if(receive >= total)
			{
				change = receive - total;
				System.out.println("\nChange : " + String.format(" %.2f", change));
				System.out.println("Thank you for buying :)))");
			}
			else 
			{
				System.out.println("Insufficient amount!!!");
			}
		}
	}

}
