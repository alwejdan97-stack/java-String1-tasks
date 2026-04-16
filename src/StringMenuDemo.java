import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("*** MENU ***");
        System.out.println("1. display the length");
        System.out.println("2. display in uppercase");
        System.out.println("3. display in lowercase");
        System.out.println("4. check if contain specific letter");
        System.out.println("5. compare with other name");
        System.out.println("enter your choice: ");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("the length of your name is: "+ name.length());
                break;
            case 2:
                System.out.println("your name in uppercase is: "+name.toUpperCase());
                break;
            case 3 :
                System.out.println("your name in lowercase is: "+name.toLowerCase());
                break;
            case 4:
                System.out.println("enter letter to check at your name");
                scan.nextLine();
                String chr =scan.nextLine();
                if(name.contains(chr)==true){
                    System.out.println("your name contain letter: "+chr);
                }else{
                    System.out.println("your name dosen't contain letter: "+chr);
                }
                break;
            case 5:
                System.out.println("compare your name with other name");
                scan.nextLine();
                String other= scan.nextLine();
                if(name.equalsIgnoreCase(other)==true){
                    System.out.println("your name is same as: " + other);
                }
                else{
                    System.out.println("your name is not same as: " + other);
                }
                break;
            default:
                System.out.println("not a valid choice");
        }
        scan.close();
    }
}
