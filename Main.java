/*
 * Object Oriented Programming Assement #2
 * Horroscope Progam
 * Dev'd by:
 * 1. Muhammad Iqbal Ardiansyah (14/365234/TK/42053)
 * 2. Muhammad Rifqi Zuliansyah (14/365235/TK/42054)
 * 3. Muflih Nadzarudin Majid   (14/368979/TK/42596)
 * 4. Muhammad Rofi Ash-Shobron (14/365237/TK/42056)
 * 5. Fata Azharuddin           (14/369641/TK/42648)
 * 6. Kharisma Prasetya         (14/365249/TK/42061) 
 * 7. F A Kristiawan            (14/365949/TK/42076)
 * 8. Nizar Akbar Meilani		(14/)
 * 
 * Kempling Team
 * Copyright@2015
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====================================================");
		System.out.println("=-RRR----AAA---MM---MM---AAA---L------AAA---NN---N-=");
		System.out.println("=-R--R--A---A--M-M-M-M--A---A--L-----A---A--N-N--N-=");
		System.out.println("=-R-R---AAAAA--M--M--M--AAAAA--L-----AAAAA--N--N-N-=");
		System.out.println("=-R--R--A---A--M-----M--A---A--LLLL--A---A--N---NN-=");
		System.out.println("=--------------------------------------------------=");
		System.out.println("=--------------------------------------------------=");
		System.out.println("=-ZZZZ---OOO---DDDD---I---AAA---K-K----------------=");
		System.out.println("=---Z---O---O--D---D--I--A---A--KK-----------------=");
		System.out.println("=--Z----O---O--D---D--I--AAAAA--KK-----------------=");
		System.out.println("=-ZZZZ---OOO---DDDD---I--A---A--K-K----------------=");
		System.out.println("=--------------------------------------------------=");
		System.out.println("=---&&&&-------------------------------------------=");
		System.out.println("=--&----&--------------------SSSS--H---H--I---OOO--=");
		System.out.println("=---&&&&---&----------------S------H---H--I--O---O-=");
		System.out.println("=--&----&&-------------------SSS---HHHHH--I--O---O-=");
		System.out.println("=---&&&---&-----------------SSSSS--H---H--I---OOO--=");
		System.out.println("====================================================");
		System.out.println();
		Calendar calendar = new GregorianCalendar();
		Scanner input=new Scanner(System.in);
		Compare HorosComp=new Compare();
		String choice="Y";
		while(choice.equals("Y")) {
			System.out.print("Masukkan tanggal lahir kamu= ");
			int inputDay=input.nextInt();
			System.out.print("Masukkan bulan lahir kamu= ");
			int inputMonth=input.nextInt();
			System.out.print("Masukkan tahun lahir kamu= ");
			calendar.set(Calendar.YEAR,input.nextInt());
			if (inputDay<=31&&inputMonth<=12) {
	
				calendar.set(Calendar.DAY_OF_MONTH,inputDay);
			//month of a person
			
				calendar.set(Calendar.MONTH,inputMonth-1);
			
			//year of a person
				
			//store all of them
				int year=calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH);
				int date= calendar.get(Calendar.DAY_OF_MONTH);
			//try print of them
	
				String star=HorosComp.starHoros(date,month);
				String shio=HorosComp.shioHoros(year);
				
				System.out.println("Bintang: "+star);
//menampilkan ramalan bintang
				int indeks1=0, indeks2=0;
				Ramal z1 = new Ramal();
				int indeks3=0, indeks4=0;
				Ramal s1 = new Ramal();
				//Senang
				if(star.equals("Cancer") || star.equals("Libra") || star.equals("Capricorn")){
					indeks1 = 0;
					if(star.equals("Cancer")){
						indeks2 = 0;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Libra")){
						indeks2 = 1;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Capricorn")){
						indeks2 = 2;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
				}
				//Sukses
				else if(star.equals("Aquarius") || star.equals("Pisces") || star.equals("Taurus")){
					indeks1 = 1;
					if(star.equals("Aquarius")){
						indeks2 = 0;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Pisces")){
						indeks2 = 1;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Taurus")){
						indeks2 = 2;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
				}
				//Bangkrut
				else if(star.equals("Sagitarius") || star.equals("Scorpio") || star.equals("Leo")){
					indeks1 = 2;
					if(star.equals("Sagitarius")){
						indeks2 = 0;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Scorpio")){
						indeks2 = 1;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Leo")){
						indeks2 = 2;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
				}
				//Galau
				else if(star.equals("Gemini") || star.equals("Virgo") || star.equals("Aries")){
					indeks1 = 3;
					if(star.equals("Gemini")){
						indeks2 = 0;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Virgo")){
						indeks2 = 1;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}
					else if(star.equals("Aries")){
						indeks2 = 2;
						z1.setDeskripsiZodiak(indeks1, indeks2);
					}	
				}
				System.out.println(z1.getDeskripsiZodiak());
				System.out.println();
				
				System.out.println("Shio: "+shio);
//menampilkan ramalan shio
				//Senang
				if(shio.equals("Babi") || shio.equals("Naga") || shio.equals("Monyet")){
					indeks3 = 0;
					if(shio.equals("Naga")){
						indeks4 = 0;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Monyet")){
						indeks4 = 1;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Babi")){
						indeks4 = 2;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
				}
				//Sukses
				else if(shio.equals("Kuda") || shio.equals("Kambing") || shio.equals("Anjing")){
					indeks3 = 1;
					if(shio.equals("Kuda")){
						indeks4 = 0;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Kambing")){
						indeks4 = 1;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Anjing")){
						indeks4 = 2;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
				}
				//Bangkrut
				else if(shio.equals("Ular") || shio.equals("Tikus") || shio.equals("Harimau")){
					indeks3 = 2;
					if(shio.equals("Ular")){
						indeks4 = 0;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Tikus")){
						indeks4 = 1;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Harimau")){
						indeks4 = 2;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
				}
				//Galau
				else if(shio.equals("Kelinci") || shio.equals("Ayam") || shio.equals("Kerbau")){
					indeks3 = 3;
					if(shio.equals("Kelinci")){
						indeks4 = 0;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Ayam")){
						indeks4 = 1;
						s1.setDeskripsiShio(indeks3, indeks4);
					}
					else if(shio.equals("Kerbau")){
						indeks4 = 2;
						s1.setDeskripsiShio(indeks3, indeks4);
					}	
				}
				System.out.println(s1.getDeskripsiShio());
				System.out.println();
				
				Ramal g1 = new Ramal();
				g1.setDeskripsiGabungan(indeks1, indeks3);
				System.out.println("Jadi...");
				System.out.println(g1.getDeskripsiGabungan());
			}
			
			else {
			    System.out.println("Inputanmu salah, Dab!");
			}
			
			System.out.println("Mau coba lagi keberuntunganmu? Y/N");
			choice = input.next();
		}
		System.exit(-1);
	}
}
