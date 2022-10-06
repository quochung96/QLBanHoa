package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.LoaiHoa;

public class LoaiHoaBL {
	public static List<LoaiHoa> taoDanhSach(String sql) {
		List<LoaiHoa> dslh = new ArrayList<LoaiHoa>();
		Connection kn = CSDL.getKetNoi();
		try {
			Statement stm = kn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				LoaiHoa lh = new LoaiHoa();
				lh.setMaloai(rs.getInt("Maloai"));
				lh.setTenloai(rs.getString("Tenloai"));
				dslh.add(lh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dslh;
	}
	
	public static List<LoaiHoa> docTatCa() {
		String sql = "select * from loaihoa";
		return taoDanhSach(sql);
	}
	
	public static void main(String[] args) {
		List<LoaiHoa> dslh = docTatCa();
		for(LoaiHoa lh : dslh) {
			System.out.println(lh.getTenloai());
		}
	}
}
