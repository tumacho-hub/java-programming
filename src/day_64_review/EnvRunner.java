package day_64_review;

import personal_Training_Starts_7_20_2021.Switch;

import static day_64_review.Environment.*;

public class EnvRunner {
    public static void setupEnvironment(Environment environment) {
        switch (environment) {
            case QA:
                System.out.println("Executing tests in QA environment");
                break;
            case DEV:
                System.out.println("Executing tests in DEV environment");
                break;
            case PROD:
                System.out.println("Executing tests in PROD environment");
                break;
            case STAGING:
                System.out.println("Executing tests STAGING environment");
                break;

        }

    }

    public static void main(String[] args){
            System.out.println(QA);
            System.out.println(Environment.DEV);
            Environment env = QA;
            System.out.println("env = " + env);


        setupEnvironment(QA);

    }
}




