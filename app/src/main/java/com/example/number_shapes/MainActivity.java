package com.example.number_shapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{
        int number;
        public boolean isSquare(){
            double squareroot= Math.sqrt(number);
            if(squareroot==Math.floor(squareroot)){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean isTriangular(){
            int x=1;
            int triangularnumber=1;
            while(triangularnumber<number){
                x++;
                triangularnumber=triangularnumber+x;
            }
            if(triangularnumber==number){
                return true;
            }
            else{
                return false;
            }
        }

    }


    public void testNumber(View view){
        EditText userNumber=(EditText) findViewById(R.id.editText);
        if(userNumber.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else{
        Number mynumber= new Number();

        mynumber.number=Integer.parseInt(userNumber.getText().toString());
        if(mynumber.isSquare()){
            if(mynumber.isTriangular()){
                Toast.makeText(this, "the number is both square and triangular", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "the number is square", Toast.LENGTH_SHORT).show();
            }

        }
        else {
            if(mynumber.isTriangular()){
                Toast.makeText(this, "the number is triangular", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "the number is nither square nor triangular", Toast.LENGTH_SHORT).show();
            }
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
