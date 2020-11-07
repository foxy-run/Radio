package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextCurrentStationTestNormalStation() {
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.nextCurrentStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderStation() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.prevCurrentStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestNormalStation() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxStation() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUndereMinStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.prevCurrentVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStationTest() {
        radio.setMaxStation(9);
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void setMinStationTest() {
        radio.setMinStation(0);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setCurrentStationTestOverMaxStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        radio.setCurrentStation(60);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        radio.setCurrentStation(-1);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolumeTest() {
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(60);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(-1);
        assertEquals(7, radio.getCurrentVolume());
    }

}