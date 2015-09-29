//Class to get the horoscope of zodiac, shio, and intersecting horoscope of both fo them
public class Ramal {
	String[][] zodiak = {
			{"Anda akan mendapatkan keberuntungan hari ini!", "Hari esok adalah hari terbaik anda!", "Besok anda akan mendapatkan surprise!"},
			{"Karir anda akan meningkat tajam", "Profit bisnis anda cenderung naik bulan ini", "Promosi dan jabatan bergengsi akan anda dapatkan sebentar lagi!"},
			{"Gagal lagi ya keuangannya? Kasian...", "kurang mampu mengatur pengeluaran akhirnya bangkrut", "tidak ada masukan tapi yang ada keluaran"},
			{"Anda akan dilanda kesedihan yang mendalam", "", ""}	
	};
	
	String[][] shio = {
			{"Impian anda akan segera terwujud", "Besok anda memiliki pacar", "Rezeki anda akan berlipat ganda hari ini"},
			{"Kesuksesan sudah di depan mata", "Anda akan menjadi pengusaha kaya raya", "Usahamu tidak akan sia-sia"},
			{"Harapannya ada pemasukan, tapi malah rugi. Duhdek!", "tidak cocok bekerja dalam ruangan karena hanya memperburuk pengeluaran", " tidak dapat mengatur keuangan yang melonjak tajam"},
			{"", "", ""}	
	};
	
	String[][] gabungan = {
			{"Ketika kamu memang merasa senang, bersenang-senanglah!","Kamu memang pantas untuk bersenang-senang, karena berkat usahamu suksesmu pasti kan datang", "Perasaan yang senang memang menyenangkan, tapi apabila berujung kebangkrutan janganlah senang itu diteruskan dahulu.", "Meskipun sering merasakan senang, tapi galau memang tak bisa dihindari. Tetap semangat!", ""},
			{"Setelah kamu meraih sukses mu, kamu pasti akan merasa senang jadi tenanglah!","Sukses yang berlipat ganda! Jangan sampai lupa usahamu juga ya!", "Setelah berada di ujung sukses, mungkin ada kalanya kamu harus berada di bawah.. semangat!", "Di dalam kesuksesan pasti ada masa-masa galau, tak usah khawatir"},
			{"Merasa rugi bukan berarti kau tidak bisa merasa senang.", "Kamu akan merasakan apa itu jatuh dan setelah itu bangkit dengan suksesmu","Hidup memang keras bung, selamat berjuang!", "Kondisi buruk memang tak bisa dihindari dalam sebuah takdir, orang bangkrut pantas galau sih ya."},
			{"Memang adakalanya galau, tapi sekarang sekarang saatnya bergembira!", "Sebelum sukses memang harus diawali dengan perasaan yang galau, selamat berjuang!", "Dunia memang penuh dengan cobaan, sekarang mungkin masih di bawah, galau sedikit tidak masalah.", "Kamu terlalu terlarut dalam kegalauan hidup yang tak berujung."}
	};
	
	String deskripsiZodiak;
	String deskripsiShio;
	String deskripsiGabungan;
	int indeks;
	
	public Ramal(){
		this.deskripsiZodiak = "none";
		this.deskripsiShio = "none";
		this.deskripsiGabungan = "none";
	}

	public String getDeskripsiZodiak() {
		return deskripsiZodiak;
	}

	public void setDeskripsiZodiak(int indeks1, int indeks2) {
		this.deskripsiZodiak = zodiak[indeks1][indeks2];
	}
	
	public String getDeskripsiShio() {
		return deskripsiShio;
	}

	public void setDeskripsiShio(int indeks3, int indeks4) {
		this.deskripsiShio = shio[indeks3][indeks4];
	}
	
	public String getDeskripsiGabungan() {
		return deskripsiGabungan;
	}

	public void setDeskripsiGabungan(int indeks5, int indeks6) {
		this.deskripsiGabungan = gabungan[indeks5][indeks6];
	}
}
