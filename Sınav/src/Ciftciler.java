
public class Ciftciler extends Dunyalılar {
	int urunsayısı;
	
	public Ciftciler(int urunsayısı,int savunma) {
		super(savunma);
		this.urunsayısı=urunsayısı;
	}
	@Override
	public int GucHesapla() {
		return urunsayısı;
	}

	public int getUrunsayısı() {
		return urunsayısı;
	}

	public void setUrunsayısı(int urunsayısı) {
		this.urunsayısı = urunsayısı;
	}
	

}
