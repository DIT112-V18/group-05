package com.example.hajken.fragments;

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
import android.widget.ImageView;

import com.example.hajken.InterfaceMainActivity;
import com.example.hajken.R;

public class StartFragment extends Fragment implements View.OnClickListener{

    private static final String TAG = "StartFragment";
    private InterfaceMainActivity interfaceMainActivity;

    private Button scanFragmentButton;

    //calls after onAttach
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    //occurs after onCreate
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start,container,false);

        //Creates the buttons and image of the collFragment
        scanFragmentButton = view.findViewById(R.id.find_vehicle_button);
        scanFragmentButton.setActivated(true);

        //Enables functions to buttons
        scanFragmentButton.setOnClickListener(this); //"this" refers to the interface (View.OnClickListener)

        return view;
    }

    public void onClick(View view) {


        switch (view.getId()) {

            //These are the events that are associated with clicking of the buttons

            case R.id.find_vehicle_button: {
                Log.d(TAG, "onClick: findVehicle");
                interfaceMainActivity.inflateFragment(getString(R.string.scan_fragment));

            }
        }
    }
    //calls before onCreate, used to instantiate the interface
    //part of the collFragment to activity communication
    @Override
    public void onAttach(Context context){
        Log.d(TAG, "onAttach: in startFragment");

        super.onAttach(context);
        interfaceMainActivity = (InterfaceMainActivity) getActivity();

    }
}











