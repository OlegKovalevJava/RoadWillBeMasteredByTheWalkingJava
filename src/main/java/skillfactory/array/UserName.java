package skillfactory.array;

public class UserName {

    String nameUserOne;
    String nameUserTwo;

    public UserName(String nameUserOne, String nameUserTwo) {
        this.nameUserOne = nameUserOne;
        this.nameUserTwo = nameUserTwo;
    }

    public void checkUserName() {
        if (nameUserOne.equals(nameUserTwo)) {
            System.out.println("Выберите другое имя!");
        } else System.out.println("Отличное имя!");
    }

}