package export;

import java.util.Date;

import java.text.SimpleDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExportScheduler {

    @Autowired
    private ExportManager exportManager;

    private static final Logger log = LoggerFactory.getLogger(ExportScheduler.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void exportFile() {
        log.info(" --------------------  Begin Export File", dateFormat.format(new Date()));
        exportManager.doExport();
        log.info(" --------------------  End Export File", dateFormat.format(new Date()));
    }



	/**
	* Returns value of exportManager
	* @return
	*/
	public ExportManager getExportManager() {
		return exportManager;
	}

	/**
	* Sets new value of exportManager
	* @param
	*/
	public void setExportManager(ExportManager exportManager) {
		this.exportManager = exportManager;
	}


}
