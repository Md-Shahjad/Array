import java.util.Scanner;
public class Move0ToLast {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a number in Array:");
        for(int i=0;i<arr.length;i++)
        {
          arr[i] = sc.nextInt();
        }
        move0ToLast(arr);

         for(int value:arr)
         {
            System.out.print(value+"  ");
         }

        }

        public static void move0ToLast(int[] arr)
        {
            int index=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    arr[index]=arr[i];
                    index++;
                }

               
            }
            while(index<arr.length)
            {
                arr[index]=0;
                index++;
            }
        }
}
