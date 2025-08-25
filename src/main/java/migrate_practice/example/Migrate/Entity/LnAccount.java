package migrate_practice.example.Migrate.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Getter
@Setter
@Table(name = "ln_account", schema = "public")
public class LnAccount {
    @Id
    @Column(name = "auto_id")
    private Long autoId;

    @Column(name = "module_type")
    private String moduleType;

    @Column(name = "ln_acc_no")
    private String lnAccNo;

    @Column(name = "acc_status")
    private String accStatus;

    @Column(name = "contract_code_id")
    private Long contractCodeId;

    @Column(name = "contract_date")
    private LocalDate contractDate;

    @Column(name = "contract_no")
    private String contractNo;

    @Column(name = "branch_accounting_id")
    private Long branchAccountingId;

    @Column(name = "branch_code_id")
    private Long branchCodeId;

    @Column(name = "cus_code_id")
    private Long cusCodeId;

    @Column(name = "cus_name")
    private String cusName;

    @Column(name = "mm_loan_type")
    private String mmLoanType;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "ccy_code_id")
    private Long ccyCodeId;

    @Column(name = "amount_exchange")
    private BigDecimal amountExchange;

    @Column(name = "close_date")
    private LocalDate closeDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "approve_status")
    private String approveStatus;

    @Column(name = "approved_by")
    private String approvedBy;

    @Column(name = "approved_date")
    private LocalDateTime approvedDate;

    @Column(name = "deleted_by")
    private String deletedBy;

    @Column(name = "deleted_date")
    private LocalDateTime deletedDate;

    @Column(name = "care_by_id")
    private UUID careById;

    @Column(name = "challenge_end_date")
    private LocalDate challengeEndDate;

    @Column(name = "challenge_start_date")
    private LocalDate challengeStartDate;

    @Column(name = "channel_code_id")
    private Long channelCodeId;

    @Column(name = "channel_code")
    private String channelCode;

    @Column(name = "debt_group_acc")
    private String debtGroupAcc;

    @Column(name = "debt_group_acc_before")
    private String debtGroupAccBefore;

    @Column(name = "debt_group_acc_date")
    private LocalDate debtGroupAccDate;

    @Column(name = "disbursement_amount")
    private BigDecimal disbursementAmount;

    @Column(name = "disbursement_method")
    private String disbursementMethod;

    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    @Column(name = "expired_date_acc")
    private LocalDate expiredDateAcc;

    @Column(name = "first_disbursement_date")
    private LocalDate firstDisbursementDate;

    @Column(name = "first_payment_date_adjust")
    private LocalDate firstPaymentDateAdjust;

    @Column(name = "first_payment_date_int")
    private LocalDate firstPaymentDateInt;

    @Column(name = "first_payment_date_principle")
    private LocalDate firstPaymentDatePrinciple;

    @Column(name = "grade_int")
    private String gradeInt;

    @Column(name = "grade_int_date")
    private LocalDate gradeIntDate;

    @Column(name = "grade_int_term")
    private Long gradeIntTerm;

    @Column(name = "grade_int_term_code_id")
    private Long gradeIntTermCodeId;

    @Column(name = "grade_int_term_unit")
    private String gradeIntTermUnit;

    @Column(name = "grade_int_type")
    private String gradeIntType;

    @Column(name = "grade_principle")
    private String gradePrinciple;

    @Column(name = "grade_principle_date")
    private LocalDate gradePrincipleDate;

    @Column(name = "grade_principle_term")
    private Long gradePrincipleTerm;

    @Column(name = "grade_principle_term_code_id")
    private Long gradePrincipleTermCodeId;

    @Column(name = "grade_principle_term_unit")
    private String gradePrincipleTermUnit;

    @Column(name = "grade_principle_type")
    private String gradePrincipleType;

    @Column(name = "guarantee_acc_no")
    private String guaranteeAccNo;

    @Column(name = "industry_code_id")
    private Long industryCodeId;

    @Column(name = "int_accumulate")
    private BigDecimal intAccumulate;

    @Column(name = "int_accumulate_supporter")
    private BigDecimal intAccumulateSupporter;

    @Column(name = "int_hold")
    private BigDecimal intHold;

    @Column(name = "int_hold_allocate")
    private BigDecimal intHoldAllocate;

    @Column(name = "int_paid_sell")
    private BigDecimal intPaidSell;

    @Column(name = "int_pastdue_i_unpaid")
    private BigDecimal intPastdueIUnpaid;

    @Column(name = "int_pastdue_p_unpaid")
    private BigDecimal intPastduePUnpaid;

    @Column(name = "int_prepaid")
    private BigDecimal intPrepaid;

    @Column(name = "int_support_status")
    private String intSupportStatus;

    @Column(name = "int_unpaid")
    private BigDecimal intUnpaid;

    @Column(name = "int_unpaid_i")
    private BigDecimal intUnpaidI;

    @Column(name = "int_unpaid_p")
    private BigDecimal intUnpaidP;

    @Column(name = "int_unpaid_supporter")
    private BigDecimal intUnpaidSupporter;

    @Column(name = "interest_pastdue_fix_per")
    private BigDecimal interestPastdueFixPer;

    @Column(name = "interest_pastdue_fix_per_princ")
    private BigDecimal interestPastdueFixPerPrinc;

    @Column(name = "interest_pastdue_fix_value")
    private BigDecimal interestPastdueFixValue;

    @Column(name = "interest_pastdue_percent_int")
    private BigDecimal interestPastduePercentInt;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "is_support")
    private String isSupport;

    @Column(name = "last_tran_date")
    private LocalDate lastTranDate;

    @Column(name = "lc_no")
    private String lcNo;

    @Column(name = "limit_parent_contract")
    private BigDecimal limitParentContract;

    @Column(name = "ln_acc_type")
    private String lnAccType;

    @Column(name = "ln_product_code_id")
    private Long lnProductCodeId;

    @Column(name = "ln_product_type")
    private String lnProductType;

    @Column(name = "ln_ref_acc_id")
    private Long lnRefAccId;

    @Column(name = "loan_account_type")
    private String loanAccountType;

    @Column(name = "loan_capital")
    private String loanCapital;

    @Column(name = "loan_source")
    private String loanSource;

    @Column(name = "number_past_due")
    private Long numberPastDue;

    @Column(name = "open_date")
    private LocalDate openDate;

    @Column(name = "payment_freq_code_int_id")
    private Long paymentFreqCodeIntId;

    @Column(name = "payment_freq_code_principle_id")
    private Long paymentFreqCodePrincipleId;

    @Column(name = "payment_freq_term_int")
    private Long paymentFreqTermInt;

    @Column(name = "payment_freq_term_principle")
    private Long paymentFreqTermPrinciple;

    @Column(name = "payment_freq_term_unit_int")
    private String paymentFreqTermUnitInt;

    @Column(name = "payment_freq_term_unit_prc")
    private String paymentFreqTermUnitPrc;

    @Column(name = "payment_method_int")
    private String paymentMethodInt;

    @Column(name = "payment_method_principle")
    private String paymentMethodPrinciple;

    @Column(name = "period_payment_date_int")
    private Long periodPaymentDateInt;

    @Column(name = "period_payment_date_principle")
    private Long periodPaymentDatePrinciple;

    @Column(name = "principle_balance")
    private BigDecimal principleBalance;

    @Column(name = "principle_balance_overdue")
    private BigDecimal principleBalanceOverdue;

    @Column(name = "principle_inschedule")
    private BigDecimal principleInschedule;

    @Column(name = "principle_paid_sell")
    private BigDecimal principlePaidSell;

    @Column(name = "principle_unpaid")
    private BigDecimal principleUnpaid;

    @Column(name = "purpose_code_id")
    private Long purposeCodeId;

    @Column(name = "rate_code_id")
    private Long rateCodeId;

    @Column(name = "term")
    private Long term;

    @Column(name = "term_unit")
    private String termUnit;

    @Column(name = "total_adjust_calendar_n")
    private BigDecimal totalAdjustCalendarN;

    @Column(name = "total_adjust_calendar_y")
    private BigDecimal totalAdjustCalendarY;

    @Column(name = "total_extend_calendar_n")
    private BigDecimal totalExtendCalendarN;

    @Column(name = "total_extend_calendar_y")
    private BigDecimal totalExtendCalendarY;

    @Column(name = "total_int_paid")
    private BigDecimal totalIntPaid;

    @Column(name = "total_int_supporter_paid")
    private BigDecimal totalIntSupporterPaid;

    @Column(name = "total_principle_paid")
    private BigDecimal totalPrinciplePaid;

    @Column(name = "total_reduct_interest")
    private BigDecimal totalReductInterest;

    @Column(name = "fund_rate")
    private BigDecimal fundRate;

    @Column(name = "rel_manager_id")
    private UUID relManagerId;

    @Column(name = "round_int_accumulate")
    private BigDecimal roundIntAccumulate;

    @Column(name = "int_past_due_unpaid")
    private BigDecimal intPastDueUnpaid;

    @Column(name = "ln_limit_contract_id")
    private Long lnLimitContractId;

    @Column(name = "target_loan_audience")
    private String targetLoanAudience;

    @Column(name = "promotion_program")
    private Long promotionProgram;

    @Column(name = "lo_ref_d")
    private String loRefD;

    @Column(name = "loan_maturity_date")
    private LocalDate loanMaturityDate;

    @Column(name = "apply_promotion_program")
    private String applyPromotionProgram;

    @Column(name = "exception_promotion_program")
    private String exceptionPromotionProgram;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "interest_type")
    private String interestType;

    @Column(name = "debt_contract")
    private String debtContract;

    @Column(name = "trans_date")
    private LocalDate transDate;

    @Column(name = "decision_number")
    private String decisionNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "is_payment_exception")
    private String isPaymentException;

    @Column(name = "rate_disbusment")
    private BigDecimal rateDisbusment;

    @Column(name = "auto_payment")
    private String autoPayment;

    @Column(name = "is_confirm_loan_contract")
    private String isConfirmLoanContract;

    @Column(name = "number_past_due_i")
    private Integer numberPastDueI;

    @Column(name = "specific_principle_balance")
    private BigDecimal specificPrincipleBalance;

    @Column(name = "general_principle_balance")
    private BigDecimal generalPrincipleBalance;

    @Column(name = "dd_no")
    private Integer ddNo;

    @Column(name = "ln_transaction_id")
    private Long lnTransactionId;

    @Column(name = "used_specific_provision")
    private BigDecimal usedSpecificProvision;

    @Column(name = "used_general_provision")
    private BigDecimal usedGeneralProvision;

    @Column(name = "block_min_max_rate")
    private String blockMinMaxRate;

    @Column(name = "total_assign_col_available_amount")
    private BigDecimal totalAssignColAvailableAmount;

    @Column(name = "ln_ref_d")
    private String lnRefD;

    @Column(name = "number_past_due_wt_challenge_time")
    private Integer numberPastDueWtChallengeTime;

    @Column(name = "debt_group_acc_wt_challenge_time")
    private String debtGroupAccWtChallengeTime;

    // Getters and setters omitted for brevity
}