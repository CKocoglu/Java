
public class Ürün extends Zaman {
	private String ürünadı,ürüntürü;
	//private int yıl,ay;
	
	
	public Ürün(int yıl,int ay,String ürünadı,String ürüntürü) {
		super(yıl,ay);
		this.ürünadı=ürünadı;
		this.ürüntürü=ürüntürü;
		//this.yıl=yıl;
		//this.ay=ay;
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
	/*public int getYıl() {
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
	}*/
	
	
	}

