package com.sample.tokenization;

public class TestTokenDetoken {

    public static void main(String[] args) {
        TokenDetoken tokenDetoken = new TokenDetoken();
        //String tokenizedData = tokenDetoken.tokenize("1234-5678-9999-2345");
        String sensitiveData = "1234-5574-8889-3433";
        //String tokenizedData = tokenDetoken.tokenize("10/10/1974");
        String tokenizedData = tokenDetoken.tokenize(sensitiveData);

        System.out.println("Sensitive Data : --> "+ sensitiveData + "  Tokenized to : ---> " + tokenizedData);

        String detokenizedData = tokenDetoken.detokenize(tokenizedData);
        System.out.println("Token : --> "+ tokenizedData + "       DeTokenized to ---> : " + detokenizedData);

        //System.out.println("Detokenized data :" + detokenizedData);


    }
}
