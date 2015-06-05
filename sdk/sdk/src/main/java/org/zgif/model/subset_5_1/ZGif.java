package org.zgif.model.subset_5_1;

import java.util.List;

import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Period;

public class ZGif extends AbstractZGif {

	DataRoot data;
	List<Period<DataRoot>> periods;

	public ZGif() {
	}

	public DataRoot getData() {
		return data;
	}

	public void setData(DataRoot data) {
		this.data = data;
	}

	public List<Period<DataRoot>> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period<DataRoot>> periods) {
		this.periods = periods;
	}
}
