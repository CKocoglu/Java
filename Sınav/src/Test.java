import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int toplamsonuc=0;
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		Dunyal�lar [] dliste=new Dunyal�lar[500];
		//Dunyal�lar [] Askerler=new Askerler[500];
		//Dunyal�lar [] Ciftciler=new Dunyal�lar[500];
		
		Uzayl�lar [] uliste=new Uzayl�lar[500];
		//Uzayl�lar [] Madenciler=new Madenciler[500];
		
		for(int i=0;i<500;i++) {
			int a=rand.nextInt(2)+1;
			//System.out.println("a="+a);
			int b=rand.nextInt(10);//silahgucu
			//System.out.println("silahgcu="+b);
			int c=rand.nextInt(10);//savunma
			//System.out.println("savunma="+c);
			int d=rand.nextInt(10);//urunsay�s�;
			//System.out.println("urunsay�s�="+d);
			if(a==1) {
				 dliste[i]=new Askerler(b,c);
			}
			else {
				 dliste[i]=new Ciftciler(d,c);
			}
			
		}
		for(int i=0;i<500;i++) {
			int a=rand.nextInt(2)+1;
			//System.out.println("a"+a);
			int b=rand.nextInt(10);//lazergucu
			//System.out.println("lazergucu="+b);
			int c=rand.nextInt(10);//savunma
			//System.out.println("savunma="+c);
			int d=rand.nextInt(10);//madensay�s�;
			//System.out.println("madensay�s�="+d);
			if(a==1) {
				 uliste[i]=new Cyborglar(c,b);
			}
			else {
				 uliste[i]=new Madenciler(c,d);
			}
			
		}
		for(int i=0;i<500;i++) {
			int a=scan.nextInt();
			if(a==-1) {
				break;
			}
			else {
				int elsonuc=(dliste[i].GucHesapla()-uliste[i].GucHesapla());
				toplamsonuc=toplamsonuc+elsonuc;
				System.out.println((i+1)+".elin sonucu="+" "+dliste[i].GucHesapla()+"-"+uliste[i].GucHesapla()+"="+(dliste[i].GucHesapla()-uliste[i].GucHesapla()));				
			}
		}
		System.out.println("Toplam Puan="+toplamsonuc);
		

	}
}

