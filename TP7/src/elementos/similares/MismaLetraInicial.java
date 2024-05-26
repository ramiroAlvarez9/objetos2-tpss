package elementos.similares;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends Filtro {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage thisWikiPage, List<WikipediaPage> wikipediaPages) {

		String title = thisWikiPage.getTitle();

		List<WikipediaPage> similarPages = 
				wikipediaPages.stream()
				.filter(wikiPage -> (wikiPage.getTitle().charAt(0)) == title.charAt(0))
				.collect( Collectors.toList() ) ;
		

		return similarPages;
	}

}
