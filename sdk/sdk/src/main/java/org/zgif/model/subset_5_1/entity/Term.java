package org.zgif.model.subset_5_1.entity;

import java.util.Currency;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.Country;
import org.zgif.model.datatype.enumeration.ContractOption;
import org.zgif.model.datatype.enumeration.DepositIncreaseType;
import org.zgif.model.datatype.enumeration.DepositType;
import org.zgif.model.datatype.enumeration.IndexAdjustmentDirection;
import org.zgif.model.datatype.enumeration.IndexRow;
import org.zgif.model.datatype.enumeration.IndexationMethod;
import org.zgif.model.datatype.enumeration.NumberType;
import org.zgif.model.datatype.enumeration.OptRate;
import org.zgif.model.datatype.enumeration.RentIncreaseType;
import org.zgif.model.datatype.enumeration.UseType;
import org.zgif.model.node.entity.AbstractTerm;

public class Term extends AbstractTerm {
	@DataField(wikiPageName="Basisindexwert")
	private Double baseIndex;
	@DataField(wikiPageName="Beginn Mietkonzession")
	private LocalDate beginningRentConcession;
	@DataField(wikiPageName="Sonderkündigungsrecht")
	private LocalDate breakOption;

	@DataField(wikiPageName="Konditionsbetrag")
	private Amount conditionAmount;
	@DataField(wikiPageName="Konditionstyp")
	private String conditionType;
	@DataField(wikiPageName="Vertragsabschlussdatum")
	private LocalDate contractCompletionDate;
	@DataField(wikiPageName="Vertragsoptionen")
	private ContractOption contractOption;
	@DataField(wikiPageName="Währung")
	private Currency currency;

	@DataField(wikiPageName="Absolutbetrag Staffelmieterhöhung")
	private Amount deltaGraduatedRent;
	@DataField(wikiPageName="Kaution")
	private Boolean depositAgreed;
	@DataField(wikiPageName="Kautionsbetrag")
	private Amount depositAmount;
	@DataField(wikiPageName="Anpassungsart_Kaution")
	private DepositIncreaseType depositIncreaseType;
	@DataField(wikiPageName="Kautionsstatus")
	private Boolean depositPayed;
	@DataField(wikiPageName="Kautionsart")
	private DepositType depositType;
	@DataField(wikiPageName="Vertragsende_nach_Option")
	private LocalDate dmiendOption;

	@DataField(wikiPageName="Enddatum Mietkonzession")
	private LocalDate endRentConcession;

	@DataField(wikiPageName="Beginn_der_Staffelmietanpassung")
	private LocalDate graduateRentBegin;

	@DataField(wikiPageName="Erlösschmälerung")
	private Amount incomeLoss;
	@DataField(wikiPageName="Beginn_der_Indexmietanpassung")
	private LocalDate indexAdjustmentBegin;
	@DataField(wikiPageName="Indexmiet-Senkungs-Sperrklausel")
	private IndexAdjustmentDirection indexAdjustmentDirection;
	@DataField(wikiPageName="Methode_der_Mindeständerung_(Punkte_oder_Prozent)")
	private NumberType indexAdjustmentValueType;
	@DataField(wikiPageName="Basisjahr_der_gewählten_Indexreihe")
	private LocalDate indexBaseYear;
	@DataField(wikiPageName="Land_der_Indexreihe")
	private Country indexCountry;
	@DataField(wikiPageName="Mindeständerung_in_Prozent")
	private Double indexMinimumAdjustmentInPercent;
	@DataField(wikiPageName="Mindeständerung_in_Punkten")
	private Double indexMinimumAdjustmentInPoints;
	@DataField(wikiPageName="Indexanpassungsmethode")
	private IndexationMethod indexModificationMethod;
	@DataField(wikiPageName="Weitergabeprozentsatz")
	private Double indexPassthrough;
	@DataField(wikiPageName="Indexreihe")
	private IndexRow indexRow;

	@DataField(wikiPageName="Datum_der_letzten_Mietanpassung")
	private LocalDate lastRentAdjustmentDate;
	@DataField(wikiPageName="Vertragsfläche")
	private Area leasedArea;

	@DataField(wikiPageName="Optierungssatz")
	private OptRate optRate;

	@DataField(wikiPageName="Betrag Mieteinzahlung")
	private Amount payment;

	@DataField(wikiPageName="Anpassungsverzögerung bei Mietanpassungen")
	private Period rentAdjustmentDelay;
	@DataField(wikiPageName="Datum der nächsten Mietanpassung")
	private LocalDate rentAdjustmentDate;
	@DataField(wikiPageName="Mietanpassungsfrequenz")
	private org.joda.time.Period rentAdjustmentFrequence;
	@DataField(wikiPageName="Mietkonzession")
	private Amount rentConcession;
	@DataField(wikiPageName="Mieterhöhungsansatz (%)")
	private Double rentIncreasePercentage;
	@DataField(wikiPageName="Anpassungsart")
	private RentIncreaseType rentIncreaseType;

	@DataField(wikiPageName="Kündigungsfrist")
	private Period terminationDuration;
	@DataField(wikiPageName="Datum des Kündigungseingangs")
	private LocalDate terminationReceiptDate;
	// TODO: TurnoverAjdType - Werttyp (absolut/Prozent)
	@DataField(wikiPageName="Umsatztestat erforderlich")
	private Boolean turnoverCertificate;
	@DataField(wikiPageName="Umsatzminimum")
	private Amount turnoverMinimum;
	@DataField(wikiPageName="Umsatzmietkappung")
	private Amount turnoverRentCap;
	@DataField(wikiPageName="Umsatzoffenlegungsintervall")
	private Period turnoverReportingInterval;
	@DataField(wikiPageName="Umsatzmietrelevantes Warensortiment")
	private String turnoverSortiment;

	@DataField(wikiPageName="Nutzungsart_gemäß_Vertrag")
	private UseType useType;

	public Double getBaseIndex() {
		return baseIndex;
	}

	public void setBaseIndex(Double baseIndex) {
		this.baseIndex = baseIndex;
	}

	public LocalDate getBeginningRentConcession() {
		return beginningRentConcession;
	}

	public void setBeginningRentConcession(LocalDate beginningRentConcession) {
		this.beginningRentConcession = beginningRentConcession;
	}

	public LocalDate getBreakOption() {
		return breakOption;
	}

	public void setBreakOption(LocalDate breakOption) {
		this.breakOption = breakOption;
	}

	public Amount getConditionAmount() {
		return conditionAmount;
	}

	public void setConditionAmount(Amount conditionAmount) {
		this.conditionAmount = conditionAmount;
	}

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public LocalDate getContractCompletionDate() {
		return contractCompletionDate;
	}

	public void setContractCompletionDate(LocalDate contractCompletionDate) {
		this.contractCompletionDate = contractCompletionDate;
	}

	public ContractOption getContractOption() {
		return contractOption;
	}

	public void setContractOption(ContractOption contractOption) {
		this.contractOption = contractOption;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Amount getDeltaGraduatedRent() {
		return deltaGraduatedRent;
	}

	public void setDeltaGraduatedRent(Amount deltaGraduatedRent) {
		this.deltaGraduatedRent = deltaGraduatedRent;
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

	public LocalDate getEndRentConcession() {
		return endRentConcession;
	}

	public void setEndRentConcession(LocalDate endRentConcession) {
		this.endRentConcession = endRentConcession;
	}

	public LocalDate getGraduateRentBegin() {
		return graduateRentBegin;
	}

	public void setGraduateRentBegin(LocalDate graduateRentBegin) {
		this.graduateRentBegin = graduateRentBegin;
	}

	public Amount getIncomeLoss() {
		return incomeLoss;
	}

	public void setIncomeLoss(Amount incomeLoss) {
		this.incomeLoss = incomeLoss;
	}

	public LocalDate getIndexAdjustmentBegin() {
		return indexAdjustmentBegin;
	}

	public void setIndexAdjustmentBegin(LocalDate indexAdjustmentBegin) {
		this.indexAdjustmentBegin = indexAdjustmentBegin;
	}

	public IndexAdjustmentDirection getIndexAdjustmentDirection() {
		return indexAdjustmentDirection;
	}

	public void setIndexAdjustmentDirection(
			IndexAdjustmentDirection indexAdjustmentDirection) {
		this.indexAdjustmentDirection = indexAdjustmentDirection;
	}

	public NumberType getIndexAdjustmentValueType() {
		return indexAdjustmentValueType;
	}

	public void setIndexAdjustmentValueType(NumberType indexAdjustmentValueType) {
		this.indexAdjustmentValueType = indexAdjustmentValueType;
	}

	public LocalDate getIndexBaseYear() {
		return indexBaseYear;
	}

	public void setIndexBaseYear(LocalDate indexBaseYear) {
		this.indexBaseYear = indexBaseYear;
	}

	public Country getIndexCountry() {
		return indexCountry;
	}

	public void setIndexCountry(Country indexCountry) {
		this.indexCountry = indexCountry;
	}

	public Double getIndexMinimumAdjustmentInPercent() {
		return indexMinimumAdjustmentInPercent;
	}

	public void setIndexMinimumAdjustmentInPercent(
			Double indexMinimumAdjustmentInPercent) {
		this.indexMinimumAdjustmentInPercent = indexMinimumAdjustmentInPercent;
	}

	public Double getIndexMinimumAdjustmentInPoints() {
		return indexMinimumAdjustmentInPoints;
	}

	public void setIndexMinimumAdjustmentInPoints(
			Double indexMinimumAdjustmentInPoints) {
		this.indexMinimumAdjustmentInPoints = indexMinimumAdjustmentInPoints;
	}

	public IndexationMethod getIndexModificationMethod() {
		return indexModificationMethod;
	}

	public void setIndexModificationMethod(IndexationMethod indexModificationMethod) {
		this.indexModificationMethod = indexModificationMethod;
	}

	public Double getIndexPassthrough() {
		return indexPassthrough;
	}

	public void setIndexPassthrough(Double indexPassthrough) {
		this.indexPassthrough = indexPassthrough;
	}

	public IndexRow getIndexRow() {
		return indexRow;
	}

	public void setIndexRow(IndexRow indexRow) {
		this.indexRow = indexRow;
	}

	public LocalDate getLastRentAdjustmentDate() {
		return lastRentAdjustmentDate;
	}

	public void setLastRentAdjustmentDate(LocalDate lastRentAdjustmentDate) {
		this.lastRentAdjustmentDate = lastRentAdjustmentDate;
	}

	public Area getLeasedArea() {
		return leasedArea;
	}

	public void setLeasedArea(Area leasedArea) {
		this.leasedArea = leasedArea;
	}

	public OptRate getOptRate() {
		return optRate;
	}

	public void setOptRate(OptRate optRate) {
		this.optRate = optRate;
	}

	public Amount getPayment() {
		return payment;
	}

	public void setPayment(Amount payment) {
		this.payment = payment;
	}

	public Period getRentAdjustmentDelay() {
		return rentAdjustmentDelay;
	}

	public void setRentAdjustmentDelay(Period rentAdjustmentDelay) {
		this.rentAdjustmentDelay = rentAdjustmentDelay;
	}

	public LocalDate getRentAdjustmentDate() {
		return rentAdjustmentDate;
	}

	public void setRentAdjustmentDate(LocalDate rentAdjustmentDate) {
		this.rentAdjustmentDate = rentAdjustmentDate;
	}

	public org.joda.time.Period getRentAdjustmentFrequence() {
		return rentAdjustmentFrequence;
	}

	public void setRentAdjustmentFrequence(org.joda.time.Period rentAdjustmentFrequence) {
		this.rentAdjustmentFrequence = rentAdjustmentFrequence;
	}

	public Amount getRentConcession() {
		return rentConcession;
	}

	public void setRentConcession(Amount rentConcession) {
		this.rentConcession = rentConcession;
	}

	public Double getRentIncreasePercentage() {
		return rentIncreasePercentage;
	}

	public void setRentIncreasePercentage(Double rentIncreasePercentage) {
		this.rentIncreasePercentage = rentIncreasePercentage;
	}

	public RentIncreaseType getRentIncreaseType() {
		return rentIncreaseType;
	}

	public void setRentIncreaseType(RentIncreaseType rentIncreaseType) {
		this.rentIncreaseType = rentIncreaseType;
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

	public UseType getUseType() {
		return useType;
	}

	public void setUseType(UseType useType) {
		this.useType = useType;
	}
}
