package ozgurbaybas.OnlineBookStore.service;

import org.springframework.stereotype.Service;
import ozgurbaybas.OnlineBookStore.model.PurchaseHistory;
import ozgurbaybas.OnlineBookStore.repository.IPurchaseHistoryRepository;
import ozgurbaybas.OnlineBookStore.repository.projection.IPurchaseItem;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{

    private final IPurchaseHistoryRepository purchaseHistoryRepository;


    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){

        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemOfUser(Long userId){

        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);

    }



}
