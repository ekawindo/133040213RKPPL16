
public class Mahasiswa {
	
	private String nama;
	private String nrp;
	private int umur;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public boolean cekUmur(int umur){
		boolean toReturn = false;
		if (umur >= 0 && umur <= 100) {
			toReturn = true;
		}
		return toReturn;
	}
	
	public String getIndex(double ipk){
		String toReturn = null;
		if (ipk == 4.0) {
			toReturn = "A";
		} else if(ipk == 3.0) {
			toReturn = "B";
		} else if(ipk == 2.0) {
			toReturn = "C";
		} else if(ipk == 1.0) {
			toReturn = "D";
		} else if(ipk < 1.0) {
			toReturn = "E";
		} else {
			toReturn = "NONE";
		}
		return toReturn;
	}

}
