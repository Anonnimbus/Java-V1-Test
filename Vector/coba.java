package pkgtest;

import java.util.Vector;
 
public class coba {
    public static void main(String[] args) {
        //  Objek 
        Vector<String> vec = new Vector<String>();
         
        //  Menambahkan value ke dalam Vector
        vec.add("Andi");    //  Index 0
        vec.add("Danil");    //  Index 1
        vec.add("Siti");    //  Index 2
        vec.add("Geri");    //  Index 3
        vec.add("Bimo");     //  Index 4
        System.out.println("Vector : "+vec);
         
        //  hapus salah satu value dari Vector
        vec.removeElement("Geri");
        System.out.println("Vector hapus(part1) : "+vec);
         
        //  hapus salah satu valie dari Vector berdasarkan Posisi Index
        vec.removeElementAt(2);
        System.out.println("Vector hapus(part2) : "+vec);
         
        //  mengambil salah satu value dari Vector
        String temp = vec.get(0);
        System.out.println("Vector Index 0 : "+temp);
         
    }
}