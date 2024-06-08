package tools;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramCheckerTest {
	
	 AnagramChecker anagramChecker = new AnagramChecker();
	    
	    @Test
	    public void testSort() {
	        assertEquals("abc", anagramChecker.sort("cab"));
	        assertEquals("eginstt", anagramChecker.sort("testing"));
	    }

	    @Test
	    public void testIsAnagrams() {
	       assertEquals(true, anagramChecker.isAnagrams("abc", "cab"));
	       assertEquals(false, anagramChecker.isAnagrams("thought", "taught"));
	    }
}
