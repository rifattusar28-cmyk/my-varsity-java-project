class Student {
    int id;
    String name;
    double cgpa;

    
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student(055, "Rahim", 3.75);
        Student s2 = new Student(056, "Karim", 3.85);
        Student s3 = new Student(057, "Sumaiya", 3.92);

        System.out.println("//--- Student Details ---");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}


