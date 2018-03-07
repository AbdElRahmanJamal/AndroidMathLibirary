package storageinandroid.example.com.mathlibirary;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by AbdEl-Rahman on 3/6/2018.
 */

public class MathOperationLayout extends LinearLayout implements HandleButtonClick {
    public static EditText num1;
    public static EditText num2;
    public static TextView result;
    public static Button operationButton;
    private View view;

    public MathOperationLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initLayout(context);
    }

    public void initLayout(Context context) {
        view = View.inflate(context, R.layout.activity_math, this);
        num1 = (EditText) view.findViewById(R.id.editText);
        num2 = (EditText) view.findViewById(R.id.editText2);
        result = (TextView) view.findViewById(R.id.textView);
        operationButton = (Button) view.findViewById(R.id.button);
    }

    @Override
    public void onButtonClick(View view) {

    }
}
