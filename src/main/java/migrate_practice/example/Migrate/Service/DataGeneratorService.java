package migrate_practice.example.Migrate.Service;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import migrate_practice.example.Migrate.Configuration.DataProcessTrans;
import migrate_practice.example.Migrate.Entity.LnAccount;
import migrate_practice.example.Migrate.Repository.LnAccountRepository;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class DataGeneratorService {
    private final DataProcessTrans processTrans;
    private final LnAccountRepository repository;

    public void insertFakeData() {

            Faker faker = new Faker();
            Random random = new Random();
            if (repository.count() == 0) {
                List<LnAccount> batch = new ArrayList<>();
                for (long i = 1; i <= 10_000_000; i++) { // Để demo, thử với 1000 trước
                    batch.add(buildLnAccount(i,random,faker));
                    if (i % 1000 == 0) {
                        processTrans.processSaveAccounts(batch);
                        batch.clear();
                        System.out.println("Inserted: " + i);
                    }
                }
            } else {
                System.out.println("Data already exists. Skipping generation.");
            }
    }


    private LnAccount buildLnAccount(long i, Random random, Faker faker){
        LnAccount account = new LnAccount();

        account.setAutoId(i);
        account.setModuleType("LN");
        account.setLnAccNo("LN_" + faker.number().digits(10) + "_" + i);
        account.setAccStatus(random.nextBoolean() ? "A" : "N");
        account.setContractCodeId((long) random.nextInt(1_000_000));
        account.setContractDate(faker.date().birthday().toInstant()
                .atZone(java.time.ZoneId.systemDefault()).toLocalDate());
        account.setContractNo(faker.number().digits(8));
        account.setBranchAccountingId((long) random.nextInt(500));
        account.setBranchCodeId((long) random.nextInt(500));
        account.setCusCodeId((long) random.nextInt(1000));
        account.setCusName(faker.name().fullName());
        account.setMmLoanType(faker.letterify("??"));
        account.setAmount(BigDecimal.valueOf(random.nextDouble() * 1_000_000_000));
        account.setCcyCodeId((long) random.nextInt(900));
        account.setAmountExchange(BigDecimal.valueOf(random.nextDouble() * 1_000_000_000));
        account.setCloseDate(LocalDate.now().plusDays(random.nextInt(1000)));
        account.setCreatedBy("SYSTEM");
        account.setCreatedDate(LocalDateTime.now().minusDays(random.nextInt(1000)));
        account.setModifiedBy("SYSTEM");
        account.setModifiedDate(LocalDateTime.now());
        account.setApproveStatus(random.nextBoolean() ? "Y" : "N");
        account.setApprovedBy(faker.name().username());
        account.setApprovedDate(LocalDateTime.now().minusDays(random.nextInt(500)));
        account.setCareById(UUID.randomUUID());
        account.setChallengeEndDate(LocalDate.now().plusDays(random.nextInt(200)));
        account.setChallengeStartDate(LocalDate.now().minusDays(random.nextInt(200)));
        account.setChannelCodeId((long) random.nextInt(50));
        account.setChannelCode(faker.letterify("CHN??"));
        account.setDebtGroupAcc(faker.letterify("G??"));
        account.setDebtGroupAccBefore(faker.letterify("G??"));
        account.setDebtGroupAccDate(LocalDate.now().minusDays(random.nextInt(100)));
        account.setDisbursementAmount(BigDecimal.valueOf(random.nextDouble() * 1_000_000));
        account.setExchangeRate(BigDecimal.valueOf(1 + random.nextDouble() * 10));
        account.setExpiredDateAcc(LocalDate.now().plusYears(random.nextInt(5)));
        account.setFirstDisbursementDate(LocalDate.now().minusDays(random.nextInt(500)));
        account.setFirstPaymentDateInt(LocalDate.now().plusMonths(random.nextInt(12)));
        account.setGradeInt("A" + random.nextInt(10));
        account.setGradeIntDate(LocalDate.now().minusMonths(random.nextInt(24)));
        account.setGradeIntTerm((long) random.nextInt(12));
        account.setGradeIntTermCodeId((long) random.nextInt(50));
        account.setGradeIntTermUnit("M");
        account.setGradePrinciple("B" + random.nextInt(5));
        account.setGradePrincipleDate(LocalDate.now().minusMonths(random.nextInt(24)));
        account.setGradePrincipleTerm((long) random.nextInt(12));
        account.setGradePrincipleTermCodeId((long) random.nextInt(50));
        account.setGradePrincipleTermUnit("M");
        account.setGradePrincipleType("NORMAL");
        account.setGuaranteeAccNo("ACC" + faker.number().digits(6));
        account.setIndustryCodeId((long) random.nextInt(200));
        account.setIntAccumulate(BigDecimal.valueOf(random.nextDouble() * 1_000_000));
        account.setInterestRate(BigDecimal.valueOf(random.nextDouble() * 20));
        account.setLastTranDate(LocalDate.now().minusDays(random.nextInt(100)));
        account.setLcNo("LC" + faker.number().digits(6));
        account.setLnAccType("C");
        account.setLnProductCodeId((long) random.nextInt(500));
        account.setLnProductType("E");
        account.setLoanAccountType("NORMAL");
        account.setLoanCapital("CAP" + faker.number().digits(3));
        account.setLoanSource("SRC" + faker.number().digits(3));
        account.setNumberPastDue((long) random.nextInt(10));
        account.setOpenDate(LocalDate.now().minusDays(random.nextInt(1000)));
        account.setPaymentMethodInt("P");
        account.setPaymentMethodPrinciple("P");
        account.setPrincipleBalance(BigDecimal.valueOf(random.nextDouble() * 1_000_000));
        account.setPrincipleUnpaid(BigDecimal.valueOf(random.nextDouble() * 1_000_000));
        account.setPurposeCodeId((long) random.nextInt(50));
        account.setRateCodeId((long) random.nextInt(50));
        account.setTerm((long) random.nextInt(60));
        account.setTermUnit("M");
        account.setFundRate(BigDecimal.valueOf(random.nextDouble() * 15));
        account.setRelManagerId(UUID.randomUUID());
        account.setLoanMaturityDate(LocalDate.now().plusYears(random.nextInt(5)));
        account.setCustomerCode("CUST" + faker.number().digits(6));
        account.setCustomerName(faker.name().fullName());
        account.setInterestType("FIX");
        account.setTransDate(LocalDate.now().minusDays(random.nextInt(500)));
        account.setDescription(faker.lorem().sentence());
        account.setIsPaymentException(random.nextBoolean() ? "Y" : "N");
        account.setAutoPayment(random.nextBoolean() ? "Y" : "N");
        account.setIsConfirmLoanContract(random.nextBoolean() ? "Y" : "N");
        account.setDdNo(random.nextInt(999999));
        return account;
    }
}
