package com.mudzingwa.sec.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mudzingwa.sec.Models.Puchase_History;
import com.mudzingwa.sec.Repository.projection.IPurchaseBook;

public interface Puchase_HistoryRepository extends JpaRepository<Puchase_History, Integer> {
	@Query("select b.tittle as tittle,ph.price as price,ph.datetime as date from left join book b on b.bid=ph.bookid where ph.userid=:userid")
	List<IPurchaseBook>findAllPurchaseOfUser(@Param("userid") String userid);

}
