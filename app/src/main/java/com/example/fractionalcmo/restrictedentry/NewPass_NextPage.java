package com.example.fractionalcmo.restrictedentry;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewPass_NextPage extends Fragment {

    Button dailypass_button,guestpass_button;

    public NewPass_NextPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_new_pass__next_page,container,false);
        dailypass_button = (Button)view.findViewById(R.id.dailypass_button);
        guestpass_button = (Button)view.findViewById(R.id.guestpass_button);


        dailypass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"This is dailypass",Toast.LENGTH_SHORT).show();
                /*dailypass_button.setVisibility(View.INVISIBLE);*/
            }
        });


        guestpass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"This is guestpass",Toast.LENGTH_SHORT).show();
                /*guestpass_button.setVisibility(View.INVISIBLE);*/
            }
        });
        return view;
    }

}
