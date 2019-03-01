package Ass8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Manager {
    public static Scanner sc = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<>();

    public String getString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.trim().length() == 0) {
            System.out.println("Invalid DATA TYPE!!! Please input a STRING: ");
            s = sc.nextLine();
        }
        return s;
    }

    public static boolean message(String a, String b) {
        while (true) {
            String k = sc.nextLine();
            if (k.equalsIgnoreCase(a)) {
                return true;
            } else if (k.equalsIgnoreCase(b)) {
                return false;
            } else {
                System.out.println("Please input " + a + " or " + b);
            }
        }
    }

    public void addStudent() {
        while (true) {
            System.out.println("Enter ID: ");
            int id = sc.nextInt();
            System.out.println("Enter name: ");
            String name = getString();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter address: ");
            String address = getString();
            System.out.println("Enter gpa: ");
            int gpa = sc.nextInt();
            listStudent.add(new Student(id, name, age, address, gpa));
            System.out.println("Do you want to continue? Y or N");
            if (message("Y", "N") == false) {
                break;
            }
        }

    }

    public void editStudent() {
        while (true) {
            System.out.println("Enter ID: ");
            int id1 = sc.nextInt();
            System.out.println("Edit name: ");
            String name1 = getString();
            System.out.println("Edit age: ");
            int age1 = sc.nextInt();
            System.out.println("Edit address: ");
            String address1 = getString();
            System.out.println("Edit gpa: ");
            int gpa1 = sc.nextInt();
            int size = listStudent.size();
            for (int i = 0; i < size; i++) {
                if (listStudent.get(i).getId() == id1) {
                    listStudent.get(i).setName(name1);
                    listStudent.get(i).setAge(age1);
                    listStudent.get(i).setAddress(address1);
                    listStudent.get(i).setGpa(gpa1);
                    break;
                }
            }
            System.out.println("Do you want to continue? Y or N");
            if (message("Y", "N") == false) {
                break;
            }
        }
    }

    public void delete() {
        while (true) {
            System.out.println("Enter ID: ");
            int id1 = sc.nextInt();
            int size = listStudent.size();
            for (int i = 0; i < size; i++) {
                if (listStudent.get(i).getId() == id1) {
                    listStudent.remove(i);
                    break;
                }
            }
            System.out.println("Do you want to continue? Y or N");
            if (message("Y", "N") == false) {
                break;
            }
        }

    }

    public void show() {
        int size = listStudent.size();
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + listStudent.get(i).getId());
            System.out.println("Name: " + listStudent.get(i).getName());
            System.out.println("Age: " + listStudent.get(i).getAge());
            System.out.println("Address: " + listStudent.get(i).getAddress());
            System.out.println("GPA: " + listStudent.get(i).getGpa());
            System.out.println("==============================");
        }
    }

    public void sortbyGPA() {
        Collections.sort(listStudent, new Comparator<Student>() {//sort list by ID
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() > o2.getGpa()) {
                    return 1;
                }
                return -1;

            }
        });
    }

    public void sortbyName(){
        Collections.sort(listStudent, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());

            }

        });
    }

    public void menu() {
        while (true) {//the program returns main screen
            System.out.println("1: Add");
            System.out.println("2: Edit");
            System.out.println("3: Delete");
            System.out.println("4: Sort by gpa");
            System.out.println("5: Sort by name");
            System.out.println("6: Show");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    sortbyGPA();
                    show();
                    break;
                case 5:
                    sortbyName();
                    show();
                    break;
                case 6:
                    show();
            }

        }
    }
}
