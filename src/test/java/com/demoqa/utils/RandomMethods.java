package com.demoqa.utils;


import com.github.javafaker.Faker;


public class RandomMethods {

    Faker faker = new Faker();
    DataArrays arrays = new DataArrays();


    public int getRandomInt(int min, int max) {

        return faker.number().numberBetween(min, max);
    }

    public String getRandomItemFromArray(String[] array) {

        return faker.options().option(array);
    }

    /* public String[] removeSelectedValueFromArray(String[] array, String value) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove(value);
        String[] newArray = list.toArray(new String[0]);

        return newArray;
    }*/



    public String getRandomGender() {

        return getRandomItemFromArray(arrays.gendersArray);
    }

    public String getRandomLastName() {

        return faker.name().lastName();
    }

    public String getRandomFirstName() {

        return faker.name().firstName();
    }


    public String getRandomEmail() {

        return faker.internet().emailAddress();
    }

    public String getRandomPhoneNumber() {

        return faker.phoneNumber().subscriberNumber(10).toString();
    }

    public String getRandomDay() {

        return faker.number().numberBetween(1, 28) + "";
    }

    public String getRandomYear() {

        return faker.number().numberBetween(1990, 2010) + "";
    }

    public String getRandomMonth() {

        return getRandomItemFromArray(arrays.monthsArray);
    }
    public String getRandomAddress() {

        return faker.address().fullAddress();
    }

    public String getRandomSubject() {

        return getRandomItemFromArray(arrays.subjectsArray);
    }


    public String getRandomHobby() {

        return getRandomItemFromArray(arrays.hobbiesArray);
    }

    public String getRandomState() {
        return getRandomItemFromArray(arrays.stateArray);
    }

}
