public class StringModifyDemo {
    public static void main(String[] args){
        String text = "Hello from Oman";
        System.out.println(text);
        System.out.println(text.trim());
        System.out.println("check if contains 'wejdan' or not: "+text.contains("wejdan"));
        System.out.println("replace 'Hello' with 'Wejdan': "+ text.replace("Hello", "Wejdan"));

    }
}
