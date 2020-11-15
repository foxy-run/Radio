package ru.netology.domain.contructor;

public class Radio {
    private int maxStation = 14;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int maxStation, int minStation, int currentStation, int maxVolume, int minVolume, int currentVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }
    public Radio() {
    }

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }

    public Radio(int maxVolume, int minVolume, int currentVolume) {
        this.maxVolume = maxVolume;
        this.minStation = minStation;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;;
    }

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

      }

