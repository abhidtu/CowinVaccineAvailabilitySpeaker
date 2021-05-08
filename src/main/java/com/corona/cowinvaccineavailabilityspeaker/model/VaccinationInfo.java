
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
public class VaccinationInfo {

    @JsonProperty("centers")
    public List<Center> centers;

}
