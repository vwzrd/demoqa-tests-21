package com.demoqa.utils;


import com.github.javafaker.Faker;

public class RandomData {
    RandomMethods rndMtd = new RandomMethods();
    Faker faker = new Faker();
    public String firstName = rndMtd.getRandomFirstName(),
        lastName = rndMtd.getRandomLastName(),
        email = rndMtd.getRandomEmail(),
        gender = rndMtd.getRandomGender(),
        phoneNumber = rndMtd.getRandomPhoneNumber(),
        day = rndMtd.getRandomDay(),
        month = rndMtd.getRandomMonth(),
        year = rndMtd.getRandomYear(),
        subject = rndMtd.getRandomSubject(),
        hobby = rndMtd.getRandomHobby(),
        photo = "photo.jpg",
        address = rndMtd.getRandomAddress(),
        state = rndMtd.getRandomState(),
        city = getRandomCity(state);

    public static String getRandomCity(String state) {
        switch (state) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return new Faker().options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return new Faker().options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return new Faker().options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return new Faker().options().option(city);
            }
        }
        return null;
    }
}
