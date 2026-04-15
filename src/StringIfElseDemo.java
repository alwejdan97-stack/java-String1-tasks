public class StringIfElseDemo {
    public static void main(String[] args){
        String username = "Wejdan";
        System.out.println(username);
        if(username.length()>5){
            System.out.println(username+" length is grater than 5");
        }else{
            System.out.println(username+" length is too short / less than 5");
        }
        String password="Xz512";
        if(password=="Xz512"){
            System.out.println("password is correct");
        }else{
            System.out.println("password is not correct");
        }
        System.out.println("check if username contain 'a': "+username.contains("a"));
        if(username.isEmpty()==true){
            System.out.println("username is empty");
        }else{
            System.out.println("username is not empty");
        }
    }
}
