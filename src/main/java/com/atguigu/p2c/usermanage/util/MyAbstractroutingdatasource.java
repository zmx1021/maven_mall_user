package com.atguigu.p2c.usermanage.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyAbstractroutingdatasource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return MydatasorceSwitch.getKey();
	}

}
