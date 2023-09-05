package skillFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("borodino.txt"), UTF_8);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер строки в диапазоне 1.." + lines.size());
        int n = in.nextInt();
        System.out.println("Вот предсказание для вас:\n" + lines.get(n - 1));

    }
}
