import java.util.Scanner;
public class SecondLargest {
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

        int second=secondLargestNumber(arr);
        System.out.println("The second largest number is :" + second);
    
    }  


    public static int secondLargestNumber(int[] arr)
    {
        int largest=arr[0];
        int secondLargest= arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest=arr[i];
            }

        }

        return secondLargest;
    }
}
