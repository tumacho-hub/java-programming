package day_34_void_methos;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--------Starting Etsy search smoke test----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsworks();
        System.out.println("------ Etsy Search Smokes Test Completed - pass -");
        }

        public static void openBrowser() {
            System.out.println("Launching chrome browser");
    }
        public static void navigateToEtsyUrl() {
        System.out.println("Navigate to https://www.etsy.com/");
    }
        public static void searchForWoodenSpoon( ){
        System.out.println("Pass: Verify Etsy home page is displayed");
        System.out.println("Type wooden spoon in search field and click search");
    }
        public static void verifyResultsworks () {
        System.out.println("Pass: search results are successfully displayed");
    }
}
