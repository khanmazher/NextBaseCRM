package com.mazprojects.pages;

import com.mazprojects.utilities.ConfigurationReader;
import com.mazprojects.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    public void loginAs(String loginType){
        String username ="";
        String password ="";

        switch(loginType){
            case "Helpdesk":
                username = ConfigurationReader.getProperty("helpdesk_username");
                password = ConfigurationReader.getProperty("helpdesk_password");
                break;
            case "HR":
                username = ConfigurationReader.getProperty("hr_username");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "Marketing":
                username = ConfigurationReader.getProperty("marketing_username");
                password = ConfigurationReader.getProperty("marketing_password");
                break;
            default:
                System.out.println("invalid entry");

        }
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
}
