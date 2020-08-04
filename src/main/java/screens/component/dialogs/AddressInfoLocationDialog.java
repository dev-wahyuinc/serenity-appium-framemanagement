package screens.component.dialogs;

import io.appium.java_client.pagefactory.AndroidFindBy;
import model.DisplayStatus;
import net.serenitybdd.core.pages.WebElementFacade;

abstract class AddressInfoLocationDialog extends BaseDialog {

    private String question;

    @AndroidFindBy(id="com.happyfresh.android:id/component_popup_dialog")
    public WebElementFacade dialogPopUp;

    @AndroidFindBy(id="com.happyfresh.android:id/ui_view_popup_dialog_title_text")
    public WebElementFacade textQuestionDialog;

    public abstract void answeringDialog(AnswerDialog answer);

    public DisplayStatus isDialogDisplay(){
        return textQuestionDialog.isVisible() ? DisplayStatus.DISPLAY : DisplayStatus.NO_DISPLAY;
    }
}
