
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
public class StateDistrict {

    @JsonProperty("districts")
    public List<District> districts;
    @JsonProperty("ttl")
    public Integer ttl;

}
