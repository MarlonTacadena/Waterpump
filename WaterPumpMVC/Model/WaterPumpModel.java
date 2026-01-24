
package Model;

public class WaterPumpModel {
    private int waterLevel;
    private boolean pumpOn;

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
        updatePumpStatus();
    }

    public boolean isPumpOn() {
        return pumpOn;
    }

    private void updatePumpStatus() {
        if (waterLevel < 20) {
            pumpOn = true;
        } else if (waterLevel > 80) {
            pumpOn = false;
        }
    }
}
