package Service;

import Data.Mail;

public interface MailInterface {
    public String sendMail(Mail data);
    public void ReturnedMail();
    public void GetMail();
}
