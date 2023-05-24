package de.ait;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import javax.swing.event.ListDataEvent;

import static org.junit.jupiter.api.Assertions.*;
import static de.ait.Main.isValidLogin; // импортировали метод, теперь можем не указывать Main в тесте

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MainTest {


    @Test
    @DisplayName("isEven(3) -> false")
    void isEven_3_FalseReturned() {
        assertFalse(Main.isEven(3));
    }
    @ParameterizedTest
    @DisplayName("isEven(<even>) -> true")
    @ValueSource(ints = {2, 6, 8, 64, 122, 800})
    public void isEven_even_return_TrueReturned(int number){
       assertTrue(Main.isEven(number));
    }
    @ParameterizedTest
    @DisplayName("isEven(<odd>) -> true")
    @ValueSource(ints = {3, 11, 19, 25, 97, 117717})
    public void isEven_odd_return_FalseReturned(int number){
        assertFalse(Main.isEven(number));
    }
        @ParameterizedTest
        @DisplayName("isValid(<trueLogin>) -> true")
        @ValueSource(strings = {"Pipeline@09", "@index30", "bestofthe@", "2873@61des"})
        public void isValidLogin_true_return_TrueReturned(String login){
            assertTrue(isValidLogin(login));
        }
        @ParameterizedTest
        @DisplayName("isValid(<falseLogin>) -> false")
        @ValueSource(strings = {"pipe09", "jkjdkfls", "08361r5383", "skjd@"})
        public void isValidLogin_false_return_FalseReturned(String login){
            assertFalse(isValidLogin(login));
        }
        @Nested
        @DisplayName("getRectangleArea tests")
        class ForGetRectangleArea{
        @ParameterizedTest
            @CsvSource({
                    "4, 5, 'Прямоугольник с площадью 20'",
                    "10, 10, 'Прямоугольник с площадью 100'",
                    "2, 3, 'Прямоугольник с площадью 6'"
            })
            public void getRectangleArea_test1(int a, int b, String message){
            assertEquals(
                    Main.getRectangleArea(a, b),
                    message
            );
        }
        }
    }
