
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
public class Center {

    @JsonProperty("center_id")
    public Integer centerId;
    @JsonProperty("name")
    public String name;
    @JsonProperty("state_name")
    public String stateName;
    @JsonProperty("district_name")
    public String districtName;
    @JsonProperty("block_name")
    public String blockName;
    @JsonProperty("pincode")
    public Integer pincode;
    @JsonProperty("lat")
    public Integer lat;
    @JsonProperty("long")
    public Integer _long;
    @JsonProperty("from")
    public String from;
    @JsonProperty("to")
    public String to;
    @JsonProperty("fee_type")
    public String feeType;
    @JsonProperty("sessions")
    public List<Session> sessions;
    @JsonProperty("vaccine_fees")
    public List<VaccineFee> vaccineFees;
}
