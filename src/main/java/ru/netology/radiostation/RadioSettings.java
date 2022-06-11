package ru.netology.radiostation;

public class RadioSettings {

    private int currentStation;
    private int currentStationBack;
    private int currentStationForvard;
    private int currentVolume;

    public void setCurrentStation(int stations) {

        if (currentStation > 9) {

            currentStation = 100;

            return;
        }

        if (currentStation < 0) {

            currentStation = -100;

            return;
        }

        if (currentStation == 9) {

            currentStationBack = 0;
        }

        if (currentStation == 0) {

            currentStationForvard = 9;
        }

        currentStation = stations;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void stationMin() {

        int stationMin = currentStation;

        setCurrentStation(stationMin);
    }

    public void stationMax() {

        int stationMax = currentStation;

        setCurrentStation(stationMax);
    }

    public void backStation() {

        int backStation = currentStationBack;

        setCurrentStation(backStation);
    }

    public void forvardStation() {

        int forvardStation = currentStationForvard;

        setCurrentStation(forvardStation);
    }

    public void plusStation() {

        int plusStation;

        plusStation = currentStation + 1;

        setCurrentStation(plusStation);
    }

    public void minusStation() {

        int minusStation;

        minusStation = currentStation - 1;

        setCurrentStation(minusStation);
    }

    public void numStation() {

        int numStation = currentStation;

        setCurrentStation(numStation);
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {

            return;
        }

        if (currentVolume > 10) {

            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void increaseVolume() {

        int currentVolume = this.currentVolume + 1;

        setCurrentVolume(currentVolume);

    }

    public void decreaseVolume() {

        int currentVolume = this.currentVolume - 1;

        setCurrentVolume(currentVolume);

    }
}
