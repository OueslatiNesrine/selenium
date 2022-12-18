import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoadDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver ();
		
		// open url / app my store
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement btnUpload = driver.findElement(By.id("uploadfile_0"));
		
		btnUpload.sendKeys("C:\\Users\\Nesrine\\Desktop\\Formation sélenium\\test.docx");
	}

}
