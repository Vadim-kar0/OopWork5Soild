package Data;

public class Mail {
    ///////////////////Single responsibility principle//////////////////////
    // Даннный класс отвечает только за сущность Mail
    ///////////////////Open-closed principle//////////////////////
    // Класс открыт для расширения


    private Human to;
    private Postman from;
    private String address;
    private String data;

    public Mail(Human to, Postman from, String address, String data) {
        this.to = to;
        this.from = from;
        this.address = address;
        this.data = data;
    }
    public Mail(){

    }

    public Mail generateNewMail(){
        return new Mail(new Human("Vasya","Lenena5"),
                new Postman("fsfasdf","Boss"),
                "adress",
                "aldkjflasjdlfjaslfj");
    }
}
