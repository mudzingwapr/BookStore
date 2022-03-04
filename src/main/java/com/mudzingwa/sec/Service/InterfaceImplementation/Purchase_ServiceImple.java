package com.mudzingwa.sec.Service.InterfaceImplementation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.sec.Models.Puchase_History;
import com.mudzingwa.sec.Repository.Puchase_HistoryRepository;
import com.mudzingwa.sec.Repository.projection.IPurchaseBook;
import com.mudzingwa.sec.Service.Purchase_HistoryServiceInterf;
@Service
public class Purchase_ServiceImple implements Purchase_HistoryServiceInterf {
	@Autowired
	private Puchase_HistoryRepository purchaserepo;

	@Override
	public List<IPurchaseBook> bookPurchase(String userid) {
		
		return purchaserepo.findAllPurchaseOfUser(userid);
	}
	
	@Override
	public Puchase_History savePurchaseHis(Puchase_History ps) {
		ps.setDatetime(LocalDateTime.now());
		return purchaserepo.save(ps);
	}

}
