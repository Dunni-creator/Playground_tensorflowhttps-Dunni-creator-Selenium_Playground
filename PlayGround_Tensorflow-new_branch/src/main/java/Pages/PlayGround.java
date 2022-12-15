package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlayGround {
    private WebDriver driver;

    public PlayGround(WebDriver driver) {
        this.driver = driver;
    }

    private By exClusiveOR = By.xpath("(//canvas[@data-dataset='xor'])[1]");
    private By selectNoise = By.xpath("//input[@id='noise']");
    private By featureOne = By.xpath("(//canvas)[17]");
    private By featureTwo = By.xpath("(//canvas)[16]");
    private By minimizedNeuronsOne = By.xpath("(//i[@class='material-icons'][normalize-space()='remove'])[1]");
    private By minimizedNeuronsTwo = By.xpath("(//i[@class='material-icons'][normalize-space()='remove'])[2]");
    private By learningRateField = By.xpath("//select[@id='learningRate']");
    private By learningRateValue = By.xpath("(//option[@value='0.1'][normalize-space()='0.1'])[1]");
    private By outputPrint = By.xpath("//div[@class='metrics']");
    private By playButton = By.xpath("//button[@id=\"play-pause-button\"]");
    private By epochValue = By.xpath("//span[@id=\"iter-number\"]");
    private By simulationButton = By.xpath("//i[normalize-space()='play_arrow']");
    private By simulationPauseButton = By.xpath("//i[normalize-space()='pause']");
    private By lossValue = By.xpath("//div[@id='loss-test']");
    private By epocCount = By.xpath("//span[@id='iter-number']");



    //Change dataset based on step- iii
    public void ExclusiveOR() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(exClusiveOR).click();
        Thread.sleep(500);
    }

    //Select noise
    public void SelectNoise() throws InterruptedException {
        WebElement e = driver.findElement(selectNoise);
        e.sendKeys(Keys.ARROW_RIGHT);
        Thread.sleep(2000);
    }

    //Select two features based on step- v
    public void FeatureSelect() throws InterruptedException {
        driver.findElement(featureOne).click();
        Thread.sleep(500);
        driver.findElement(featureTwo).click();
        Thread.sleep(2000);
    }

    //Remove one reuron from the both section based on the step- vi
    public void MinimizedNeurones() throws InterruptedException {
        driver.findElement(minimizedNeuronsOne).click();
        Thread.sleep(500);
        driver.findElement(minimizedNeuronsTwo).click();
        Thread.sleep(2000);
    }

    //Change Learning rate based on the step- vii
    public void selectLearningRate() throws InterruptedException {
        Select learningRate = new Select(driver.findElement(learningRateField));
        learningRate.selectByValue("0.1");
        Thread.sleep(2000);
    }

    //Click on Simulation based on the step- viii and waite until more than 0.3(000 300) based on step- ix
    public void ClickSimulationButton() throws InterruptedException {
        driver.findElement(simulationButton).click();
        Thread.sleep(5500);
        driver.findElement(simulationPauseButton).click();
        Thread.sleep(2000);
    }

    //Print loss value is console based on step- ii & x
    public void PrintLossValue() throws InterruptedException {
        String a = driver.findElement(lossValue).getText();
        System.out.println(a);
        Thread.sleep(2000);
    }

    //Print number of execution epoch
    public void PrintEpocValue() throws InterruptedException {
        String a = driver.findElement(epocCount).getText();
        System.out.println(a);
        Thread.sleep(1000);
    }


}
