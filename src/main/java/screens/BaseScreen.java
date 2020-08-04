package screens;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.bytebuddy.implementation.bytecode.Throw;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;


public class BaseScreen extends PageObject {

    private String screenPackage = "";
    private  List<WebElement>  elements;



    public AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public void scrollToText(String text) {
        MobileElement el = androidDriver().findElementByAndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"));");
        el.isDisplayed();
    }

    public String getCurrentActivityName() {
        return this.androidDriver().currentActivity();
    }

    public void navigateBack(){
        androidDriver().navigate().back();
    }

    public MobileElement findText(String text){
        return androidDriver().findElementByAndroidUIAutomator("new UiSelector().text(\""+text+"\");");
    }

    public void selectListByIndex(String locator, int index){
        List<WebElementFacade> lists = findAll(By.id(locator));
        lists.get(index).click();
    }

    public void selectListByText(String locator, String text){
        List<WebElementFacade> elements = findAll(By.id(locator));
        for(WebElementFacade element : elements) {
            System.out.println("hasil = " + element.getText());
            if (element.getText().equals(text))
                element.click();
                break;
        }

    }

    public void selectListByText(List<WebElementFacade> elements, String text){
        Integer x = 0,y = 0;
        for(WebElementFacade element : elements) {
            if (element.getText().toLowerCase().equals(text.toLowerCase())) {
                y++;
                element.click();
                break;
            }
            x++;
        }
        if(x.equals(0)){
            throw new NotFoundException(elements.toString() +" Find "+text+"tidak ada.");
        }
        if(y.equals(0)){
            throw new NotFoundException("Tidak ada satupun pilihan dari " + text);
        }
    }
}
