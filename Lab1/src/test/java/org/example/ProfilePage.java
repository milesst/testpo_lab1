package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/a[1]/div/img")
    private WebElement userMenu;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/div/ul/ul/li[6]/a")
    @FindBy(xpath = "//*[contains(text(), 'Выйти')]/..")
    private WebElement logoutBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/main/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div")
    private WebElement loginSpan;

    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/a[1]/div/img")));

        String userName = loginSpan.getText();
        return userName; }

    public void entryMenu() {
        userMenu.click(); }

    public void userLogout() {
        logoutBtn.click(); }
}
