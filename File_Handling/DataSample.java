

import java.io.*;

public class DataSample {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\data.txt");
        int index = 0;
        int count = 0;
        String word = "Java";
        int ch;
        while((ch = fis.read()) != -1){
            if((char) ch == word.charAt(index)){
                index++;
                if(index == word.length()){
                    count++;
                    index = 0;
                }
            }
            else{
                index = 0;
            }
        }
        fis.close();
        System.out.println(count);
    }
}