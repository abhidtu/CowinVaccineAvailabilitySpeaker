package com.corona.cowinvaccineavailabilityspeaker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Abhishek Chawla
 */
public class Utils {

    public static String getCurrentDateAsString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dateTimeFormatter.format(now);
    }

}
