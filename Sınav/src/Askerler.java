
public class Askerler extends Dunyalýlar {
	int silahgucu;
	
	public Askerler(int silahgucu,int savunma) {
		super(savunma);
		this.silahgucu=silahgucu;
	}
	@Override
	public int GucHesapla() {
		return silahgucu*savunma;
	}

	public int getSilahgucu() {
		return silahgucu;
	}

	public void setSilahgucu(int silahgucu) {
		this.silahgucu = silahgucu;
	}
		
	
}
