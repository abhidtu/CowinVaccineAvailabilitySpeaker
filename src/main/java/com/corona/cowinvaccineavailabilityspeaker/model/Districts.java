
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
public class Districts {

    @JsonProperty("districts")
    public List<District> districts;
    @JsonProperty("ttl")
    public Integer ttl;

}
