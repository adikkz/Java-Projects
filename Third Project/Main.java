import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MenuAdmin admin = new MenuAdmin();

		System.out.println("Please enter number that defining to admin or client");
		System.out.println("1. Admin mode");
		System.out.println("2. Client mode");

		int num = in.nextInt();

		if(num == 1){
			adminMode(admin);
		}
		else{
			Menu user = new Menu(admin);
			clientMode(user);
		}

	}

	public static void adminMode(MenuAdmin admin){
		Scanner in = new Scanner(System.in);
		System.out.println(admin.msg);
		int chooseActivites;	
		while(true){
			admin.activites();
			chooseActivites = in.nextInt();
			switch(chooseActivites){
				case 0: System.exit(0);
				case 1: admin.setWelcomeMessage(); break;
				case 2: admin.setMenu(); break;
				case 3: admin.setSubMenu(); break;
				case 4: admin.setPrices(); break;
				case 5: System.out.println("\n" + admin.getWelcomeMessage()); break;
				case 6: System.out.println("\n" + admin.getMenu()); break;
				case 7: System.out.println("\n" + admin.getSubMenu()); break;
				case 8: System.out.println("\n" + admin.getPrices()); break;
				case 9: Menu user = new Menu(admin);clientMode(user); break;
				default: 
					System.out.println("No such options! Please choose another option.");
					continue;
			}			
		}
	}

	public static void clientMode(Menu user){
		System.out.println("Hi there!");
		System.out.println();
		System.out.println("Welcome to the menu of \"Salam Bro\" Fast Food Station.");
		System.out.println("Here you can see our menu below.");

		while(true){
			user.printMenu();
			user.typeOrder();
		}
	}
}
