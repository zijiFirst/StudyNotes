package Summer.singletonpatterns;

public class SingletonHungry {

    public static SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return INSTANCE;
    }
}
