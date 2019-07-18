package Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements Mediator, ActionListener {

    private ColleagueCheckBox checkGuest;
    private ColleagueCheckBox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancle;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("UserName:"));
        add(textUser);
        add(new Label("Password"));
        add(textPass);
        add(buttonOK);
        add(buttonCancle);
        colleagueChanged();
        pack();
        show();
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckBox("Guest",g,true);
        checkLogin = new ColleagueCheckBox("Login",g,false);
        textUser = new ColleagueTextField("",10);
        textPass = new ColleagueTextField("",10);
        textPass.setEchoChar('*');
        buttonOK = new ColleagueButton("OK");
        buttonCancle = new ColleagueButton("Cancle");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancle.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOK.addActionListener(this);
        buttonCancle.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {

        if(checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(true);
        }else{
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }

    }

    private void userpassChanged() {
        if(textUser.getText().length()>0){
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length()>0){
                buttonOK.setColleagueEnabled(true);
            }else{
                buttonOK.setColleagueEnabled(false);
            }
        }else{
            textPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
