import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		Dunyalýlar [] Askerler=new Dunyalýlar[500];
		//Dunyalýlar [] Askerler=new Askerler[500];
		Dunyalýlar [] Ciftciler=new Dunyalýlar[500];
		
		Uzaylýlar [] Cyborglar=new Cyborglar[500];
		Uzaylýlar [] Madenciler=new Madenciler[500];
		
		for(int i=0;i<500;i++) {
			int a=rand.nextInt(2)+1;
			//int b=rand.nextInt(10)//silahgucu
			//int c=rand.nextInt(10);//savunma
			//int d=rand.nextInt(10);//urunsayýsý;
			if(a==1) {
				 Askerler[i]=new Askerler(rand.nextInt(10),rand.nextInt(10));
			}
			else {
				 Ciftciler[i]=new Ciftciler(rand.nextInt(10),rand.nextInt(10));
			}
			
		}
		for(int i=0;i<500;i++) {
			int a=rand.nextInt(2)+1;
			//int b=rand.nextInt(10);//lazergucu
			//int c=rand.nextInt(10);//savunma
			//int d=rand.nextInt(10);//madensayýsý;
			if(a==1) {
				 Cyborglar[i]=new Cyborglar(rand.nextInt(10),rand.nextInt(10));
			}
			else {
				 Madenciler[i]=new Madenciler(rand.nextInt(10),rand.nextInt(10));
			}
			
		}
		for(int i=0;i<500;i++) {
			int a=scan.nextInt();
			if(a==-1) {
				break;
			}
			else {
				int Dguc=Askerler[i].GucHesapla()+Ciftciler[i].GucHesapla();
				int Uguc=Cyborglar[i].GucHesapla()+Madenciler[i].GucHesapla();
				System.out.println(i+".elin sonucu="+(Dguc-Uguc));				
			}
		}
		

	}
}

