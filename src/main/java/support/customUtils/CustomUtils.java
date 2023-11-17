package support.customUtils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import constants.Constants;
import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class CustomUtils {
	
	
	public static String getUrls(String siteName) {
        return getPropertiesFile(Constants.ApplicationUrlsPath).getProperty(siteName);
    }
	
	public static Object getUrlsByGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static Properties getPropertiesFile(String filePath) {
        Properties properties = new Properties();
        try {
            File file = new File(filePath);
            FileInputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
            inputStream.close();
            //log.info("File found: " + filePath);

        } catch (Exception e) {
//            log.error(String.valueOf(e));
        }
        return properties;
    }
	
	 public static String getWebElement(String filePath, String selector) {
	        return getPropertiesFile(filePath).getProperty(selector);
	    }


	
}
