package elementos.similares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wikipedia implements WikipediaPage {

	String title;
	List<String> links = new ArrayList<String>();
	Map<String, WikipediaPage> infoBox = new HashMap<String, WikipediaPage>();

	public Wikipedia(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {

		return this.title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return null;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return null;
	}

}
