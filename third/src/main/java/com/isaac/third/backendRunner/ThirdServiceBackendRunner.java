package com.isaac.third.backendRunner;

import com.isaac.third.ThirdApplication;
import com.rmz.common.BackendRunner;

public class ThirdServiceBackendRunner extends BackendRunner {
  public ThirdServiceBackendRunner() {
    super(ThirdApplication.class, CustomizationBean.class);
  }
}