import com.google.gson.JsonObject;
import com.microsoft.playwright.Page;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SampleTest2 extends  BaseTest{
  String testURL = "https://playwright.dev/";
 String testURLTitle = "Fast and reliable end-to-end testing for modern web apps | Playwright";
 @Test
 @UseDataProvider(value = "getDefaultTestCapability",location = LTCapability.class)
 public void sampleTest1(JsonObject capability) {
   Driver driver;
   Page page = null;
   try {
     driver = super.createConnection(capability);
     page = driver.getPage();
     page.navigate(testURL);
     Thread.sleep(200);
     page.setViewportSize(1900, 1050);
     
     page.locator("text = Get Started").click();
     page.locator("text=Installation").first().isVisible();
     page.locator("text=Trace viewer").first().click();
     page.locator("text=Test Generator").first().click();
     page.locator("text=Release notes").first().click();
     page.locator("text=Annotations").first().click();
     page.locator("text=API testing").first().click();
     page.locator("text=Authentication").first().click();
     page.locator("text=Command line").first().click();
     page.locator("text=Configuration").first().click();
     page.locator("text=Page Object Models").first().click();

    page.locator("text=Parameterize tests").first().click();
    page.locator("text=Reporters").first().click();
    page.locator("text=Retries").first().click();
    page.locator("text=Timeouts").first().click();
    page.locator("text=Visual comparisons").first().click();
    page.locator("text=Fixtures").first().click();
    page.locator("text=TypeScript").first().click();
    page.locator("text=Components (experimental)").first().click();
    page.locator("text=Library").first().click();
    page.locator("text=Auto-waiting").first().click();
    page.locator("text=Authentication").first().click();
    page.locator("text=Browsers").first().click();
    page.locator("text=Chrome Extensions").first().click();
    page.locator("text=Command line").first().click();
    page.locator("text=Dialogs").first().click();
    page.locator("text=Downloads").first().click();
    page.locator("text=Emulation").first().click();
    page.locator("text=Evaluating JavaScript").first().click();
    page.locator("text=Events").first().click();
    page.locator("text=Extensibility").first().click();
    page.locator("text=Frames").first().click();
    page.locator("text=Handles").first().click();
    page.locator("text=Locators").first().click();
    page.locator("text=Navigations").first().click();
    page.locator("text=Network").first().click();
    page.locator("text=Pages").first().click();
    page.locator("text=Page Object Model").first().click();
    page.locator("text=Screenshots").first().click();
    page.locator("text=Videos").first().click();
    page.locator("text=Migration").first().click();
    page.locator("text=Migrating from Protractor").first().click();
    page.locator("text=Integrations").first().click();
    page.locator("text=Docker").first().click();
    page.locator("text=Continuous Integration").first().click();
    page.locator("text=Selenium Grid").first().click();
    page.locator("text=Supported languages").first().click();
    Thread.sleep(2000);
    if(page.title().equalsIgnoreCase("Supported languages | Playwright")){
      super.setTestStatus("passed","Title matched",page);
    } else {
      super.setTestStatus("failed","Title not matched",page);
    }
     super.closeConnection(driver);
   } catch (Exception e) {
     e.printStackTrace();
     super.setTestStatus("failed",e.getMessage(),page);
   }
 }
}
