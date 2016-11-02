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
    private RadioButton firstCorrect;
    private RadioButton secondCorrect;
    private RadioButton thirdCorrect;
    private RadioButton fourthCorrect;
    private RadioButton fifthCorrect;
    private EditText sixthEditText;
    private EditText seventhEditText;
    private EditText eighthEditText;
    private CheckBox firstBox;
    private CheckBox secondBox;
    private CheckBox thirdBox;
    private CheckBox fourthBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstCorrect = (RadioButton) findViewById(R.id.answerOneC);
        secondCorrect = (RadioButton) findViewById(R.id.answerTwoC);
        thirdCorrect = (RadioButton) findViewById(R.id.answerThreeC);
        fourthCorrect = (RadioButton) findViewById(R.id.answerFourC);
        fifthCorrect = (RadioButton) findViewById(R.id.answerFiveC);
        sixthEditText = (EditText) findViewById(R.id.answerSixEdit);
        seventhEditText = (EditText) findViewById(R.id.answerSevenEdit);
        eighthEditText = (EditText) findViewById(R.id.answerEightEdit);
        firstBox = (CheckBox) findViewById(R.id.answerNineA);
        secondBox = (CheckBox) findViewById(R.id.answerNineB);
        thirdBox = (CheckBox) findViewById(R.id.answerNineC);
        fourthBox = (CheckBox) findViewById(R.id.answerNineD);
    }

    /**
     * This is called when the Submit button is clicked
     */
    public void quizResult(View view) {
        score = 0;
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
        fifthCorrect.setTextColor(Color.GREEN);
        if (fifthCorrect.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks if the text entered from the user is correct and adds to the score
     */
    private void sixthQuestion() {
        String sixthCorrect = sixthEditText.getText().toString().toUpperCase();
        if (sixthCorrect.equals("C") || sixthCorrect.equals("C.") || sixthCorrect.equals("SCARFACE")) {
            score += 1;
        }
    }

    /**
     * This method checks if the text entered from the user is correct and adds to the score
     */
    private void seventhQuestion() {
        String seventhCorrect = seventhEditText.getText().toString().toUpperCase();
        if (seventhCorrect.equals("D") || seventhCorrect.equals("D.") || seventhCorrect.equals("SAVING PRIVATE RYAN")) {
            score += 1;
        }
    }

    /**
     * This method checks if the text entered from the user is correct and adds to the score
     */
    private void eighthQuestion() {
        String eighthCorrect = eighthEditText.getText().toString().toUpperCase();
        if (eighthCorrect.equals("C") || eighthCorrect.equals("C.") || eighthCorrect.equals("SCENT OF A WOMAN")) {
            score += 1;
        }
    }

    /**
     * Checks which CheckBoxes are checked and adds to the score if correct
     */
    private void ninenthQuestion() {
        firstBox.setTextColor(Color.GREEN);
        secondBox.setTextColor(Color.GREEN);
        thirdBox.setTextColor(Color.GREEN);
        fourthBox.setTextColor(Color.RED);
        if (firstBox.isChecked() && secondBox.isChecked() && thirdBox.isChecked() && fourthBox.isChecked() == false) {
            score += 1;
        }


    }

}


