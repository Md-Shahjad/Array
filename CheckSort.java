import java.util.Scanner;
public class CheckSort {
    public static void main(String[] args)
    {
        System.out.println("Enter a szie");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter a number one by one:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        boolean check = checkSorting(arr);

        System.out.println("The array is" + (check ? " ":" not ")+ "Sorted");
    }


    public static boolean checkSorting(int arr[])
    {
       boolean check=true;
       for(int i=0;i<arr.length-1;i++)
       {
        if(arr[i+1]<arr[i]){
           check=false;
        }
       }

       return check;
    }
}
