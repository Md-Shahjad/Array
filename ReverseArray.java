import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a Number one by one");
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();
        }

       int rev[]= reverseArray(arr);

       System.out.println("Value after reversing");

       for(int value:rev)
       {
        System.out.print(value + "  ");
       }

    
    }

    public static int[] reverseArray(int array[])
    {
        int temp[]=new int[array.length];
        for(int i=array.length-1;i>=0;i--)
        {
            temp[array.length-i-1]=array[i];
        }

        return temp;
    }
}
