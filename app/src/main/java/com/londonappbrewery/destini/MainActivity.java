package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mstoryText;
    Button mbuttonTop;
    Button mbuttonBottom;
    int step;
    String prevSelection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryText = findViewById(R.id.storyTextView);
        mbuttonTop = findViewById(R.id.buttonTop);
        mbuttonBottom = findViewById(R.id.buttonBottom);
        step=1;



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (step==1){
                    mstoryText.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    step++;
                    prevSelection="Top";
                }else if(step ==2 && prevSelection=="Top"){
                    mstoryText.setText(R.string.T6_End);
                    step=4;


                }else if (step==2 && prevSelection=="Bottom"){
                    mstoryText.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    step++;

                }else if (step==3){
                    mstoryText.setText(R.string.T6_End);
                    step=4;

                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (step==1){
                    mstoryText.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBottom.setText(R.string.T2_Ans2);
                    step++;
                    prevSelection="Bottom";
                }else if (step ==2 && prevSelection=="Buttom"){
                    mstoryText.setText(R.string.T4_End);
                    step=4;

                }else if (step == 2 && prevSelection=="Top"){
                    mstoryText.setText(R.string.T5_End);
                    step=4;

                }else if (step==3){
                    mstoryText.setText(R.string.T5_End);
                    step=4;
                }

            }
        });


    }
}
