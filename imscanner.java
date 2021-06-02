import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class imscanner{
	public static HashMap<String, String> finalPak = new HashMap<>();
	public static HashMap<String, String> hashme = new HashMap<>();
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		banner();
		try{
			hashme = inputType(scan);
			statements(hashme);
			scan.close();
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

	static void showSelectedLayanan(String name){
		String tbl = "| %-15s | %-22s | %-22s | %-3d |%n";
		System.out.format("+-----------------+------------------------+------------------------+-----+%n");
		System.out.format("| Harga           | Akomodasi              | Berangkat              | No  |%n");
		System.out.format("+-----------------+------------------------+------------------------+-----+%n");
		String[] harga = new String[]{"2.000.000","3.000.000"};
		String[] akomodasi = new String[]{"Hotel bintang 5","Hotel bintang 10"};
		String[] berangkat = new String[]{"2020-02-02","2020-02-03"};
		for (int i = 0; i < harga.length; i++) {
		    System.out.format(tbl, harga[i], akomodasi[i],berangkat[i],  i + 1);
		}
		System.out.format("+-----------------+------------------------+------------------------+-----+%n");

		final int mypak = choosePackage();
		if( mypak == 1 ){
			finalPak.put("harga", harga[0]);
			showFinalPackage();
		}else if ( mypak == 2){
			finalPak.put("harga", harga[1]);
			showFinalPackage();
		}
	}
	public static void showFinalPackage(){
		if ( finalPak != null ){
			if( finalPak.size() != 0 ){
				String tbl = "| %-15s | %-22s | %-22s |%n";
				System.out.format("+-----------------+------------------------+------------------------+%n");
				System.out.format("| Layanan         | Paket                  | Harga                  |%n");
				System.out.format("+-----------------+------------------------+------------------------+%n");
				System.out.format(tbl, finalPak.get("layanan"),finalPak.get("paket"),finalPak.get("harga"));
				System.out.format("+-----------------+------------------------+------------------------+%n");
			}else{
				new_line("Error");
			}
		}else{
			new_line("Null error");
		}
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

		if( me != null ){
			if ( me.size() != 0 ){
				finalPak.put("nama",me.get("nama"));
				finalPak.put("usia",me.get("usia"));
				finalPak.put("alamat",me.get("alamat"));
			}
		}
		return me;
	}

	static int choosePackage(){
		Scanner scanme = new Scanner(System.in);
		inline("Pilih paket : ");
		return scanme.nextInt();
	}
	static  void inline(String value){
		System.out.print(value);
	}
	static  void new_line(String value){
		System.out.println(value);
	}
	static void statements(HashMap<String, String> switchs){
		if( switchs.get("paket").equals("1")){
			showSelectedLayanan("1");
		}else if( switchs.get("paket").equals("2")){
			showSelectedLayanan("2");
		}
	}
}

