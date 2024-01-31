import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2= {1,2,3};
    int[] input3= {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{3,2,1}, input2);
    assertArrayEquals(new int[]{4,3,2,1,}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1 , 2 ,3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1,2,4};
    double average = ArrayExamples.averageWithoutLowest(input1);
    double[] input2={1};
    double average2 = ArrayExamples.averageWithoutLowest(input2);
    double[] input3 = {1,1,2,4};
    double average3 = ArrayExamples.averageWithoutLowest(input3);
    assertEquals(3.0, average, 0);
    assertEquals(0.0, average2, 0);
    assertEquals(3.0, average3, 0);
    
  }
}
