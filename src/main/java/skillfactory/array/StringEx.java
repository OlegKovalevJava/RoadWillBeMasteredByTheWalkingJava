package skillfactory.array;

public class StringEx {
    public static void main(String[] args) {

        UserName user1 = new UserName("MAX", "MAX");
        check(user1);
    }

    public static void check(UserName userName) {
       if (userName.getNameUserOne().equals(userName.getNameUserTwo())) {
           System.out.println("NORM");
       }else System.out.println("NO");
    }
}