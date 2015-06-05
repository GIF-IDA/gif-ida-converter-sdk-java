package org.zgif.model.datatype;

import java.util.Currency;

public class Amount {
	private Double value;
	private Currency currency;
	
	public Amount(Double value, Currency currency) {
		this.value = value;
		this.currency = currency;
	}

	public Double getValue() {
		return this.value;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void getCurrency(Currency currency) {
		this.currency = currency;
	}
}
