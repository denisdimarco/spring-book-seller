package com.ddm.springbookseller.service;

import com.ddm.springbookseller.model.PurchaseHistory;
import com.ddm.springbookseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<PurchaseItem> findPurchasedItemsOfUser(Long userId);
}
