import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int toplamsonuc=0;
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		Dunyalılar [] dliste=new Dunyalılar[500];
		//Dunyalılar [] Askerler=new Askerler[500];
		//Dunyalılar [] Ciftciler=new Dunyalılar[500];
		
		Uzaylılar [] uliste=new Uzaylılar[500];
		//Uzaylılar [] Madenciler=new Madenciler[500];
		
		for(int i=0;i<500;i++) {
			int a=rand.nextInt(2)+1;
			//System.out.println("a="+a);
			int b=rand.nextInt(10);//silahgucu
			//System.out.println("silahgcu="+b);
			int c=rand.nextInt(10);//savunma
			//System.out.println("savunma="+c);
			int d=rand.nextInt(10);//urunsayısı;
			//System.out.println("urunsayısı="+d);
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
			int d=rand.nextInt(10);//madensayısı;
			//System.out.println("madensayısı="+d);
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

