public class StringSwitchDemo {
    public static void main(String[] args){
        String departmentnName = "IBA";
        System.out.println(departmentnName);
        switch(departmentnName){
            case "IT":
                System.out.println("IT department for technician");
                break;
            case "Finance":
                System.out.println("Finance department for handling payments and expenses");
                break;
            case "Marketing" :
                System.out.println("Marketing department attracts customers");
                break;
            default:
                System.out.println("not a department of company");
        }
    }
}
