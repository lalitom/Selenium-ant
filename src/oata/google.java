package oata;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class google
{



public static void main (String args[])
{
//System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
//WebDriver driver= new ChromeDriver();
WebDriver driver= new FirefoxDriver();
 driver.get("http://www.google.com");
//Thread.sleep(1000);
System.out.println("The title of page is "+driver.getTitle());
driver.quit();
}

}