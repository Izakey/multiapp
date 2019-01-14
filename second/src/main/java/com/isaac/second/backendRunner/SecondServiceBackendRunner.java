package com.isaac.second.backendRunner;

import com.isaac.second.SecondApplication;
import com.rmz.common.BackendRunner;

public class SecondServiceBackendRunner extends BackendRunner {
	public SecondServiceBackendRunner() {
        super(SecondApplication.class, CustomizationBean.class);
    }
}