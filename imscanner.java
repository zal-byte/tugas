import java.util.Scanner;
import java.util.HashMap;
public class imscanner{
	public static HashMap<String, String> hashme = new HashMap<>();
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		banner();
		try{
			hashme = inputType(scan);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	 static void banner(){
		String tbl = "| %-15s | %-4d |%n";
		System.out.format("+-----------------+------+%n");
		System.out.format("| Layanan         | No   |%n");
		System.out.format("+-----------------+------+%n");
		String layanan[] = new String[]{"Haji","Umroh","ONH"};
		for (int i = 0; i < layanan.length; i++) {
		    System.out.format(tbl, layanan[i], i + 1);
		}
		System.out.format("+-----------------+------+%n");
		
	}

	 static HashMap<String, String> inputType(Scanner scan){
		HashMap<String, String> me = new HashMap<>();
		inline("Nama : ");
		me.put("nama", scan.nextLine());
		inline("Usia : ");
		me.put("usia", scan.nextLine());
		inline("Alamat : ");
		me.put("alamat", scan.nextLine());
		inline("Pilih no layanan : ");
		me.put("paket", scan.nextLine());

		return me;
	}
	static  void inline(String value){
		System.out.print(value);
	}
	static  void new_line(String value){
		System.out.println(value);
	}
}

class yourPackage{
	public String namapaket, hargapaket, akomodasi, berangkat; 
	public String get_namapaket(){
		return this.namapaket;
	}
	public String get_hargapaket(){
		return this.hargapaket;
	}
	public String get_akomodasi(){
		return this.akomodasi;
	}
	public String get_berangkat(){
		return this.berangkat;
	}
}
class myPackage extends yourPackage{
	public myPackage(){

	}
	public ArrayList<yourPackage> showMyPackage(String num){
		//What
		yourPackage yp = new yourPackage();
		if( num.equals("1")){

		}
	}
	@Override
	public String get_namapaket(){
		return super.get_namapaket();
	}
	@Override
	public String get_hargapaket(){
		return super.get_hargapaket();
	}
	@Override
	public String get_akomodasi(){
		return super.get_akomodasi();
	}
	@Override
	public String get_berangkat(){
		return super.get_berangkat();
	}
}