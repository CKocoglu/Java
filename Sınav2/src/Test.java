import java.util.Scanner;
public class Test {
	
	public static void S�rala(�r�n[] �r�nListesi) {
		int min;
		�r�n temp;
		for(int i=0;i<�r�nListesi.length;i++) {
			min=i;
			for(int j=i+1;j<�r�nListesi.length;j++) {
				if(�r�nListesi[j].getY�l()<�r�nListesi[min].getY�l()) {
					min=j;
				}
				else if(�r�nListesi[j].getY�l()==�r�nListesi[min].getY�l()) {
					if(�r�nListesi[j].getAy()<�r�nListesi[min].getAy()) {
						min=j;
				}
			}
			temp=�r�nListesi[i];
			�r�nListesi[i]=�r�nListesi[min];
			�r�nListesi[min]=temp;
		}
		
	 }
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		�r�n [] �r�nListesi=new �r�n[3];
		 
		
		for(int i=0;i<�r�nListesi.length;i++) {
			�r�n �r�n=new �r�n(1,1,"a","b");
			�r�nListesi[i]=�r�n;
		}
		
		for(int i=0;i<�r�nListesi.length;i++) {
			System.out.printf(i+".�r�n ad�: ");
			�r�nListesi[i].set�r�nad�(scan.next());
			System.out.printf(i+".�r�n t�r�: ");
			�r�nListesi[i].set�r�nt�r�(scan.next());
			System.out.printf("Son kullanma tarihi ay: ");
			int ay=scan.nextInt();
			if(ay>12 || ay<1) {
				break;
			}
			else {
				�r�nListesi[i].setAy(ay);
			}
			System.out.printf("Son kullanma tarihi y�l: ");
			int y�l=scan.nextInt();
			if(y�l>10 || y�l<1) {
				break;
			}
			else {
				�r�nListesi[i].setY�l(y�l);
			}
			
		}
		//Arrays.sort(�r�nListesi);
		for (int i = 0; i < �r�nListesi.length; i++) {
			System.out.println((i+1)+".�r�n ad�:"+�r�nListesi[i].get�r�nad�()+
					" �r�n t�r�:"+�r�nListesi[i].get�r�nt�r�()+
					" Son kullanma tarihi:"+�r�nListesi[i].getAy()+"."+�r�nListesi[i].getY�l());
		}
		S�rala(�r�nListesi);
		System.out.println("---------------");
		for (int i = 0; i < �r�nListesi.length; i++) {
			System.out.println((i+1)+".�r�n ad�:"+�r�nListesi[i].get�r�nad�()+
					" �r�n t�r�:"+�r�nListesi[i].get�r�nt�r�()+
					" Son kullanma tarihi:"+�r�nListesi[i].getAy()+"."+�r�nListesi[i].getY�l());
		}
	}
}
