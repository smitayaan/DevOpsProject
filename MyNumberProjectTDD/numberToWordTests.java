package devops;

import org.junit.*;



public class numberToWordTests {
	private numberToWord mynoToWord ;
	
	@Before
	public void setup() {
		mynoToWord = new numberToWord() ;
	}
	
	
	
	@Test
	public void validNumberTest() {
		
		Assert.assertEquals( 150, mynoToWord.validNumber( 150) ) ;
		
		Assert.assertEquals( 0, mynoToWord.validNumber( 1000) ) ;
		
		Assert.assertEquals( 0, mynoToWord.validNumber( 0 ) ) ;
	}
	
	@Test
	public void numberTwotest() { 
	
		Assert.assertEquals( "Two", "Two", mynoToWord.convertNumber( 2 ) ) ;
	}	
		
	@Test
	public void numberThirteenTest() {
		
		Assert.assertEquals( "Thirteen", "Thirteen", mynoToWord.convertNumber( 13 ) ) ;
	}
	
	@Test
	public void numberseventyTest() {
		
		Assert.assertEquals( "Seventy ", "Seventy", mynoToWord.convertNumber( 70 ) ) ;
	}
	
	@Test
	public void numbernintyEightTest() {
		
		Assert.assertEquals( "Ninty Eight ", "Ninty Eight", mynoToWord.convertNumber( 98 ) ) ;
	}
	
	@Test
	public void numberOneseventyfiveTest() {
		
		Assert.assertEquals( "One Hundred and Seventy Five", "One Hundred and Seventy Five", mynoToWord.convertNumber( 175 ) ) ;
	}

	@Test
	public void numberOneHundredTest() {
		
		Assert.assertEquals( "One Hundred", "One Hundred", mynoToWord.convertNumber( 100 ) ) ;
	}
	
	@Test
	public void numberSixHundredTest() {
		
		Assert.assertEquals( "Six Hundred", "Six Hundred", mynoToWord.convertNumber( 600 ) ) ;
	}
	
	@Test
	public void numberNineNintyNineTest() {
		
		Assert.assertEquals( "Nine Hundred and Ninty nine", "Nine Hundred and Ninty Nine", mynoToWord.convertNumber( 999 ) ) ;
	}
}
