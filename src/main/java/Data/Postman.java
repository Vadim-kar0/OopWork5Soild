package Data;

public class Postman extends User{
    ///////////////////Single responsibility principle//////////////////////
    // Даннный класс отвечает только за сущность Postman

    ///////////////////Liskov substitution principle//////////////////////
    // Этот класс можно использовать на месте родидельского

    ///////////////////Open-closed principle//////////////////////
    // Класс открыт для расширения


    private String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Postman(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }
}
