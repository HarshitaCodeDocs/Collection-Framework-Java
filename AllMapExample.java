import java.util.HashMap;

public class AllMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();

        //adding elements
        courses.put("Core Java", 4000);
        courses.put("Basic Python", 3500);
        courses.put("Spring", 8000);
        courses.put("Android", 4000);
        courses.put("Android", 4000);
        courses.put("Angular", 3000);
        System.out.println(courses);
        courses.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });

        //in java8
        courses.forEach((key, value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
            System.out.println();
        });
        //entry set
        //key set
        //get by key
        System.out.println(courses.get("Core Java"));
    }
}
