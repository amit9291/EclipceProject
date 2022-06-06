package Newselenium;


   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Trial {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Amit\\JAVA\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://google.com/");
            String a = driver.getCurrentUrl();
            System.out.println(a);
            String b = driver.getTitle();
            System.out.println(b);
        }
    }



