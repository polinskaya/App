package puv.fit.bstu.by;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import text.TextFunc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity","conter =" + count);
        }
        displayText();
    }

    private void displayText() {
        TextFunc tf = new TextFunc();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(tf.getValue());
    }
}