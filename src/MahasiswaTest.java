
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MahasiswaTest {

	private static Mahasiswa m;
	
	@Before
	public void awalTest() {
		m = new Mahasiswa();
		System.out.println("Mengawali Testing");
	}
	
	@Test
	public void test1(){
//		m.setNrp("133040213");
		assertNotNull("Seharusnya tidak null", m.getNrp());
	}
	
	@Test
	public void test2(){
		m.setNama(null);
		assertNull("Seharusnya null", m.getNama());
	}
	
	@Test
	public void test3(){
		assertTrue("Seharusnya true", m.cekUmur(21));
	}
	
	@After
	public void akhirTest(){
		System.out.println("Mengakhiri Testing");
	}
	
}
