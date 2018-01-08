
public class Cyborglar extends Uzaylýlar {
	int lazergucu=0;
	public Cyborglar(int savunma,int lazergucu) {
		super(savunma);
		this.lazergucu=lazergucu;
	}
	@Override
	public int GucHesapla() {
		return lazergucu*savunma;
	}
	public int getLazergucu() {
		return lazergucu;
	}
	public void setLazergucu(int lazergucu) {
		this.lazergucu = lazergucu;
	}

}
