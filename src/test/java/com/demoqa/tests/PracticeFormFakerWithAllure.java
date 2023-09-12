package com.demoqa.tests;

import com.demoqa.pages.RegistrationFormPage;
import com.demoqa.utils.RandomData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PracticeFormFakerWithAllure extends RemoteTestBase {

    @Test
    @Tag("remote")
    @DisplayName("Проверка формы регистрации")
    void fillPracticeForm() {

        RegistrationFormPage registrationPage = new RegistrationFormPage();
        RandomData data = new RandomData();

        step("Открываем страницу с формой регистрации", () -> {
            registrationPage.openPage();
        });

        step("Вводим значения в поля", () -> {
            registrationPage.setFirstName(data.firstName)
                    .setLastName(data.lastName)
                    .setEmail(data.email)
                    .setGender(data.gender)
                    .setNumber(data.phoneNumber)
                    .setBirthday(data.day, data.month, data.year)
                    .setSubject(data.subject)
                    .setHobby(data.hobby)
                    .setPhoto(data.photo)
                    .setAddress(data.address)
                    .setCity(data.state, data.city)
                    .submit();
        });

        step("Проверяем открывшуюся табличку", () -> {
            registrationPage.checkResultsTableVisible()
                    .checkResult("Student Name", data.firstName)
                    .checkResult("Student Email", data.email)
                    .checkResult("Gender", data.gender)
                    .checkResult("Mobile", data.phoneNumber)
                    .checkResult("Date of Birth", String.format("%s %s,%s", data.day, data.month, data.year))
                    .checkResult("Subjects", data.subject)
                    .checkResult("Hobbies", data.hobby)
                    .checkResult("Picture", data.photo)
                    .checkResult("Address", data.address)
                    .checkResult("State and City", data.state + " " + data.city);
        });
        }
    }