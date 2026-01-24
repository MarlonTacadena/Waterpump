import Model.WaterPumpModel;
import View.WaterPumpView;
import Controller.WaterPumpController;

public class Main {
    public static void main(String[] args) {
        WaterPumpModel model = new WaterPumpModel();
        WaterPumpView view = new WaterPumpView();
        WaterPumpController controller = new WaterPumpController(model, view);

        controller.run();
    }
}

