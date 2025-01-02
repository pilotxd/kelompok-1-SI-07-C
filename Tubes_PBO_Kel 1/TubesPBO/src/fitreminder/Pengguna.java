package fitreminder;

public class Pengguna {
    
    private String nama;
    private String aktivitas;
    private String jenis_olahraga;
    private String waktu;

    public Pengguna(String nama, String aktivitas, String jenis_olahraga, String waktu) {
        this.nama = nama;
        this.aktivitas = aktivitas;
        this.jenis_olahraga = jenis_olahraga;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public String getJenis_olahraga() {
        return jenis_olahraga;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }

    public void setJenis_olahraga(String jenis_olahraga) {
        this.jenis_olahraga = jenis_olahraga;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    
    
    
}
