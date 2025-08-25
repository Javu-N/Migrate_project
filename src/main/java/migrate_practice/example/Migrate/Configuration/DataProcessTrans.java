package migrate_practice.example.Migrate.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import migrate_practice.example.Migrate.Entity.LnAccount;
import migrate_practice.example.Migrate.Repository.LnAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataProcessTrans {
    private final LnAccountRepository repository;

    private final EntityManager entityManager;
    @Transactional
    public void processSaveAccounts(List<LnAccount> accounts){
        repository.saveAllAndFlush(accounts);
        entityManager.clear();
    }
}
