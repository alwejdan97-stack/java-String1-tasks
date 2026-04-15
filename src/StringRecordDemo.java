public class StringRecordDemo {
    public static void main(String[] args){
        String record = "Wejdan, IT, wejdan@gmail.com";
        System.out.println(record);
        System.out.println(" "+ record +" ");
        System.out.println(record);
        String afterTrim=record.trim();
        System.out.println("after trim: " + afterTrim);
        String text1 = "hello";
        String text2 = "HELLO";
        System.out.println("check if text1 and text2 are equals: "+ text1.equalsIgnoreCase(text2));
        String[] afterSlipt = afterTrim.split(",");
        System.out.println("after split: ");
        for(String split : afterSlipt){
            System.out.println(split.trim());
        }
        String text3 = " ";
        System.out.println("check if text2 is empty or not: " +text3.isEmpty());
        System.out.println("display xharacter at index 7: "+ afterTrim.charAt(7));
    }
}

