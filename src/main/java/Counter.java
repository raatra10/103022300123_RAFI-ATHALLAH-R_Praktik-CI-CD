package src.main.java;

public class Counter {

	private int count;
	
	// Menambahkan variabel yang tidak pernah digunakan 
	private String dummyVariable = "Halo Dosen"; 

	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		// Skenario Gagal 2: Menggunakan System.out untuk logging
		System.out.println("Nilai counter bertambah!");
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		// Menulis baris kode mati setelah statement return
		return count;
		// sengaja di-comment atau dibiarkan aktif jika compiler mengizinkan untuk memicu deteksi analisis
	}
	
	// Skenario Gagal 4: Membuat fungsi kosong yang tidak melakukan apa-apa (Code Smell: Empty Method Body)
	public void fungsiGabutSengajaDibuat() {
		// Kosong sengaja untuk memicu komplain SonarCloud
	}
	
}
