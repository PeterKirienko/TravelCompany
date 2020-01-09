package tour;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.apache.log4j.Logger;

 public class FamilyTour extends BaseTour{
	private String FamilyTourPrice = "D:/Solvd/Eclipse/MavenNew/New/src/main/java";
	private static final Logger LOGGER=Logger.getLogger(FamilyTour.class);

	public static Logger getLogger() {
    return LOGGER;}
    public int familyMembersCount;
	public int price;


   public FamilyTour(int familyMembersCount) {		
		this.familyMembersCount = familyMembersCount;
		readPriceProperty();
	}
	
	private void readPriceProperty() {
		Properties priceProps = new Properties();
		try {
		FileInputStream fis = new FileInputStream(FamilyTourPrice);
	priceProps.loadFromXML(fis);
	LOGGER.info(priceProps);
	} catch (InvalidPropertiesFormatException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
	}
		

//String fixPriceFromFile = priceProps.getProperty("FixPrice");
		
//	try {
//	this.price = Integer.parseInt(fixPriceFromFile);	
//	} catch (NumberFormatException e) {
//		LOGGER.info("FixPrice is not valid");
 //   trow InvalidParameterException;
//	}
	}
			
@Override
	public void transfer() {
		LOGGER.info("Transfer by bus");
	}
	
	public void recalculateOverallPrice() {
		this.price = price * familyMembersCount;
		LOGGER.info("Price for " + familyMembersCount + " is " + price);
	}

}
