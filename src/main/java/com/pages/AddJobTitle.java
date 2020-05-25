package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class AddJobTitle extends PageBase {

    private static By AdminJob = By.id("menu_admin_Job");
    private static By AdminJobTitle = By.id("menu_admin_viewJobTitleList");
    private static By HrmJobTitle = By.xpath("//*[@id=\"search-results\"]/div[1]/h1");



    private static By AddButton = By.id("btnAdd");
    private static By SaveButton = By.id(" btnSave");

    public static void ClickAdminJob() {
        getDriver().findElement(AdminJob).click();

    }
    public static void ClickAdminJobTitle() {
        getDriver().findElement(AdminJobTitle).click();

    }

    public static void ClickAddButton() {
        getDriver().findElement(AddButton).click();

    }

//    public static void ClickSaveButton() {
//        getDriver().findElement(SaveButton).click();
//
//    }

    private static By DeleteButton = By.id("btnDelete");

    public static void ClickDeleteButton() {
        getDriver().findElement(DeleteButton).click();

    }

    private static By JobTitleCheckBox = By.id("ohrmList_chkSelectAll");

    public static void ClickCheckBox() {
        getDriver().findElement(JobTitleCheckBox).click();

    }

    private static By ConForomOk = By.id("dialogDeleteBtn");

    public static void ClickConForomOk() {
        getDriver().findElement(ConForomOk).click();

    }


    private static By AddJobTitleHeader = By.xpath("//h1");

    public static boolean isDisplayAddJobTitleHeader() {
        return getDriver().findElement(AddJobTitleHeader).isDisplayed();
    }

    private static By txtJobTitle = By.id("jobTitle_jobTitle");

    public static void setJobTitle(String JobTitle) {
        getDriver().findElement(txtJobTitle).sendKeys(JobTitle);

    }

    private static By txtJobDescription = By.id("jobTitle_jobDescription");

    public static void setJobDescription(String Description) {
        getDriver().findElement(txtJobDescription).sendKeys(Description);

    }

    private static By txtobSpecification = By.id("jobTitle_jobSpec");

    public static void ClickButtonpecifica() {
        getDriver().findElement(txtobSpecification).click();

    }

    private static By txtNote = By.id("jobTitle_note");

    public static void setNote(String Note) {
        getDriver().findElement(txtNote).sendKeys(Note);

    }

    private static By ButtonSave = By.id("btnSave");

    public static void ClickButtonSave() {
        getDriver().findElement(ButtonSave).click();

    }
    public static boolean isHrmJobTitlePageDisplayed() {
        return getDriver().findElement(HrmJobTitle).isDisplayed();

    }
}
