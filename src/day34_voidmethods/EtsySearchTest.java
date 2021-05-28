package day34_voidmethods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchWoodenSpoon();
        verifyResultAreDisplayed();
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome Browser");
        //System.out.println("Browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to https://www.etsy.com/");
    }
    public static void searchWoodenSpoon(){
        System.out.println("PASS:Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }
    public static void verifyResultAreDisplayed(){
        System.out.println("PASS:Search results are successfully displayed");
    }
}
