package markas;

import markas.*;
public class cobapackage{
 public static void main(String args[]){
  int norum;
  String naKK;
    rumah baru = new rumah(32,"Tanjung Priuk");
  baru.setKel(new kelompok(4,"Ale"));
  System.out.println("No rumah    : "+baru.getnorum()+"\nAlamat      : "+baru.getalamat()+"\nNama KK     : "+baru.getkelompok().getnama()+"\nAnggota kel.: "+baru.getkelompok().getno());
 }
} 