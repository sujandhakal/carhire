package oscar.task;

import java.util.TimerTask;

/**
 *
 * @author schiodin
 */
public class HirePersonUpdateTask extends TimerTask {

    @Override
    public void run() {
        //TODO: implement booking table filter update
        System.out.println(System.nanoTime() + "update hire person table");
    }
}