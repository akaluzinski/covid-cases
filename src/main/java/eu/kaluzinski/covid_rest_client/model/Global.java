package eu.kaluzinski.covid_rest_client.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Global {

    @JsonProperty("NewConfirmed")
    private long newConfirmed;

    @JsonProperty("NewDeaths")
    private long newDeaths;


}
