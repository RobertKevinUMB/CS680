package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw04.Student;

class StudentTest {

	Student instateStudent = Student.createInStateStudent("Marshal", "Boston");
	Student outStateStudent = Student.createOutStateStudent("Michael", "NewYork", 6);
	Student intlstudent = Student.createIntlStudent("Jack", "Boston", 356, "Turkey");

	@Test
	public void test_Name() {

		assertEquals("Marshal", instateStudent.getName());
		assertEquals("Michael", outStateStudent.getName());
		assertEquals("Jack", intlstudent.getName());
	}
}
