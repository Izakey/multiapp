package com.isaac.first.backendRunner;

import com.rmz.common.BackendRunner;
import com.isaac.first.FirstApplication;

public class FirstServiceBackendRunner extends BackendRunner {
  public FirstServiceBackendRunner() {
    super(FirstApplication.class, CustomizationBean.class);
  }
}