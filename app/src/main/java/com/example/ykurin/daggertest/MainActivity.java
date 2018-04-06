package com.example.ykurin.daggertest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ykurin.daggertest.Classes.TextGenerator;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @BindView(R.id.text)
    TextView title;

    @Inject
    TextGenerator textGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textGenerator = new TextGenerator();
        title.setText(textGenerator.getSomeText());
    }
}
