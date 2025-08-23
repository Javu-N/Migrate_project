package migrate_practice.example.Migrate.Service;

import migrate_practice.example.Migrate.Entity.LnAccount;
import migrate_practice.example.Migrate.Repository.LnAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LnAccountService {
    private final LnAccountRepository lnAccountRepository;

    public LnAccountService(LnAccountRepository lnAccountRepository) {
        this.lnAccountRepository = lnAccountRepository;
    }

    public List<LnAccount> getAllAccounts() {
        return lnAccountRepository.findAll();
    }
}
