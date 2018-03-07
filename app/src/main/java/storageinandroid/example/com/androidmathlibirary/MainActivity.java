package storageinandroid.example.com.androidmathlibirary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import storageinandroid.example.com.mathlibirary.HandleButtonClick;
import storageinandroid.example.com.mathlibirary.MathOperationClass;
import storageinandroid.example.com.mathlibirary.MathOperationLayout;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener ,HandleButtonClick{
    String[] operations = {"Add", "Sub", "Multi", "Div"};
    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, operations);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        operation = operations[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onButtonClick(View view) {
        if (!MathOperationLayout.num1.getText().toString().equals("") ||
                !MathOperationLayout.num2.getText().toString().equals("")) {
            int num1 = Integer.parseInt(MathOperationLayout.num1.getText().toString());
            int num2 = Integer.parseInt(MathOperationLayout.num2.getText().toString());

            switch (operation) {
                case "Add":
                    MathOperationLayout.result.setText("The Result Is : " + MathOperationClass.add(num1, num2));
                    break;
                case "Sub":
                    MathOperationLayout.result.setText("The Result Is : " + MathOperationClass.sub(num1, num2));
                    break;
                case "Multi":
                    MathOperationLayout.result.setText("The Result Is : " + MathOperationClass.multi(num1, num2));
                    break;
                case "Div":
                    MathOperationLayout.result.setText("The Result Is : " + MathOperationClass.div(num1, num2));
                    break;
            }
        } else {
            MathOperationLayout.result.setText(" InValid Numbers ");
        }

    }
}
