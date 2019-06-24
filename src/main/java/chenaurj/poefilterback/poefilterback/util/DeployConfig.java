package chenaurj.poefilterback.poefilterback.util;


public class DeployConfig {

    private static String localCorsUrl = "http://localhost:4200";
    private static String pcfCorsUrl = "https://chenaurj-poe-filter-front.cfapps.io";
    
    // Change me
    private static String activeCorsUrl = localCorsUrl;

    public static String getCorsUrl() {
        return activeCorsUrl;
    }

    
}