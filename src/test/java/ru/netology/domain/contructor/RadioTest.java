package ru.netology.domain.contructor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void nextCurrentStationTestNormalStation() {
        radio.setCurrentStation(5);
        radio.nextCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderStation() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation() {
        radio.setCurrentStation(4);
        radio.prevCurrentStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation() {
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestNormalStation() {
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxStation() {
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(15);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUnderMinStation() {
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() {
        radio.setCurrentVolume(89);
        radio.nextCurrentVolume();
        assertEquals(90, radio.getCurrentVolume());
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
        radio.setCurrentStation(13);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
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
        radio.setCurrentVolume(160);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
        radio.setCurrentVolume(-12);
        radio.setCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}