package lesson28;

//Параметризуем класс generic T. T может быть любым ссылочным типом
public class Generic1<T> {
    //Объявляем поле типа T. В конечном итоге для каждого экземпляра T будет соответствовать конкретному типу данных
    private T field;

    //Метод, возвращающий объект, соответствующий типу T для данного экземпляра Generic1
    public T getField() {
        return field;
    }

    //Метод, принимающий параметр, соответствующий типу T для данного экземпляра Generic1
    public void setField(T field) {
        this.field = field;
    }
}