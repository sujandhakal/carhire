package oscar.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import oscar.MVC.Controller;
import oscar.task.HirePersonUpdateTask;
import oscar.view.StaffView;

/**
 *
 * @author Draga
 */
public class StaffController extends Controller {

    private StaffView staffView;
    /*// weather the controller is attached to the admin one
    private boolean passive = false;*/
    private HirePersonUpdateTask hirePersonUpdateTask;
    private Timer timer;

    @Override
    public void run() {
        this.setName("Staff");
        staffView = new StaffView();
        this.addElement(staffView);
        this.addElement(staffView.getLogoutBtn());
        // Hire tab
        this.addElement(staffView.getHireAddressTxt());
        this.addElement(staffView.getHireBtn());
        this.addElement(staffView.getHireChauffeuredCB());
        this.addElement(staffView.getHireClassCB());
        this.addElement(staffView.getHireClearBtn());
        this.addElement(staffView.getHireDateOfBirthDP());
        this.addElement(staffView.getHireEmailTxt());
        this.addElement(staffView.getHireFromDP());
        this.addElement(staffView.getHireInsuranceCB());
        this.addElement(staffView.getHireNameTxt());
        this.addElement(staffView.getHirePersonLoadBtn());
        this.addElement(staffView.getHirePhoneTxt());
        this.addElement(staffView.getHireRefCodeSearchBtn());
        this.addElement(staffView.getHireRefCodeTxt());
        this.addElement(staffView.getHireSurnameTxt());
        this.addElement(staffView.getHireToDP());
        
        timer = new Timer();
        hirePersonUpdateTask = new HirePersonUpdateTask();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(staffView.getLogoutBtn()))
            actionLogout();
        //Hire tab
        else if (e.getSource().equals(staffView.getHireBtn()))
            actionHire();
        else if (e.getSource().equals(staffView.getHireClearBtn()))
            actionHireClearFields();
        else if (e.getSource().equals(staffView.getHirePersonLoadBtn()))
            actionHireLoadPerson();
        else if (e.getSource().equals(staffView.getHireRefCodeSearchBtn()))
            actionHireSearchRefCode();
    }

    private void actionLogout() {
        new LoginController().start();
        this.removeAllElement();
    }

    private void actionHire() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void actionHireSearchRefCode() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void actionHireLoadPerson() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void actionHireClearFields() {
        staffView.getHireChauffeuredCB().setSelected(false);
        staffView.getHireClassCB().setSelectedIndex(0);
        staffView.getHireInsuranceCB().setSelected(false);
        staffView.getHireDateOfBirthDP().setDate(null);
        staffView.getHireFromDP().setDate(null);
        staffView.getHireToDP().setDate(null);
        staffView.getHireAddressTxt().setText("");
        staffView.getHireEmailTxt().setText("");
        staffView.getHireNameTxt().setText("");
        staffView.getHirePhoneTxt().setText("");
        staffView.getHireRefCodeTxt().setText("");
        staffView.getHireSurnameTxt().setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource().equals(staffView.getHireNameTxt())){
            
            //System.out.println(staffView.ge
            
            String query = staffView.getHireNameTxt().getText();
            System.out.println(query);
        }
       // throw new UnsupportedOperationException("Not supported yet.");
    }
}
