package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {

    public static String randomString(int n) {
        String generatedString = RandomStringUtils.randomAlphabetic(n);
        return generatedString;
    }
}
