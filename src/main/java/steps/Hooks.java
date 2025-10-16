package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PicoContext;

public class Hooks {

    private final PicoContext context;
   public WebDriver driver ;
    public Hooks(PicoContext context) {
        this.context = context;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        context.setDriver(driver);
    }

    @After
    public void tearDown() {
        context.quitDriver();
    }
}
