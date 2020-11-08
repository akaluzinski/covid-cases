package eu.kaluzinski.covid_rest_client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Summary {
    @JsonProperty("Global")
    private Global global;

    @JsonProperty("Date")
    private String date;

}
