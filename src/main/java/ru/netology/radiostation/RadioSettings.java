package ru.netology.radiostation;

public class RadioSettings {

    private int rangeDefault;
    private int range;
    private int currentStation;
    private int currentVolume;

    public RadioSettings(int range) {
        this.range = range;}

    public RadioSettings() {}

    public void setCurrentStation(int currentStation) {

        if (currentStation > 9) {
            this.currentStation = 100;
            return;
        }

        if (currentStation < 0) {
            this.currentStation = -100;
            return;
        }

        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }

        if (currentStation == 0) {
            this.currentStation = 9;
        }
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentNext(Boolean nextStation, int currentStation) {

        if (nextStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = currentStation;
        }
    }
    public int getCurrentNext() {
        return this.currentStation;
    }

    public void setCurrentPrev(Boolean prevStation, int currentStation) {

        if (prevStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = currentStation;
        }
    }
    public int getCurrentPrev() {
        return this.currentStation;
    }

    public void setCurrentDefault(int rangeDefault) {

        if (0 <= rangeDefault && rangeDefault <= 10) {
            this.rangeDefault = 10;
        } else {
            this.rangeDefault = 100;
        }
    }
    public int getCurrentDefault() {
        return rangeDefault;
    }

    public void setCurrentRange(int range) {
        if (range == 5) {
            this.rangeDefault = 5;
        } else {
            this.rangeDefault = 0;
        }
    }
    public int getCurrentRange() {
        return rangeDefault;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            this.currentVolume = 0;
        }

        if (currentVolume > 100) {
            this.currentVolume = 100;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolumeNext(Boolean nextVolume, int currentVolume) {

        if (nextVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = currentVolume;
        }
    }
    public int getVolumeNext() {
        return this.currentVolume;
    }

    public void setVolumePrev(Boolean prevStation, int currentVolume) {

        if (prevStation) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = currentVolume;
        }
    }
    public int getVolumePrev() {
        return this.currentVolume;
    }
}