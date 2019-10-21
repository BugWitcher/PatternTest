
import DecoratorClasses.BasicArmor;
import DecoratorClasses.*;
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


            /*
        public static final int BASIC_ARMOR =100;
        public static final int ARMOR_ARMOR =200;
        public static final int HELMET_ARMOR =20;
        public static final int TROUSERS_ARMOR =50;

        public static final int LIGHT_ARMOUR =50 ;
        public static final int MEDIUM_ARMOUR =80 ;
        public static final int HEAVY_ARMOUR =100 ;

        TEMERIAN (" Temerian " , Constants.MEDIUM_ARMOUR),
        NILFGARD (" Nilfgard " , Constants.HEAVY_ARMOUR),
        KAEDWANIAN (" Temerian " , Constants.LIGHT_ARMOUR);


        */

        EquipmentItem superman = new Armor( new Helmet ( new Trousers(new BasicArmor())));
        System.out.println(" Armor description " + superman.getDescription());
        System.out.println(" Armor strength " + superman.getArmor());

        EquipmentItem witcher = new Armor( new Helmet ( new Trousers(new BasicArmor())),"TEMERIAN");
        System.out.println("Witcher Armor description " + witcher.getDescription());
        System.out.println("Witcher  Armor strength " + witcher.getArmor());

        EquipmentItem witcher2 = new Armor( new Helmet ( new Trousers(new BasicArmor())),"NILFGARD");
        System.out.println("Witcher Armor description " + witcher2.getDescription());
        System.out.println("Witcher  Armor strength " + witcher2.getArmor());
    }
}
