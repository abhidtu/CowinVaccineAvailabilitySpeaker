
package com.corona.cowinvaccineavailabilityspeaker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Abhishek Chawla
 */
@Getter
@Setter
public class District {

    @JsonProperty("district_id")
    public Integer districtId;
    @JsonProperty("district_name")
    public String districtName;

}
