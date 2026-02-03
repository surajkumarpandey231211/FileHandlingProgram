import java.io.File;
import java.io.FileWriter;
public class FileWriter12{
    public static void main(String[] args) {
        File f1=new File("D:\\fileCreation.txt");
        try
            (FileWriter fr=new FileWriter(f1)){
            fr.write("Mohan is good bay");
            System.out.println("Text is written");
           
        }catch(Exception e){
            System.out.println("Exception catched..");
        }
    }
    
}
