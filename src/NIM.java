public class NIM {

    private String nim;

    public NIM(String nim) {
        this.nim = nim;
    }

    // Jenjang Pendidikan
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);
        // Jenjang
        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "UNKNOWN";
    }

    //Tahun Masuk
    public String TahunMasuk() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "UNKNOWN";
        }
    }

    // Nama Fakultas
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("1")) {
            return "FAKULTAS TARBIYAH dan KEGURUAAN";
        }else if (fac.equalsIgnoreCase("2")) {
            return "FAKULTAS  SYARI'AH dan HUKUM";
        }else if (fac.equalsIgnoreCase("3")) {
            return "FAKULTAS USHULUDIN";
        }else if (fac.equalsIgnoreCase("4")) {
            return "FAKULTAS DAKWAH dan KOMUNIKASI";
        }else if (fac.equalsIgnoreCase("5")) {
            return "FAKULTAS SAINS dan TEKNOLOGI";
        }else if (fac.equalsIgnoreCase("6")) {
            return "PSIKOLOGI";
        }else if (fac.equalsIgnoreCase("7")) {
            return "FAKULTAS EKONOMI dan ILMU SOSIAL";
        }else if (fac.equalsIgnoreCase("8")) {
            return "FAKULTAS PERTANIAN dan PERTENAKAN";
        }else {
            return "UNKNOWN";
        }
    }

    // Nama Jurusan
    public String Jurusan() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("04")) {
            return "Matematika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("05")) {
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }

    //Jenis kelamin
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "UNKNOWN";
    }

    public String noUM() {
        return this.nim.substring(7,11);
    }
}
