package com.demoqa.utils;


public class RandomData {
    RandomMethods rndMtd = new RandomMethods();

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
        city = rndMtd.getRandomCity(state);


}
