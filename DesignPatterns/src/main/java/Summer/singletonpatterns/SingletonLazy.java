package Summer.singletonpatterns;

public class SingletonLazy {

    public static SingletonLazy singleLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singleLazy == null) {
            singleLazy = new SingletonLazy();
        }
        return singleLazy;
    }
}
