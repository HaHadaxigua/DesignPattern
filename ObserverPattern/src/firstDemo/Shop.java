package firstDemo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * if there is a shop and people want it's production
 * but the shop have a poor capacity
 * so if the production arrive, and the shop will notice customer
 * and if customer get the message, they will go to shop
 */
public class Shop implements Subject {
    List<Observer> customers = new ArrayList<>();        // keep a list of customer
    private Boolean arriveInfo;
    @Override
    public void myNotify() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        for (Observer o: customers) {
            if(arriveInfo) {
                try {
                    Thread.sleep(100);
                    Date date = new Date();
                    o.getUpdate("will rush to buy!! at---"+simpleDateFormat.format(date));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                o.getUpdate("i will'not by");
            }
        }
    }

    /**
     * add Observer
     */
    public void addAttach(Observer o){
        customers.add(o);
    }
    public Boolean getArriveInfo() {
        return arriveInfo;
    }
    public void setInfo(Boolean info){
        arriveInfo = info;
        myNotify();
    }
}
