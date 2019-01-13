package com.isaac.second.backendRunner;

import com.rmz.common.BackendRunner;
import com.isaac.second.SecondApplication;

public class SecondServiceBackendRunner extends BackendRunner {
	public SecondServiceBackendRunner() {
        super(SecondApplication.class, CustomizationBean.class);
    }
}