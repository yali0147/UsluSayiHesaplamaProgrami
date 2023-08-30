import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("UsluSayiHesaplamaProgrami");
        int n,k,toplam=1 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n=inp.nextInt();
        System.out.print("Üssü giriniz : ");
        k=inp.nextInt();

        for(int i=1 ;i<=k;i++){
            toplam*=(n);
        }System.out.println("("+n+"^"+k+")"+" Sonucu : "+ toplam);
    }
}