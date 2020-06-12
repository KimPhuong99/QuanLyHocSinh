package herbenateExample;

import dao.SinhVienDAO;
import java.util.List;
import pojo.SinhVien;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        
        List<SinhVien> ds =SinhVienDAO.LayDSSinhVien();
        System.out.println("ok");
        for(int i=0;i<ds.size();i++)
        {
            System.out.println("MSSV: "+ds.get(i).getMaSinhVien_id());
        }
    }
}
