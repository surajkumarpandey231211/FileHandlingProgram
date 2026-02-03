import java.io.File;
public class FileCreation{
public static void main(String[] args) {
    File f1=new File("D:\\FileCreation.txt");
    try{
        System.out.println(f1.createNewFile());
        System.out.println("File is createed....");
    }catch(Exception e){
        System.out.println("File is not created...");
    }
    System.out.println(".......Program Ends.....");
}
}