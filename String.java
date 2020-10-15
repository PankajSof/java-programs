//WAP to get the array element through user using scanner class;
//Print the size of array;
//And print the occurance of element;
//And search the element index number;
//Print the index number;
import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int max=sc.nextInt();
        int arr[] = new int[max];
        for (int i=0; i< max; i++)
        {
            System.out.println("Enter number");
            int insertedDate= sc.nextInt();
            arr[i]= insertedDate;
        }
        System.out.println("Size of array : "+arr.length);
        System.out.println("Enter the number to search : ");
        int numToSearch=sc.nextInt();
        for (int i=0 ; i < arr.length; i++)
        {
            if(arr[i] == numToSearch)
            {
                System.out.println(" We found the " + numToSearch + " at " +i+ " index ");
            }

        }


    }

}
