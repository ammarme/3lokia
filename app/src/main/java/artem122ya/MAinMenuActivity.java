package artem122ya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import artem122ya.Note.MainNoteActivity;
import artem122ya.tomatotimer.R;
import artem122ya.tomatotimer.timer.TimerActivity;

public class MAinMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_ain_menu);
    }

    public void goCount(View view) {

        startActivity(new Intent(MAinMenuActivity.this, TimerActivity.class));
    }

    public void gonote(View view) {
        startActivity(new Intent(MAinMenuActivity.this, MainNoteActivity.class));

    }
}
