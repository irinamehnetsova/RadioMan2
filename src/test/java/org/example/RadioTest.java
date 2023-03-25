package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void switchToOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNotExistentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void putZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnNextForward() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.next();
        int expected = 3;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFromMaxForward() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchOneForward() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnPrevious() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFromScratchBack() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchBack() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.add();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addToMaxOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.add();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addZeroOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.add();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduce();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMinByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduce();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceSoundByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduce();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void notValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSpecifiedStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMaxStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMinStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNegativeStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNotValidStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMaxSound() {
        Radio radio = new Radio();
        radio.setVolumeLevel(100);
        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMinSound() {
        Radio radio = new Radio();
        radio.setVolumeLevel(0);
        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSpecifiedSound() {
        Radio radio = new Radio();
        radio.setVolumeLevel(70);
        int expected = 70;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchSoundZeroToFirst() {
        Radio radio = new Radio();
        radio.setVolumeLevel(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchSoundForwardOne() {
        Radio radio = new Radio();
        radio.setVolumeLevel(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchSoundMax() {
        Radio radio = new Radio();
        radio.setVolumeLevel(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void removeMaxSound() {
        Radio radio = new Radio();
        radio.setVolumeLevel(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void removeMinSound() {
        Radio radio = new Radio();
        radio.setVolumeLevel(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

}