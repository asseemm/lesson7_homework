package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radio_choco_ice, radio_vanilla_ice, radio_straw_ice, radio_wafer, radio_cup, radio_nut, radio_choco_cr, radio_choco_ch , radio_vanilla_ch ,radio_straw_ch;
    CheckBox check_ice, check_cheese;
    Button btnDone;
    String cheeseText, iceText, vkusIceTxt, vkusCheeseTxt, kroshkaTxt, vChemTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_choco_ice = findViewById(R.id.radio_choco_ice);
        radio_choco_ch = findViewById(R.id.radio_choco_ch);
        radio_vanilla_ice = findViewById(R.id.radio_vanilla_ice);
        radio_vanilla_ch = findViewById(R.id.radio_vanilla_ch);
        radio_straw_ice = findViewById(R.id.radio_straw_ice);
        radio_straw_ch = findViewById(R.id.radio_straw_ch);
        radio_wafer = findViewById(R.id.radio_wafer);
        radio_cup = findViewById(R.id.radio_cup);
        radio_nut = findViewById(R.id.radio_nut);
        radio_choco_cr = findViewById(R.id.radio_choco_cr);

        check_ice = findViewById(R.id.check_ice);
        check_cheese = findViewById(R.id.check_cheese);

        btnDone =  findViewById((R.id.btnDone));


        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_ice.isChecked()){
                    iceText = "Ice cream";
                }

                if (radio_choco_ice.isChecked()){
                    vkusIceTxt = "Chocolate";
                }else if(radio_vanilla_ice.isChecked()){
                    vkusIceTxt = "Vanilla";
                }else{
                    vkusIceTxt = "Strawberry ";
                }

                if (radio_wafer.isChecked()){
                    vChemTxt = "In wafer";
                }else if(radio_cup.isChecked()){
                    vChemTxt = "In cup";
                }

                if (radio_nut.isChecked()){
                    kroshkaTxt = "With Nut crumbs";
                }else if(radio_choco_cr.isChecked()){
                    kroshkaTxt = "With chocolate crumbs";
                }


                if (check_cheese.isChecked()){
                    cheeseText = "Cheesecake";
                }
                if (radio_choco_ch.isChecked()){
                    vkusCheeseTxt = "Chocolate";
                }else if(radio_vanilla_ch.isChecked()){
                    vkusCheeseTxt = "Vanilla";
                }else{
                    vkusCheeseTxt= "Strawberry ";
                }

                String res = "Your choose: " + iceText + " :" + "\n" +
                        vkusIceTxt + ", " + vChemTxt + ", " + kroshkaTxt + ";" + "\n" +
                        cheeseText + " : " + vkusCheeseTxt;

                Toast.makeText(MainActivity.this, res, Toast.LENGTH_LONG).show();

            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}