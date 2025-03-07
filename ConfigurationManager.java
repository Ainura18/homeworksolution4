import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> configData;

    private ConfigurationManager() {
        configData = new HashMap<>();
        configData.put("maxPlayers", "100");
        configData.put("defaultLanguage", "en");
        configData.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configData.getOrDefault(key, "Key not found");
    }

    public void printAllConfigs() {
        System.out.println("Configuration Settings:");
        for (Map.Entry<String, String> entry : configData.entrySet()) {
            System.out.println(entry.getKey() + " =  " + entry.getValue());
        }
    }
}
