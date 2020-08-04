package screens.component.dialogs;

import io.appium.java_client.pagefactory.AndroidFindBy;
import model.DisplayStatus;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoStoreAroundYou extends AddressInfoLocationDialog  {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoStoreAroundYou.class);
    private final String question = "Are you sure?";

    @AndroidFindBy(id="com.happyfresh.android:id/ui_view_popup_dialog_primary_action_button")
    public WebElementFacade buttonOk;


    @Override
    public void answeringDialog(AnswerDialog answer) {
        if (super.isDialogDisplay().equals(DisplayStatus.DISPLAY))
            if(answer.equals(AnswerDialog.OK))
                buttonOk.click();
            else
                throw new IllegalArgumentException(answer + "jawaban tidak ada pada dialog");
        else
            LOGGER.debug("Pop up tidak tampil");
    }
}
