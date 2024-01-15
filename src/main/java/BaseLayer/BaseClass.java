package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	protected static WebDriver driver;
	protected static Properties prop;
	
	public BaseClass() {
		
		File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\config.properties");
		try {
			FileInputStream fis= new FileInputStream(f);
		    prop= new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void initialization(String browsername) {
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("sitUrl"));
		
		
		
		
	}

}
