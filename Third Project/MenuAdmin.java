import java.util.*;

public class MenuAdmin {
	String msg;
	String menu;
	ArrayList<String> menuArr;
	String subMenu;
	String subMenuPrices;
	int initialPrice;
	ArrayList<ArrayList<String>> listCategories;
	ArrayList<ArrayList<String>> listCategoriesPrices;
	String[] tempPrice;

	public MenuAdmin(){
		msg = "Welcome to the Admin Panel of \"Salam Bro\" Fast Food Stationt!\nHere you can do the following activites:";
		menu = "";
		menuArr = new ArrayList<>();
		subMenu = "";
		subMenuPrices = "";
		initialPrice = 0;
		listCategories = new ArrayList<>();
		listCategoriesPrices = new ArrayList<>();
	}

	public void activites(){
		System.out.println("\n0. Exit." +
						   "\n1. Change Welcome Message." + 
						   "\n2. Change Menu." + 
						   "\n3. Change SubMenu." + 
						   "\n4. Change Prices." + 
						   "\n5. Display Welcome Message." + 
						   "\n6. Display Menu." + 
						   "\n7. Display SubMenu." + 
						   "\n8. Display Prices." +  
						   "\n9. Switch to Client Mode (coming soon).\n");
		System.out.print("Choose an activity:");
	}

	public void setWelcomeMessage(){
		Scanner in = new Scanner(System.in);
		System.out.println("Please, type the message that clients will see when they enter the menu:\n"
		 + "Tip: use underscore (_) as a splifter");
		System.out.print("> ");
		String temp = in.nextLine();
		String[] strArr = temp.split(" _ ");
		msg = "";
		for (int i=0;i<strArr.length;i++) {
			msg+=strArr[i] + "\n";

		}

	}

	public void setMenu(){
		Scanner in = new Scanner(System.in);
		System.out.println("Here you can do the following activites:\n");
		System.out.println("0. Go Back.\n" + 
						   "1. Add categories.\n" + 
						   "2. Remove categories.\n");
		System.out.print("Your choice: ");
		int chooseSetMenu = in.nextInt();
		switch(chooseSetMenu){
			case 0: return;
			case 1: addCategories(); break;
			case 2: removeCategories();break;
		}			
	}	

	public void setSubMenu(){
		Scanner in = new Scanner(System.in);
		System.out.println("Here you can do the following activites:\n");
		System.out.println("0. Go Back.\n" + 
						   "1. Add subcategories.\n" + 
						   "2. Remove subcategories.\n");
		System.out.print("Your choice: ");
		int chooseSetMenu = in.nextInt();
		switch(chooseSetMenu){
			case 0: return;
			case 1: addSubCategories(); break;
			case 2: removeSubCategories();break;
		}
	}


	public void addSubCategories(){
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);

		System.out.println("Choose the category from which you want to add subcategories:");
		System.out.println(menu);
		System.out.print("> ");
		int indexOfCategory = in1.nextInt();
		System.out.println("\nWrite the names of subcategories separated by comma (c1, c2, ...):");
		System.out.print("> ");
		String subMenuItems = in2.nextLine();
		tempPrice = subMenuItems.split(",");
		for(String str: tempPrice){
			listCategories.get(indexOfCategory-1).add(str);
		}
		for(int i=0;i<tempPrice.length;i++){
			tempPrice[i] += " - " + initialPrice + " kzt.";
			listCategoriesPrices.get(indexOfCategory-1).add(tempPrice[i]);
		}
	}



	public void removeSubCategories(){
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		subMenu = "";
		System.out.println("Choose the category from which you want to remove subcategories:");
		System.out.println(menu);
		System.out.print("> ");
		int indexOfCategory = in.nextInt();
		if(listCategories.get(indexOfCategory-1).isEmpty()){
			System.out.println("You don't have subcategories in this category.");	
		}else{
			System.out.println("Choose subcategories you want to remove by its index shown below: ");
			for(int i=0;i<listCategories.get(indexOfCategory-1).size();i++){
				System.out.println((i+1) + ". " + listCategories.get(indexOfCategory-1).get(i) + ".");
			}
			System.out.println("\nTip: write the indexes separated by comma(i1, i2, ...)");
			System.out.print("> ");
			String removeCategoriesStr = in2.nextLine();
			String[] temp = removeCategoriesStr.split(",");
			int[] tempInt = new int[temp.length];
			for (int i=0;i<temp.length;i++) {
				tempInt[i] = Integer.parseInt(temp[i]);
			}
			Arrays.sort(tempInt);
			for (int i=temp.length-1;i>=0;i--) {
				for(int j=listCategories.get(indexOfCategory-1).size() - 1;j>=0;j--){
					if((tempInt[i] - 1) == j){
						listCategories.get(indexOfCategory-1).remove(j);
						listCategoriesPrices.get(indexOfCategory-1).remove(j);

					}
				}
			}

		}
	}

	public void setPrices(){
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		subMenuPrices = "";
		if(listCategories.isEmpty()){
			System.out.println("\nWe don't have any menu. Please add some menu.");
		}else{
			
			System.out.println("Choose the category for which you want to shange prices of subcategories:");
			System.out.println(menu);
			System.out.print("> ");
			int indexOfCategory = in1.nextInt() - 1;
			if(listCategories.get(indexOfCategory).isEmpty()){
				System.out.println("Please add for that category some subcategory for seting prices.");
				return;
			}
			System.out.println("Choose subcategories for which you want to change prices of subcategories");
			for(int i=0;i<listCategoriesPrices.get(indexOfCategory).size();i++){
				System.out.println((i+1) + ". " + listCategoriesPrices.get(indexOfCategory).get(i));
			}
			System.out.println("\nTip: write the indexes separated by comma(i1, i2, ...)");
			System.out.print("> ");
			String strI = in2.nextLine();
			System.out.print("\nEnter a new prices for " + menuArr.get(indexOfCategory) + ": ");
			initialPrice = in3.nextInt();
			String[] temp = strI.split(",");
			int[] tempInt = new int[temp.length];
			for (int i = 0;i<temp.length;i++) {
				tempInt[i] = Integer.parseInt(temp[i]);
				for (int j=0;j<listCategoriesPrices.get(indexOfCategory).size();j++) {
					if((tempInt[i]-1) == j){
						String[] tempInner = tempPrice[j].split("-");
						listCategoriesPrices.get(indexOfCategory).set(j, tempInner[0] + " - " + initialPrice + " kzt.");
					}
				}
			}
		}							
	}

	public void addCategories(){
		Scanner in = new Scanner(System.in);
		System.out.println("Write the names of categories separated by comma (c1, c2, ...):");
		System.out.print("> ");
		String listOfCategories = in.nextLine();
		String[] temp = listOfCategories.split(",");
		for(String s: temp){
			menuArr.add(s);
		}
		for (int i = 0;i<menuArr.size();i++) {
			menu += (i+1) + "." + menuArr.get(i) + ".\n";
			ArrayList<String> item = new ArrayList<>();
			ArrayList<String> itemWithPrices = new ArrayList<>();
			listCategories.add(item);
			listCategoriesPrices.add(itemWithPrices);
		}
	}

	public void removeCategories(){
		if(!menuArr.isEmpty()){
			Scanner in = new Scanner(System.in);
			Scanner in2 = new Scanner(System.in);
			System.out.println(menu);
			System.out.println("\nTip: write the indexes separated by comma(i1, i2, ...)");
			System.out.print("> ");
			String removeCategoriesStr = in2.nextLine();
			String[] temp = removeCategoriesStr.split(",");
			int[] tempInt = new int[temp.length];
			for (int i=0;i<temp.length;i++) {
				tempInt[i] = Integer.parseInt(temp[i]);
			}
			Arrays.sort(tempInt);
			for (int i=temp.length-1;i>=0;i--) {
				for(int j=listCategories.size() - 1;j>=0;j--){
					if((tempInt[i] - 1) == j){
						listCategories.remove(j);
						listCategoriesPrices.remove(j);
						menuArr.remove(j);
					}
				}
			}	
			menu = "";
			for (int i=0;i<menuArr.size();i++) {
				menu+= (i+1) + ". " + menuArr.get(i) + ".\n";
			}		
		}else{
			System.out.println("You don't have menu yet.");
		}
	}
	public String getWelcomeMessage(){
		return msg;
	}

	public String getMenu(){
		if(menu.length()>0){
			return menu;
		}
		return "You don't have menu yet.\n";
	}

	public String getSubMenu(){
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the category for which you want to see its subcategories");
		System.out.println(getMenu());
		System.out.print("> ");
		int num = in.nextInt();
		if(listCategories.get(num-1).isEmpty()){
			return "You don't have subcategories in this category";
		}
		for(int i = 0;i<listCategories.get(num-1).size();i++){
			subMenu += (i+1) + ". " + listCategories.get(num-1).get(i) + ".\n";
		}
		return subMenu;
	}

	public String getPrices(){
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the category for which you want to see its subcategories' prices:");
		System.out.println(getMenu() + "\n");
		System.out.print("> ");
		int num = in.nextInt();

		if(listCategories.get(num-1).isEmpty()){
			return "You don't have subcategories in this category";
		}
		for(int i = 0;i<listCategories.get(num-1).size();i++){
			subMenuPrices += (i+1) + ". " + listCategoriesPrices.get(num-1).get(i) + "\n";
		}
		return subMenuPrices;
	}
	public void switchClientMode(){
		System.out.println();
	}
}
