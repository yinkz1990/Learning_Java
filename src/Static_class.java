public class Static_class {

    String name;
    int rollNo;
    static String college = "ABD";
    String message;


    static {
        college = "EDF";
        System.out.println(college);
    }

    public Static_class(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public static String changeMessages (String messages){

        return messages;
    }


    public int calculator(int x, int y){
        int result = x * y;
        return result;
    }


}
