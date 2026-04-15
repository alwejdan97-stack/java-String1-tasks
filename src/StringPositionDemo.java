public class StringPositionDemo {
    public static void main(String[] args){
        String text = "Hello from Oman";
        System.out.println(text);
        System.out.println("display at index 5: "+text.indexOf(5));
        System.out.println("check if text start with h or not: "+ text.startsWith("h"));
        System.out.println("check if text start with n or not: "+ text.endsWith("n"));
    }
}
