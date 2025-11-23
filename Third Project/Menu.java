import java.util.Scanner;

public class Menu {
	private int total = 0;
	private String listOfOrders = "";
	MenuAdmin admin;
    int lenMenu;

    public Menu(MenuAdmin admin){
    	this.admin = admin;
    	lenMenu = admin.menuArr.size();
    }

	public void printMenu(){
		System.out.println("0. Exit menu.");
		System.out.print(admin.getMenu());
		System.out.println((lenMenu + 1) + ". Clear basket.");
		System.out.println((lenMenu + 2) + ". Check basket.");
		System.out.println();
		System.out.print("Choose one: ");
	}

	public void typeOrder(){
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		System.out.println();
		
		if(choice == 0){
			System.out.println("Please enter number that defining to admin or client");
			System.out.println("1. Admin mode");
			System.out.println("2. Client mode");

			int num = in.nextInt();

			if(num == 1){
				Main.adminMode(admin);
			}
			else{
				Menu user = new Menu(admin);
				Main.clientMode(user);
			}
		}else if(choice <= lenMenu){
			printItemMenu(choice);
		}else if(choice == (lenMenu + 1)){
			toClearBasket();
		}else if(choice == (lenMenu + 2)){
			toCheckBasket();
		}

	}

	public void toCheckBasket(){
		if(total!=0){
			System.out.println("Basket:");
			System.out.println(listOfOrders);
			System.out.println("Total price: " + total + " kzt.");
		}else{
			System.out.println("Basket is empty.");
			System.out.println("Total price: 0 kzt.");
		}
		System.out.println();
	}

	public void toClearBasket(){
		total=0;
		listOfOrders="";
	}	

	public void printItemMenu(int choice){
		Scanner in = new Scanner(System.in);

		System.out.println("0. Exit menu.");
		for (int i = 0;i<admin.listCategoriesPrices.get(choice-1).size();i++) {
			System.out.println((i+1) + ". " + admin.listCategoriesPrices.get(choice-1).get(i));
		}
		System.out.println();

		int ch= in.nextInt();

		if(ch == 0){
			this.typeOrder();
		}else{
			String[] temp = admin.listCategoriesPrices.get(choice-1).get(ch-1).split(" - ");
			String t = temp[1].replace(" kzt.", "");
			int price = Integer.parseInt(t);
			total+=price;
			listOfOrders += admin.listCategoriesPrices.get(choice-1).get(ch-1) + "\n";
		}	
	}
}
