
public class Madenciler extends Uzayl�lar {
	int madensay�s�=0;
	
	public Madenciler(int savunma,int madensay�s�) {
		super(savunma);
		this.madensay�s�=madensay�s�;
	}
	@Override
	public int GucHesapla() {
		return madensay�s�;
	}

	public int getMadensay�s�() {
		return madensay�s�;
	}

	public void setMadensay�s�(int madensay�s�) {
		this.madensay�s� = madensay�s�;
	}

}
