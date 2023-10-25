package home;

abstract class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void working() {
        System.out.println(name + " works in " + department);
    }
}
