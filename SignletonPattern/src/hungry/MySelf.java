package hungry;

/**
 * 饿汉模式,
 * 所谓 “饿汉方式” 就是说JVM在加载这个类时就马上创建此唯一的单例实例，
         * 不管你用不用，先创建了再说，如果一直没有被使用，便浪费了空间，典型的空间换时间，每次调用的时候，就不需要再判断，节省了运行时间。
         */
final class MySelf {
    // 在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static MySelf me = new MySelf(23);
    private int age;
    private MySelf(){}
    private MySelf(int age) {
        this.age = age;
    }
    public static MySelf getInstance(){
        return me;
    }

    public int getAge() { return age; }
    public void setAge(int x) { age = x; }

}
