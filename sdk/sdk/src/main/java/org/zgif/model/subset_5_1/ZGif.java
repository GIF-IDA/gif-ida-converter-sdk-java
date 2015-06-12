package org.zgif.model.subset_5_1;

import java.util.Map;

import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Period;

public class ZGif extends AbstractZGif {

	DataRoot data;
	Map<String, Period<DataRoot>> periods;

	public ZGif() {
	}

	public DataRoot getData() {
		return data;
	}

	public void setData(DataRoot data) {
		this.data = data;
	}

    public Map<String, Period<DataRoot>> getPeriods() {
        return periods;
    }

    public void setPeriods(Map<String, Period<DataRoot>> periods) {
        this.periods = periods;
    }
}
