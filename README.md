# CowinVaccineAvailabilitySpeaker
CowinVaccineAvailabilitySpeaker is a Java software that notifies user by voice when a new vaccine is available in the specified pin-code/district. It is built using "Co-WIN Public API" 

# what makes CowinVaccineAvailabilitySpeaker unique?
* Since it gives you voice notifications, its reduces the chances to miss the notifications especially when you are way from keyboard. The sofftware can be kept running in background and the voice notifications will start as soon a vaccine slot is available in the list of specified pin-codes or districts.
* You can register for multiple districts and pin codes and start receiving voice notifications for them.

# Prerequisite
You will need to have Java 8 or above installed on your system.
Steps to install Java on your system:
First check if java is installed on your system by running this command in your terminal: java -version if its says version greater that or equal to 8 then you already have java installed your system and this step can be skipped.

# Usage
1. To run CowinVaccineAvailabilitySpeaker download the jar from here:   https://github.com/abhidtu/CowinVaccineAvailabilitySpeaker/raw/main/releases/CowinVaccineAvailabilitySpeaker-1.0.jar
2. Navigate to the downloads directory and note down its path. Open the termianl in your mac or PC and type "java -jar path_tothe_java_file".
3. The application should start now with the message "Cowin Vacccine Availability Speaker" in Acii characters.
4. Head over to your browser and open the following URL's
 * To get notification if vaccine is available in the requested district : 'http://localhost:7021/rest/corona/vaccination/registerDistrict?districtName={district name}&&age={age}
 * For example if you want to check vaccine availability in 'south delhi' for age 18 the URL would be like: (http://localhost:7021/rest/corona/vaccination/registerDistrict?districtName=south%20delhi&&age=18)
 
* And lets say we want to check vccine availability in 'cental delih' for age 45 then the URL would be like: (http://localhost:7021/rest/corona/vaccination/registerDistrict?districtName=central%20delhi&&age=45) Thhe list of all possible districts are mentioned in the doc below.

* To get notification if vaccine is available in the requested pin-code : ('http://localhost:7021/rest/corona/vaccination/registerPin?pinCode={desired pin code}&&age={age}')

* And lets say we want to check vaccine availability in pin-code = 110018, then the URl will be: (http://localhost:7021/rest/corona/vaccination/registerPin?pinCode=110018&&age=18)

# Video Tutorial:

[![Cowin Vaccine Availability Speaker](https://i.ytimg.com/an_webp/ta_d0O8xgGE/mqdefault_6s.webp?du=3000&sqp=CJnD44QG&rs=AOn4CLA6r4xi9NABX7ZCqsiFzzo_ZG3PpQ)](https://www.youtube.com/watch?v=ta_d0O8xgGE&ab_channel=AbhishekChawla)

Here is a list of all possible districts categorised state wise which can be used to build the URL:

State | District
------------ | -------------
Andaman and Nicobar Islands | Nicobar
Andaman and Nicobar Islands | North and Middle Andaman
Andaman and Nicobar Islands | South Andaman
Andhra Pradesh | Chittoor
Andhra Pradesh | Prakasam
Andhra Pradesh | West Godavari
Andhra Pradesh | East Godavari
Andhra Pradesh | Sri Potti Sriramulu Nellore
Andhra Pradesh | YSR District, Kadapa (Cuddapah)
Andhra Pradesh | Guntur
Andhra Pradesh | Srikakulam
Andhra Pradesh | Krishna
Andhra Pradesh | Visakhapatnam
Andhra Pradesh | Anantapur
Andhra Pradesh | Kurnool
Andhra Pradesh | Vizianagaram
Arunachal Pradesh | Tawang
Arunachal Pradesh | Longding
Arunachal Pradesh | Dibang Valley
Arunachal Pradesh | West Siang
Arunachal Pradesh | Pakke Kessang
Arunachal Pradesh | Kra Daadi
Arunachal Pradesh | Tirap
Arunachal Pradesh | Lower Dibang Valley
Arunachal Pradesh | East Kameng
Arunachal Pradesh | Papum Pare
Arunachal Pradesh | Kurung Kumey
Arunachal Pradesh | Upper Siang
Arunachal Pradesh | Lower Siang
Arunachal Pradesh | East Siang
Arunachal Pradesh | Shi Yomi
Arunachal Pradesh | Lepa Rada
Arunachal Pradesh | Anjaw
Arunachal Pradesh | Upper Subansiri
Arunachal Pradesh | Lower Subansiri
Arunachal Pradesh | Itanagar Capital Complex
Arunachal Pradesh | Siang
Arunachal Pradesh | Lohit
Arunachal Pradesh | Changlang
Arunachal Pradesh | West Kameng
Arunachal Pradesh | Namsai
Arunachal Pradesh | Kamle
Assam | Nalbari
Assam | Kamrup Metropolitan
Assam | Dhemaji
Assam | Udalguri
Assam | Lakhimpur
Assam | Golaghat
Assam | Cachar
Assam | Sivasagar
Assam | Kamrup Rural
Assam | Dhubri
Assam | Baksa
Assam | West Karbi Anglong
Assam | Majuli
Assam | Hailakandi
Assam | Charaideo
Assam | Sonitpur
Assam | Karbi-Anglong
Assam | Dibrugarh
Assam | Barpeta
Assam | Morigaon
Assam | Hojai
Assam | Chirang
Assam | South Salmara Mankachar
Assam | Karimganj
Assam | Dima Hasao
Assam | Biswanath
Assam | Nagaon
Assam | Jorhat
Assam | Darrang
Assam | Tinsukia
Assam | Kokrajhar
Assam | Goalpara
Assam | Bongaigaon
Bihar | Patna
Bihar | Khagaria
Bihar | Buxar
Bihar | Saran
Bihar | Munger
Bihar | Jamui
Bihar | Banka
Bihar | Supaul
Bihar | Purnia
Bihar | Kishanganj
Bihar | Darbhanga
Bihar | Sheikhpura
Bihar | Muzaffarpur
Bihar | Jehanabad
Bihar | Begusarai
Bihar | Vaishali
Bihar | Rohtas
Bihar | Lakhisarai
Bihar | East Champaran
Bihar | Araria
Bihar | Sheohar
Bihar | Nalanda
Bihar | Kaimur
Bihar | Bhagalpur
Bihar | West Champaran
Bihar | Saharsa
Bihar | Madhepura
Bihar | Gaya
Bihar | Arwal
Bihar | Sitamarhi
Bihar | Nawada
Bihar | Katihar
Bihar | Bhojpur
Bihar | Samastipur
Bihar | Madhubani
Bihar | Gopalganj
Bihar | Aurangabad
Bihar | Siwan
Chandigarh | Chandigarh
Chhattisgarh | Koriya
Chhattisgarh | Durg
Chhattisgarh | Balod
Chhattisgarh | Raipur
Chhattisgarh | Kanker
Chhattisgarh | Bijapur
Chhattisgarh | Mahasamund
Chhattisgarh | Gariaband
Chhattisgarh | Baloda bazar
Chhattisgarh | Rajnandgaon
Chhattisgarh | Kawardha
Chhattisgarh | Bilaspur
Chhattisgarh | Mungeli
Chhattisgarh | Gaurela Pendra Marwahi 
Chhattisgarh | Balrampur
Chhattisgarh | Sukma
Chhattisgarh | Kondagaon
Chhattisgarh | Dantewada
Chhattisgarh | Narayanpur
Chhattisgarh | Janjgir-Champa
Chhattisgarh | Bastar
Chhattisgarh | Surajpur
Chhattisgarh | Korba
Chhattisgarh | Dhamtari
Chhattisgarh | Raigarh
Chhattisgarh | Jashpur
Chhattisgarh | Bemetara
Chhattisgarh | Surguja
Dadra and Nagar Haveli | Dadra and Nagar Haveli
Daman and Diu | Daman
Daman and Diu | Diu
Delhi | West Delhi
Delhi | East Delhi
Delhi | Shahdara
Delhi | New Delhi
Delhi | South Delhi
Delhi | North Delhi
Delhi | South East Delhi
Delhi | North East Delhi
Delhi | South West Delhi
Delhi | Central Delhi
Delhi | North West Delhi
Goa | North Goa
Goa | South Goa
Gujarat | Bharuch
Gujarat | Vadodara
Gujarat | Patan
Gujarat | Junagadh Corporation
Gujarat | Dahod
Gujarat | Amreli
Gujarat | Surat
Gujarat | Morbi
Gujarat | Gir Somnath
Gujarat | Bhavnagar
Gujarat | Vadodara Corporation
Gujarat | Porbandar
Gujarat | Kheda
Gujarat | Dang
Gujarat | Anand
Gujarat | Surat Corporation
Gujarat | Narmada
Gujarat | Jamnagar
Gujarat | Bhavnagar Corporation
Gujarat | Valsad
Gujarat | Rajkot
Gujarat | Kutch
Gujarat | Devbhumi Dwaraka
Gujarat | Aravalli
Gujarat | Surendranagar
Gujarat | Navsari
Gujarat | Jamnagar Corporation
Gujarat | Botad
Gujarat | Ahmedabad
Gujarat | Rajkot Corporation
Gujarat | Mahisagar
Gujarat | Gandhinagar
Gujarat | Banaskantha
Gujarat | Tapi
Gujarat | Panchmahal
Gujarat | Junagadh
Gujarat | Chhotaudepur
Gujarat | Ahmedabad Corporation
Gujarat | Sabarkantha
Gujarat | Mehsana
Gujarat | Gandhinagar Corporation
Haryana | Sonipat
Haryana | Kurukshetra
Haryana | Charkhi Dadri
Haryana | Panipat
Haryana | Jhajjar
Haryana | Yamunanagar
Haryana | Mahendragarh
Haryana | Faridabad
Haryana | Rewari
Haryana | Jind
Haryana | Nuh
Haryana | Fatehabad
Haryana | Rohtak
Haryana | Kaithal
Haryana | Ambala
Haryana | Palwal
Haryana | Gurgaon
Haryana | Sirsa
Haryana | Karnal
Haryana | Bhiwani
Haryana | Panchkula
Haryana | Hisar
Himachal Pradesh | Mandi
Himachal Pradesh | Kangra
Himachal Pradesh | Shimla
Himachal Pradesh | Kinnaur
Himachal Pradesh | Sirmaur
Himachal Pradesh | Bilaspur
Himachal Pradesh | Kullu
Himachal Pradesh | Solan
Himachal Pradesh | Chamba
Himachal Pradesh | Lahaul Spiti
Himachal Pradesh | Una
Himachal Pradesh | Hamirpur
Jammu and Kashmir | Srinagar
Jammu and Kashmir | Kulgam
Jammu and Kashmir | Anantnag
Jammu and Kashmir | Ramban
Jammu and Kashmir | Ganderbal
Jammu and Kashmir | Udhampur
Jammu and Kashmir | Kupwara
Jammu and Kashmir | Bandipore
Jammu and Kashmir | Reasi
Jammu and Kashmir | Jammu
Jammu and Kashmir | Poonch
Jammu and Kashmir | Baramulla
Jammu and Kashmir | Samba
Jammu and Kashmir | Kathua
Jammu and Kashmir | Pulwama
Jammu and Kashmir | Budgam
Jammu and Kashmir | Shopian
Jammu and Kashmir | Kishtwar
Jammu and Kashmir | Rajouri
Jammu and Kashmir | Doda
Jharkhand | Giridih
Jharkhand | Seraikela Kharsawan
Jharkhand | Khunti
Jharkhand | Dhanbad
Jharkhand | Palamu
Jharkhand | Godda
Jharkhand | Simdega
Jharkhand | Koderma
Jharkhand | Dumka
Jharkhand | Ramgarh
Jharkhand | Gumla
Jharkhand | Bokaro
Jharkhand | West Singhbhum
Jharkhand | Latehar
Jharkhand | East Singhbhum
Jharkhand | Ranchi
Jharkhand | Hazaribagh
Jharkhand | Chatra
Jharkhand | Lohardaga
Jharkhand | Garhwa
Jharkhand | Sahebganj
Jharkhand | Jamtara
Jharkhand | Deoghar
Jharkhand | Pakur
Karnataka | Gulbarga
Karnataka | Bidar
Karnataka | Vijayapura
Karnataka | Koppal
Karnataka | Dakshina Kannada
Karnataka | Bangalore Urban
Karnataka | Shimoga
Karnataka | Hassan
Karnataka | Chamarajanagar
Karnataka | Yadgir
Karnataka | Mandya
Karnataka | Davanagere
Karnataka | BBMP
Karnataka | Tumkur
Karnataka | Haveri
Karnataka | Chikamagalur
Karnataka | Mysore
Karnataka | Dharwad
Karnataka | Belgaum
Karnataka | Udupi
Karnataka | Kodagu
Karnataka | Chikkaballapur
Karnataka | Bagalkot
Karnataka | Raichur
Karnataka | Gadag
Karnataka | Bellary
Karnataka | Uttar Kannada
Karnataka | Kolar
Karnataka | Chitradurga
Karnataka | Bangalore Rural
Karnataka | Ramanagara
Kerala | Kozhikode
Kerala | Thrissur
Kerala | Kannur
Kerala | Malappuram
Kerala | Wayanad
Kerala | Kasaragod
Kerala | Palakkad
Kerala | Alappuzha
Kerala | Kollam
Kerala | Pathanamthitta
Kerala | Ernakulam
Kerala | Kottayam
Kerala | Thiruvananthapuram
Kerala | Idukki
Ladakh | Kargil
Ladakh | Leh
Lakshadweep | Agatti Island
Lakshadweep | Lakshadweep
Madhya Pradesh | Narsinghpur
Madhya Pradesh | Indore
Madhya Pradesh | Damoh
Madhya Pradesh | Shivpuri
Madhya Pradesh | Ashoknagar
Madhya Pradesh | Ratlam
Madhya Pradesh | Khargone
Madhya Pradesh | Guna
Madhya Pradesh | Umaria
Madhya Pradesh | Bhopal
Madhya Pradesh | Seoni
Madhya Pradesh | Neemuch
Madhya Pradesh | Jabalpur
Madhya Pradesh | Datia
Madhya Pradesh | Sidhi
Madhya Pradesh | Balaghat
Madhya Pradesh | Rewa
Madhya Pradesh | Mandla
Madhya Pradesh | Gwalior
Madhya Pradesh | Vidisha
Madhya Pradesh | Burhanpur
Madhya Pradesh | Shahdol
Madhya Pradesh | Panna
Madhya Pradesh | Agar
Madhya Pradesh | Jhabua
Madhya Pradesh | Dewas
Madhya Pradesh | Singrauli
Madhya Pradesh | Barwani
Madhya Pradesh | Sagar
Madhya Pradesh | Mandsaur
Madhya Pradesh | Harda
Madhya Pradesh | Chhatarpur
Madhya Pradesh | Shajapur
Madhya Pradesh | Raisen
Madhya Pradesh | Alirajpur
Madhya Pradesh | Katni
Madhya Pradesh | Dhar
Madhya Pradesh | Tikamgarh
Madhya Pradesh | Betul
Madhya Pradesh | Satna
Madhya Pradesh | Morena
Madhya Pradesh | Hoshangabad
Madhya Pradesh | Chhindwara
Madhya Pradesh | Sheopur
Madhya Pradesh | Rajgarh
Madhya Pradesh | Anuppur
Madhya Pradesh | Khandwa
Madhya Pradesh | Dindori
Madhya Pradesh | Ujjain
Madhya Pradesh | Bhind
Madhya Pradesh | Sehore
Maharashtra | Hingoli
Maharashtra | Yavatmal
Maharashtra | Amravati
Maharashtra | Raigad
Maharashtra | Mumbai
Maharashtra | Chandrapur
Maharashtra | Solapur
Maharashtra | Osmanabad
Maharashtra | Jalgaon
Maharashtra | Aurangabad 
Maharashtra | Ratnagiri
Maharashtra | Nagpur
Maharashtra | Dhule
Maharashtra | Thane
Maharashtra | Palghar
Maharashtra | Jalna
Maharashtra | Beed
Maharashtra | Sangli
Maharashtra | Nanded
Maharashtra | Gadchiroli
Maharashtra | Wardha
Maharashtra | Ahmednagar
Maharashtra | Parbhani
Maharashtra | Kolhapur
Maharashtra | Bhandara
Maharashtra | Satara
Maharashtra | Nandurbar
Maharashtra | Gondia
Maharashtra | Washim
Maharashtra | Akola
Maharashtra | Pune
Maharashtra | Latur
Maharashtra | Buldhana
Maharashtra | Sindhudurg
Maharashtra | Nashik
Manipur | Tengnoupal
Manipur | Imphal West
Manipur | Noney
Manipur | Bishnupur
Manipur | Thoubal
Manipur | Jiribam
Manipur | Pherzawl
Manipur | Chandel
Manipur | Ukhrul
Manipur | Kakching
Manipur | Senapati
Manipur | Churachandpur
Manipur | Kamjong
Manipur | Tamenglong
Manipur | Imphal East
Manipur | Kangpokpi
Meghalaya | South West Garo Hills
Meghalaya | East Khasi Hills
Meghalaya | South West Khasi Hills
Meghalaya | North Garo Hills
Meghalaya | West Garo Hills
Meghalaya | Ri-Bhoi
Meghalaya | West Jaintia Hills
Meghalaya | East Garo Hills
Meghalaya | South Garo Hills
Meghalaya | West Khasi Hills
Meghalaya | East Jaintia Hills
Mizoram | Lawngtlai
Mizoram | Aizawl East
Mizoram | Lunglei
Mizoram | Aizawl West
Mizoram | Mamit
Mizoram | Champhai
Mizoram | Serchhip
Mizoram | Kolasib
Mizoram | Siaha
Nagaland | Wokha
Nagaland | Dimapur
Nagaland | Mon
Nagaland | Zunheboto
Nagaland | Kiphire
Nagaland | Peren
Nagaland | Kohima
Nagaland | Phek
Nagaland | Longleng
Nagaland | Tuensang
Nagaland | Mokokchung
Odisha | Kendrapara
Odisha | Deogarh
Odisha | Mayurbhanj
Odisha | Jajpur
Odisha | Bargarh
Odisha | Rayagada
Odisha | Kendujhar
Odisha | Dhenkanal
Odisha | Nabarangpur
Odisha | Jharsuguda
Odisha | Bhadrak
Odisha | Sambalpur
Odisha | Khurda
Odisha | Gajapati
Odisha | Angul
Odisha | Nayagarh
Odisha | Kalahandi
Odisha | Boudh
Odisha | Subarnapur
Odisha | Koraput
Odisha | Ganjam
Odisha | Balangir
Odisha | Nuapada
Odisha | Kandhamal
Odisha | Cuttack
Odisha | Sundargarh
Odisha | Malkangiri
Odisha | Jagatsinghpur
Odisha | Balasore
Odisha | Puri
Puducherry | Karaikal
Puducherry | Mahe
Puducherry | Puducherry
Puducherry | Yanam
Punjab | Pathankot
Punjab | Fazilka
Punjab | SBS Nagar
Punjab | Kapurthala
Punjab | Barnala
Punjab | Patiala
Punjab | Ferozpur
Punjab | Sri Muktsar Sahib
Punjab | Ludhiana
Punjab | Bathinda
Punjab | Rup Nagar
Punjab | Gurdaspur
Punjab | Tarn Taran
Punjab | Mansa
Punjab | Faridkot
Punjab | Sangrur
Punjab | Hoshiarpur
Punjab | Moga
Punjab | Fatehgarh Sahib
Punjab | SAS Nagar
Punjab | Jalandhar
Punjab | Amritsar
Rajasthan | Nagaur
Rajasthan | Jaipur I
Rajasthan | Bhilwara
Rajasthan | Sikar
Rajasthan | Jhunjhunu
Rajasthan | Dausa
Rajasthan | Banswara
Rajasthan | Pali
Rajasthan | Jaipur II
Rajasthan | Bikaner
Rajasthan | Sirohi
Rajasthan | Jodhpur
Rajasthan | Dholpur
Rajasthan | Baran
Rajasthan | Pratapgarh
Rajasthan | Jaisalmer
Rajasthan | Bundi
Rajasthan | Sri Ganganagar
Rajasthan | Karauli
Rajasthan | Dungarpur
Rajasthan | Barmer
Rajasthan | Rajsamand
Rajasthan | Jalore
Rajasthan | Chittorgarh
Rajasthan | Tonk
Rajasthan | Ajmer
Rajasthan | Kota
Rajasthan | Hanumangarh
Rajasthan | Bharatpur
Rajasthan | Sawai Madhopur
Rajasthan | Jhalawar
Rajasthan | Churu
Rajasthan | Udaipur
Rajasthan | Alwar
Sikkim | East Sikkim
Sikkim | North Sikkim
Sikkim | South Sikkim
Sikkim | West Sikkim
Tamil Nadu | Nagapattinam
Tamil Nadu | Dindigul
Tamil Nadu | Tiruvarur
Tamil Nadu | Aranthangi
Tamil Nadu | Thanjavur
Tamil Nadu | Perambalur
Tamil Nadu | Karur
Tamil Nadu | Cheyyar
Tamil Nadu | Tirupattur
Tamil Nadu | Salem
Tamil Nadu | Namakkal
Tamil Nadu | Erode
Tamil Nadu | Vellore
Tamil Nadu | Ariyalur
Tamil Nadu | Theni
Tamil Nadu | Poonamallee
Tamil Nadu | Kovilpatti
Tamil Nadu | Coimbatore
Tamil Nadu | Tiruppur
Tamil Nadu | Sivaganga
Tamil Nadu | Nilgiris
Tamil Nadu | Kallakurichi
Tamil Nadu | Viluppuram
Tamil Nadu | Attur
Tamil Nadu | Thoothukudi (Tuticorin)
Tamil Nadu | Pudukkottai
Tamil Nadu | Krishnagiri
Tamil Nadu | Cuddalore
Tamil Nadu | Tiruvallur
Tamil Nadu | Sivakasi
Tamil Nadu | Palani
Tamil Nadu | Kanchipuram
Tamil Nadu | Virudhunagar
Tamil Nadu | Chengalpet
Tamil Nadu | Tiruchirappalli
Tamil Nadu | Ramanathapuram
Tamil Nadu | Madurai
Tamil Nadu | Dharmapuri
Tamil Nadu | Tiruvannamalai
Tamil Nadu | Tenkasi
Tamil Nadu | Paramakudi
Tamil Nadu | Kanyakumari
Tamil Nadu | Chennai
Tamil Nadu | Tirunelveli
Tamil Nadu | Ranipet
Telangana | Jayashankar Bhupalpally
Telangana | Vikarabad
Telangana | Narayanpet
Telangana | Kumuram Bheem
Telangana | Bhadradri Kothagudem
Telangana | Rangareddy
Telangana | Medchal
Telangana | Jogulamba Gadwal
Telangana | Wanaparthy
Telangana | Nirmal
Telangana | Mahabubabad
Telangana | Hyderabad
Telangana | Sangareddy
Telangana | Mulugu
Telangana | Kamareddy
Telangana | Warangal(Rural)
Telangana | Nizamabad
Telangana | Mahabubnagar
Telangana | Jagtial
Telangana | Siddipet
Telangana | Nagarkurnool
Telangana | Karimnagar
Telangana | Warangal(Urban)
Telangana | Peddapalli
Telangana | Mancherial
Telangana | Jangaon
Telangana | Suryapet
Telangana | Nalgonda
Telangana | Khammam
Telangana | Adilabad
Telangana | Yadadri Bhuvanagiri
Telangana | Rajanna Sircilla
Telangana | Medak
Tripura | Sepahijala
Tripura | Dhalai
Tripura | South Tripura
Tripura | Gomati
Tripura | Unakoti
Tripura | Khowai
Tripura | West Tripura
Tripura | North Tripura
Uttar Pradesh | Gautam Buddha Nagar
Uttar Pradesh | Prayagraj
Uttar Pradesh | Bulandshahr
Uttar Pradesh | Mainpuri
Uttar Pradesh | Bahraich
Uttar Pradesh | Kanpur Nagar
Uttar Pradesh | Varanasi
Uttar Pradesh | Aligarh
Uttar Pradesh | Hamirpur
Uttar Pradesh | Sant Kabir Nagar
Uttar Pradesh | Etawah
Uttar Pradesh | Moradabad
Uttar Pradesh | Bareilly
Uttar Pradesh | Lalitpur
Uttar Pradesh | Ayodhya
Uttar Pradesh | Jaunpur
Uttar Pradesh | Sitapur
Uttar Pradesh | Ghaziabad
Uttar Pradesh | Raebareli
Uttar Pradesh | Chandauli
Uttar Pradesh | Mathura
Uttar Pradesh | Balarampur
Uttar Pradesh | Kasganj
Uttar Pradesh | Ambedkar Nagar
Uttar Pradesh | Hapur
Uttar Pradesh | Shahjahanpur
Uttar Pradesh | Farrukhabad
Uttar Pradesh | Muzaffarnagar
Uttar Pradesh | Basti
Uttar Pradesh | Lucknow
Uttar Pradesh | Azamgarh
Uttar Pradesh | Jhansi
Uttar Pradesh | Sonbhadra
Uttar Pradesh | Ghazipur
Uttar Pradesh | Rampur
Uttar Pradesh | Chitrakoot
Uttar Pradesh | Mau
Uttar Pradesh | Ballia
Uttar Pradesh | Kaushambi
Uttar Pradesh | Amethi
Uttar Pradesh | Hardoi
Uttar Pradesh | Shamli
Uttar Pradesh | Fatehpur
Uttar Pradesh | Pilibhit
Uttar Pradesh | Bhadohi
Uttar Pradesh | Maharajganj
Uttar Pradesh | Badaun
Uttar Pradesh | Kannauj
Uttar Pradesh | Sultanpur
Uttar Pradesh | Gonda
Uttar Pradesh | Saharanpur
Uttar Pradesh | Deoria
Uttar Pradesh | Meerut
Uttar Pradesh | Banda
Uttar Pradesh | Kushinagar
Uttar Pradesh | Amroha
Uttar Pradesh | Hathras
Uttar Pradesh | Shravasti
Uttar Pradesh | Firozabad
Uttar Pradesh | Pratapgarh
Uttar Pradesh | Bijnour
Uttar Pradesh | Mahoba
Uttar Pradesh | Baghpat
Uttar Pradesh | Kanpur Dehat
Uttar Pradesh | Unnao
Uttar Pradesh | Agra
Uttar Pradesh | Gorakhpur
Uttar Pradesh | Sambhal
Uttar Pradesh | Etah
Uttar Pradesh | Mirzapur
Uttar Pradesh | Barabanki
Uttar Pradesh | Lakhimpur Kheri
Uttar Pradesh | Auraiya
Uttar Pradesh | Jalaun
Uttar Pradesh | Siddharthnagar
Uttarakhand | Pithoragarh
Uttarakhand | Dehradun
Uttarakhand | Rudraprayag
Uttarakhand | Almora
Uttarakhand | Haridwar
Uttarakhand | Tehri Garhwal
Uttarakhand | Bageshwar
Uttarakhand | Nainital
Uttarakhand | Udham Singh Nagar
Uttarakhand | Chamoli
Uttarakhand | Pauri Garhwal
Uttarakhand | Uttarkashi
Uttarakhand | Champawat
West Bengal | Bishnupur HD (Bankura)
West Bengal | Uttar Dinajpur
West Bengal | Murshidabad
West Bengal | Diamond Harbor HD (S 24 Parganas)
West Bengal | Alipurduar District
West Bengal | Purba Medinipore
West Bengal | Jhargram
West Bengal | Cooch Behar
West Bengal | West Bardhaman
West Bengal | Nadia
West Bengal | East Bardhaman
West Bengal | Bankura
West Bengal | Purulia
West Bengal | Kalimpong
West Bengal | COOCHBEHAR
West Bengal | Nandigram HD (East Medinipore)
West Bengal | Hoogly
West Bengal | Basirhat HD (North 24 Parganas)
West Bengal | Rampurhat HD (Birbhum)
West Bengal | Kolkata
West Bengal | Dakshin Dinajpur
West Bengal | North 24 Parganas
West Bengal | Howrah
West Bengal | Birbhum
West Bengal | South 24 Parganas
West Bengal | Malda
West Bengal | Darjeeling
West Bengal | Paschim Medinipore
West Bengal | Jalpaiguri
