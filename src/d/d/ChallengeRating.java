/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.d;

/**
 *
 * @author Joshua
 */
public class ChallengeRating{
    public int challengeRating;
    public void ChallengeRating(){
        challengeRating = 0;
    }
    public void ChallengeRatingZeroToFour(){
        challengeRating = 0;
    }
    public void ChallengeRatingFiveToTen(){
        challengeRating = 1;
    }
    public void ChallengeRatingElevenToSixteen(){
        challengeRating = 2;
    }
    public void ChallengeRatingSeventeenPlus(){
        challengeRating = 3;
    }
    public int getChallengeRating(){
        return challengeRating;
    }
}
