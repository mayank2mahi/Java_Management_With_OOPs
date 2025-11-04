import java.util.*;

class Student {
    private int id;
    private String name;
    private int totmarksobt;

    // Parameterized constructor
    public Student(int id, String name, int totmarksobt) {
        this.id = id;
        this.name = name;
        this.totmarksobt = totmarksobt;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotmarksobt() {
        return totmarksobt;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotmarksobt(int totmarksobt) {
        this.totmarksobt = totmarksobt;
    }
}

public class Solution {

    // Method 1: Find student with highest total marks
    public static String findStudentWithhighestTotal(Student[] students) {
        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getTotmarksobt() > topper.getTotmarksobt()) {
                topper = students[i];
            }
        }
        return topper.getName().toUpperCase();
    }

    // Method 2: Find students who scored >= 70%
    public static int[] searchStudentsBypercentage(Student[] students) {
        List<Integer> ids = new ArrayList<>();
        for (Student s : students) {
            double percentage = (s.getTotmarksobt() / 400.0) * 100;
            if (percentage >= 70.0) {
                ids.add(s.getId());
            }
        }
        if (ids.isEmpty()) {
            return null;
        }
        Collections.sort(ids);
        int[] result = new int[ids.size()];
        for (int i = 0; i < ids.size(); i++) {
            result[i] = ids.get(i);
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.nextLine().trim());
            String name = sc.nextLine().trim();
            int totmarksobt = Integer.parseInt(sc.nextLine().trim());
            students[i] = new Student(id, name, totmarksobt);
        }

        // Find and print topper name
        String topper = findStudentWithhighestTotal(students);
        System.out.println(topper);

        // Find and print students with >=70%
        int[] res = searchStudentsBypercentage(students);
        if (res == null) {
            System.out.println("No Student found with mentioned attribute.");
        } else {
            for (int id : res) {
                System.out.println(id);
            }
        }
    }
}
