package MultiThreading;

public class LaunchMulti1 {
    public static void main(String[] args) {
        
        System.out.println("Main Thread");

        System.out.println("Before Changing the main thread");

        String name = Thread.currentThread().getName(); // These are Static Methods called without creating a Object 
        System.out.println("The name of thread is :" + name);
        System.out.println("The priority of thread is :" + Thread.currentThread().getPriority());

        System.out.println("After Changing the name and priority of main thread");

        Thread t = Thread.currentThread(); // Changing name and priority of main thread
        t.setName("newMain");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println("The name of thread is :" + name1);
        System.out.println("The priority of thread is :" + Thread.currentThread().getPriority());






    }
}
