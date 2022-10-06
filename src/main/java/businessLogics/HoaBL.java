package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.Hoa;

public class HoaBL {
	public static List<Hoa> taoDanhSach(String sql) {
		List<Hoa> dsh = new ArrayList<Hoa>();
		Connection kn = CSDL.getKetNoi();
		try {
			Statement stm = kn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Hoa h = new Hoa();
				h.setTenhoa(rs.getString("tenhoa"));
				h.setMota(rs.getString("mota"));
				h.setMaloai(rs.getInt("maloai"));
				h.setMahoa(rs.getInt("mahoa"));
				h.setHinh(rs.getString("hinh"));
				h.setDongia(rs.getInt("dongia"));
				dsh.add(h);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dsh;
	}
	
	public static List<Hoa> docTatCa() {
		String sql ="select * from hoa";
		return taoDanhSach(sql);
	}
	public static List<Hoa> hoaTheoLoai(int ml) {
		String sql = "select * from hoa where maloai = "+ml;
		return taoDanhSach(sql);
	}
	public static List<Hoa> timKiemHoa(String tenHoa) {
		String sql ="select * from hoa where tenhoa like '%"+tenHoa+"%'";
		return taoDanhSach(sql);
	}
	
	public static void main(String[] args) {
		List<Hoa> dsh = hoaTheoLoai(1);
		for(Hoa h:dsh) {
			System.out.println(h.getTenhoa());
		}
	}
}
