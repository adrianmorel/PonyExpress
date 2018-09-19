package ponyExpress;

import org.junit.Assert;
import org.junit.Test;

public class JineteTest {

	@Test
	public void UnJinete() {
		Assert.assertEquals(1, Jinete.jinetes(new int[] { 18, 25 }));
	}

	@Test
	public void DosJinetes() {
		Assert.assertEquals(2, Jinete.jinetes(new int[] { 43, 23, 40, 13 }));
	}

	@Test
	public void TresJinetes() {
		Assert.assertEquals(3, Jinete.jinetes(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
	}

	@Test
	public void CuatroJinetes() {
		Assert.assertEquals(4, Jinete.jinetes(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

}
