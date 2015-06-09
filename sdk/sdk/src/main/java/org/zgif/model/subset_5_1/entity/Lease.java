package org.zgif.model.subset_5_1.entity;

import java.util.Currency;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.DepositIncreaseType;
import org.zgif.model.datatype.enumeration.DepositType;
import org.zgif.model.datatype.enumeration.DunningLevel;
import org.zgif.model.datatype.enumeration.LeaseContractType;
import org.zgif.model.datatype.enumeration.NumberType;
import org.zgif.model.datatype.enumeration.Sector;
import org.zgif.model.node.entity.AbstractLease;

public class Lease extends AbstractLease {
	@DataField(wikiPageName = "Akzeptierter Kündigungstermin")
	private LocalDate acceptedTerminationtDate;

	@DataField(wikiPageName = "Ausgebuchte_Forderungen")
	private Amount badDebt;
	@DataField(wikiPageName = "Beginn_der_Mieteinzahlung")
	private LocalDate beginRentPayment;
	@DataField(wikiPageName = "Sonderkündigungsrecht")
	private LocalDate breakOption;

	@DataField(wikiPageName = "Sammelvertrag")
	private String collectiveObjectIdSender;
	@DataField(wikiPageName = "Vertragsabschlussdatum")
	private LocalDate contractCompletionDate;
	@DataField(wikiPageName = "Vertragsverlängerung um")
	private Period contractExtensionDuration;
	@DataField(wikiPageName = "Währung")
	private Currency currency;

	@DataField(wikiPageName = "Debitor")
	private String debitor;
	@DataField(wikiPageName = "Debitorennummer")
	private String debitorId;
	@DataField(wikiPageName = "Kaution")
	private Boolean depositAgreed;
	@DataField(wikiPageName = "Kautionsbetrag")
	private Amount depositAmount;
	@DataField(wikiPageName = "Anpassungsart_Kaution")
	private DepositIncreaseType depositIncreaseType;
	@DataField(wikiPageName = "Kautionsstatus")
	private Boolean depositPayed;
	@DataField(wikiPageName = "Kautionsart")
	private DepositType depositType;
	@DataField(wikiPageName = "Vertragsende nach Option")
	private LocalDate dmiendOption;
	@DataField(wikiPageName = "Mahnkennzeichen")
	private Boolean dunningIndicator;
	@DataField(wikiPageName = "Mahnstufe")
	private DunningLevel dunningLevel;

	@DataField(wikiPageName = "Mietvertragsbeginn")
	private LocalDate leaseBeginDate;
	@DataField(wikiPageName = "Double-/Triple-Net_Mietvertrag")
	private LeaseContractType leaseContractType;
	@DataField(wikiPageName = "Mietvertragsende")
	private LocalDate leaseEndDate;

	@DataField(wikiPageName = "Mindestmietdauer")
	private Period minRentalTime;

	@DataField(wikiPageName = "Nationalität")
	private String nation;

	@DataField(wikiPageName = "Saldo_Mieterkonto")
	private Amount openItems;
	@DataField(wikiPageName = "Betriebskostenvorauszahlung")
	private Amount operatingCostPrepayment;
	@DataField(wikiPageName = "Abgerechnete_Betriebskosten")
	private Amount operatingCostsSettled;
	@DataField(wikiPageName = "Optierung")
	private Boolean option;

	@DataField(wikiPageName = "Betrag_Mieteinzahlung")
	private Amount payment;
	@DataField(wikiPageName = "Zahlungsrhythmus")
	private Period paymentPattern;
	@DataField(wikiPageName = "Notification_(Umsatzmiete)")
	private Period periodsTurnoverRents;
	@DataField(wikiPageName = "Property_Manager")
	private String propertyManager;

	@DataField(wikiPageName = "Branche")
	private Sector sector;

	@DataField(wikiPageName = "Kündigungsfrist")
	private Period terminationDuration;
	@DataField(wikiPageName = "Datum des Kündigungseingangs")
	private LocalDate terminationReceiptDate;

	@DataField(wikiPageName = "Turnover_Type_(Umsatzmiete)")
	private NumberType turnoverAdjType;
	@DataField(wikiPageName = "Umsatztestat erforderlich")
	private Boolean turnoverCertificate;
	@DataField(wikiPageName = "Umsatzminimum")
	private Amount turnoverMinimum;
	@DataField(wikiPageName = "Umsatzmietkappung")
	private Amount turnoverRentCap;
	@DataField(wikiPageName = "Umsatzoffenlegungsintervall")
	private Period turnoverReportingInterval;
	@DataField(wikiPageName = "Umsatzmietrelevantes Warensortiment")
	private String turnoverSortiment;

	private List<Unit> listOfUnit;

	public LocalDate getAcceptedTerminationtDate() {
		return acceptedTerminationtDate;
	}

	public void setAcceptedTerminationtDate(LocalDate acceptedTerminationtDate) {
		this.acceptedTerminationtDate = acceptedTerminationtDate;
	}

	public Amount getBadDebt() {
		return badDebt;
	}

	public void setBadDebt(Amount badDebt) {
		this.badDebt = badDebt;
	}

	public LocalDate getBeginRentPayment() {
		return beginRentPayment;
	}

	public void setBeginRentPayment(LocalDate beginRentPayment) {
		this.beginRentPayment = beginRentPayment;
	}

	public LocalDate getBreakOption() {
		return breakOption;
	}

	public void setBreakOption(LocalDate breakOption) {
		this.breakOption = breakOption;
	}

	public String getCollectiveObjectIdSender() {
		return collectiveObjectIdSender;
	}

	public void setCollectiveObjectIdSender(String collectiveObjectIdSender) {
		this.collectiveObjectIdSender = collectiveObjectIdSender;
	}

	public LocalDate getContractCompletionDate() {
		return contractCompletionDate;
	}

	public void setContractCompletionDate(LocalDate contractCompletionDate) {
		this.contractCompletionDate = contractCompletionDate;
	}

	public Period getContractExtensionDuration() {
		return contractExtensionDuration;
	}

	public void setContractExtensionDuration(Period contractExtensionDuration) {
		this.contractExtensionDuration = contractExtensionDuration;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getDebitor() {
		return debitor;
	}

	public void setDebitor(String debitor) {
		this.debitor = debitor;
	}

	public String getDebitorId() {
		return debitorId;
	}

	public void setDebitorId(String debitorId) {
		this.debitorId = debitorId;
	}

	public Boolean getDepositAgreed() {
		return depositAgreed;
	}

	public void setDepositAgreed(Boolean depositAgreed) {
		this.depositAgreed = depositAgreed;
	}

	public Amount getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Amount depositAmount) {
		this.depositAmount = depositAmount;
	}

	public DepositIncreaseType getDepositIncreaseType() {
		return depositIncreaseType;
	}

	public void setDepositIncreaseType(DepositIncreaseType depositIncreaseType) {
		this.depositIncreaseType = depositIncreaseType;
	}

	public Boolean getDepositPayed() {
		return depositPayed;
	}

	public void setDepositPayed(Boolean depositPayed) {
		this.depositPayed = depositPayed;
	}

	public DepositType getDepositType() {
		return depositType;
	}

	public void setDepositType(DepositType depositType) {
		this.depositType = depositType;
	}

	public LocalDate getDmiendOption() {
		return dmiendOption;
	}

	public void setDmiendOption(LocalDate dmiendOption) {
		this.dmiendOption = dmiendOption;
	}

	public Boolean getDunningIndicator() {
		return dunningIndicator;
	}

	public void setDunningIndicator(Boolean dunningIndicator) {
		this.dunningIndicator = dunningIndicator;
	}

	public DunningLevel getDunningLevel() {
		return dunningLevel;
	}

	public void setDunningLevel(DunningLevel dunningLevel) {
		this.dunningLevel = dunningLevel;
	}

	public LocalDate getLeaseBeginDate() {
		return leaseBeginDate;
	}

	public void setLeaseBeginDate(LocalDate leaseBeginDate) {
		this.leaseBeginDate = leaseBeginDate;
	}

	public LeaseContractType getLeaseContractType() {
		return leaseContractType;
	}

	public void setLeaseContractType(LeaseContractType leaseContractType) {
		this.leaseContractType = leaseContractType;
	}

	public LocalDate getLeaseEndDate() {
		return leaseEndDate;
	}

	public void setLeaseEndDate(LocalDate leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public Period getMinRentalTime() {
		return minRentalTime;
	}

	public void setMinRentalTime(Period minRentalTime) {
		this.minRentalTime = minRentalTime;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Amount getOpenItems() {
		return openItems;
	}

	public void setOpenItems(Amount openItems) {
		this.openItems = openItems;
	}

	public Amount getOperatingCostPrepayment() {
		return operatingCostPrepayment;
	}

	public void setOperatingCostPrepayment(Amount operatingCostPrepayment) {
		this.operatingCostPrepayment = operatingCostPrepayment;
	}

	public Amount getOperatingCostsSettled() {
		return operatingCostsSettled;
	}

	public void setOperatingCostsSettled(Amount operatingCostsSettled) {
		this.operatingCostsSettled = operatingCostsSettled;
	}

	public Boolean getOption() {
		return option;
	}

	public void setOption(Boolean option) {
		this.option = option;
	}

	public Amount getPayment() {
		return payment;
	}

	public void setPayment(Amount payment) {
		this.payment = payment;
	}

	public Period getPaymentPattern() {
		return paymentPattern;
	}

	public void setPaymentPattern(Period paymentPattern) {
		this.paymentPattern = paymentPattern;
	}

	public Period getPeriodsTurnoverRents() {
		return periodsTurnoverRents;
	}

	public void setPeriodsTurnoverRents(Period periodsTurnoverRents) {
		this.periodsTurnoverRents = periodsTurnoverRents;
	}

	public String getPropertyManager() {
		return propertyManager;
	}

	public void setPropertyManager(String propertyManager) {
		this.propertyManager = propertyManager;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Period getTerminationDuration() {
		return terminationDuration;
	}

	public void setTerminationDuration(Period terminationDuration) {
		this.terminationDuration = terminationDuration;
	}

	public LocalDate getTerminationReceiptDate() {
		return terminationReceiptDate;
	}

	public void setTerminationReceiptDate(LocalDate terminationReceiptDate) {
		this.terminationReceiptDate = terminationReceiptDate;
	}

	public NumberType getTurnoverAdjType() {
		return turnoverAdjType;
	}

	public void setTurnoverAdjType(NumberType turnoverAdjType) {
		this.turnoverAdjType = turnoverAdjType;
	}

	public Boolean getTurnoverCertificate() {
		return turnoverCertificate;
	}

	public void setTurnoverCertificate(Boolean turnoverCertificate) {
		this.turnoverCertificate = turnoverCertificate;
	}

	public Amount getTurnoverMinimum() {
		return turnoverMinimum;
	}

	public void setTurnoverMinimum(Amount turnoverMinimum) {
		this.turnoverMinimum = turnoverMinimum;
	}

	public Amount getTurnoverRentCap() {
		return turnoverRentCap;
	}

	public void setTurnoverRentCap(Amount turnoverRentCap) {
		this.turnoverRentCap = turnoverRentCap;
	}

	public Period getTurnoverReportingInterval() {
		return turnoverReportingInterval;
	}

	public void setTurnoverReportingInterval(Period turnoverReportingInterval) {
		this.turnoverReportingInterval = turnoverReportingInterval;
	}

	public String getTurnoverSortiment() {
		return turnoverSortiment;
	}

	public void setTurnoverSortiment(String turnoverSortiment) {
		this.turnoverSortiment = turnoverSortiment;
	}

	public List<Unit> getListOfUnit() {
		return listOfUnit;
	}

	public void setListOfUnit(List<Unit> listOfUnit) {
		this.listOfUnit = listOfUnit;
	}
}
