package com.example.whatever;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhateverApplication extends Application<AppConfiguration> {
  public static final Logger LOGGER = LoggerFactory.getLogger(WhateverApplication.class);

  public static void main(final String[] args) throws Exception {
    new WhateverApplication().run(args);
  }

  @Override
  public void run(final AppConfiguration configuration, final Environment environment)
      throws Exception {
    LOGGER.info("Application name: {}", configuration.getAppName());
  }
}
