package Controller;

import Data.Mail;
import MVP.HumanMailView;
import Service.MailService;

public class Controller {
    MailService mailService = new MailService();
    HumanMailView humanMailView = new HumanMailView();

    public void start(Mail data) {
        String qwe = mailService.sendMail(data);
        humanMailView.GetMail(qwe);
    }
}
