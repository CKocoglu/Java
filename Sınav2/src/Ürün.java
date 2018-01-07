
public class Ürün {
	private String ürünadı,ürüntürü;
	private int yıl,ay;
	
	
	public Ürün(String ürünadı,String ürüntürü,int yıl,int ay) {
		this.ürünadı=ürünadı;
		this.ürüntürü=ürüntürü;
		this.yıl=yıl;
		this.ay=ay;
	}
	public String getÜrünadı() {
		return ürünadı;
	}
	public void setÜrünadı(String ürünadı) {
		this.ürünadı = ürünadı;
	}
	public String getÜrüntürü() {
		return ürüntürü;
	}
	public void setÜrüntürü(String ürüntürü) {
		this.ürüntürü = ürüntürü;
	}
	public int getYıl() {
		return yıl;
	}
	public void setYıl(int yıl) {
		this.yıl = yıl;
	}
	public int getAy() {
		return ay;
	}
	public void setAy(int ay) {
		this.ay = ay;
	}
	
	
	}

