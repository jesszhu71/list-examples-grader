import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
  public void testFilter1() {
    List<String> input1 = new ArrayList<>();
    input1.add("hello");
    input1.add("hello");
    input1.add("hello");
    input1.add("bye");
    input1.add("bye");
    input1.add("bye");
    input1.add("bye");
    input1.add("bye");


    List<String> out = new ArrayList<>();
    out.add("bye");
    out.add("bye");
    out.add("bye");
    out.add("bye");
    out.add("bye");
    IsMoon sC = new IsMoon();
    assertArrayEquals(out.toArray(), ListExamples.filter(input1, sC).toArray());
	}



    @Test 
	public void testFilter2() {
    List<String> input1 = new ArrayList<>();


    List<String> out = new ArrayList<>();
    IsMoon sC = new IsMoon();
    assertArrayEquals(out.toArray(), ListExamples.filter(input1, sC).toArray());
	}




    @Test 
	public void testMerge1() {
    List<String> input1 = new ArrayList<>();

    input1.add("a");
    input1.add("b");

    input1.add("d");
    input1.add("f");

    List<String> input2 = new ArrayList<>();
    input2.add("c");
    input2.add("e");

    input2.add("g");
    input2.add("h");


    List<String> out = new ArrayList<>();
    // ListExamples sC = new ListExamples();
    out.add("a");
    out.add("b");
    out.add("c");

    out.add("d");
    out.add("e");
    out.add("f");

    out.add("g");
    out.add("h");



    assertArrayEquals(out.toArray(), ListExamples.merge(input1, input2).toArray());
	}
}
