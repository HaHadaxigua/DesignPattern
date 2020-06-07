package demo11;

/**
 * 具体组件
 * 就是一个普通的对象，我们需要装饰的东西就是他
 */
public class WhiteWater extends Tea {
    public WhiteWater() {
        setName("white_water");
        setPrice(100);
    }
}
