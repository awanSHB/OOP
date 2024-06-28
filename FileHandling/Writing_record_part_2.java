import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Writing_record_part_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            BufferedWriter ds = new BufferedWriter(new FileWriter("Assignment.txt"));

            String[] arr = new String[5];
            int[] arrg = new int[5];

            for (int i=0;i<arr.length;i++){
                System.out.print("Enter name of Student- "+(i+1)+" :");
                arr[i]= input.next();

                //ds.write(String.valueOf(arr[i]));
                //ds.write("\n");

            }
            for (int i=0;i<arr.length;i++) {
                System.out.print("Enter GPA of "+arr[i]+  " :");

                arrg[i] = input.nextInt();

                ds.write((arr[i])+" = "+(arrg[i]));
                ds.write("\n");

            }

            System.out.println();
            //OutputPrinting

            for (int i=0;i<arr.length;i++){


                //System.out.println(arr[i]+" = "+arrg[i]);

                System.out.println(String.valueOf(arr[i])+" = "+ arrg[i]);

            }
            ds.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }

}




