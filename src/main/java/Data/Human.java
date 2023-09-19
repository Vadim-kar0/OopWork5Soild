package Data;

public class Human extends User{

    ///////////////////Single responsibility principle//////////////////////
    // Даннный класс отвечает только за сущность Human
    ///////////////////Liskov substitution principle//////////////////////
    // Этот класс можно использовать на месте родидельского
    ///////////////////Open-closed principle//////////////////////
    // Класс открыт для расширения

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Human(String name, String address) {
        super(name);
        this.address = address;
    }
}
