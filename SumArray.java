import java.util.Scanner;
public class SumArray {
    public static void main(String[] args)
    {
      System.out.println("Enter a Size:");
      Scanner sc = new Scanner(System.in);
      int size=sc.nextInt();
      int[] arr= new int[size];
      System.out.println("Enter a number one by one");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }

      int sum=sumArray(arr);

      System.out.println("The Sum is:"+ sum);
    }


    public static int sumArray(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
}
