package mainChase;

import base.CommonAPI;

public class Credentialslogin extends CommonAPI {
    public void credentialsLogin(){
        typeByXpath("//*[@id=\"usr_name_home\"]", "chaseUser");
        typeByXpath("//*[@id=\"usr_password_home\"]", "password");
        clickByXpath("//*[@id=\"signin-module\"]/div[3]/div/div/div/form/div/div[5]/a");

    }
}
