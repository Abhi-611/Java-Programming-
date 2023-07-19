package DateAndTimeAPI;
//import java.util.Date;
//import java.sql.Date;
public class LaunchDT1 {
    public static void main(String[] args) {
        
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long time = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(time);
        System.out.println(dt1);

    }
}
