package oscar.persistance;

import java.util.TimerTask;

/**
 *
 * @author schiodin
 */
public class ClassUpdateTableTask extends TimerTask {

    @Override
    public void run() {
        //TODO: implement booking table filter update
        System.out.println(System.nanoTime() + "update class table");
    }
}