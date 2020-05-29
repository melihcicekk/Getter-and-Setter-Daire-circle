/**
 * Bu uygulama Getter ve Setter metodların kullanılması ile
 * dairenin alan hesabını yapar.
 */


package dairealan;

/**
 *
 * @author melih
 */
class alan {
  private int r;//r'yi başka classta değiştirilemesin diye private yaptık.

public int getr()//getter metodu.
{
return r;//r değerini döndüren kod satırı.
}

public void setr(int r)//setter metodu
{
this.r=r;//Girilen uzunluğu Kenar’a atayan kod satırı.
}


}
