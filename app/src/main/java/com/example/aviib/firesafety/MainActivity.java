package com.example.aviib.firesafety;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;

    Button answer1, answer2;

    TextView score, question;


    private questions mQuestions = new questions();
    private String mAnswer;
    private int mScore;
    private int mQuestionsLength = mQuestions.mQuestions.length;



    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);


        score = (TextView) findViewById(R.id.Score);
        question = (TextView) findViewById(R.id.question);
        score.setText("Your Score is: " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.yestrim);
        final MediaPlayer no = MediaPlayer.create(this, R.raw.wrong);

        answer1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (answer1.getText() == mAnswer) {
                                               mScore++;
                                               mp.start();
                                               score.setText("Your Score is: " + mScore);
                                               updateQuestion(r.nextInt(mQuestionsLength));
                                           } else

                                           {
                                               no.start();
                                               gameOver();
                                           }


                                       }
                                   });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer) {
                    mScore++;


                    mp.start();
                    score.setText("Your Score is: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    no.start();
                    gameOver();

                }


            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainMenuActivity();
            }
        });

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstructions();
            }
        });
    }
    public void openMainMenuActivity() {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void openInstructions() {
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }







    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));


        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! You have managed to score " + mScore + " Points" )

                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                            }
                        })

                                .setNegativeButton("EXIT",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                            finish();
                                            }
                                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
}
