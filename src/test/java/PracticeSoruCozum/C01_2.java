package PracticeSoruCozum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //ODEV2
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (title.contains("Teknoloji")){
            System.out.println("Title Teknoloji kelimesi içeriyor");
        }else {
            System.out.println("Title Teknoloji kelimesi içermiyor");
        }

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (url.contains("teknosa")){
            System.out.println("Url teknosa kelimesi içeriyor");
        }else {
            System.out.println("Url teknosa kelimesi içermiyor");
        }

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitle = driver.getTitle();
        System.out.println(medunnaTitle);
        String medunnaUrl = driver.getCurrentUrl();
        System.out.println(medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title MEDUNNA kelimesi içeriyor");
        }else {
            System.out.println("Title MEDUNNA kelimesi içermiyor");
        }

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("Url medunna kelimesi içeriyor");
        }else {
            System.out.println("Url medunna kelimesi içermiyor");
        }

        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
