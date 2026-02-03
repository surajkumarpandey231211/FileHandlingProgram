import java.io.File;
import java.io.FileReader;
public class FileRead12 {
    public static void main(String[] args) {
        File f1=new File("D:\\fileCreation.txt");
        try(FileReader fr=new FileReader(f1)){
            int x=fr.read();
            while(x != -1){
                System.out.print((char)x);
                x=fr.read();
            }
            System.out.println("Complete reading ");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
