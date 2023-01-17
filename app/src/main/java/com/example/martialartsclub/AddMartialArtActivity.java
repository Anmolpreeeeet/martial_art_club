package com.example.martialartsclub;

import android.os.Bundle;

import com.example.martialartsclub.Model.DatabaseHandler;
import com.example.martialartsclub.Model.MartialArt;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.martialartsclub.databinding.ActivityAddMartialArtBinding;

public class AddMartialArtActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtName , edtPrice , edtColor;
    Button btnAddMartialArt , btnBack;

    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_martial_art);

        edtName = findViewById(R.id.edtName);
        edtColor = findViewById(R.id.editColor);
        edtPrice = findViewById(R.id.edtPrice);
        btnAddMartialArt = findViewById(R.id.btnAddMartialArt);
        btnBack = findViewById(R.id.btnGoBack);

        databaseHandler = new DatabaseHandler(AddMartialArtActivity.this);
        btnAddMartialArt.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    private void addMartialArtObjectToDatabase(){
        String nameValue = edtName.getText().toString();
        String priceValue = edtPrice.getText().toString();
        String colorValue = edtColor.getText().toString();

        try {
            double priceDoubleValue = Double.parseDouble(priceValue);
            MartialArt martialArtObject = new MartialArt(0, nameValue , priceDoubleValue , colorValue);
            databaseHandler.addMartialArt(martialArtObject);
            Toast.makeText(this, martialArtObject + "Added to Database!!!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAddMartialArt:
                addMartialArtObjectToDatabase();
                break;
            case R.id.btnGoBack:
                this.finish();
                break;
        }
    }
}