import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.findElement(By.xpath("//INPUT[@id='hp-widget__sfrom']")).click();
		Thread.sleep(2000);
		String from = "Goa";
		String to = "Bangalore";
		driver.findElement(By.xpath("(//li[@aria-label='Top Cities : "+ from +", India '])[1]")).click();
		driver.findElement(By.xpath("(//li[@aria-label='Top Cities : "+to + ", India '])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("26")).click();
		driver.findElement(By.cssSelector("input[id='hp-widget__return']")).click();
		driver.findElement(By.linkText("29")).click();
		driver.findElement(By.id("hp-widget__paxCounter_pot")).click();
		driver.findElement(By.id ("business")).click();
		driver.findElement(By.xpath ("//a[@class='close_pax pull-right']")).click();
		driver.findElement(By.xpath("//button[@id='searchBtn']")).click();
		System.out.println(driver.getTitle());
		
	}

}
