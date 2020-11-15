package ru.netology.domain.contructor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
        public void shouldCreate() {
        Radio radio = new Radio(8,0,7,100,0,89);

}
    @Test
    public void shouldCreate1() {
        Radio radio = new Radio();

    }
    @Test
    public void shouldCreate2() {
        Radio radio = new Radio(7, 8 );

    }
    @Test
    public void shouldCreate3() {
        Radio radio = new Radio(77,2,58);

    }
    @Test
    public void shouldCreate4() {
        Radio radio = new Radio();

    }
}