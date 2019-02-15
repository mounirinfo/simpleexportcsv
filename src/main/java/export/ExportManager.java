package export;

import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ExportManager{

  private static final Logger logger = LoggerFactory.getLogger(ExportManager.class);

  public void doExport(){
    logger.info("***** in ExportManager ******************");
  }
}
