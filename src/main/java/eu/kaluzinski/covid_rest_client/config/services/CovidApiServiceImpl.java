package eu.kaluzinski.covid_rest_client.config.services;

import eu.kaluzinski.covid_rest_client.model.Global;
import eu.kaluzinski.covid_rest_client.model.Summary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidApiServiceImpl implements CovidApiService {

    private final RestTemplate restTemplate;
    private final String apiUrl;

    public CovidApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    @Override
    public Global getSummaryCovidCases() {
        Summary summary = restTemplate.getForObject(apiUrl, Summary.class);

        return summary.getGlobal();
    }
}
