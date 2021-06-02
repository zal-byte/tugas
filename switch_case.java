import java.util.*;
class switch_case {
    public static void main(String args[]){
        Scanner scanme = new Scanner(System.in);
        manage myClass = new manage();
        aturNilai nilai = new aturNilai();
        try{
            input(scanme, myClass, nilai);
        }catch(Exception e){
            e.printStackTrace();
        }
    }   
    static void input(Scanner scan, manage myClass, aturNilai nilai){
        inline("Nama : ");
        myClass.setNama(scan.nextLine());
        inline("Jurusan : ");
        myClass.setJurusan(scan.nextLine());

        new_line("---+ Masukan Nilai Normatif +---");
        inline("PABP : ");
        nilai.setPabp(scan.nextDouble());
        inline("PKN : ");
        nilai.setPkn(scan.nextDouble());
        inline("Indonesia : ");
        nilai.setIndonesia(scan.nextDouble());
        inline("Inggris : ");
        nilai.setInggris(scan.nextDouble());
        inline("Matematika : ");
        nilai.setMatematika(scan.nextDouble());

        new_line("---+ Masukan nilai produktif +---");
        inline("PPL : ");
        nilai.setPpl(scan.nextDouble());
        inline("PWPB : ");
        nilai.setPwpb(scan.nextDouble());
        inline("Database : ");
        nilai.setDatabase(scan.nextDouble());
        inline("PBO : ");
        nilai.setPbo(scan.nextDouble());
        inline("SimDig : ");
        nilai.setSimdig(scan.nextDouble());
        // new_line(nilai.getGrade());
        switch(nilai.getGrade()){
            case "A":
            show("A",myClass, nilai);
            break;
            case "B":
            show("B", myClass, nilai);
            break;
            case "C":
            show("C", myClass, nilai);
            break;
            case "D":
            show("D", myClass, nilai);
            break;
            default:
            break;
        }
    }   
    public static void show(String grade, manage myClass, aturNilai nilai){
        new_line("---+ Result +---");
        new_line("---+ Information +---");
        new_line("Nama : "+myClass.getNama());
        new_line("Jurusan : "+myClass.getJurusan());
        new_line("---+ Nilai Akhir +---");
        new_line("Nilai Rata - Rata : "+nilai.calculate());
        new_line("Status : "+grade);
        switch(grade){
            case "A":
            new_line("Excelent !");
            break;
            case "B":
            new_line("Good job");
            break;
            case "C":
            new_line("Good");
            break;
            case "D":
            new_line("Try Again");
            break;
            default:
            break;
        }
        new_line("---+ End of Result +---");
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
    public String getGrade(){
        if( this.calculate() >= 99){
            return "A";
        }else if(this.calculate() >= 80){
            if( this.calculate() <= 89){
                return "B";
            }
        }else if(this.calculate() >= 70){
            if( this.calculate() <= 79){
                return "C";
            }
        }else if( this.calculate() >= 30){
            if( this.calculate() <= 39){
                return "D";
            }
        }else{
            return "D";
        }
        return "Tidak dapat mengambil grade";
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
