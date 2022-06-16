package im.tobe.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button showBtn;
    private TextView nameTxt;
    private EditText nameInput;
    private int salary = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showBtn = findViewById(R.id.showNameBtn);
        nameTxt = findViewById(R.id.nameTxt);
        nameInput = findViewById(R.id.nameInput);

        /**
         * while not using lambda:
         * showBtn.setOnClickListener(new View.OnClickListener() {
         *             @Override
         *             public void onClick(View view) {
         *                 String name = nameInput.getText().toString();
         *                 Log.d("MainActivity", "onClick: "+name);
         *                 if (!name.isEmpty()) {
         *                     nameTxt.setText("Hello, "+name);
         *                 } else {
         *                     nameTxt.setText("No name is input");
         *                 }
         *
         *             }
         *         });
         */
        /**
         * Write codes to handle onclick event explicitly
         *
         * showBtn.setOnClickListener(view -> {
         *             String name = nameInput.getText().toString();
         *             Log.d("MainActivity", "onClick: "+name);
         *             if (!name.isEmpty()) {
         *                 nameTxt.setText("Hello, "+name);
         *             } else {
         *                 nameTxt.setText(R.string.noNameInputMsg);
         *             }
         *         });
         */

    }

    public void onShowNameBtnClicked(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        String name = nameInput.getText().toString();
        Log.d("MainActivity", "onClick: "+name);
        if (!name.isEmpty()) {
            nameTxt.setText("Hello, "+name+", Salary is:"+String.valueOf(numberFormat.format(salary)));
        } else {
            nameTxt.setText(R.string.empty_name_msg);
        }
    }

    public void onShowInfoBtnClicked(View view) {
//        Toast.makeText(MainActivity.this, R.string.app_info_msg, Toast.LENGTH_LONG).show();

        Snackbar.make(nameTxt, R.string.app_info_msg, Snackbar.LENGTH_LONG).setAction("More", view1-> Log.d("Snack", "here")).show();
    }

    public void onChangeColorBtnClicked(View view) {
        nameTxt.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
        /**
         * getColor may be deprecated
         */
//        nameTxt.setTextColor(getResources().getColor(R.color.white));
    }

    public void onGoDetailPageBtnClicked(View view) {
        setContentView(R.layout.detail);
    }
}