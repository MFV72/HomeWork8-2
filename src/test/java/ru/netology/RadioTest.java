package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {"'5','6'",
                    "'8','9'",
                    "'9','0'",
                    "'0','1'"},
            delimiter = ','
    )
    void shouldIncreaseStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setStation(currentStation);
        radio.increaseStation();
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','4'",
                    "'1','0'",
                    "'0','9'",
                    "'9','8'"},
            delimiter = ','
    )
    void shouldDecreaseStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setStation(currentStation);
        radio.decreaseStation();
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','6'",
                    "'9','10'",
                    "'10','10'",
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
                    "'10','10'",
                    "'11','0'"}, delimiter = ','
    )
    void shouldSetVolume(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(newVolume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'5','5'",
                    "'0', '0'",
                    "'-1','0'",
                    "'9','9'",
                    "'10','0'"}, delimiter = ','
    )
    void shouldSetStation(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStation);
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }


}