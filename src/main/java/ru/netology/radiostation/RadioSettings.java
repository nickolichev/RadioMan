package ru.netology.radiostation;

public class RadioSettings {

    private Boolean nextStation = true;
    private Boolean prevStation = true;
    private Boolean nextVolume = true;
    private Boolean prevVolume = true;
    private int rangeDefault = 10;
    private int range;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int stepStation = 1;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int stepVolume = 1;

    public RadioSettings(
            Boolean nextStation,
            Boolean prevStation,
            Boolean nextVolume,
            Boolean prevVolume,
            int rangeDefault,
            int minStation,
            int maxStation,
            int stepStation,
            int minVolume,
            int maxVolume,
            int stepVolume) {

        this.nextStation = nextStation;
        this.prevStation = prevStation;
        this.nextVolume = nextVolume;
        this.prevVolume = prevVolume;
        this.rangeDefault = rangeDefault;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.stepStation = stepStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.stepVolume = stepVolume;
    }
    public RadioSettings() {
        this.range = 10;
    }
    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {
            this.currentStation = 100;
            return;
        }

        if (currentStation < minStation) {
            this.currentStation = -100;
            return;
        }

        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }

        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentNext(Boolean nextStation, int currentStation) {

        if (nextStation) {
            this.currentStation = currentStation + stepStation;
        } else {
            this.currentStation = currentStation;
        }
    }
    public int getCurrentNext() {
        return this.currentStation;
    }
    public void setCurrentPrev(Boolean prevStation, int currentStation) {

        if (prevStation) {
            this.currentStation = currentStation - stepStation;
        } else {
            this.currentStation = currentStation;
        }
    }
    public int getCurrentPrev() {
        return this.currentStation;
    }
    public void setCurrentDefault(int rangeDefault) {

        if (0 <= rangeDefault && rangeDefault <= 10) {
            this.rangeDefault = rangeDefault;
        } else {
            this.rangeDefault = 100;
        }
    }
    public int getCurrentDefault() {
        return rangeDefault;
    }
    public void setCurrentRange(int range) {
        this.range = range;
    }
    public int getCurrentRange() {
        return range;
    }
    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setVolumeNext(Boolean nextVolume, int currentVolume) {

        if (nextVolume) {
            this.currentVolume = currentVolume + stepVolume;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public int getVolumeNext() {
        return this.currentVolume;
    }

    public void setVolumePrev(Boolean prevStation, int currentVolume) {

        if (prevStation) {
            this.currentVolume = currentVolume - stepVolume;
        } else {
            this.currentVolume = currentVolume;
        }
    }
    public int getVolumePrev() {
        return this.currentVolume;
    }
}