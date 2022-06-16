package im.tobe.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button showBtn;
    private TextView nameTxt;
    private EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showBtn = findViewById(R.id.showBtn);
        nameTxt = findViewById(R.id.nameTxt);
        nameInput = findViewById(R.id.nameInput);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameInput.getText().toString();
                if (!name.isEmpty()) {
                    nameTxt.setText("Hello, "+name);
                } else {
                    nameTxt.setText("No name is input");
                }

            }
        });
    }
}