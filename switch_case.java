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
