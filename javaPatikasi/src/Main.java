import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, index;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (m) giriniz: ");
        boy= input.nextDouble();

        System.out.print("Kilonuzu (kg) giriniz: ");
        kilo=input.nextDouble();


        index=kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz: "+index);












        }
    }
