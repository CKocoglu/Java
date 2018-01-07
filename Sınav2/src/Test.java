import java.util.Scanner;
import java.util.Arrays;
public class Test {
	public static int[] Sırala(int ürünListesi[]) {
		int min,temp;
		for(int i=0;i<ürünListesi.length;i++) {
			min=i;
			for(int j=i+1;j<ürünListesi.length;j++) {
				if(ürünListesi[j].getYıl<ürünListesi[min].getYıl) {
					min=j;
					//Arrays.sort(ürünListesi);
				}
			}
			temp=ürünListesi[i];
			ürünListesi[i]=ürünListesi[min];
			ürünListesi[min]=temp;
		}
		return ürünListesi;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Ürün [] ürünListesi=new Ürün[3];
		 
		
		for(int i=0;i<ürünListesi.length;i++) {
			Ürün ürün=new Ürün("","",1,1);
			ürünListesi[i]=ürün;
		}
		
		for(int i=0;i<ürünListesi.length;i++) {
			System.out.printf(i+".Ürün adı: ");
			ürünListesi[i].setÜrünadı(scan.next());
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
			System.out.printf("Son kullanma tarihi yıl: ");
			int yıl=scan.nextInt();
			if(yıl>10 || yıl<1) {
				break;
			}
			else {
				ürünListesi[i].setYıl(yıl);
			}
			
		}
		//Arrays.sort(ürünListesi);
		for (int i = 0; i < ürünListesi.length; i++) {
			System.out.println(i+".Ürün adı:"+ürünListesi[i].getÜrünadı()+
					" Ürün türü:"+ürünListesi[i].getÜrüntürü()+
					" Son kullanma tarihi:"+ürünListesi[i].getAy()+"."+ürünListesi[i].getYıl());
		}
		
		
		
	}
	

}
