 class NOTEXOR {
    public static void main(String args[]) {
    System.out.println ("Nama : ");
    //contoh NOT
    boolean val1 = true;
    boolean val2 = false;
    System.out.println ("Contoh Logika NOT");
    System.out.println (!val1);
    System.out.println (!val2);
    
    //contohEX-OR
    System.out.println ("Contoh Logika EX-OR");
    boolean val3 = true;
    boolean val4 = true;
    System.out.println(val3 ^ val4);
    boolean val5 = false;
    boolean val6 = true;
    System.out.println(val5 ^ val6);
    boolean val7 = false;
    boolean val8 = false;
    System.out.println(val7 ^ val8);
    boolean val9 = true;
    boolean val10 = true;
    System.out.println(val9 ^ val10);
    }
}