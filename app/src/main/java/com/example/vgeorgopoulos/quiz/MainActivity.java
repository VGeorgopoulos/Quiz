package com.example.vgeorgopoulos.quiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private RadioButton firstCorrect = (RadioButton) findViewById(R.id.answerOneC);
    private RadioButton secondCorrect = (RadioButton) findViewById(R.id.answerTwoB);
    private RadioButton thirdCorrect = (RadioButton) findViewById(R.id.answerThreeD);
    private RadioButton fourthCorrect = (RadioButton) findViewById(R.id.answerFourB);
    private RadioButton fifthCorrect = (RadioButton) findViewById(R.id.answerFiveC);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizResult(View view) {
        showCorrect();
        calculateScore();
    }

    private void showCorrect() {
        firstCorrect.setTextColor(Color.GREEN);
        secondCorrect.setTextColor(Color.GREEN);
        thirdCorrect.setTextColor(Color.GREEN);
        fourthCorrect.setTextColor(Color.GREEN);
        fifthCorrect.setTextColor(Color.GREEN);
    }

    private void calculateScore() {
        if (firstCorrect.isChecked()) {
            score += 1;
        }
        if (secondCorrect.isChecked()) {
            score += 1;
        }
        if (thirdCorrect.isChecked()) {
            score += 1;
        }
        if (fourthCorrect.isChecked()) {
            score += 1;
        }
        if (fifthCorrect.isChecked()) {
            score += 1;
        }

    }
}


