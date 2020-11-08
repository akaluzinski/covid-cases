package eu.kaluzinski.covid_rest_client.config.services;

import eu.kaluzinski.covid_rest_client.model.Global;

public interface CovidApiService {
    Global getSummaryCovidCases();

}
