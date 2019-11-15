public class CourseValidation {
	/* Will check the validity of a class number. If the class number is negative then 
	 * it is invalid. If the class number is larger than 5 digits or less than 5 digits
	 * it is invalid. If it is positive and length of 5 then it is valid.
	 */
	boolean ValidateClassNumber(int classNum) {
		if(classNum < 0) {
			return false;
		}
		if(String.valueOf(classNum).length() != 5) {
			return false;
		}
		return true;
	}
}
