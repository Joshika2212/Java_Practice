
import java.io.*;

class Student implements Serializable {
    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}

public class ObjectSample2 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Ravi", 101, 85);
            Student s2 = new Student("Priya", 102, 92);
            Student s3 = new Student("Arun", 103, 76);

            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("student_data.dat"));

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("student_data.dat"));

            double total = 0;
            int count = 0;

            while (true) {
                try {
                    Student std = (Student) ois.readObject();

                    System.out.println(
                        std.name + " " + std.rollno + " " + std.marks);

                    total += std.marks;
                    count++;

                } catch (EOFException e) {
                    System.out.println("End of file reached");
                    break;
                }
            }

            if (count > 0) {
                System.out.printf("Average Marks: %.2f%n", total / count);
            }

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}