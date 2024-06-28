import java.io.File;
import java.util.Random;

public class creating_file {


    public static void main(String[] args) {

        File ds = new File("Assignment.txt");

        try{
            boolean success = ds.createNewFile();
            if (success){
                System.out.println("File Created :"+ds.getName());
            }
            else{

                System.out.println("File already exists");
            }
            System.out.println("Path : "+ds.getAbsolutePath());


        }catch (Exception e){
            System.out.println(e);
        }



    }


}
