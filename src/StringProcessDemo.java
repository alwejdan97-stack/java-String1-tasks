public class StringProcessDemo {
    public static void main(String[] args){
        String record = "Wejdan, IT, wejdan@gmail.com";
        System.out.println(record);
        System.out.println(" "+ record +" ");
        System.out.println(record);
        String afterTrim=record.trim();
        System.out.println("after trim: " + afterTrim);
        String[] afterSlipt = afterTrim.split(",");
        System.out.println("after split: ");
        for(String split : afterSlipt){
            System.out.println(split.trim());
        }
        String text1 = "hi";
        String text2 = "HI";
        System.out.println("check if " + text1 +" and "+text2 + " are same ore not: "+ text1.equalsIgnoreCase(text2));
        System.out.println("check if text2 is empty or not: " +text2.isEmpty());
}
}
