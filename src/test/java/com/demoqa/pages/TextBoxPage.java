package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    private SelenideElement
        fullNameInput = $("#userName"),
        emailInput = $("#userEmail"),
        currentAddressInput = $("#currentAddress"),
        permanentAddressInput = $("#permanentAddress"),
        submitButton = $("#submit"),
        fullNameResult = $("#name"),
        emailResult = $("#email"),
        currentAddressResult = $("#output").$("#currentAddress"),
        permanentAddressResult = $("#output").$("#permanentAddress");

    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public TextBoxPage setFullName(String value) {
        fullNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage submit() {
        submitButton.click();
        return this;
    }

    public TextBoxPage checkName(String value) {
        fullNameResult.shouldHave(Condition.text(value));
        return this;
    }

    public TextBoxPage checkEmail(String value) {
        emailResult.shouldHave(Condition.text(value));
        return this;
    }

    public TextBoxPage checkCurrentAddress(String value) {
        currentAddressResult.shouldHave(Condition.text(value));
        return this;
    }

    public TextBoxPage checkPermanentAddress(String value) {
        permanentAddressResult.shouldHave(Condition.text(value));
        return this;
    }
}
