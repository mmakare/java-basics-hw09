import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

  /**
   * Test data for common array elements.
   *
   * @return test data array
   */
  @DataProvider(name = "ArrayUtil")
  public static Object[][] arrays() {
    return new Object[][]{
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
            new String[]{"JAVA", "SQL"}
        },
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL1"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "PHP"},
            new String[]{"PHP"}},
        {
            new String[]{"Python", "JAVA", "PHP2", "C#", "C++", "SQL1"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "PHP"},
            new String[]{}}
        // TODO add 2 more test data here
    };
  }

  @Test(dataProvider = "ArrayUtil")
  public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

    assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
        "Common elements are not correct");
  }
}