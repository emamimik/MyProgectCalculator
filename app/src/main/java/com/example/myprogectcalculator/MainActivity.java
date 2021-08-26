package com.example.myprogectcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText calculation;
    private EditText result;
    private String calculations;
    private String results;
    private boolean isOperatorTriggered;
    private String operator;
    private List<String> firstHolder;
    private List<String> secondHolder;
    private Button key_0;
    private Button key_1;
    private Button key_2;
    private Button key_3;
    private Button key_4;
    private Button key_5;
    private Button key_6;
    private Button key_7;
    private Button key_8;
    private Button key_9;
    private Button key_div;
    private Button key_mult;
    private Button key_minus;
    private Button key_dot;
    private Button key_eq;
    private Button key_plus;
    private Button btnAC;
    private Button btnDel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.calculations = "";
        this.results = "";
        this.isOperatorTriggered = false;
        this.firstHolder = new ArrayList<>();
        this.secondHolder = new ArrayList<>();


        this.key_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("0");
                    calculations = calculations + "0";
                } else {
                    secondHolder.add("0");
                    calculations = calculations + "0";
                }
                displayFormula(calculations);
            }
        });
        this.key_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("1");
                    calculations = calculations + "1";
                } else {
                    secondHolder.add("1");
                    calculations = calculations + "1";
                }
                displayFormula(calculations);
            }
        });
        this.key_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("2");
                    calculations = calculations + "2";
                } else {
                    secondHolder.add("2");
                    calculations = calculations + "2";
                }
                displayFormula(calculations);
            }
        });
        this.key_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("3");
                    calculations = calculations + "3";
                } else {
                    secondHolder.add("3");
                    calculations = calculations + "3";
                }
                displayFormula(calculations);
            }
        });
        this.key_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("4");
                    calculations = calculations + "4";
                } else {
                    secondHolder.add("4");
                    calculations = calculations + "4";
                }
                displayFormula(calculations);
            }
        });
        this.key_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("5");
                    calculations = calculations + "5";
                } else {
                    secondHolder.add("5");
                    calculations = calculations + "5";
                }
                displayFormula(calculations);
            }
        });
        this.key_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("6");
                    calculations = calculations + "6";
                } else {
                    secondHolder.add("6");
                    calculations = calculations + "6";
                }
                displayFormula(calculations);
            }
        });
        this.key_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("7");
                    calculations = calculations + "0";
                } else {
                    secondHolder.add("0");
                    calculations = calculations + "0";
                }
                displayFormula(calculations);
            }
        });
        this.key_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("8");
                    calculations = calculations + "8";
                } else {
                    secondHolder.add("8");
                    calculations = calculations + "8";
                }
                displayFormula(calculations);
            }
        });
        this.key_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("9");
                    calculations = calculations + "9";
                } else {
                    secondHolder.add("9");
                    calculations = calculations + "9";
                }
                displayFormula(calculations);
            }
        });
        this.key_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("0");
                    calculations = calculations + "0";
                } else {
                    secondHolder.add("0");
                    calculations = calculations + "0";
                }
                displayFormula(calculations);
            }
        });
        this.key_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculations = calculations + ".";
                displayFormula(calculations);
            }
        });

        this.key_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "/";
                    calculations = calculations + "/";
                    isOperatorTriggered = true;
                }
                displayFormula(calculations);
            }
        });

        this.key_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "*";
                    isOperatorTriggered = true;
                    calculations = calculations + "*";
                }
                displayFormula(calculations);
            }
        });

        this.key_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "-";
                    isOperatorTriggered = true;
                    calculations = calculations + "-";
                }
                displayFormula(calculations);
            }
        });

        this.key_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "+";
                    isOperatorTriggered = true;
                    calculations = calculations + "+";
                }
                displayFormula(calculations);
            }
        });

        this.key_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int finalResult = results(firstHolder, secondHolder, operator);
                results(Integer.toString(finalResult));
            }
        });

    }

    /**
     * finds all views by id
     */
    private void findByIds() {
        this.calculation = (EditText) findViewById(R.id.calculation);
        this.result = (EditText) findViewById(R.id.result);
        this.key_0 = (Button) findViewById(R.id.key_0);
        this.key_1 = (Button) findViewById(R.id.key_1);
        this.key_2 = (Button) findViewById(R.id.key_2);
        this.key_3 = (Button) findViewById(R.id.key_3);
        this.key_4 = (Button) findViewById(R.id.key_4);
        this.key_5 = (Button) findViewById(R.id.key_5);
        this.key_6 = (Button) findViewById(R.id.key_6);
        this.key_7 = (Button) findViewById(R.id.key_7);
        this.key_8 = (Button) findViewById(R.id.key_8);
        this.key_9 = (Button) findViewById(R.id.key_9);
        this.key_div = (Button) findViewById(R.id.key_div);
        this.key_plus = (Button) findViewById(R.id.key_plus);
        this.key_minus = (Button) findViewById(R.id.key_minus);
        this.key_dot = (Button) findViewById(R.id.key_dot);
        this.key_mult = (Button) findViewById(R.id.key_mult);
        this.key_eq = (Button) findViewById(R.id.key_eq);
    }

    @param
    number

    private void displayFormula(String number) {
        this.compute.setText(number);
    }

    @param
    result

    private void displayResult(String result) {
        this.result.setText(result);
    }

    private static int results(List<String> listOne, List<String> listTwo, String operator) {
        int sumFirstHolder = 0;
        int sumSecondHolder = 0;
        int result = 0;

        for (int i = 0; i < listOne.size(); i++) {
            sumFirstHolder += Integer.parseInt(listOne.get(i));
        }

        for (int i = 0; i < listTwo.size(); i++) {
            sumSecondHolder += Integer.parseInt(listTwo.get(i));
        }

        switch (operator) {
            case "+":
                result = sumFirstHolder + sumSecondHolder;
                break;
            case "-":
                result = sumFirstHolder - sumSecondHolder;
                break;
            case "*":
                result = sumFirstHolder * sumSecondHolder;
                break;
            case "/":
                result = sumFirstHolder / sumSecondHolder;
                break;
        }
        return result;
    }
}