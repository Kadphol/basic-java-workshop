public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String pos;

    public String getFullName() {
        return firstName + " : " + lastName;
    }
}