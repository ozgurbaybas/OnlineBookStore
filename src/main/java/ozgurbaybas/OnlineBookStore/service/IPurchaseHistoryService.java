package ozgurbaybas.OnlineBookStore.service;

import ozgurbaybas.OnlineBookStore.model.PurchaseHistory;
import ozgurbaybas.OnlineBookStore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemOfUser(Long userId);
}
