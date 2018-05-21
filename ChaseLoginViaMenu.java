package mainChase;

import base.CommonAPI;

public class ChaseLoginViaMenu extends CommonAPI {
    public void chaseLoginViaMenu(){
        clickByXpath("//header[@data-feature='header']//a[@id='skip-sidemenu']");
        clickOnCss(".chaseanalytics-track-link.signInBtn");

    }
}
