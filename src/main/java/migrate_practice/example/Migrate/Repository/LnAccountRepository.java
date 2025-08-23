package migrate_practice.example.Migrate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import migrate_practice.example.Migrate.Entity.LnAccount;

@Repository
public interface LnAccountRepository extends JpaRepository<LnAccount, Long> {

}
