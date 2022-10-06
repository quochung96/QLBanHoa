package javaBeans;

import java.io.Serializable;

public class LoaiHoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maloai;
	private String tenloai;
	public LoaiHoa() {
		super();
	}
	public int getMaloai() {
		return maloai;
	}
	public void setMaloai(int maloai) {
		this.maloai = maloai;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
