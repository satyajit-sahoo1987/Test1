import java.util.Scanner;
public class MergeArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter data into first array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the size of 2nd the array");
        int size1=sc.nextInt();
        int b[]=new int[size1];
        System.out.println("Enter data into second array");
        for(int i=0;i<size1;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        System.out.println("See the array after merging");
        for(int x:c){
           System.out.print(x+" ");
        }
    }
}