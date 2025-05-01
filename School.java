public class School {
    // Lists to store students, teachers, and classes
    String[] students = new String[100];
    String[] teachers = new String[50];
    String[] classes = new String[20];
    int studentCount = 0;
    int teacherCount = 0;
    int classCount = 0;

    // Method to add a student
    void addStudent(String name) {
        students[studentCount] = name;
        studentCount++;
        System.out.println(name + " added as a student.");
    }

    // Method to remove a student
    void removeStudent(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].equals(name)) {
                students[i] = null;
                System.out.println(name + " removed from students.");
                break;
            }
        }
    }

    // Method to add a teacher
    void addTeacher(String name) {
        teachers[teacherCount] = name;
        teacherCount++;
        System.out.println(name + " added as a teacher.");
    }

    // Method to remove a teacher
    void removeTeacher(String name) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i] != null && teachers[i].equals(name)) {
                teachers[i] = null;
                System.out.println(name + " removed from teachers.");
                break;
            }
        }
    }

    // Method to create a class
    void createClass(String name) {
        classes[classCount] = name;
        classCount++;
        System.out.println("Class " + name + " created.");
    }

    // Method to display all details
    void displayDetails() {
        System.out.println("\nSchool Details:");
        System.out.print("Students: ");
        for (String student : students) {
            if (student != null) System.out.print(student + " ");
        }
        System.out.print("\nTeachers: ");
        for (String teacher : teachers) {
            if (teacher != null) System.out.print(teacher + " ");
        }
        System.out.print("\nClasses: ");
        for (String cls : classes) {
            if (cls != null) System.out.print(cls + " ");
        }
        System.out.println();
    }

    // Main method inside the School class
    public static void main(String[] args) {
        School mySchool = new School();

        mySchool.addStudent("Alice");
        mySchool.addStudent("Bob");

        mySchool.addTeacher("Mr. Smith");
        mySchool.addTeacher("Ms. Johnson");

        mySchool.createClass("Math");
        mySchool.createClass("Science");

        mySchool.displayDetails();

        mySchool.removeStudent("Alice");
        mySchool.removeTeacher("Mr. Smith");

        mySchool.displayDetails();
    }
}
