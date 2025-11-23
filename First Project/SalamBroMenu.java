import java.util.Scanner;

public class SalamBroMenu{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there!\n");
        System.out.println("Welcome to the menu of \"Salam Bro\" Fast Food Station.");
        System.out.println("Here you can see our menu below.");

        String basket = "";
        int price = 0;
        System.out.println();
          System.out.println("0. Exit menu.");
          System.out.println("1. Burgers.");
          System.out.println("2. Hot dogs.");
          System.out.println("3. French fries.");
          System.out.println("4. Drinks.");
          System.out.println("5. Sauces.");
          System.out.println("6. Additives.");
          System.out.println("7. Clear basket.");
          System.out.println("8. Check basket.");
          System.out.println();
          System.out.print("Choose one: ");
        while(true){
          int a = scan.nextInt(); 
          if(a==0){
            System.out.println();
            break;
          }
          else if(a==1){
            System.out.println();
            System.out.println("0. Exit menu. "); 
            System.out.println("1. Chicken hamburger - 590 kzt. ");
            System.out.println("2. Beef hamburger - 790 kzt. ");
            System.out.println("3. Chicken cheeseburger - 790 kzt. ");
            System.out.println("4. Beef cheeseburger - 890 kzt. ");
            System.out.println("5. Double chicken hamburger - 990 kzt. ");
            System.out.println("6. Double chicken cheeseburger - 1090 kzt. ");
            System.out.println("7. Double beef hamburger - 1090 kzt. ");
            System.out.println("8. Double beef cheeseburger - 1190 kzt. ");
            System.out.println("9. Mixed hamburger - 1090 kzt. ");
            System.out.println("10. Mixed cheeseburger - 1190 kzt. ");
            System.out.println();
            System.out.print("Choose a burger: ");
            int b = scan.nextInt();
            if(b==1){
              price+=590;
              basket+="Chicken hamburger - 590 kzt. \n";
            } else if(b==2){
              price+=790;
              basket+="Beef hamburger - 790 kzt. \n";
            } else if(b==3){
              price+=790;
              basket+="Chicken cheeseburger - 790 kzt. \n";
            } else if(b==4){
              price+=890;
              basket+="Beef cheeseburger - 890 kzt. \n";
            } else if(b==5){
              price+=990;
              basket+="Double chicken hamburger - 990 kzt. \n";
            } else if(b==6){
              price+=1090;
              basket+="Double chicken cheeseburger - 1090 kzt. \n";
            } else if(b==7){
              price+=1090;
              basket+="Double beef hamburger - 1090 kzt. \n";
            } else if(b==8){
              price+=1190;
              basket+="Double beef cheeseburger - 1190 kzt. \n";
            } else if(b==9){
              price+=1090;
              basket+="Mixed hamburger - 1090 kzt. \n";
            } else if(b==10){
              price+=1190;
              basket+="Mixed cheeseburger - 1190 kzt. \n";
            } else {
              break;
            }
          }
          else if(a==2){
            System.out.println("0. Exit menu. "); 
            System.out.println("1. Spicy hot dog - 590 kzt. ");
            System.out.println("2. Hot dog - 590 kzt. ");
            System.out.println();
            System.out.print("Choose a hot dog: ");
            int b = scan.nextInt();
            if(b==1){
              price+=590;
              basket+="Spicy hot dog - 590 kzt. \n";
            } else if(b==2){
              price+=590;
              basket+="Hot dog - 590 kzt. \n";
            } else{
              break;
            }
            }
          else if(a==3){
            System.out.println("0. Exit menu. "); 
            System.out.println("1. French fries - 390 kzt. ");
            System.out.println();
            System.out.print("Choose french fries: ");
            int b = scan.nextInt();
            if(b==1){
              price+=390;
              basket+="French fries - 390 kzt. \n";
            }
            else{
              break;
            }
            }
          else if(a==4){
            System.out.println("0. Exit menu. ");
            System.out.println("1. Coca-Cola 0.5l - 250 kzt. ");
            System.out.println("2. Fanta 0.5l - 250 kzt. ");
            System.out.println("3. Sprite 0.5l - 250 kzt. ");
            System.out.println("4. Fuse tea 0.5l - 250 kzt. ");
            System.out.println("5. Bon aqua 0.5l - 250 kzt. ");
            System.out.println("6. Raspberry compote 0.3l - 250 kzt. ");
            System.out.println("7. Currant compote 0.3l - 250 kzt. ");
            System.out.println("8. Piko pulpy 0.5l -350 kzt. ");
            System.out.println();
            System.out.print("Choose a drink: ");
            int b = scan.nextInt();
            if(b==1){
              price+=250;
              basket+="Coca-Cola 0.5l - 250 kzt. \n";
            } 
            else if(b==2){
              price+=250;
              basket+="Fanta 0.5l - 250 kzt. \n";
            }
            else if(b==3){
              price+=250;
              basket+="Sprite 0.5l - 250 kzt. \n";
            }
            else if(b==4){
              price+=250;
              basket+="Fuse tea 0.5l - 250 kzt. \n";
            }
            else if(b==5){
              price+=250;
              basket+="Bon aqua 0.5l - 250 kzt. \n";
            }
            else if(b==6){
              price+=250;
              basket+="Raspberry compote 0.3l - 250 kzt. \n";
            }
            else if(b==7){
              price+=250;
              basket+="Currant compote 0.3l - 250 kzt. \n";
            }
            else if(b==8){
              price+=350;
              basket+="Piko pulpy 0.5l -350 kzt. \n";
            }
            else{
              break;
            }
          }
          else if(a==5){
            System.out.println("0. Exit menu. ");
            System.out.println("1. Ketchup - 100 kzt. ");
            System.out.println("2. Cheese sauce - 100 kzt. ");
            System.out.println("3. Sauce BBQ - 100 kzt. ");
            System.out.println("4. Spicy sauce - 50 kzt. ");
            System.out.println("5. Mustard sauce - 100 kzt. ");
            System.out.println();
            System.out.print("Choose a sauce: ");
            int b = scan.nextInt();
            if(b==1){
              price+=100;
              basket+="Ketchup - 100 kzt. \n";
            }
            else if(b==2){
              price+=100;
              basket+="Cheese sauce - 100 kzt. \n";
            }
            else if(b==3){
              price+=100;
              basket+="Sauce BBQ - 100 kzt. \n";
            }
            else if(b==4){
              price+=50;
              basket+="Spicy sauce - 50 kzt. \n";
            }
            else if(b==5){
              price+=100;
              basket+="Mustard sauce - 100 kzt. \n";
            }
            else{
              break;
            }
          }
          else if(a==6){
            System.out.println("0. Exit menu. ");
            System.out.println("1. Jalapeno - 100 kzt. ");
            System.out.println("2. Cheese - 150 kzt. ");
            System.out.println();
            System.out.println("Choose an additive: ");
            int b = scan.nextInt();
            if(b==1){
              price+=100;
              basket+="Jalapeno - 100 kzt. \n";
            } 
            else if(b==2){
              price+=150;
              basket+="Cheese - 150 kzt. \n";
            }
            else{
              break;
            }
          }
          else if(a==7){
            price=0;
          } 
          else if(a==8){
            if(price!=0){
            System.out.println("basket: ");
            System.out.println(basket);
            System.out.println("Total price: "+price+" kzt.");
          }
            else {
            System.out.println();
            System.out.println("Basket is empty.");
            System.out.println("Total price: "+price+" kzt.");
            }
          }
          else if(a==0){
            break;
          }
          System.out.println();
          System.out.println("0. Exit menu.");
          System.out.println("1. Burgers.");
          System.out.println("2. Hot dogs.");
          System.out.println("3. French fries.");
          System.out.println("4. Drinks.");
          System.out.println("5. Sauces.");
          System.out.println("6. Additives.");
          System.out.println("7. Clear basket.");
          System.out.println("8. Check basket.");
          System.out.println();
          System.out.print("Choose one: ");
        }
        }
      }
