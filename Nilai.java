import java.util.Scanner;
public class Nilai{
    String nim,nama;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiUts, pNilaiTugas, pNilaiUas, pNilaiAkhir;
    String nHuruf, predikat;
    Scanner input = new Scanner(System.in);
    public Nilai (String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas){
        this.nim=nim;this.nama=nama;this.nilaiTugas=nilaiTugas;this.nilaiUts=nilaiUts;this.nilaiUas=nilaiUas;
    }
    public Nilai(){}
void hitungNilai(){
    pNilaiTugas=0.3f*nilaiTugas;
    pNilaiUts=0.35f*nilaiUts;
    pNilaiUas=0.35f*nilaiUas;
    pNilaiAkhir=pNilaiTugas+pNilaiUts+pNilaiUas;
}
void inputData(){
    System.out.println("Nim     : "); 
    nim=input.nextLine();
    System.out.println("nama     : "); 
    nama=input.nextLine();
    System.out.println("nilaiTugas     : "); 
    nilaiTugas=input.nextFloat();
    System.out.println("nilaiUts     : "); 
    nilaiUts=input.nextFloat();
    System.out.println("nilaiUas     : "); 
    nilaiUas=input.nextFloat();
}
String getNilHuruf(float nilai){
    if(nilai>=85)
        nHuruf="A";
     else if(nilai >=80)
        nHuruf="AB";
     else if(nilai >= 70)
        nHuruf="B";
     else if(nilai >= 65)
        nHuruf = "BC";
     else if(nilai >= 60)
        nHuruf = "C";
     else if(nilai >= 55)
        nHuruf = "D";
     else 
             nHuruf = "E";
    return nHuruf; 
}
    String getPredikat(String huruf){
        switch(huruf){
            case "A": predikat="Apik";break;
            case "AB": predikat="Apik Baik";break;
            case "B": predikat="Baik";break;
            case "BC": predikat="Baik Cukup";break;
            case "C": predikat="Cukup";break;
            case "D": predikat="Dablek";break;
            default:predikat="Elek";
        }
        return predikat;
    }
    void cetakNilai(){
        System.out.println("Nim     : "+nim);
        System.out.println("Nama     : "+nama);
        System.out.println("N. Tugas     : "+nilaiTugas+ " 30% : "+pNilaiTugas);
        System.out.println("N. Uts     : "+nilaiUts+ " 35% : "+pNilaiUts);
        System.out.println("N. Uas     : "+nilaiUas+ " 35% : "+pNilaiUas);
        System.out.println("N. Akhir    : "+pNilaiAkhir);
        System.out.println("N. Huruf    : "+getNilHuruf(pNilaiAkhir));
        System.out.println("Predikat    : "+getPredikat(nHuruf));
    }
}

