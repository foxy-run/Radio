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
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(14);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation() {
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.prevCurrentStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation() {
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(14, radio.getCurrentStation());
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
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(15);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUndereMinStation() {
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() {
        radio.setMaxVolume(14);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {
        radio.setCurrentVolume(100);
        radio.nextCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() {
        radio.setCurrentVolume(55);
        radio.prevCurrentVolume();
        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStationTest() {
        radio.setMaxStation(14);
        assertEquals(14, radio.getMaxStation());
    }

    @Test
    public void setMinStationTest() {
        radio.setMinStation(0);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setCurrentStationTestOverMaxStation() {
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(13);
        radio.setCurrentStation(25);
        assertEquals(13, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() {
        radio.setMaxStation(14);
        radio.setMinStation(0);
        radio.setCurrentStation(13);
        radio.setCurrentStation(-1);
        assertEquals(13, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolumeTest() {
        radio.setMaxVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        radio.setCurrentVolume(81);
        radio.setCurrentVolume(160);
        assertEquals(81, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {

        radio.setCurrentVolume(53);
        radio.setCurrentVolume(-12);
        assertEquals(53, radio.getCurrentVolume());
    }

}