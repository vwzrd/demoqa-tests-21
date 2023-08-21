package com.demoqa.utils;


import com.github.javafaker.Faker;



public class RandomMethods {

    Faker faker = new Faker();

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
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

        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomDay() {

        String day = faker.number().numberBetween(1, 28) + "";
        if (Integer.valueOf(day) < 10) {
            return "0" + day;
        }
        return day;

    }

    public String getRandomYear() {

        return faker.number().numberBetween(1990, 2010) + "";
    }

    public String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "December"};
        return faker.options().option(months);
    }
    public String getRandomAddress() {

        return faker.address().fullAddress();
    }

    public String getRandomSubject() {
        String[] subjects = {"English", "Chemistry", "Computer Science", "Commerce",
                "Economics", "Social Studies", "Maths", "Accounting", "Arts",
                "Physics", "History, Civics", "Hindi", "Biology"};
        return faker.options().option(subjects);
    }

    public String getRandomHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public String getRandomCity(String state) {
        switch (state) {
            case "NCR": {;
                String[] ncr = {"Delhi", "Gurgaon","Noida"};
                return faker.options().option(ncr);
            }
            case "Uttar Pradesh": {
                String[] uttarPradesh = {"Agra","Lucknow", "Merrut"};
                return faker.options().option(uttarPradesh);
            }
            case "Haryana": {
                String[] haryana = {"Karnal", "Panipat"};
                return faker.options().option(haryana);
            }
            case "Rajasthan": {
                String[] rajasthan = {"Jaipur", "Jaiselmer"};
                return faker.options().option(rajasthan);
            }
        }
        return null;
    }

}
