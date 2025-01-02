import java.util.Scanner;
public class CountTargetValue {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size:");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a Number one by one:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter a target Value");
    int target=sc.nextInt();
    int count=countTarget(arr,target);

    System.out.println("The count of Target Value is:" + count);

    }
    
    public static int countTarget(int[] arr,int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]==target)
        {
            count++;
        }
        }

        return count;
    }
    
}
