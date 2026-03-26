package sanPham;
import java.util.Scanner;
public class SanPham {
       
	  private String tenSP;
	  private double donGia;
	  private double giamGia;
	  
	  public SanPham() {
	  }
	  
	  public SanPham(String tenSP, double donGia, double giamGia)
	  {
		  this.tenSP = tenSP;
		  this.donGia = donGia;
		  this.giamGia = giamGia;
	  }
	  
	  public String getTenSP() {
		return tenSP;
	}

	  public void setTenSP(String tenSP) {
		  this.tenSP = tenSP;
	  }

	  public double getDonGia() {
		  return donGia;
	  }

	  public void setDonGia(double donGia) {
		  this.donGia = donGia;
	  }

	  public double getGiamGia() {
		  return giamGia;
	  }

	  public void setGiamGia(double giamGia) {
		  this.giamGia = giamGia;
	  }
	  
	  public double getThueNhapKhau()
	  {
		  return donGia * 0.1;
	  }

	  public double getGiaSauGiam()
	  {
		  return donGia - (donGia * giamGia/100);
	  }
	  public void Nhap(Scanner sc)
	  {
		  System.out.println("Nhap ten san pham :");
		  tenSP = sc.nextLine();
		  System.out.println("Nhap don gia :");
		  donGia = sc.nextDouble();
		  System.out.println("Nhap giam gia :");
		  giamGia = sc.nextDouble();
	  }
	  public void Xuat()
	  {
		  System.out.println("Ten san pham :" + tenSP);
		  System.out.println("Don gia :" + donGia);
		  System.out.println("Giam gia :" + giamGia);
		  System.out.println("Thue nhap khau :" + getThueNhapKhau());
		  System.out.println("Gia sau khi giam :" + getGiaSauGiam());
	  }
	  
}
