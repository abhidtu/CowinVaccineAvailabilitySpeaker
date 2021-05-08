package com.corona.cowinvaccineavailabilityspeaker.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Abhishek Chawla
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class RequestedDistrictsWithAge {
    Integer districtId;
    Integer age;
}
