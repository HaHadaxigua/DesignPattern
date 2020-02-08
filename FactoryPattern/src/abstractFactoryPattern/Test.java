package abstractFactoryPattern;

public class Test {
    public static void main(String[] args) {
        ArmsFactory myFactory = new M41Factory();
        Gun myGun = myFactory.getGun();
        Bullet bullet = myFactory.getBullet();
        myGun.shooting();
        bullet.loading();
    }
}
