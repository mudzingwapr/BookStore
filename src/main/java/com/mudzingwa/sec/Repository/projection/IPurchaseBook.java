package com.mudzingwa.sec.Repository.projection;

import java.time.LocalDateTime;

public interface IPurchaseBook {
	String getTittle();
	Double getPrice();
	LocalDateTime getDatetime();

}
