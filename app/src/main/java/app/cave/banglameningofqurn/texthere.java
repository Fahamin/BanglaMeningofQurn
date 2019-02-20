package app.cave.banglameningofqurn;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class texthere extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texthere);


        final SharedPreferences preferences = getApplicationContext().getSharedPreferences("ss", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

       // suraStore();
        textView = findViewById(R.id.suraTxtId);
        Bundle bb = getIntent().getExtras();
        int a = bb.getInt("0");
        a = bb.getInt("1");

        if(a==1)
        {
            textView.setText(getResources().getString(R.string.s2));
        }



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(preferences.contains("1"))
                {
                    textView.setText(preferences.getString("1",null));
                }
            }
        });
    }



}
