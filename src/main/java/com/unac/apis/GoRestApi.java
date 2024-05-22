package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "3fcef876c1e4b509e1e2fbabda831ed04c30269ab67400bab9401456dcbc8831";
    private static String pathName = "name";
    private static String pathEmail = "email";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionGetToken(String endPoint, String idUser){
        RestInteractions.executionGetToken(endPoint, idUser, TOKEN);
    }

    public static void executionPut(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPut(endPoint, idUser, TOKEN, name, email);
    }

    public static void validateResponse(Integer statusCode, String name, String email) {
        RestInteractions.validateCode(statusCode);
        RestInteractions.validateDataResponse(name, pathName);
        RestInteractions.validateDataResponse(email, pathEmail);
    }

    public static void validateResponse(Integer statusCode, String name) {
    }
}