import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linh {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://market.openlivenft.io/");
        String str = driver.getTitle();

        Actions action = new Actions(driver);

        System.out.println(str);

        Thread.sleep(3000);

        By Metamask = By.xpath("//section/section//div[@class=\"item-signin\"][1]");

        WebElement dong = driver.findElement(By.xpath("//div[@class=\"btn-close\"]//img[contains(@src,\"data:image/png;base64,iVBORw0KGgoA\")]"));
        WebElement dangnhap = driver.findElement(By.xpath("//div[@class=\"icon-user\"]//img[contains(@src,\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAYAA\")]"));

        action.doubleClick(dangnhap).build().perform();

        Thread.sleep(3000);

        WebElement wesignin = driver.findElement(Metamask);
        action.click(wesignin).build().perform();




//        dong.click();
//        dangnhap.click();

        Thread.sleep(3000);




    }
}
