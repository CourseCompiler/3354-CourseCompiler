import static org.junit.Assert.*;
import org.junit.Test;

public class CourseValidationTest {
	@Test
	public void isValidTest() {
		int classNum = 23432;
		CourseValidation validate = new CourseValidation();
		assertTrue(validate.ValidateClassNumber(classNum));
	}
	
	
}
