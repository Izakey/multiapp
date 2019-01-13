package com.isaac.third.backendRunner;

import com.rmz.common.BackendRunner;
import com.isaac.third.ThirdApplication;

public class ThirdServiceBackendRunner extends BackendRunner {
  public ThirdServiceBackendRunner() {
    super(ThirdApplication.class, CustomizationBean.class);
  }
}