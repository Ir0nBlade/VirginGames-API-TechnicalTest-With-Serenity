package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

/**
 * @author Vimal Vithalpura
 * @project VirginGames-API-TechnicalTest-With-Serenity
 * @created 16/01/2022
 */
public class VirginGamesSteps {

    // Step for Getting all the games information and parsing text into JSON format
    @Step("Getting all Games information")
    public ValidatableResponse getAllGamesInfo() {
        return SerenityRest.rest()
                .given()
                .log()
                .all()
                .when()
                .get(EndPoints.GET_ALL_BINGO)
                .then().log().ifValidationFails()
                .parser("text/plain", Parser.JSON); // Converting String to JSON format
    }
}
