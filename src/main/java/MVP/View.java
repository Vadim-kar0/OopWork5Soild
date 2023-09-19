package MVP;

public interface View {

    //////////////////////////Interface segregation principle///////////////////////
    // Интерфейс реализует только методы необходимые для работы пользователя с почтой
    public void ReturnMail();
    public void SendMail();
    public void GetMail(String data);
    public void TalkWithPostman();


}
