public class StringCheckDemo {
    public static void main(String[] args){
        String text = "your feedback is very important for the company";
        System.out.println(text);
        System.out.println("the length of text is: "+ text.length());
        String text2 = "try to give your feedback to the company";
        System.out.println("check if text and text2 are equals: "+ text.equals(text2));
        System.out.println("display the index of 'y': " + text.indexOf("y"));
        System.out.println("check if text start with y: "+ text.startsWith("y"));
        System.out.println("ckeck if text end with y: "+ text.endsWith("y"));

    }
}
