package Controller;

import Model.WaterPumpModel;
import View.WaterPumpView;

public class WaterPumpController {
    private WaterPumpModel model;
    private WaterPumpView view;

    public WaterPumpController(WaterPumpModel model, WaterPumpView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int waterLevel = view.getWaterLevelInput();
        model.setWaterLevel(waterLevel);
        view.displayPumpStatus(model.isPumpOn());
    }
}

