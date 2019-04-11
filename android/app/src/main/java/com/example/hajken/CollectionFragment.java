package com.example.hajken;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class CollectionFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "DrawFragment";
    private InterfaceMainActivity interfaceMainActivity;
    private ImageButton circle;
    private ImageButton square;
    private Button stopVehicleButton;

    //occurs after onAttach
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    //occurs after onCreate
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_collection,container,false);

        //Creates the buttons, list and image of the fragment
        stopVehicleButton = view.findViewById(R.id.stop_vehicle_button);
        circle = view.findViewById(R.id.circle_symbol);
        square = view.findViewById(R.id.square_symbol);

        //Enables functions to buttons
        circle.setOnClickListener(this);
        square.setOnClickListener(this);

        return view;
    }

    //calls before onCreate, used to instantiate the interface
    //part of the fragment to activity communication
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        interfaceMainActivity = (InterfaceMainActivity) getActivity();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            //This is the events that are associated with the buttons

            case R.id.stop_vehicle_button: {
                break;
            }

            case R.id.circle_symbol: {
                interfaceMainActivity.customDialog("Circle route","Would you like to start the route?","cancelMethod","startMethod");
                break;
            }

            //this is where the problem is, customDialog does run complete until if statement is checked, therefore its false
            case R.id.square_symbol: {
                interfaceMainActivity.customDialog("Square route","Would you like to star the route?","cancelMethod","startMethod");
                break;
            }

        }

        if (interfaceMainActivity.getVehicleActivity()){
            Log.d(TAG, "onClick: inside getVehicleActivity = true");
            stopVehicleButton.setOnClickListener(this);
            stopVehicleButton.setActivated(true);
        }


    }
}
