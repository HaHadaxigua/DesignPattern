package abstractFactoryPattern;

public class AKFactory implements ArmsFactory {
    public AKFactory() {
        System.out.println("Constructor: you create a Ak-factory");
    }

    @Override
    public Bullet getBullet() {
        return new Ak47_bullet();
    }

    @Override
    public Gun getGun() {
        return new Ak47();
    }
}
