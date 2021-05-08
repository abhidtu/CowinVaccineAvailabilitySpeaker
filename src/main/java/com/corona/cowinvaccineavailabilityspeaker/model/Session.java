
package com.corona.cowinvaccineavailabilityspeaker.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Abhishek Chawla
 */
@Getter
@Setter
public class Session {

    @JsonProperty("session_id")
    public String sessionId;
    @JsonProperty("date")
    public String date;
    @JsonProperty("available_capacity")
    public Integer availableCapacity;
    @JsonProperty("min_age_limit")
    public Integer minAgeLimit;
    @JsonProperty("vaccine")
    public String vaccine;
    @JsonProperty("slots")
    public List<String> slots;

}
