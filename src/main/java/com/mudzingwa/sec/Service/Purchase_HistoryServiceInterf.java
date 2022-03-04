package com.mudzingwa.sec.Service;

import java.util.List;

import com.mudzingwa.sec.Models.Puchase_History;
import com.mudzingwa.sec.Repository.projection.IPurchaseBook;

public interface Purchase_HistoryServiceInterf {
	public List<IPurchaseBook> bookPurchase(String userid);

	Puchase_History savePurchaseHis(Puchase_History ps);
	

}
