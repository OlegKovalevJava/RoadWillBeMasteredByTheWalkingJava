package finished.archive.lesson26;

public class Main {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("word");
        StringBuilder wordTwo = new StringBuilder("wordTwo");
        String wordThree = "wordThree";

        System.out.println("compareTo: " + word.compareTo(wordTwo));
        //System.out.println("delete: " + word.delete(0, 2));
        System.out.println("deleteCharAt: " + word.deleteCharAt(3));
        System.out.println("replace " + word.replace(1,2,wordThree));
        System.out.println("reverse " + word.reverse());

    }
}