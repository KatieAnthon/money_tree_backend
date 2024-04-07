package com.makers.moneytree;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;



public class LandingPageTest {
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launchBrowser(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterAll
    static void closeBrowser() {
        browser.close();
    }

    @BeforeEach
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void signupWorks() {
        String email = "test@example.com";
        String password = "Password123!";

        page.navigate("http://localhost:8080/users/signup");

        page.fill("#emailInput", email);
        page.fill("#passwordInput", password);
        page.click("#signupButton");

        assertThat(page).textContent("#successMessage").contains("User signed up successfully");

    }
}
