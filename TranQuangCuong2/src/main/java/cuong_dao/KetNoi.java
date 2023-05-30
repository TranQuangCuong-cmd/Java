package cuong_dao;

import java.sql.DriverManager;

public class KetNoi {

	public java.sql.Connection cn;
    public void ketnoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Xong b1");
            
            String url = "jdbc:sqlserver://LAPCN-CuongTQ:1433;databaseName=TranQuangCuong;user=sa; password=2001";
            System.out.println("Xong b2");
            cn = DriverManager.getConnection(url);
            System.out.println("Xong b3");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        KetNoi kn=new KetNoi();
        kn.ketnoi();
    }

}
