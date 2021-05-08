
package com.corona.cowinvaccineavailabilityspeaker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Abhishek Chawla
 */
@Getter
@Setter
public class VaccineFee {

    @JsonProperty("vaccine")
    public String vaccine;
    @JsonProperty("fee")
    public String fee;

}
