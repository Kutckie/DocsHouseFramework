package ru.lanit.testbase;

import ru.lanit.pages.LoginPage;
import ru.lanit.pages.MainPage;
import ru.lanit.pages.services.DocumentsPage;
import ru.lanit.pages.services.FilePage;
import ru.lanit.pages.services.StoragePage;

public class PageInitializer extends BaseClass {

    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static StoragePage storagePage;
    public static FilePage filePage;
    public static DocumentsPage documentsPage;


    public static void initialize() {
        // initialize pages
        loginPage = new LoginPage();
        mainPage = new MainPage();
        storagePage = new StoragePage();
        filePage = new FilePage();
        documentsPage = new DocumentsPage();


    }

}