package com.example.vgeorgopoulos.quiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This is called when the Submit button is clicked
     */
    public void quizResult(View view) {
        firstQuestion();
        secondQuestion();
        thirdQuestion();
        fourthQuestion();
        fifthQuestion();
        sixthQuestion();
        seventhQuestion();
        eighthQuestion();
        ninenthQuestion();
        String toastMessage = String.format("Your final Score is: %d/9", score);
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method checks if the correct RadioButton is checked and adds to the score,
     * also turns the colour of the text for the correct Answer to Green.
     */
    private void firstQuestion() {
        RadioButton firstCorrect = (RadioButton) findViewById(R.id.answerOneC);
        firstCorrect.setTextColor(Color.GREEN);
        if (firstCorrect.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks if the correct RadioButton is checked and adds to the score,
     * also turns the colour of the text for the correct Answer to Green.
     */
    private void secondQuestion() {
        RadioButton secondCorrect = (RadioButton) findViewById(R.id.answerTwoC);
        secondCorrect.setTextColor(Color.GREEN);
        if (secondCorrect.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks if the correct RadioButton is checked and adds to the score,
     * also turns the colour of the text for the correct Answer to Green.
     */
    private void thirdQuestion() {
        RadioButton thirdCorrect = (RadioButton) findViewById(R.id.answerThreeC);
        thirdCorrect.setTextColor(Color.GREEN);
        if (thirdCorrect.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks if the correct RadioButton is checked and adds to the score,
     * also turns the colour of the text for the correct Answer to Green.
     */
    private void fourthQuestion() {
        RadioButton fourthCorrect = (RadioButton) findViewById(R.id.answerFourC);
        fourthCorrect.setTextColor(Color.GREEN);
        if (fourthCorrect.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks if the correct RadioButton is checked and adds to the score,
     * also turns the colour of the text for the correct Answer to Green.
     */
    private void fifthQuestion() {
        RadioButton fifthCorrect = (RadioButton) findViewById(R.id.answerFiveC);
        fifthCorrect.setTextColor(Color.GREEN);
        if (fifthCorrect.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks if the text entered from the user is correct and adds to the score
     */
    private void sixthQuestion() {
        EditText sixthEditText = (EditText) findViewById(R.id.answerSixEdit);
        String sixthCorrect = sixthEditText.getText().toString().toUpperCase();
        if (sixthCorrect.equals("C") || sixthCorrect.equals("C.") || sixthCorrect.equals("SCARFACE")) {
            score += 1;
        }
    }

    /**
     * This method checks if the text entered from the user is correct and adds to the score
     */
    private void seventhQuestion() {
        EditText seventhEditText = (EditText) findViewById(R.id.answerSevenEdit);
        String seventhCorrect = seventhEditText.getText().toString().toUpperCase();
        if (seventhCorrect.equals("D") || seventhCorrect.equals("D.") || seventhCorrect.equals("SAVING PRIVATE RYAN")) {
            score += 1;
        }
    }

    /**
     * This method checks if the text entered from the user is correct and adds to the score
     */
    private void eighthQuestion() {
        EditText eighthEditText = (EditText) findViewById(R.id.answerEightEdit);
        String eighthCorrect = eighthEditText.getText().toString().toUpperCase();
        if (eighthCorrect.equals("C") || eighthCorrect.equals("C.") || eighthCorrect.equals("SCENT OF A WOMAN")) {
            score += 1;
        }
    }

    /**
     * Checks which CheckBoxes are checked and adds to the score if correct
     */
    private void ninenthQuestion() {
        CheckBox firstBox = (CheckBox) findViewById(R.id.answerNineA);
        CheckBox secondBox = (CheckBox) findViewById(R.id.answerNineB);
        CheckBox thirdBox = (CheckBox) findViewById(R.id.answerNineC);
        CheckBox fourthBox = (CheckBox) findViewById(R.id.answerNineD);
        firstBox.setTextColor(Color.GREEN);
        secondBox.setTextColor(Color.GREEN);
        thirdBox.setTextColor(Color.GREEN);
        fourthBox.setTextColor(Color.RED);
        if (firstBox.isChecked() && secondBox.isChecked() && thirdBox.isChecked() && thirdBox.isChecked() == false) {

            score += 1;
        }


    }

}


