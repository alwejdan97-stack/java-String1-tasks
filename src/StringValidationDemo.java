public class StringValidationDemo {
    public static void main(String[] args){
        String text = "username is Wejdan";
        System.out.println(text);
        System.out.println("check if text starts with username: "+ text.startsWith("username"));
        System.out.println("check if text ends with company: "+ text.endsWith("company"));
        System.out.println("replace Wejdan with Ahmed: "+ text.replace("Wejdan", "Ahmed"));
        System.out.println("print only the specify: "+ text.substring(4,9));
        System.out.println("the length is: "+ text.length());
    }
}
