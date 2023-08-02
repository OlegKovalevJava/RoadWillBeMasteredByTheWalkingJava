package skillfactory.array;

import lombok.Getter;

@Getter
public class UserName {
    private String nameUserOne;
    private String nameUserTwo;

    public UserName(String nameUserOne, String nameUserTwo) {
        this.nameUserOne = nameUserOne;
        this.nameUserTwo = nameUserTwo;
    }
}