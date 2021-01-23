public class Person {
    String name;
    String address;

    public Person() {
        System.out.println("Input new Person!");
    }

    public Person(String name, String address) {
        System.out.println("Input new Person!");
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
        System.out.println("Address changed!");
    }

    public String toString() {
        return name + "(" + address + ")";
    }
}
