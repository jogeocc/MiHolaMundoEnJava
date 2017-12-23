package com.jgeo.www.miholamundoenjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnAcercaDe)
    Button btnAcercaDe;
    @BindView(R.id.btnSalir)
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnAcercaDe, R.id.btnSalir})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnAcercaDe:
                    Toast.makeText( this.getApplicationContext(), "Este es mi primer porgrama en andriod estudio con java",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnSalir:
                break;
        }
    }
}
