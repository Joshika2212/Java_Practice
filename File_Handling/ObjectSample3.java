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

public class ObjectSample3 {
    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int total = 0;
        int num = 0;
        String n = "";

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student_data.dat")
            );

            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    System.out.println(s.name + " " + s.rollno + " " + s.marks);
                    count++;
                    if (s.marks > 80)
                        num++;
                    total += s.marks;
                    if (s.marks > max) {
                        max = s.marks;
                        n = s.name;
                    }
                } catch (EOFException e) {
                    System.out.println("End of file reached");
                    break;
                }
            }

            ois.close();

            if (count > 0) {
                System.out.println("The total no. of students is " + count);
                System.out.println("The highest mark is " + max + " scored by " + n);
                System.out.println("The no. of students who got above 80 is " + num);
                System.out.println("The average is " + (double) total / count);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}