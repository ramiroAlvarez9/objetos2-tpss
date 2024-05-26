package elementos.similares;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElementosSimilaresTest {

	//All pages to use in code
	WikipediaPage wikipediaPage1;
	WikipediaPage wikipediaPage2;
	WikipediaPage wikipediaPage3;
	
	//Filter to pages
	MismaLetraInicial mismaLetraInicial;
	
	//list of pages 
	List<WikipediaPage> wikipediaPages = new ArrayList<WikipediaPage>();
	
	@BeforeEach
	void setUp() throws Exception {
		//create pages 
		wikipediaPage1 = new Wikipedia("La Plata");
		wikipediaPage2 = new Wikipedia("Lobo");
		wikipediaPage3 = new Wikipedia("Hawai");
		
		//adding all pages
		wikipediaPages.add(wikipediaPage2);
		wikipediaPages.add(wikipediaPage3);
		
		//instance of filter
		mismaLetraInicial = new MismaLetraInicial();
	}
	
	@Test
	void mismaLetraInicialSize() {
		
		//size of similar elements 
		assertEquals( 1 , ( mismaLetraInicial.getSimilarPages( wikipediaPage1 ,  wikipediaPages) ).size() );
		
	}
	@Test
	void mismaLetraInicialContiene() {
		
		List<WikipediaPage> resultingList = mismaLetraInicial.getSimilarPages(wikipediaPage1 , wikipediaPages);
		//contains n element
		assertTrue(resultingList.contains( wikipediaPage2 ));
		
	}
	@Test
	void mismaLetraInicialNoContiene() {
		
		List<WikipediaPage> resultingList = mismaLetraInicial.getSimilarPages(wikipediaPage1 , wikipediaPages);
		//not contains n element
		assertFalse(resultingList.contains( wikipediaPage3 ));
		
	}
	
	@Test
	void mismaLetraInicialNoContiene2() {
		
		List<WikipediaPage> resultingList = mismaLetraInicial.getSimilarPages(wikipediaPage1 , wikipediaPages);
		//not contains n element
		assertFalse(resultingList.contains( wikipediaPage1 ));
		
	}
	

}
