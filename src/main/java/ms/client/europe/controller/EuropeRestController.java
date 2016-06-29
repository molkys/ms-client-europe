package ms.client.europe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EuropeRestController {

	@Value("${ms-client}") String msClient;

	@RequestMapping(value="/getMsClient", produces=MediaType.APPLICATION_JSON_VALUE)
	public String getMsClient() {
		return "Rest Controller with ms-client: " + msClient;
	}
}
