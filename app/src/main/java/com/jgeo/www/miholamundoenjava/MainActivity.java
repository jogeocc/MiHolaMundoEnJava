package com.jgeo.www.miholamundoenjava;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.etNombre)
    EditText etNombre;
    @BindView(R.id.etApellido)
    EditText etApellido;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etNumTele)
    EditText etNumTele;
    @BindView(R.id.stTerminos)
    Switch stTerminos;
    @BindView(R.id.btnGuardar)
    Button btnGuardar;
    @BindView(R.id.btnSalir)
    Button btnSalir;
    @BindView(R.id.contentMain)
    ConstraintLayout contentMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.btnGuardar)
    public void saveData() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        if (stTerminos.isChecked()) {
            Toast.makeText(this, "Guardar Contacto " + etNombre.getText().toString()
                    + " " + etApellido.getText().toString() + ".", Toast.LENGTH_SHORT).show();
        } else {
            Snackbar.make(contentMain, "Debe de aceptar los termino y condiciones", Snackbar.LENGTH_LONG)
                    .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            stTerminos.setChecked(true);
                        }
                    }).show();
        }
    }

    @OnClick(R.id.btnSalvar)
    public void onViewClicked() {
        Log.d("entro:", "Entro el onclick del boton ");
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        if (stTerminos.isChecked()) {
            Toast.makeText(this, "Guardar Contacto " + etNombre.getText().toString()
                    + " " + etApellido.getText().toString() + ".", Toast.LENGTH_SHORT).show();
        } else {
            Snackbar.make(contentMain, "Debe de aceptar los termino y condiciones", Snackbar.LENGTH_LONG)
                    .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            stTerminos.setChecked(true);
                        }
                    }).show();
        }
    }
}
