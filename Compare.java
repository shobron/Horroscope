//Class to get zodiac and shio based on date/month/year inputted using Java Calendar

class Compare {
    public String starHoros(int dayBirth,int monthBirth) {

	String tmp;
	++monthBirth;
	int dayAndMonth;
	String starHoroscope="";
	if (dayBirth<10)
	    tmp=""+monthBirth+""+0+""+dayBirth+"";
	else
	    tmp=""+monthBirth+""+dayBirth+"";
	dayAndMonth=Integer.parseInt(tmp);
	Boolean[] dateStar={dayAndMonth<=219&&dayAndMonth>=121,dayAndMonth<=320&&dayAndMonth>=220,dayAndMonth<=420 && dayAndMonth>=321,dayAndMonth<=521 && dayAndMonth>=421,dayAndMonth<=621 && dayAndMonth>=522,dayAndMonth<=722 && dayAndMonth>=622,dayAndMonth<=822 && dayAndMonth>=723,dayAndMonth<=922 && dayAndMonth>=822,dayAndMonth<=1023 && dayAndMonth>=924,dayAndMonth<=1122 && dayAndMonth>=1024,dayAndMonth<=1221 && dayAndMonth>=1123};
	    String[] star={"Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagitarius"};
for(int i=0;i<11;i++) {
    if(dateStar[i]==true)
	starHoroscope=star[i];
    else
	if(monthBirth==1)
	    monthBirth+=12;
	dayAndMonth=Integer.parseInt(""+monthBirth+""+0+""+dayBirth+"");
	if(dayAndMonth<=1320&&dayAndMonth>=1222)
	    starHoroscope="Capricorn";
    }
return starHoroscope;
}
public String shioHoros(int year) {
    String[] shioStar={"Monyet","Ayam","Anjing","Babi","Tikus","Kerbau","Harimau","Kelinci","Naga","Ular","Kuda","Kambing"};
    int count=(year%12);
    String shio="";
    for(int i=0;i<12;i++) {
	if(i==count) {
	    shio=shioStar[count];
	    break;
	}
    }
    return shio;
}
}