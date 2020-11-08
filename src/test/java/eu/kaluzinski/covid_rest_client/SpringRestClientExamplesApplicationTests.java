package eu.kaluzinski.covid_rest_client;

import eu.kaluzinski.covid_rest_client.config.services.CovidApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestClientExamplesApplicationTests {

	@Autowired
	CovidApiService apiService;

	@Test
	public void shouldGetCovidCases() {

		long cases = apiService.getSummaryCovidCases().getNewConfirmed();

		assertTrue("cases", cases >= 0);

	}
}
