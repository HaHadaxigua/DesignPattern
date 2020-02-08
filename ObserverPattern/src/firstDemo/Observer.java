package firstDemo;

/**
 * 观察者接口
 */
public interface Observer {
    // 获得通知后更新
    void getUpdate(String msg);
}
