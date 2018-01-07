
public class Madenciler extends Uzaylılar {
	int madensayısı;
	
	public Madenciler(int savunma,int madensayısı) {
		super(savunma);
		this.madensayısı=madensayısı;
	}
	@Override
	public int GucHesapla() {
		return madensayısı;
	}

	public int getMadensayısı() {
		return madensayısı;
	}

	public void setMadensayısı(int madensayısı) {
		this.madensayısı = madensayısı;
	}

}
