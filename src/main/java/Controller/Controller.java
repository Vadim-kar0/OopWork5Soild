package Controller;

import Data.Mail;
import MVP.HumanMailView;
import Service.MailService;

public class Controller {
    ///////////////////Single responsibility principle//////////////////////
    // Данный класс реализует только связь сервисов
    ///////////////////Open-closed principle//////////////////////
    // на основе этого класса можно создать новый реализуя Методы по иному принципу
    ///////////////////////////Dependency inversion principle///////////////////////
    // Этот класс не зависит от MailService и HumanMailView
    // методы HumanMailView и MailService не зависят от класса Mail
    MailService mailService = new MailService();
    HumanMailView humanMailView = new HumanMailView();

    public void start(Mail data) {
        String qwe = mailService.sendMail(data);
        humanMailView.GetMail(qwe);
    }
}
