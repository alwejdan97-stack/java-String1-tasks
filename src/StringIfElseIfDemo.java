public class StringIfElseIfDemo {
    public static void main(String[] args){
        String username = "Wejdan";
        System.out.println(username);
        if(username.isEmpty()==true){
            System.out.println("username is empty");
        }else if(username.length()<5){
            System.out.println(username+" length is less than 5");
        }else if(username.length()>5){
            System.out.println(username+" length is grater than 5");
        }else if(username.startsWith("W")==true){
            System.out.println("username start with W");
        }else if(username.endsWith("n")==true){
            System.out.println("username ends with n");
        }
        System.out.println("check if username and given name is: "+username.equalsIgnoreCase("salim"));
    }
}
