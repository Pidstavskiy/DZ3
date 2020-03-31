import java.util.*;


public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> surname = new ArrayList<>();
        while (true) {
            System.out.println("Choose task \n 1: Swap elements  \n 2: Arithmetic mean  \n 3: Filling the array and output \n 4: Exit ");
            int k = scanner.nextInt();

            if(k==1){
                String [] array = new String[] {"Phone","Notebook","Computer","Microphone"};
                String temp;
                int length = array.length;
                System.out.println("Output before change");
                for (int i =0;i<array.length;i++){
                    System.out.println(array[i]);
                }

                for (int i =0; i<length/2;i++){
                    temp= array[length-i-1];
                    array[length-i-1]=array[i];
                    array[i]=temp;
                }
                System.out.println("Output after change");
                for (int i =0;i<array.length;i++){
                    System.out.println(array[i]);
                }
            }



            else if(k==2){
                int[] array = new int[5];
                int[] array1 = new int[5];
                double sum = 0.0;
                double sum1 = 0.0;
                Random random = new Random();
                for (int i = 0; i < 5; i++) {
                    array[i] = random.nextInt(5);
                    array1[i] = random.nextInt(5);
                    System.out.print(array[i] + "\t");
                    sum += array[i];
                    sum1 += array1[i];
                }
                System.out.println();
                for (int i = 0; i < 5; i++) {
                    System.out.print(array1[i] + "\t");
                }
                System.out.println();
                sum = sum/5;
                sum1 = sum1/5;
                System.out.println("Average value of first is " + sum);
                System.out.println("Average value of second is " + sum1);

                if (sum > sum1) {
                    System.out.println("Average value of first is greater");
                } else if (sum < sum1) {
                    System.out.println("Average value of second is greater");
                } else {
                    System.out.println("Average values are equal ");
                }
            }


            else if(k==3) {
                System.out.println("Enter number of surnames you want to add[1-5]");
                int number = scanner.nextInt();
                if (number > 0 && number < 6) {
                    System.out.println("Enter " + number + " names of surnames by one ");
                    for (int i = 0; i <= number; i++) {
                        surname.add(scanner.nextLine());
                    }

                    for (int i = 0; i < surname.size(); i++) {
                        System.out.println(surname.get(i));
                    }
                    System.out.println();
                } else {
                    System.out.println("Wrong number");
                }
            }

            else if (k==4)
            {
                break;
            }


        }

    }
}
