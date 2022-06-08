package ru.netology.radiostation;

public class RadioSettings {

    private int currentStation;

    public void setNextStation(int[] stations) {

        int currentStation;
        int lastStation = 9;

        for (currentStation = 0; currentStation < stations.length; currentStation++) {

            currentStation = currentStation + 1;

            if (currentStation > 8) {

                lastStation = 0;
            }
            this.currentStation = lastStation;
        }
    }

    public int getNextStation() {

        return this.currentStation;
    }

    public void setPrevStation(int[] stations) {

        int currentStation;
        int lastStation = 0;

        for (currentStation = 0; currentStation < stations.length; currentStation++) {

            if (currentStation == 0) {

                lastStation = 9;
            }
            this.currentStation = lastStation;
        }
    }

    public int getPrevStation() {

        return currentStation;
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

    private int currentVolume;

    public void setIncreaseVolume(int levelVolume) {

        if (levelVolume < 10) {

            currentVolume = levelVolume + 1;
        }

        if (levelVolume == 10) {

            currentVolume = levelVolume;
        }
    }

    public int getIncreaseVolume() {

        return currentVolume;
    }

    public void setDecreaseVolume(int levelVolume) {

        if (levelVolume < 10) {

            currentVolume = levelVolume - 1;
        }

        if (levelVolume == 0) {

            currentVolume = levelVolume;
        }
    }

    public int getDecreaseVolume() {

        return currentVolume;
    }

}
