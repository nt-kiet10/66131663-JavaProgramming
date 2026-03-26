package ntu.nguyentuanK;

public class HocSinh {

    private String tenHS;
	private int tuoiHS;
	private  String lopHS;
	//Constructor rong
	public HocSinh() {
		
	}
	//Constructor day du
	public HocSinh(String tenHS,int tuoiHS, String lopHS) {
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}
	//Getter & Setter
	
	
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public int getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(int tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	
	@Override
	public String toString() {
		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
}
