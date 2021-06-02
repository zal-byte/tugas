import java.util.*;
class more{
    public static boolean is_admin = false;
    public static boolean is_logedin = false;
    public static void main(String args[]){
        dashboard();
    }
    public static void dashboard(){
        if( is_logedin == true ){
            if( is_admin == true){
                new_line("kamu login sebagai admin");
            }
        }else{
            login_page();
        }
    }
    public static void login_page(){
        Scanner scan = new Scanner(System.in);
        final String username, password;
        inline("Username : ");
        username = scan.nextLine();
        inline("Password : ");
        password = scan.nextLine();

        if( username != null ){
            if( password != null ){
                if( !username.isEmpty() ){
                    if ( !password.isEmpty()){
                        if( username.equals("admin") ){
                            if( password.equals("admin")){
                                is_admin = true;
                                is_logedin = true;
                                dashboard();
                            }else{
                                new_line("Password doesn't match, exiting...");
                                System.exit(1);
                            }
                        }else{
                            if( username.equals("rizal" )){
                                if( password.equals("rizalsolehudin")){
                                    is_logedin = true;
                                    dashboard();
                                }else{
                                    new_line("Password doesn't match, exiting...");
                                    System.exit(1);
                                }
                            }else{
                                new_line("Username doesn't exists, exiting...");
                                System.exit(1);
                            }
                        }
                    }else{
                        new_line("Don't leave password blank !, exiting...");
                        System.exit(1);
                    }
                }else{
                    new_line("Don't leave username blank !, exiting...");
                    System.exit(1);
                }
            }else{
                new_line("Password is null, exiting...");
                System.exit(1);
            }
        }else{
            new_line("Username is null, exiting...");
            System.exit(1);
        }
    }
    static void inline(String value){
        System.out.print(value);
    }
    static void new_line(String value){
        System.out.println(value);
    }
}