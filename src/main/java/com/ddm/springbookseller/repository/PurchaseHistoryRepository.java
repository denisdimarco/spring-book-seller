package com.ddm.springbookseller.repository;

import com.ddm.springbookseller.model.PurchaseHistory;
import com.ddm.springbookseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<PurchaseHistory, Long> {

    @Query("select " +
            "b.title as title, ph.price as price, ph.purchaseTime as purchaseTime " +
            "from PurchaseHistory ph left join Book b on b.id = ph.bookId " +
            "where ph.userId = :userId")
List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);

}
