package abstractFactoryPattern;

public class M41Factory implements ArmsFactory{
    public M41Factory() {
        System.out.println("Constructor: you create a M4-factory");
    }

    @Override
    public Bullet getBullet() {
        return new M41A_bullet();
    }

    @Override
    public Gun getGun() {
        return new M41A();
    }
}
