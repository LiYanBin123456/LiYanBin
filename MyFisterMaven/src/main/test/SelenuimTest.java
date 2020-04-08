import org.junit.*;


import static org.junit.Assert.assertEquals;


public class SeleniumTest {
    Selenuim selenuim = new Selenuim();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTitle() {
        WebDriver webdriver = selenium.getWebdriver();
        webdriver.get("https://www.csdn.net/");
        String expected = "CSDN-专业IT技术社区";
        String actual = webdriver.getTitle();
        assertEquals(expected,actual);
        webdriver.quit();
    }
    @Test
    public void findElement() throws InterruptedException {
        WebDriver webdriver = selenium.getWebdriver();
        webdriver.get("https://www.csdn.net/");

        WebElement element = webdriver.findElement(By.id("toolber-keyword"));
        String expected = "Selenium";
        element.sendKeys(expected);
        element.submit();
        Thread.sleep(5000);

    }


}
