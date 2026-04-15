public class StringCheckDemo {
    public static void main(String[] args){
        String text = "Ahmed is employee at HR";
        System.out.println(text);
        System.out.println("after convert to uppercase: "+ text.toUpperCase());
        System.out.println("after convert to lowercase: "+ text.toLowerCase());
        System.out.println("the index of employee is:"+ text.indexOf("employee"));
        System.out.println("print only the specify: "+ text.substring(text.length()-2, text.length()-1));
        System.out.println("check if contains i: "+ text.contains("i"));
    }
}
