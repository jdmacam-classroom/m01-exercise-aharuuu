package com.example.m01exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    int i = -1;
    public void buttonClick(View view){
        i++;
        String[] trivias = {"Ithyphallophobia is the fear of erections",
                "A duck and a rooster were the first passengers in a hot air balloon",
                "Arab women can initiate a divorce if their husbands don't pour coffee for them",
                "Upon losing battles apes will tend to masturbate",
                "In Japan it is perfectly acceptable to name your child buttocks or prostitute",
                "In France it is legal to marry a dead person",
                "A group of 12 or more cows is called a flink",
                "In 1386 a pig in France was executed by public hanging for the murder of a child",
                "Los Angeles' full name is El Pueblo de Nuestra Señora la Reina de la Los Angeles de Porciúncula",
                "It is physically impossible for pigs to look up into the sky"};

        TextView txt = (TextView)findViewById(R.id.trivia);
        Button btn = (Button)findViewById(R.id.button);

        if (i >= 10){
            btn.setEnabled(false);
        } else {
            txt.setText(trivias[i]);
        }
    }
}