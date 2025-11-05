import java.util.HashMap;
import java.util.Map;

class Appliance {
    String model;
    Appliance(String model) { this.model = model; }
}

class Refrigerator extends Appliance {
    Refrigerator(String model) { super(model); }
}

class Washer extends Appliance {
    Washer(String model) { super(model); }
}

class Oven extends Appliance {
    Oven(String model) { super(model); }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Appliance> devices = new HashMap<>();

        devices.put("RF-100", new Refrigerator("RF-100"));
        devices.put("WS-200", new Washer("WS-200"));
        devices.put("OV-300", new Oven("OV-300"));
        for (String key : devices.keySet()) {
            System.out.println(key);
        }
    }
}
