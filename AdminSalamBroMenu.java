import java.util.Scanner;

public class AdminSalamBroMenu{

    public static void main(String[] args){

        String[]categories =  new  String[10];
        String[][] Submenu = new String[categories.length][];     
        String[][] Prices = new String[categories.length][];
        
        Scanner scanner = new Scanner(System.in);

        String WelcomeMessage = "Welcome to the Admin Panel of \"Salam Bro\" Fast Food Station!\n" +
                "Here you can do the following activities:";

        String Menu = "0. Exit.\n" +
                "1. Change Welcome Message.\n" +
                "2. Change Menu\n" +
                "3. Change SubMenu\n" +
                "4. Change Prices.\n" +
                "5. Display Welcome Message.\n" +
                "6. Display Menu.\n" +
                "7. Display SubMenu.\n" +
                "8. Display Prices.\n" +
                "9. Switch to Client Mode (coming soon.)";

        System.out.println(WelcomeMessage);
        System.out.println(Menu);
        System.out.print("Choose an activity: ");

        int activity = scanner.nextInt();

        loop:
        while(true){

            if (activity == 1){

                System.out.println("Please, type the message that clients will  see when they enter the menu:\n" +
                        "Tip: use underscore (_) as a splitter");
               
                scanner.nextLine();
                WelcomeMessage = scanner.nextLine();

            }

            else if(activity == 2){

                System.out.println("Here you can do the following activities:\n" +
                        "0.Go Back.\n" +
                        "1.Add categories.\n" +
                        "2.Remove categories.");
                System.out.print("Your choice:");
                int chose = scanner.nextInt();

                    if(chose == 2){
                        System.out.println("Choose category you want to remove by  its index shown below:");
                        int c = 1;
                        for(int i = 0 ; i < categories.length ; i++){
                            if(categories[i] != null){
                                System.out.println(c + ". " + categories[i] + ".");
                                c++;

                            }
                        }

                        System.out.println("Tip: write the indexes separated by comma (i1, i2, ...)");
                        String[]  indexes = scanner.next().split(",");
                        for(int i = 0; i < indexes.length; i++){
                               categories[Integer.parseInt(indexes[i])-1] = null;

                        }
                    }

                    else if(chose == 1){
                        System.out.println("Write the names of categories separated by comma(c1, c2, ...)");
                        categories = scanner.next().split(",");

                    }

                    else if(chose == 0){

                    }
            }
            
            else if(activity == 5){

                String[] split = WelcomeMessage.split("_");
                for(int i = 0; i < split.length; i++){
                    System.out.println(split[i]);

                }
            }

            else if(activity == 6){

                boolean empty = true;

                for(String item : categories){
                    if(item != null){
                        empty = false;
                        break;
                    }
                }
                if(empty){
                    System.out.println("You don't have a menu yet.");
                }
                else {
                    int c = 1;

                    for (int i = 0; i < categories.length; i++) {
                        if (categories[i] != null) {
                            System.out.println(c + ". " + categories[i] + ".");
                            c++;
                        }
                    }
                }
            }

            else if(activity == 3){

                System.out.println("Here you can do the following activities:\n" +
                        "0. Go Back.\n" +
                        "1. Add subcategories.\n" +
                        "2. Remove subcategories");
                int  chose = scanner.nextInt();
                if(chose == 1){
                    System.out.println("Choose the category for which you want to see its subcategories:");

                    int c = 1;
                    for(int i = 0 ; i < categories.length ; i++){
                        if(categories[i] != null){
                            System.out.println(c + ". " + categories[i] + ".");
                            c++;

                        }
                    }
                    System.out.print("Your choice: " );
                    int chose2 = scanner.nextInt();

                    System.out.println("Write the names of subcategories separated by comma (c1, c2, ...):" );
                    String submenu = scanner.next();
                    Submenu[chose2-1] =  new String[submenu.split(",").length];
                    Prices[chose2-1] =  new String[submenu.split(",").length];
                    Submenu[chose2-1] = submenu.split(",");
                }
                else if(chose == 2){
                    System.out.println("Choose category you want to remove subcategories  by  its index shown below:");
                    int c = 1;
                    for(int i = 0 ; i < categories.length ; i++){
                        if(categories[i] != null){
                            System.out.println(c + ". " + categories[i] + ".");
                            c++;
                        }
                    }
                    int chose2 = scanner.nextInt();
                    System.out.println("Choose subcategories you want to remove   by  its index shown below:");
                    if(Submenu[chose2-1] == null){
                        System.out.println("You don't have subcategories in this category.");

                    }
                    else{
                        for(int i = 0; i < Submenu[chose2-1].length; i++){
                            System.out.println(i+1+". "+ Submenu[chose2-1][i]);
                        }
                    }
                    System.out.println("Tip: write the indexes separated by comma (i1, i2, ...)");
                    String[]  indexes = scanner.next().split(",");
                    for(int i = 0; i < indexes.length; i++){
                        Submenu[chose2-1][Integer.parseInt(indexes[i])-1] = null;

                    }
                }
                else if(chose == 0){

                }
            }

            else if(activity == 7){

                System.out.println("Choose the category for which you want to see its subcategories:");
                int c = 1;
                for(int i = 0 ; i < categories.length ; i++){
                    if(categories[i] != null){
                        System.out.println(c + ". " + categories[i] + ".");
                        c++;
                    }
                }
                int chose = scanner.nextInt();

                if(Submenu[chose-1] == null){
                    System.out.println("You don't have subcategories in this category.");

                }
                else{
                    for(int i = 0; i < Submenu[chose-1].length; i++){
                        System.out.println(i+1+". "+ Submenu[chose-1][i]);
                    }
                }
            }

            else if(activity == 0){

                break loop;

            }

            else if(activity == 9){

                break loop;

            }

            else if(activity == 4){

                System.out.println("Choose the category for which you want to change prices of subcategories:");

                int g = 1;
                for(int i = 0 ; i < categories.length ; i++){
                    if(categories[i] != null){
                        System.out.println(g + ". " + categories[i] + ".");
                        g++;
                    }
                }
                int chose = scanner.nextInt();

                if(Submenu[chose-1] == null){
                    System.out.println("You don't have subcategories in this category.");

                }
                else{
                    System.out.println("Choose subcategories for which you want to change prices:");
                    for(int i = 0; i < Submenu[chose-1].length; i++){
                        System.out.println(i+1+". "+ Submenu[chose-1][i] + " - 0 kzt.");
                    }
                        System.out.println("Tip write the indexes separated by comma (i1, i2, ...)");
                    String[]  indexes = scanner.next().split(",");

                    for(int i = 0; i < indexes.length; i++){
                        if(Integer.parseInt(indexes[i]) < Submenu[chose-1].length +1){
                            System.out.println("Enter a new prices for "+Submenu[chose-1][Integer.parseInt(indexes[i])-1] +  " :");
                            Prices[chose-1][Integer.parseInt(indexes[i]) - 1 ] = scanner.next();
                        }
                    }
                }
            }

            else if(activity == 8){

                System.out.println("Choose the category for which you want to see its subcategories' prices:");

                int c = 1;
                for(int i = 0 ; i < categories.length ; i++){
                    if(categories[i] != null){
                        System.out.println(c + ". " + categories[i] + ".");
                        c++;
                    }
                }
                int chose = scanner.nextInt();

                if(Submenu[chose-1] == null){
                    System.out.println("You don't have subcategories in this category.");

                }
                else{

                    for(int i = 0; i < Submenu[chose-1].length; i++){
                        if(Prices[chose - 1][i] != null){
                            System.out.println(i + 1 + ". " + Submenu[chose - 1][i] + " - " + Prices[chose - 1][i] + " kzt.");
                        }
                        else{
                            System.out.println(i + 1 + ". " + Submenu[chose - 1][i] + " - " +  "0 kzt.");

                        }
                    }
                }
            }

            System.out.println();
            System.out.println();
            System.out.println(Menu);
            System.out.print("Choose an activity:" );

            activity = scanner.nextInt();

        }
    }
}