import java.util.*;
class switch_case {
    public static void main(String args[]){
        Scanner scanme = new Scanner(System.in);
        manage myClass = new manage();
        try{
            input(scanme, myClass);
        }catch(Exception e){
            e.printStackTrace();
        }
    }   
    static void input(Scanner scan, manage myClass){
        inline("Nama : ");
        myClass.setNama(scan.nextLine());
        inline("Jurusan : ");
        myClass.setJurusan(scan.nextLine());
    }   
    public static void  inline(String value){
        System.out.print(value);
    }
    public static void new_line(String value){
        System.out.println(value);
    }

}

class Nilai{
    //normatif
    public double pabp, pkn, indonesia, inggris, matematika;
    public double ppl, pwpb, database, pbo, simdig;

    public double calculate(){
        final double normatif = pabp + pkn + indonesia + inggris + matematika;
        final double produktif = ppl + pwpb + database + pbo + simdig;
        final double finals = normatif + produktif;
        int jumlah_mapel = 10;
        return finals / jumlah_mapel;
    }
    public void setPpl(double value){
        ppl = value;
    }
    public void setPwpb(double value){
        pwpb = value;
    }
    public void setDatabase(double value){
        database = value;
    }
    public void setPbo(double value){
        pbo = value;
    }
    public void setSimdig(double value){
        simdig = value;
    }

    public void setPabp(double value){
        pabp = value;
    }
    public void setPkn(double value)
    {
        pkn = value;
    }
    public void setIndonesia(double value){
        indonesia = value;
    }
    public void setInggris(double value){
        inggris = value;
    }
    public void setMatematika(double value){
        matematika = value;
    }
}

class aturNilai extends Nilai{
    @Override
    public void setPabp(double value){
        super.setPabp(value);
    }
    
    @Override
    public void setIndonesia(double value){
        super.setIndonesia(value);
    }
    @Override
    public void setMatematika(double value){
        super.setMatematika(value);
    }
    @Override
    public void setInggris(double value){
        super.setInggris(value);
    }
    @Override
    public void setPkn(double value){
        super.setPkn(value);
    }

    @Override
    public void setPpl(double value){
        super.setPpl(value);
    }
    @Override
    public void setDatabase(double value){
        super.setDatabase(value);
    }
    @Override
    public void setSimdig(double value){
        super.setSimdig(value);
    }
    @Override
    public void setPwpb(double value){
        super.setPwpb(value);
    }
    @Override
    public void setPbo(double value){
        super.setPbo(value);
    }
}

class Informasi{
    public String nama, jurusan;
    public void setNama(String value){
        nama = value;
    }
    public void setJurusan(String value){
        jurusan = value;
    }
    public String getNama(){
        return this.nama;
    }
    public String getJurusan(){
        return this.jurusan;
    }
}

class manage extends Informasi{
    @Override
    public String getNama(){
        return super.getNama();
    }
    @Override
    public String getJurusan(){
        return super.getJurusan();
    }

    @Override
    public void setNama(String value){
        super.setNama(value);
    }
    @Override
    public void setJurusan(String value){
        super.setJurusan(value);
    }
}
