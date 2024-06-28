import java.io.FileWriter;

public class write_to_file {
    public static void main(String[] args) {



        try{
            FileWriter ds = new FileWriter("Assignment.txt");

            ds.write("Hello Well Done\n");
            ds.write("Reading the second line \n");
            ds.write("Reading the third line\n");
            ds.close();

        }catch (Exception e){
            System.out.println(e);
        }



    }


}
