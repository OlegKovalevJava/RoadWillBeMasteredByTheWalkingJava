package lesson28;

public class Main {
    public static void main(String[] args) {

// Создаем объект Generic1, T в этом экземпляре равносильно String
        Generic1<String> generic1String = new Generic1<>();
        generic1String.setField("1");

// Создаем объект Generic1, T в этом экземпляре равносильно Integer
        Generic1<Integer> generic1Integer = new Generic1<>();
        generic1Integer.setField(1);

// Создаем объект Generic1 без указания параметризации, T в этом экземпляре равносильно Object
        Generic1 generic1Object = new Generic1();
// Поскольку тип не указан явно, мы можем передавать все, что может быть приведено к ссылочному типу
        generic1Object.setField("1");
//Здесь работает принцип автоупаковки. Будет передан параметр типа Integer, а не int
        generic1Object.setField(1);

    }
}
