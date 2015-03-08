package com.home.calc;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculateActivity extends Activity {
    
    private EditText inputText;

    private Button operPlusBtn, operMinusBtn, operDivBtn, operMulBtn;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // ~ Text Field
        inputText = (EditText) findViewById(R.id.calculate_input);
        
        //~ Number Button
        findViewById(R.id.number_0).setOnClickListener(mClickListener);
        findViewById(R.id.number_1).setOnClickListener(mClickListener);
        findViewById(R.id.number_2).setOnClickListener(mClickListener);
        findViewById(R.id.number_3).setOnClickListener(mClickListener);
        findViewById(R.id.number_4).setOnClickListener(mClickListener);
        findViewById(R.id.number_5).setOnClickListener(mClickListener);
        findViewById(R.id.number_6).setOnClickListener(mClickListener);
        findViewById(R.id.number_7).setOnClickListener(mClickListener);
        findViewById(R.id.number_8).setOnClickListener(mClickListener);
        findViewById(R.id.number_9).setOnClickListener(mClickListener);
        
        // ~ Operator Button
        operPlusBtn = (Button) findViewById(R.id.operator_plus);
        operMinusBtn = (Button) findViewById(R.id.operator_minus);
        operDivBtn = (Button) findViewById(R.id.operator_div);
        operMulBtn = (Button) findViewById(R.id.operator_mul);
    }
    
    private void setNumberForInputText(int number){
        String now = inputText.getText().toString();
        now += number;
        inputText.setText(now);
    }
    
    /**
     * Number Button Event Listener
     * */
    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.number_0:
                    setNumberForInputText(0);
                    break;
                case R.id.number_1:
                    setNumberForInputText(1);
                    break;
                case R.id.number_2:
                    setNumberForInputText(2);
                    break;
                case R.id.number_3:
                    setNumberForInputText(3);
                    break;
                case R.id.number_4:
                    setNumberForInputText(4);
                    break;
                case R.id.number_5:
                    setNumberForInputText(5);
                    break;
                case R.id.number_6:
                    setNumberForInputText(6);
                    break;
                case R.id.number_7:
                    setNumberForInputText(7);
                    break;
                case R.id.number_8:
                    setNumberForInputText(8);
                    break;
                case R.id.number_9:
                    setNumberForInputText(9);
                    break;
            }
        }
    };
}
