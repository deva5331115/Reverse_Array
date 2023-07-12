import java.util.Scanner;

public class ReverseArray {


        public int [] Reverse(int[] arr){
           int i=0;
           int j=arr.length-1;
            int temp=arr[0];
            while (i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
            return arr;
        }
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int size=scan.nextInt();
            int array[]=new int[size];
            for(int i=0;i<size;i++){
                array[i]=scan.nextInt();

            }


                ReverseArray range=new ReverseArray();
                range.Reverse(array);
                for (int arr:array
                ) {
                    System.out.println(arr);
                }


        }
    }

