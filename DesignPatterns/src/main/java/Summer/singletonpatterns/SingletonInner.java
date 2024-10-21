package Summer.singletonpatterns;

/**
 * 静态内部类
 */
public class SingletonInner {
    private SingletonInner() {
    }

    private static class SingletonHolder {
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
