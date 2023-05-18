import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size = sc.nextInt();
        int a[] = new int[size];
        int i,j;
        System.out.println("Enter the elements of your array");
        for (i=0;i<size;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the element you want to search");
        int n = sc.nextInt();
        for (i=0;i<size;i++){
            if (a[i]==n){
                System.out.println("your number "+n+" is found on index  -> "+i);
                break;
            }

        }
    }
}
