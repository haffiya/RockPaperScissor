package com.example.haffiya.rockpaperscissor;

import android.view.View;


public class Game implements View.OnClickListener {


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int rand = (int) (Math.random() * 3 + 1); // get a random number form
        MainActivity.count++;
        switch (rand) {
            /**     * rand = 1 means computer is Rock,      * 2 represents Paper,      * 3 represents scissors     */
            case 1:
                MainActivity.imgView.setImageResource(R.drawable.rock);
                //computer choose Rock
                switch (v.getId()) {
                    case R.id.btnRock:   //player choose Rock
                        MainActivity.result_tv.setText("Result: " + "Tied!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                    case R.id.btnPaper:  //player choose Paper
                        MainActivity.result_tv.setText("You " + "Won!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                    case R.id.btnScissor:  //player choose Scissors
                        MainActivity.result_tv.setText("You " + "Lose!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                }
                break;
            case 2:
                MainActivity.imgView.setImageResource(R.drawable.paper);  //computer choose Paper
                switch (v.getId()) {
                    case R.id.btnRock:
                        MainActivity.result_tv.setText("You " + "Lose!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                    case R.id.btnPaper:
                        MainActivity.result_tv.setText("Result: " + "Tie!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                    case R.id.btnScissor:
                        MainActivity.result_tv.setText("You " + "Won!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                }
                break;

            case 3:
                MainActivity.imgView.setImageResource(R.drawable.scissor);  //computer choose Scissors
                switch (v.getId()) {
                    case R.id.btnRock:
                        MainActivity.result_tv.setText("You " + "Won!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                    case R.id.btnPaper:
                        MainActivity.result_tv.setText("You " + "Lose!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;
                    case R.id.btnScissor:
                        MainActivity.result_tv.setText("Result: " + "Tie!");
                        MainActivity.count_tv.setText("Round: " + MainActivity.count);
                        break;

                }
                break;
        }
    }
}