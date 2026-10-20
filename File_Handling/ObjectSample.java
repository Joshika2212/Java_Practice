import java.io.*;

class Student implements Serializable{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectSample {
    public static void main(String[] args){
        try{
            Student s = new Student("Ravi",85);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
            oos.writeObject(s);
            System.out.println("Objact written succesfully");
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));
            Student std = (Student) ois.readObject();
            System.out.println(std.name);
            System.out.println(std.marks);
            ois.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
