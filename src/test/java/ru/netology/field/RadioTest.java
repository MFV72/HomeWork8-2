package ru.netology.field;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {"'0','0'",
                    "'1','1'",
                    "'9','9'",
                    "'100','100'"},
            delimiter = ','
    )
    void shouldToCreate(int quantityStation, int expected) {
        Radio radio = new Radio(quantityStation);
        int actual = radio.getQuantityStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldToCreateDefault() {
        Radio radio = new Radio();
        int actual = radio.getQuantityStation();
        assertEquals(10, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'100','5','6'",
                    "'100','8','9'",
                    "'100','99','0'",
                    "'100','0','1'"},
            delimiter = ','
    )
    void shouldIncreaseStation(int quantityStation, int currentStation, int expected) {
        Radio radio = new Radio(quantityStation);
        radio.setStation(currentStation);
        radio.increaseStation();
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'100','5','4'",
                    "'100','1','0'",
                    "'100','0','99'",
                    "'100','9','8'"},
            delimiter = ','
    )
    void shouldDecreaseStation(int quantityStation, int currentStation, int expected) {
        Radio radio = new Radio(quantityStation);
        radio.setStation(currentStation);
        radio.decreaseStation();
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','6'",
                    "'9','10'",
                    "'100','100'",
                    "'0','1'"},
            delimiter = ','
    )
    void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','4'",
                    "'1','0'",
                    "'0','0'",
                    "'10','9'"},
            delimiter = ','
    )
    void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','5'",
                    "'0', '0'",
                    "'-1','0'",
                    "'100','100'",
                    "'101','0'"}, delimiter = ','
    )
    void shouldSetVolume(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(newVolume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'100','5','5'",
                    "'100','0', '0'",
                    "'100','-1','0'",
                    "'100','99','99'",
                    "'100','100','0'"}, delimiter = ','
    )
    void shouldSetStation(int quantityStation, int newStation, int expected) {
        Radio radio = new Radio(quantityStation);
        radio.setStation(newStation);
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'5','5'",
                    "'0', '0'",
                    "'-1','0'",
                    "'100','100'"
            }, delimiter = ','
    )
    void shouldSetQuantityStationOnCreate(int quantityStation, int expected) {
        Radio radio = new Radio(quantityStation);
        int actual = radio.getQuantityStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','5'",
                    "'0', '0'",
                    "'-1','0'",
                    "'100','100'"
            }, delimiter = ','
    )
    void shouldSetQuantityStation(int quantityStation, int expected) {
        Radio radio = new Radio();
        radio.setQuantityStation(quantityStation);
        int actual = radio.getQuantityStation();
        assertEquals(expected, actual);
    }
}