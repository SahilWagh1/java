import java.util.Scanner;
public class vendor{
    public double price;
    String spatty,sfries,sdrink;

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.println("here's your menu:\n1.Hamburger\n2.Pizza(Under Construction)");
        while(true){
            System.out.print("Enter your Response:");
            val =sc.nextInt(); 
            if(val==1){
                hamburger();
                break;
            }
            val =sc.nextInt(); 
            if(val==2){
                pizza();
                break;
            }
            else if(val!=1 && val!=2){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        sc.close();
    }
    public void hamburger(){
        int patty,fries;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which one:\npatty?\n1.Veg           $2.50\n2.Chicken       $4.40\n3.Beef          $5.79");

        while(true){
            System.out.print("Enter your Response:");
            patty =sc.nextInt(); 
            if(patty==1){
                price=2.50;
                spatty="VEG BURGER $2.50";
                break;
            }
            else if(patty==2){
                price=4.40;
                spatty="CHICKEN BURGER $4.40";
                break;
            }
            else if(patty==3){
                price=5.79;
                spatty="BEEF BURGER $5.79";
                break;
            }else if(patty!=1 && patty!=2 && patty!=3){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        System.out.println("Want Fries?\n1.Yes\n2.NO");
        while(true){
            System.out.print("Enter your Response:");
            fries=sc.nextInt(); 
           
            if(fries==1){
                ffries();
                break;
            }
            else if(fries==2){
                break;
            }
            else if(fries!=1){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        sc.close();
    }
    public void ffries(){
        int ffries,drink;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which on\n1.Salty          $1.10\n2.Peri-Peri      $2.10");
        while(true){
            System.out.print("Enter your Response:");
            ffries=sc.nextInt(); 
           
            if(ffries==1){
                price=price+1.10;
                sfries="SALTY FRIES $1.10";
                break;
            }
            if(ffries==2){
                price=price+2.10;
                sfries="PERI-PERI FRIES $2.10";
                break;
            }
            else if(ffries!=1){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        System.out.println("Drink?");
        System.out.println("1.Sure\n2.No Thanks");
        while(true){
            System.out.print("Enter your Response:");
            drink =sc.nextInt(); 
           
            if(drink==1){
                fdrinks();
                break;
            }
            if(drink==1){
                bill();
                break;
            }
            else if(drink!=1){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        sc.close();
    
    }
    public void pizza() {
        
        System.out.println("UNDER CONSTRUCTION SORRY FOR YOUR UNCONVENIENCE");
    }
    public void fdrinks(){
        int fdrink;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which on\n1.Coca-Cola\n2.Sprite\n3.Fanta\n4.Dr Pepper\n5.Diet Coke\n6.DASANI Water");
        while(true){
            System.out.print("Enter your Response:");
            fdrink =sc.nextInt(); 
           
            if(fdrink==1){
                price=price+1;
                sdrink="COCA-COLA $1.0";
                break;
            }
            else if(fdrink==2){
                price=price+1;
                sdrink="SPRITE $1.0";
                break;
            }
            else if(fdrink==3){
                price=price+1;
                sdrink="FANTA $1.0";
                break;
            }
            else if(fdrink==4){
                price=price+1;
                sdrink="DR PEPPER $1.0";
                break;
            }
            else if(fdrink==5){
                price=price+1;
                sdrink="DIET COKE $1.0";
                break;
            }
            else if(fdrink==6){
                price=price+1;
                sdrink="DASANI WATER $1.0";
                break;
            }
            else if(fdrink!=1 && fdrink!=2 && fdrink!=3 && fdrink!=4 && fdrink!=5 && fdrink!=6){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        sc.close();
        bill();
        
    }
    public void bill(){
        System.out.println("\n----------BILL----------");
        System.out.println(spatty+" + "+sfries+" + "+sdrink);
        price=price+0.60;
        System.out.println("YOU HAVE TO PAY $"+price+" INCLUDING CHARGES");
        System.out.println("**********THANK YOU**********");

    }
    public static void main(String[]args){

        int val;
        Scanner sc = new Scanner(System.in);
        //Greetings
        System.out.println("Hello!...How are you?");
        System.out.println("1.Menu");
        vendor vendor= new vendor();
        while(true){
            System.out.print("Enter your Response:");
            val =sc.nextInt(); 
           
            if(val==1){
                vendor.menu();
                break;
            }
            else if(val!=1){
                System.out.println("Sorry i cant understand Please try again");
            }
        }
        sc.close();
    }
}
