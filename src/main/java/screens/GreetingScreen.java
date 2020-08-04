package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GreetingScreen extends BaseScreen {
    @AndroidFindBy(id = "com.happyfresh.android:id/ui_view_item_language_textview")
    public WebElementFacade languange;

    @AndroidFindBy(id = "com.happyfresh.android:id/ui_view_skip_on_boarding_text_view")
    private WebElementFacade skip;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_always_button")
    public WebElementFacade allowPermissionDevice;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
    private WebElementFacade permissionPhotoMediaFile;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/content_container")
    public WebElementFacade permissionDevice;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElementFacade allowPermissionPhotoMediaFile;

    public void skipFromNextStep(){
        skip.waitUntilVisible().click();
    }

    public void allowPermissionPhotoMedia(){
        permissionPhotoMediaFile.waitUntilVisible();
        allowPermissionPhotoMediaFile.click();
    }



}
