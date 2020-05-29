/**
 * Bu uygulama Getter ve Setter metodların kullanılması ile
 * dairenin alan hesabını yapar.
 */


package dairealan;

import java.util.Scanner;

/**
 *
 * @author melih
 */
public class Dairealan {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);//Kullanıcının veri girmesini sağlayan kod satırı.
       
alan alan=new alan();//alan adlı classtan alan adlı nesneyi oluşturduğumuz kod satırı

System.out.println( "Yarıçap uzunluğu giriniz:");//Kullanıcıdan yarıçap uzunluğu aldığımız kod satırı.
int r=scan.nextInt();

alan.setr(r);//alan'a girdiğimiz değeri r'ye atayan kod satırı.

System.out.print("Dairenin alanı:"+(alan.getr())*(alan.getr())*3);//dairenin alanının hesaplayıp ekrana yazdıran kod satırı.
    }   
}
