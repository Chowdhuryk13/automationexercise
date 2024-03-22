import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Testcase_1 {
    public static void main(String[] args) throws InterruptedException {
        //1. Launch Driver
        ChromeOptions opt =new ChromeOptions();
        opt.addExtensions(new File("Extensions/adblock.crx"));
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Navigate to url: https://automationexercise.com/
        driver.get("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equalsIgnoreCase("Automation Exercise")) {
            System.out.println("title is correct");
        }
        else {
            System.out.println("Incorrect Title");
        }

        //4. Click on 'Signup / Login' button

        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();

        //5. Verify 'New User Signup!' is visible
        boolean signUpText =  driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).isDisplayed();
        if(signUpText) {
            System.out.println("New User Signup! is visible");
        }
        else {
            System.out.println(" New User Sgn up! is not visible");
        }


        //6. Enter name and email address

        driver.findElement(By.xpath("//input[@placeholder='Name']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Azhaar");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).click();
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("azsbhsdaar@icloud.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        boolean eci = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")).isDisplayed();
        if (eci){
            System.out.println("Enter Account Information is Displayed");
        }
        else {
            System.out.println("Enter Account Information is not displayed");
        }

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hello123");
        WebElement d= driver.findElement(By.xpath("//select[@id='days']"));
        WebElement m= driver.findElement(By.xpath("//select[@id='months']"));
        WebElement y= driver.findElement(By.xpath("//select[@id='years']"));
        //day
        Select day=new Select(d);
        day.selectByValue("8");
        //month
        Select month=new Select(m);
        month.selectByValue("8");
        //year
        Select year=new Select(y);
        year.selectByValue("1994");

        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();



        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        //FirstName
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("THABED");
        //LastName
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Bitchboy");
        //Address
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("17106 Morrison st");
        //Country
        WebElement c= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[6]/select[1]"));
        Select country= new Select(c);
        country.selectByValue("United States");
        //State
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Michigan");
        //City
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Detroit");
        //Zipcode
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("48212");
        //MobileNumber
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("3138043360");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
         boolean ac = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed();
         if (ac) {
             System.out.println("ACCOUNT CREATED is visible");
         }
         else {
             System.out.println("ACCOUNT CREATED is not visible");
         }

         //15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

         //16. Verify that 'Logged in as username' is visible
         boolean un = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).isDisplayed();
         if (un){
             System.out.println("Logged in as Azhaaar is visible");
         }
         else{
             System.out.println("Logged in as Azhaaar is not visible");
         }

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        boolean ad = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed();
        if (ad){
            System.out.println("Account Deleted is displayed.");
        }
        else{
            System.out.println("Account Deleted is not displayed");
        }

        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();



    }
}


