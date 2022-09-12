import com.google.gson.JsonObject;
import com.tngtech.java.junit.dataprovider.DataProvider;

public class LTCapability {
  @DataProvider
  public static Object[] getDefaultTestCapability() {
    JsonObject capabilities1 = new JsonObject();
    JsonObject ltOptions1 = new JsonObject();

    String user = System.getenv("LT_USERNAME") == null ? "LT_USERNAME" :
            System.getenv("LT_USERNAME");
    String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "LT_ACCESS_KEY" :
            System.getenv("LT_ACCESS_KEY");

    capabilities1.addProperty("browserName", "Chrome"); // Browsers allowed: `Chrome`, `MicrosoftEdge`, `pw-chromium`, `pw-firefox` and `pw-webkit`
    capabilities1.addProperty("browserVersion", "latest");
    ltOptions1.addProperty("platform", "Windows 10");
    ltOptions1.addProperty("name", "Playwright HyperExecute Test");
    ltOptions1.addProperty("build", "Playwright HyperExecute Build");
    ltOptions1.addProperty("user", user);
    ltOptions1.addProperty("accessKey", accessKey);
    ltOptions1.addProperty("video", true);
    ltOptions1.addProperty("console", true);
    capabilities1.add("LT:Options", ltOptions1);

    return new Object[]{
      capabilities1
    };
  }
}
