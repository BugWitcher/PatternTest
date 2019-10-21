package SingletonClasses;

/*
  1. prywatny konstruktor

 */



public class Singleton_v1 {

        private static Singleton_v1 ourInstance = new Singleton_v1();

        private int number =314;

        public static Singleton_v1 getInstance() {
            return ourInstance;
        }

        private Singleton_v1() {
        }

    public int getNumber() {
        return number;
    }
}
