package ru.netology.domain.contructor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextCurrentStationTestNormalStation() {
        Radio radio = new Radio(8,1,4,100,0,66 );
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderStation() {
        Radio radio = new Radio (10,0,12,100,0,1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation() {
        Radio radio = new Radio (10,0,5,100,0,55);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation() {
        Radio radio = new Radio (10,5,4,100,0,13);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestNormalStation() {
        Radio radio = new Radio (10,0,5,100,0,0);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxStation() {
        Radio radio = new Radio (10,0,12,100,0,6);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUnderMinStation() {
        Radio radio = new Radio (10,0,-2,100,0,88);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() {
        Radio radio = new Radio (10,0,1,100,0,59);
        assertEquals(60, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {
        Radio radio = new Radio (10,0,1,100,0,155);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() {
        Radio radio = new Radio (10,0,1,100,0,56);

        assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
        Radio radio = new Radio (10,0,1,100,0,-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStationTest() {
        Radio radio = new Radio (10,0,12,100,0,1);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void setMinStationTest() {
        Radio radio = new Radio (10,0,-1,100,0,1);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setCurrentStationTestOverMaxStation() {
        Radio radio = new Radio (10,0,12,100,0,1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() {
        Radio radio = new Radio (10,0,-2,100,0,1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolumeTest() {
        Radio radio = new Radio (10,0,1,100,0,111);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest() {
        Radio radio = new Radio (10,0,1,100,0,-8);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        Radio radio = new Radio (10,0,1,100,0,101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
        Radio radio = new Radio (10,0,1,100,0,-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}