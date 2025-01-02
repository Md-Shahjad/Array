import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a Number one by one");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int large =largestElement(arr);
        System.out.println("The largest Number is:" + large);

    }


    public static int largestElement(int array[])
    {

    int largestNumber=array[0];
        for(int i=0;i<array.length;i++)
        {
          if(array[i]>largestNumber)
          {
              largestNumber=array[i];
          }
        }
        return largestNumber;
    }
}
