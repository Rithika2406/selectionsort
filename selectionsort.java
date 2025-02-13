import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner S=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=S.nextInt();  
        }
        for(int i=0;i<arr.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                minindex=j;
            }
        
        int temp=arr[minindex];
        arr[minindex]=arr[i];
        arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }
    }
}