package militaryElite.helperClasses.interfaces;

import militaryElite.enums.State;

public interface Mission {
    void completeMission();
    String getCodeName();
    State getState();

}
