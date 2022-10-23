import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18 ,kdvOran2=0.8, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz: ");
        tutar= input.nextDouble();


        double kosul = (0<tutar && tutar<=1000)? kdvOran1:kdvOran2;
        kdvTutar = tutar* kosul;
        kdvliTutar = kdvTutar+tutar;
        System.out.println("Kdvsiz fiyat: "+ tutar);
        System.out.println("Kdvli fiyat: "+kdvliTutar);
        System.out.println("Kdv tutarı: "+ kdvTutar);
        System.out.println("Kdv oranı : "+kosul);

    }
}