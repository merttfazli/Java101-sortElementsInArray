import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int sizeOfTheArray;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");
        sizeOfTheArray=scan.nextInt();
        int number;
        int[] list=new int[sizeOfTheArray];
        int sayac=1;
        for (int i=0;i<sizeOfTheArray;i++){
            System.out.print(sayac+".Elemanı:");
            number=scan.nextInt();
            list[i]=number;
            sayac++;
        }
        System.out.print("Sıralama: [ ");
        Arrays.sort(list);
        for (int j=0;j<sizeOfTheArray;j++){
            System.out.print(list[j]+" ,");
        }
        System.out.print(" ]");
    }
}
