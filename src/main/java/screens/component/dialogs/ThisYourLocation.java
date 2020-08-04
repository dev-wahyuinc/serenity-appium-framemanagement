package screens.component.dialogs;

import io.appium.java_client.pagefactory.AndroidFindBy;
import model.DisplayStatus;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;

public class ThisYourLocation extends AddressInfoLocationDialog {

    @AndroidFindBy(id="com.happyfresh.android:id/ui_view_popup_dialog_primary_action_button")
    public WebElementFacade yesButton;

    @AndroidFindBy(id="com.happyfresh.android:id/ui_view_popup_dialog_secondary_action_button")
    public WebElementFacade noButton;

    @AndroidFindBy(id="com.happyfresh.android:id/ui_view_address_info_text_view_address")
    public WebElementFacade textLocation;


    @Override
    public  void answeringDialog(AnswerDialog answer){
        if (super.isDialogDisplay().equals(DisplayStatus.DISPLAY)) {
            if ((AnswerDialog.OK == answer)) {
                yesButton.click();
            } else {
                noButton.click();
            }
        } else
            throw new NoSuchElementException("Dialog ThisYourLocation tidak tampil");
    }


}
