package Kelas_X.Semester2.Polimorphisme.Latihan3;

public class Direktur extends Pegawai {
    private static final int gajiDir=100000;
    private static final int tunjangan=50000;

    @Override
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}