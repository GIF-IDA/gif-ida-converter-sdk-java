package org.zgif.model.subset_5_1.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Currency;

import org.zgif.model.annotation.WikiDataField;
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
	@WikiDataField(pageName="Basisindexwert")
	private Double baseIndex;
	@WikiDataField(pageName="Beginn Mietkonzession")
	private LocalDate beginningRentConcession;
	@WikiDataField(pageName="Sonderk�ndigungsrecht")
	private LocalDate breakOption;

	@WikiDataField(pageName="Konditionsbetrag")
	private Amount conditionAmount;
	@WikiDataField(pageName="Konditionstyp")
	private String conditionType;
	@WikiDataField(pageName="Vertragsabschlussdatum")
	private LocalDate contractCompletionDate;
	@WikiDataField(pageName="Vertragsoptionen")
	private ContractOption contractOption;
	@WikiDataField(pageName="W�hrung")
	private Currency currency;

	@WikiDataField(pageName="Absolutbetrag Staffelmieterh�hung")
	private Amount deltaGraduatedRent;
	@WikiDataField(pageName="Kaution")
	private Boolean depositAgreed;
	@WikiDataField(pageName="Kautionsbetrag")
	private Amount depositAmount;
	@WikiDataField(pageName="Anpassungsart_Kaution")
	private DepositIncreaseType depositIncreaseType;
	@WikiDataField(pageName="Kautionsstatus")
	private Boolean depositPayed;
	@WikiDataField(pageName="Kautionsart")
	private DepositType depositType;
	@WikiDataField(pageName="Vertragsende_nach_Option")
	private LocalDate dmiendOption;

	@WikiDataField(pageName="Enddatum Mietkonzession")
	private LocalDate endRentConcession;

	@WikiDataField(pageName="Beginn_der_Staffelmietanpassung")
	private LocalDate graduateRentBegin;

	@WikiDataField(pageName="Erl�sschm�lerung")
	private Amount incomeLoss;
	@WikiDataField(pageName="Beginn_der_Indexmietanpassung")
	private LocalDate indexAdjustmentBegin;
	@WikiDataField(pageName="Indexmiet-Senkungs-Sperrklausel")
	private IndexAdjustmentDirection indexAdjustmentDirection;
	@WikiDataField(pageName="Methode_der_Mindest�nderung_(Punkte_oder_Prozent)")
	private NumberType indexAdjustmentValueType;
	@WikiDataField(pageName="Basisjahr_der_gew�hlten_Indexreihe")
	private LocalDate indexBaseYear;
	@WikiDataField(pageName="Land_der_Indexreihe")
	private Country indexCountry;
	@WikiDataField(pageName="Mindest�nderung_in_Prozent")
	private Double indexMinimumAdjustmentInPercent;
	@WikiDataField(pageName="Mindest�nderung_in_Punkten")
	private Double indexMinimumAdjustmentInPoints;
	@WikiDataField(pageName="Indexanpassungsmethode")
	private IndexationMethod indexModificationMethod;
	@WikiDataField(pageName="Weitergabeprozentsatz")
	private Double indexPassthrough;
	@WikiDataField(pageName="Indexreihe")
	private IndexRow indexRow;

	@WikiDataField(pageName="Datum_der_letzten_Mietanpassung")
	private LocalDate lastRentAdjustmentDate;
	@WikiDataField(pageName="Vertragsfl�che")
	private Area leasedArea;

	@WikiDataField(pageName="Optierungssatz")
	private OptRate optRate;

	@WikiDataField(pageName="Betrag Mieteinzahlung")
	private Amount payment;

	@WikiDataField(pageName="Anpassungsverz�gerung bei Mietanpassungen")
	private Period rentAdjustmentDelay;
	@WikiDataField(pageName="Datum der n�chsten Mietanpassung")
	private LocalDate rentAdjustmentDate;
	@WikiDataField(pageName="Mietanpassungsfrequenz")
	private java.time.Period rentAdjustmentFrequence;
	@WikiDataField(pageName="Mietkonzession")
	private Amount rentConcession;
	@WikiDataField(pageName="Mieterh�hungsansatz (%)")
	private Double rentIncreasePercentage;
	@WikiDataField(pageName="Anpassungsart")
	private RentIncreaseType rentIncreaseType;

	@WikiDataField(pageName="K�ndigungsfrist")
	private Period terminationDuration;
	@WikiDataField(pageName="Datum des K�ndigungseingangs")
	private LocalDate terminationReceiptDate;
	// TODO: TurnoverAjdType - Werttyp (absolut/Prozent)
	@WikiDataField(pageName="Umsatztestat erforderlich")
	private Boolean turnoverCertificate;
	@WikiDataField(pageName="Umsatzminimum")
	private Amount turnoverMinimum;
	@WikiDataField(pageName="Umsatzmietkappung")
	private Amount turnoverRentCap;
	@WikiDataField(pageName="Umsatzoffenlegungsintervall")
	private Period turnoverReportingInterval;
	@WikiDataField(pageName="Umsatzmietrelevantes Warensortiment")
	private String turnoverSortiment;

	@WikiDataField(pageName="Nutzungsart_gem��_Vertrag")
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

	public java.time.Period getRentAdjustmentFrequence() {
		return rentAdjustmentFrequence;
	}

	public void setRentAdjustmentFrequence(java.time.Period rentAdjustmentFrequence) {
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
