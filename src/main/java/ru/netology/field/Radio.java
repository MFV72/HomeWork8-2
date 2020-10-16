package ru.netology.field;

public class Radio {
    private int station;
    private int volume;
    private int quantityStation;

    public Radio(int quantityStation) {
        if (quantityStation >= 0) {
            this.quantityStation = quantityStation;
        } else this.quantityStation = 0;
    }

    public Radio() {
        this.quantityStation = 10;
    }

    public void increaseStation() {
        if (station < (quantityStation - 1)) {
            station++;
        } else {
            station = 0;
        }
    }

       public void decreaseStation() {
        if (station>0) {
            station--;
        } else {
            station = (quantityStation - 1);
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if ((volume < 0) | (volume >100)) {
           return;
        }
        this.volume = volume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if ((station < 0) | (station > (quantityStation - 1))) {
            return;
        }
        this.station = station;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        if (quantityStation >= 0) {
            this.quantityStation = quantityStation;
        } else this.quantityStation = 0;
    }
}
