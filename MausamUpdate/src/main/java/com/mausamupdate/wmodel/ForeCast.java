package com.mausamupdate.wmodel;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForeCast {
	
	@JsonProperty("items")
	private Items[] itemArr;
	
	private String forecastDate;
	
	private String nextUpdate;
	
	private String source;
	
	private String point;
	
	private String fingerprint;
	

}

//"forecastDate": "2024-04-06T12:20:48Z",
//"nextUpdate": "2024-04-06T17:30:00Z",
//"source": "w3Data",
//"point": "global",
//"fingerprint": "Uv+BAwEBC0ZpbmdlcnByaW50Af+CAAEFAQdWZXJzaW9uAQwAAQtSZXF1ZXN0VGltZQH/hAABA0xuZwEIAAEDTGF0AQgAAQZNb2RlbHMB/4gAAAAQ/4MFAQEEVGltZQH/hAAAADb/hwIBASdbXXN0cnVjdCB7IE5hbWUgc3RyaW5nOyBSdW4gdGltZS5UaW1lIH0B/4gAAf+GAAAe/4UDAQL/hgABAgEETmFtZQEMAAEDUnVuAf+EAAAA/gF1/4IBCWRldi0yLjAuMQEPAQAAAA7doz3ECIotKgAAAfjG3LWEfDhSQAH4GCZTBaMSM0ABCwEOZXhwb3NlZF9tb3NtaXgBDwEAAAAO3aKxsAAAAAAAAAABDmV4cG9zZWRfbW9zbWl4AQ8BAAAADt2iCPAAAAAAAAAAAQdpY29uX2V1AQ8BAAAADt2ih4AAAAAAAAAAAQdpY29uX2V1AQ8BAAAADt2h3sAAAAAAAAAAAQtuYW1fY29udXNfNQEPAQAAAA7dooeAAAAAAAAAAAELbmFtX2NvbnVzXzUBDwEAAAAO3aHewAAAAAAAAAABBm1vc21peAEPAQAAAA7dorGwAAAAAAAAAAEGbW9zbWl4AQ8BAAAADt2iCPAAAAAAAAAAAQlnZnNfc2ZsdXgBDwEAAAAO3aKHgAAAAAAAAAABCWdmc19zZmx1eAEPAQAAAA7dod7AAAAAAAAAAAEGYXdlX2RlAQ8BAAAADt2ilZAAAAAAAAAAAA=="