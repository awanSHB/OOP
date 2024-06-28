import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Writing_record {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            BufferedWriter ds = new BufferedWriter(new FileWriter("Assignment.txt"));

            String[] arr = new String[5];

            for (int i=0;i<arr.length;i++){
                System.out.print("Enter name of Student- "+(i+1)+" :");
                arr[i]= input.next();


                ds.write((arr[i]));
                ds.write("\n");

            }

            System.out.println();
            //OutputPrinting

            for (int i=0;i<arr.length;i++){
                System.out.println(String.valueOf(arr[i]));

            }
            ds.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }

}
