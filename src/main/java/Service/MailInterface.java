package Service;

import Data.Mail;

public interface MailInterface {

    //////////////////////////Interface segregation principle///////////////////////
    // Интерфейс реализует только методы необходимые для работы с почтой


    public String sendMail(Mail data);
    public void ReturnedMail();
    public void GetMail();
}
