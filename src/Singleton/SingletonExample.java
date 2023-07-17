package Singleton;

class SingletonPattern{
    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern(){
        // init DB
    }

    public static SingletonPattern getInstance(){
        return instance;
    }

    public void getDBConnection(){
        System.out.println("DB Connection");
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        singletonPattern1.getDBConnection();

        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        singletonPattern2.getDBConnection();

        System.out.println(singletonPattern1 == singletonPattern2);
    }
}
