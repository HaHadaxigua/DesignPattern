package demo1;

public abstract class PancakeDecorator implements IPancake {
    private IPancake pancake;

    public PancakeDecorator(IPancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public void cook() {
        if (this.pancake != null)
            pancake.cook();
    }

    interface MLogger {
        void log(String msg);
    }
}
