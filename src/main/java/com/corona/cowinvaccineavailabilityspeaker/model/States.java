package com.corona.cowinvaccineavailabilityspeaker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Abhishek Chawla
 */
@Getter
@Setter
public class States {

    @JsonProperty("states")
    List<State> states;

}
