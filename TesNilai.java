public class TesNilai {
    public static void main(String[] a){
        Nilai nilaiku = new Nilai();
        nilaiku.nim = "A11.2023.15423";
        nilaiku.nama = "Panji Kusumo";
        nilaiku.nilaiTugas = 90;
        nilaiku.nilaiUts = 85;
        nilaiku.nilaiUas = 87;
        nilaiku.hitungNilai();
        nilaiku.cetakNilai();
        Nilai nilaimu = new Nilai();
        nilaimu.inputData();
        nilaimu.hitungNilai();
        nilaimu.cetakNilai();
        Nilai nilainya = new Nilai("A111.2023.15423","YOGZ",90,85,80);
        nilainya.hitungNilai();
        nilainya.cetakNilai();
        Nilai nilaidia = new Nilai();
        nilaidia.inputData();
        nilaidia.hitungNilai();
        nilaidia.cetakNilai();
    }
}
