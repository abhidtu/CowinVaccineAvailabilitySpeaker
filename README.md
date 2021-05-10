# CowinVaccineAvailabilitySpeaker
CowinVaccineAvailabilitySpeaker is a Java software that notifies user by voice when a new vaccine is available in the specified pin-code/district.

# Prerequisite
You will need to have Java 8 or above installed on your system.
Steps to install Java on your system:
First check if java is installed on your system by running this command in your terminal: java -version if its says version greater that or equal to 8 then you already have java installed your system and this step can be skipped.

# Usage
1. To run CowinVaccineAvailabilitySpeaker download the jar from here:   https://github.com/abhidtu/CowinVaccineAvailabilitySpeaker/raw/main/releases/CowinVaccineAvailabilitySpeaker-1.0.jar
2. Navigate to the downloads directory and note down its path. Open the termianl in your mac or PC and type "java -jar path_tothe_java_file".
3. The application should start now with the message "Cowin Vacccine Availability Speaker" in Acii characters.
4. Head over to your browser and open the following URL's
 1. To get notification if vaccine is available in the requested district : 'http://localhost:8080/rest/corona/vaccination/registerDistrict?districtName={district name}&&age={age}'
 For example if you want to check vaccine availability in 'south delhi' for age 18 the request would be like: http://localhost:8080/rest/corona/vaccination/registerDistrict?districtName=south delhi&&age=18
 
And lets say we want to checkvccine availability in 'cental delih' for age 45 the request would be like: http://localhost:8080/rest/corona/vaccination/registerDistrict?districtName=central delhi&&age=18

2. To get notification if vaccine is available in the requested pin-code : 'http://localhost:8080/rest/corona/vaccination/registerPin?pinCode={desired pin code}&&age={age}'
