package hungryInEnum;

public enum Singleton {
    //定义一个枚举的元素，它就是 Singleton 的一个实例
    He("he", 20),
    She("she", 21);

    private String name;
    private int age;

    private Singleton() {
    }

    private Singleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInstance() {
        System.out.println("枚举方式实现单例");
    }
}
