package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.Driver","src/resources/Drivers/chromedriver.exe");
        //Java uygulamalarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        // setProperty methodu ile class ımıza driver in fiziki yolunu belirttik
        System.out.println(System.getProperty("webdriver.chrome.Driver"));
        WebDriver driver=new ChromeDriver();
        // chrome Driver turunde yeni bir obje olusturduk
        driver.get("https://techproeducation.com");// get() methodu ile string olrak girilen url ye didilir
    }
}
