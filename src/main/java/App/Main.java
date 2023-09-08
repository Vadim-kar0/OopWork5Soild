package App;

import Controller.Controller;
import Data.Mail;
import MVP.HumanMailView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Mail mail = new Mail();
        mail = mail.generateNewMail();
        controller.start(mail);

    }
}
