import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Append {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            BufferedWriter ds = new BufferedWriter(new FileWriter("Assignment.txt"));
            int n=5;

            String[] arr = new String[n];
            int[] arrg = new int[n];

            for (int i=0;i<arr.length;i++){
                System.out.print("Enter name of Student- "+(i+1)+" :");
                arr[i]= input.next();

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

                System.out.println(String.valueOf(arr[i])+" = "+ arrg[i]);

            }
            System.out.println("Do you want to Edit Record? Press 1");
            System.out.println("Do you want to Add Record? Press 2");
            System.out.println("Do you want to Delete Record? Press 3");

            int x = input.nextInt();

            switch (x){
                case 1:

                    int done = 1;

                    while (done !=0){

                        System.out.println("Which Record do you want to edit");
                        System.out.println();
                        for (int i=0;i<arr.length;i++) {

                            System.out.println(String.valueOf(arr[i]) + " = " + arrg[i]);

                        }
                        int edit_user_choice = input.nextInt();
                        if (edit_user_choice ==0){
                            arr[0] = "";
                            arrg[0] = 0;
                            System.out.print("Enter the name Again :");
                            arr[edit_user_choice] = input.next();
                            System.out.print("Enter the GPA Again :");
                            arrg[edit_user_choice] = input.nextInt();



                        }else if (edit_user_choice ==1){
                            arr[1] = "";
                            arrg[1] = 0;
                            System.out.println("Enter the name Again");
                            arr[edit_user_choice] = input.next();
                            System.out.println("Enter the GPA Again ");
                            arrg[edit_user_choice] = input.nextInt();


                        }else if (edit_user_choice ==2){
                            arr[2] = "";
                            arrg[2] = 0;
                            System.out.println("Enter the name Again");
                            arr[edit_user_choice] = input.next();
                            System.out.println("Enter the GPA Again ");
                            arrg[edit_user_choice] = input.nextInt();




                        }else if (edit_user_choice ==3){
                            arr[3] = "";
                            arrg[3] = 0;
                            System.out.println("Enter the name Again");
                            arr[edit_user_choice] = input.next();
                            System.out.println("Enter the GPA Again ");
                            arrg[edit_user_choice] = input.nextInt();

                        }else if (edit_user_choice ==4){
                            arr[4] = "";
                            arrg[4] = 0;
                            System.out.println("Enter the name Again");
                            arr[edit_user_choice] = input.next();
                            System.out.println("Enter the GPA Again ");
                            arrg[edit_user_choice] = input.nextInt();

                        }else if (edit_user_choice ==5) {
                            arr[5] = "";
                            arrg[5] = 0;
                            System.out.println("Enter the name Again");
                            arr[edit_user_choice] = input.next();
                            System.out.println("Enter the GPA Again ");
                            arrg[edit_user_choice] = input.nextInt();

                        }
                        System.out.println("Do you want to edit any other Record, Press 1 to edit or 0 to Exit. ");
                        done = input.nextInt();


                    }
                    // print updated list.......

                    for (int i=0;i<arr.length;i++) {

                        System.out.println(String.valueOf(arr[i]) + " = " + arrg[i]);
                    }break;


                case 2:

                    int more = 1;


                        for (int i=0;i<arr.length;i++) {

                            System.out.println(String.valueOf(arr[i]) + " = " + arrg[i]);
                        }


                        System.out.print("How many records do you want to enter :");

                        int more_records = input.nextInt();

                        String[] arrrrj = new String[(n+more_records)];
                        int [] arrrrjg = new int[(n+more_records)];

                        int l=0;

                        for (int k=0;k<more_records;k++){
                            l++;

                            System.out.print("Enter name of student "+(n+k+1)+": ");
                            arrrrj[k] = input.next();

                        }
                        for (int k=0;k<more_records;k++){
                            l++;

                            System.out.print("Enter GPA student "+(k+n+1)+": ");
                            arrrrjg[k] = input.nextInt();

                        }
                        //Updated List is
                        for (int i=0;i<arr.length;i++) {

                            ds.write(String.valueOf(arr[i]) + " = " + arrg[i]);
                        }
                        for (int k=0;k<more_records;k++) {

                            ds.write(String.valueOf(arrrrj[k]) + " = " + arrrrjg[k]);
                        }



                    break;

            }


            ds.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }



}
