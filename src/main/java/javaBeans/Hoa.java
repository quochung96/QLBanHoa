package javaBeans;

import java.io.Serializable;

public class Hoa implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int mahoa;
	private int maloai;
	private String tenhoa;
	private int dongia;
	private String hinh;
	private String mota;
	public Hoa() {
		super();
	}
	public int getMahoa() {
		return mahoa;
	}
	public void setMahoa(int mahoa) {
		this.mahoa = mahoa;
	}
	public int getMaloai() {
		return maloai;
	}
	public void setMaloai(int maloai) {
		this.maloai = maloai;
	}
	public String getTenhoa() {
		return tenhoa;
	}
	public void setTenhoa(String tenhoa) {
		this.tenhoa = tenhoa;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}
