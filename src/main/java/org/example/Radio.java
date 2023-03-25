package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void increaseVolume() {
        if (volumeLevel == maxVolumeLevel) {
            return;
        }
        this.volumeLevel++;
    }

    public void reduceVolume() {
        if (volumeLevel == minVolumeLevel) {
            return;
        }
        this.volumeLevel--;
    }


    private int volumeLevel;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else currentStation = maxStation;
    }

    public void add() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 0;
    }

    public void reduce() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}