package com.example.newobject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

public class TwoActivity extends AppCompatActivity { /*вторая страница(созданные проекты и кнопка создания новой заметки), переход на Activity*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}