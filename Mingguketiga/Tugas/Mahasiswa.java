package Mingguketiga.Tugas;

public class Mahasiswa {
    public String nama;
    public String nim;
    public double ipk;
    public String jeniskelamin;
  
    public void setNama(String nama){
        this.nama= nama;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setIPK( double ipk) {
        this.ipk = ipk;
    }

    public void setKelamin( String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }

    public String getNama(){
        return nama;
    }
    public String getNIM(){
        return nim;
    }
    public double getIPK(){
        return ipk;
    }
    public String getJeniskelamin(){
        return jeniskelamin;
    }

    
}
