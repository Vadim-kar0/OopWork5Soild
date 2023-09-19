package Data;

public class User {
    ///////////////////Single responsibility principle//////////////////////
    // Даннный класс отвечает только за сущность User

    ///////////////////Open-closed principle//////////////////////
    // Класс открыт для расширения


    private String name;

    public User(String name) {
        this.name = name;
    }
}
