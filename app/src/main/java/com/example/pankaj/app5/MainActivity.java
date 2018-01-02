package com.example.pankaj.app5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVehicle = findViewById(R.id.txtVehicle);
        TextView txtCar = findViewById(R.id.txtCar);
        TextView txtMotorcycle = findViewById(R.id.txtMotorcycle);
        final TextView txtResult = findViewById(R.id.txtResult);

        Button btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("Button Clicked");
            }
        });

        Vehicle vehicle1 = new Vehicle(50,true,4);
        vehicle1.ride();
        txtVehicle.setText(vehicle1.toString());

        Car car1 = new Car(60,true,4);
        car1.ride();
        txtCar.setText(car1.toString());

        Motorcycle motorcycle1 = new Motorcycle(80,true, 2 );
        motorcycle1.ride();
        txtMotorcycle.setText(motorcycle1.toString());
    }
}
