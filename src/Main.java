
import SingletonClasses.Singleton_v1;
import BuilderClasses.Task;
import BuilderClasses.TaskBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Pattern Test 1.0");


        System.out.println("Welcome to Pattern Test 2.0");

        Singleton_v1 rex =Singleton_v1.getInstance();
        System.out.println(rex.getNumber());

        System.out.println("Welcome to Pattern Test 3.0 test");

        System.out.println("Welcome to Pattern Test 4.1 test");

        /* Builder TEST */
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }
}
