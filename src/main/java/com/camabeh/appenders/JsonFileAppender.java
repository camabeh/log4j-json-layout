package com.camabeh.appenders;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 * <p>
 * A simplistic appender to simply souport JSON logging
 */
public class JsonFileAppender extends NextRollingFileAppender {
  {
    JsonLayout layout = new JsonLayout();
    layout.activateOptions();
    setLayout(layout);
    setMaximumFileSize(10 * 1024 * 1024);
    setFileExtension(".json");
    setMaxBackupIndex(10);
  }
}
