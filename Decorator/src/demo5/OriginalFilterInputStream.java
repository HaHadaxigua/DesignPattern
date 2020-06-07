package demo5;

/**
 * 使用继承方式扩展能力
 * 从基本的构件去扩展能力
 */
public class OriginalFilterInputStream extends NormalInputStream {
    @Override
    public void read() {
        System.out.print("read");
        addFilter();
    }

    public void addFilter() {
        System.out.print("add filter func\n");
    }
}
