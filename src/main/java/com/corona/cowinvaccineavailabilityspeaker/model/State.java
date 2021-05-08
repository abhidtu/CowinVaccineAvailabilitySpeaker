package com.corona.cowinvaccineavailabilityspeaker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Abhishek Chawla
 */
@Getter
@Setter
public class State {

    @JsonProperty("state_id")
    public Integer stateId;
    @JsonProperty("state_name")
    public String stateName;

}
