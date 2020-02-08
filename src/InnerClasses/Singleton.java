package InnerClasses;

public class Singleton {
    private int count =0;

    private static Singleton instance;

    Singleton(){

    }

    public int getCount(){
        return ++count;
    }

    private static class SingletonInner {
        static {
            instance = new Singleton();
        }

        public static Singleton getInstanc(){
            return instance;
        }
    }
    public static Singleton getInstance(){
        return SingletonInner.getInstanc();
    }
}
