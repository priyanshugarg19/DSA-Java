import java.util.Scanner;

public class subarray_with_given_sum_2 {

    public static boolean sum(int arr[], int value) {
        int index=-1;
        int current= 0;

        for(int i=0; i<arr.length; i++){
            current += arr[i];
            while(current > value){
                index++;
                current -= arr[index];
            }
            if (current == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0; i<arr.length; i++ ) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value you want to check");
        int value= sc.nextInt();
        sc.close();
        System.out.println(sum(arr , value));
    }
}
