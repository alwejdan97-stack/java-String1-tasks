import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("your name is "+ name);
        System.out.println("the length of your name is: "+ name.length());
        System.out.println("your name in uppercase is: "+name.toUpperCase());
        System.out.println("your name in lowercase is: "+name.toLowerCase());
        System.out.println("enter a word or letter to search inside your name ");
        //scan.nextLine();
        String chr= scan.nextLine();
        if(name.contains(chr)==true){
            System.out.println("your name contain: "+chr);
        }else{
            System.out.println("your name dosen't contain: "+chr);
        }
        System.out.println("enter other name to compare with your name ");
        //scan.nextLine();
        String other =scan.nextLine();
        if(name.equalsIgnoreCase(other)==true){
            System.out.println("your name is same as: " + other);
        }
        else{
            System.out.println("your name is not same as: " + other);
        }
        scan.close();
        System.out.println("your substing abiut your name is: "+name.substring(1,4));
        if(name.length()>5){
            System.out.println("your name is more than 5 letters");
        }else{
            System.out.println("your name is more less 5 letters");
        }
    }
}
