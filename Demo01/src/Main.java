public class Main {
    public static void main(String[] args) {
        String fname = args[0];
        String lname = args[1];
        Employee employee = new Employee(fname,lname);
        String result = employee.getFullName();
        System.out.println(result);
    }
}
