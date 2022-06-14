package ru.netology.radiostation;

public class RadioSettings {

    private int currentStation;
    private int startStation = 0;
    private int finishStation = 9;
    private int currentVolume;
    private  int startVolume = 0;
    private  int finishVolume = 10;
    public void setCurrentStation(int station) {
        if (station > finishStation) {
           currentStation = 100;
           return;
        }
        if (station < startStation) {
            currentStation = -100;
            return;
        }
        this.currentStation = station;
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
        if (currentStation == finishStation) {
            currentStation = startStation;
            setCurrentStation(currentStation);
        } else {
            return;
        }
    }
    public void forvardStation() {
        if (currentStation == startStation) {
            currentStation = finishStation;
            setCurrentStation(currentStation);
        } else {
            return;
        }
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
        if (currentVolume < startVolume) {
            return;
        }
        if (currentVolume > finishVolume) {
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
