package sg.edu.rp.c346.id21024750.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonCallSon;
    Button buttonCallDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCallSon = findViewById(R.id.buttonCallSon);
        buttonCallDaughter = findViewById(R.id.buttonCallDaughter);
    }
    buttonCallSon.setOnClickListener()

    Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +12345678));
    startActivity(intentCall);
    }

}