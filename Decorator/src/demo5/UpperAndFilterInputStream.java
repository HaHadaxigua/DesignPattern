package demo5;

import java.io.FilterInputStream;

public class UpperAndFilterInputStream extends OriginalFilterInputStream {
    @Override
    public void read() {
        System.out.print("we add ");
        addFilter();
    }

    @Override
    public void addFilter() {
        super.addFilter();
        System.out.print("we add filter in upper\n");
    }
}
