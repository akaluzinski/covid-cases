package eu.kaluzinski.covid_rest_client.config.services;

import eu.kaluzinski.covid_rest_client.model.Global;
import eu.kaluzinski.covid_rest_client.model.Summary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidApiServiceImpl implements CovidApiService {

    private final RestTemplate restTemplate;

    public CovidApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Global getSummaryCovidCases() {
        Summary summary = restTemplate.getForObject("https://api.covid19api.com/summary", Summary.class);

        return summary.getGlobal();
    }
}
