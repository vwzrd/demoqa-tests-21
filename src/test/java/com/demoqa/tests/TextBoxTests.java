package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase{

    @Test
    void fillTextBox() {

        TextBoxPage textBox = new TextBoxPage();

        //Заполняем поля
        textBox.openPage()
                .setFullName("Ivan Ivanov")
                .setEmail("ivanov@mail.com")
                .setCurrentAddress("Moscow, Pushkina 322")
                .setPermanentAddress("Vologda, Zayceva 10")
                .submit();

        //Проверяем результат
        textBox.checkName("Ivan Ivanov")
                .checkEmail("ivanov@mail.com")
                .checkCurrentAddress("Moscow, Pushkina 322")
                .checkPermanentAddress("Vologda, Zayceva 10");
    }
}
