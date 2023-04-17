package markas;
public class rumah{ 
    private int norumah; 
    private String alamat; 
    private kelompok anggota;  
    public  rumah( int kode, String nama){  
        this.norumah = kode;  
        this.alamat = nama; } 
    public kelompok getkelompok(){  
        return anggota; } public int getnorum(){  
            return norumah; } 
        public String getalamat(){  
            return alamat; } 
        public void setKel(kelompok baru){  
            this.anggota=baru; }} 