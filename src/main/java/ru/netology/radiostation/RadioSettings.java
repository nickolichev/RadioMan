package ru.netology.radiostation;

public class RadioSettings {

    private int currentStation;
    private int currentStationBack;
    private int currentStationForvard;
    private int currentVolume;

    public void setCurrentStation(int stations) {

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

    public void BackStation() {

        int backStation = currentStationBack;

        setCurrentStation(backStation);
    }

    public void ForvardStation() {

        int forvardStation = currentStationForvard;

        setCurrentStation(forvardStation);
    }

    public void PlusStation() {

        int plusStation;

        plusStation = currentStation + 1;

        setCurrentStation(plusStation);
    }

    public void MinusStation() {

        int minusStation;

        minusStation = currentStation - 1;

        setCurrentStation(minusStation);
    }

    public void setNumStation(int station) {

        if (station >= 0) {

            if (station <= 10) {

                currentStation = station;
            }
        }
    }

    public int getNumStation() {

        return currentStation;
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

    public void IncreaseVolume() {

        int currentVolume = this.currentVolume + 1;

        setCurrentVolume(currentVolume);

    }

    public void DecreaseVolume() {

        int currentVolume = this.currentVolume - 1;

        setCurrentVolume(currentVolume);

    }
}
