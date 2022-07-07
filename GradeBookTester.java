import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	/*
	 Task #2
	 1.	Select the setUp and tearDown method check boxes and click Next.
	 2.	Select all of the methods of Gradebook, except for the constructor to create tests for. Then click finish.
	 * 
	 * 
	 Task #3
	 1.	In the setUp method of GradebookTester, create at least two objects of Gradebook to hold 5 scores. 
	 	Then call the addScore method for each of the Gradebook objects at least twice (but no more than 5 times) 
	 	to add some random scores of your choice to the GradeBook objects
	 2.	In the teardown method of GradebookTester, set the two objects of Gradebook to null.
	 */
	
	GradeBook book1;
	GradeBook book2;
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		for (int i = 1; i <= 5; i++)
		{
			book1.addScore(i);		// adds 1.0 2.0 3.0 4.0 5.0 
			book2.addScore(6 - i);	// adds 5.0 4.0 3.0 2.0 1.0 
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}
	
	
	/*
	 Task #4: Create test for the methods of Gradebook
	 1. addScore
	 2. sum
	 3. minimum
	 4. finalScore
	 */

	@Test
	void testAddScore() {
		assertTrue(book1.toString().equals("1.0 2.0 3.0 4.0 5.0 "));
		assertTrue(book2.toString().equals("5.0 4.0 3.0 2.0 1.0 "));
	}

	@Test
	void testSum() {
		assertEquals(15.0, book1.sum());
		assertEquals(15.0, book2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(1, book1.minimum());
		assertEquals(1, book2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(14, book1.finalScore());
		assertEquals(14, book2.finalScore());
	}
	
	/*
	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}
	 */
}
