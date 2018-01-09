import java.util.Scanner;
public class Test {
	
	public static void Sýrala(Ürün[] ürünListesi) {
		int min;
		Ürün temp;
		for(int i=0;i<ürünListesi.length;i++) {
			min=i;
			for(int j=i+1;j<ürünListesi.length;j++) {
				if(ürünListesi[j].getYýl()<ürünListesi[min].getYýl()) {
					min=j;
				}
				else if(ürünListesi[j].getYýl()==ürünListesi[min].getYýl()) {
					if(ürünListesi[j].getAy()<ürünListesi[min].getAy()) {
						min=j;
				}
			}
			temp=ürünListesi[i];
			ürünListesi[i]=ürünListesi[min];
			ürünListesi[min]=temp;
		}
		
	 }
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Ürün [] ürünListesi=new Ürün[3];
		 
		
		for(int i=0;i<ürünListesi.length;i++) {
			Ürün ürün=new Ürün(1,1,"a","b");
			ürünListesi[i]=ürün;
		}
		
		for(int i=0;i<ürünListesi.length;i++) {
			System.out.printf(i+".Ürün adý: ");
			ürünListesi[i].setÜrünadý(scan.next());
			System.out.printf(i+".Ürün türü: ");
			ürünListesi[i].setÜrüntürü(scan.next());
			System.out.printf("Son kullanma tarihi ay: ");
			int ay=scan.nextInt();
			if(ay>12 || ay<1) {
				break;
			}
			else {
				ürünListesi[i].setAy(ay);
			}
			System.out.printf("Son kullanma tarihi yýl: ");
			int yýl=scan.nextInt();
			if(yýl>10 || yýl<1) {
				break;
			}
			else {
				ürünListesi[i].setYýl(yýl);
			}
			
		}
		//Arrays.sort(ürünListesi);
		for (int i = 0; i < ürünListesi.length; i++) {
			System.out.println((i+1)+".Ürün adý:"+ürünListesi[i].getÜrünadý()+
					" Ürün türü:"+ürünListesi[i].getÜrüntürü()+
					" Son kullanma tarihi:"+ürünListesi[i].getAy()+"."+ürünListesi[i].getYýl());
		}
		Sýrala(ürünListesi);
		System.out.println("---------------");
		for (int i = 0; i < ürünListesi.length; i++) {
			System.out.println((i+1)+".Ürün adý:"+ürünListesi[i].getÜrünadý()+
					" Ürün türü:"+ürünListesi[i].getÜrüntürü()+
					" Son kullanma tarihi:"+ürünListesi[i].getAy()+"."+ürünListesi[i].getYýl());
		}
	}
}
