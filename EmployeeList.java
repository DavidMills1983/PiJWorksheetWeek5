import java.util.Arrays;
import java.util.Scanner;

public class EmployeeList {
    private String[] names;
    private int[] ids;
    private int count;

    public EmployeeList() {
        names = new String[0];
        ids = new int[0];
        count = 0;
    }

    public void addEmployee(String name, int id) {
        if (count == names.length) {
            resizeArrays();
            addEmployee(name, id);
        } else {
            names[count] = name;
            ids[count] = id;
            count++;
        }
    }

    public void resizeArrays() {
        String[] newNames;
        newNames = new String[count + 1];
        int[] newIds;
        newIds = new int[count + 1];

        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
            newIds[i] = ids[i];
        }

        names = newNames;
        ids = newIds;

    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "names=" + Arrays.toString(names) +
                ", ids=" + Arrays.toString(ids) +
                '}';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();

        while (true) {

            System.out.println("Enter employee's name: ");
            String name = input.nextLine();
            if (name.isEmpty()){
                break;
            }

            System.out.println("Enter employee's ID: ");
            int id = input.nextInt();
            input.nextLine();
            if (id == 0){
                break;
            }

            employeeList.addEmployee(name, id);

        }

        System.out.println(employeeList);
    }
}