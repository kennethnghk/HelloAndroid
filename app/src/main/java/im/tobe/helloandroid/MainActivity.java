package im.tobe.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import im.tobe.helloandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    /**
     * for no data-binding
     */
//    private Button showBtn;
//    private TextView nameTxt;
//    private EditText nameInput;
    private int salary = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * while no data-binding findViewById would be slow because the app searches the element
         */
//        setContentView(R.layout.activity_main);
//        showBtn = findViewById(R.id.showNameBtn);
//        nameTxt = findViewById(R.id.nameTxt);
//        nameInput = findViewById(R.id.nameInput);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.showNameBtn.setOnClickListener(this::onShowNameBtnClicked);

        // OR by lambda
//        binding.showNameBtn.setOnClickListener(view -> onShowNameBtnClicked(view));

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

        // hide keyboard
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String name = binding.nameInput.getText().toString();

        Log.d("MainActivity", "onClick: "+name);
        if (!name.isEmpty()) {
            binding.nameTxt.setText("Hello, "+name+", Salary is:"+String.valueOf(numberFormat.format(salary)));
        } else {
            binding.nameTxt.setText(R.string.empty_name_msg);
        }

        // clear all binding
        binding.invalidateAll();
    }

    public void onShowInfoBtnClicked(View view) {
//        Toast.makeText(MainActivity.this, R.string.app_info_msg, Toast.LENGTH_LONG).show();

        Snackbar.make(binding.nameTxt, R.string.app_info_msg, Snackbar.LENGTH_LONG).setAction("More", view1-> Log.d("Snack", "here")).show();
    }

    public void onChangeColorBtnClicked(View view) {
        binding.nameTxt.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
        /**
         * getColor may be deprecated
         */
//        nameTxt.setTextColor(getResources().getColor(R.color.white));
    }

    public void onGoDetailPageBtnClicked(View view) {
        setContentView(R.layout.linear_view);
    }
}