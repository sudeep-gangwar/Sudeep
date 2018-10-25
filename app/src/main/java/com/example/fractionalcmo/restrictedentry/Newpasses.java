package com.example.fractionalcmo.restrictedentry;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class Newpasses extends Fragment {

    FragmentManager newpass_fm;
    FragmentTransaction newpass_tx;
    Button home_button;
    FrameLayout frameLayout;
    ImageView imageView;
    RelativeLayout relativeLayout;

    public Newpasses() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_newpasses,container,false);
        newpass_fm = getFragmentManager();
        /*home_button = (Button) view.findViewById(R.id.home_button);
*/
        imageView = (ImageView)view.findViewById(R.id.imageView);
        final CardView cardView = (CardView)view.findViewById(R.id.card);
        frameLayout = (FrameLayout)view.findViewById(R.id.newpass_fragment);
        relativeLayout = (RelativeLayout)view.findViewById(R.id.rel);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newpass_tx = newpass_fm.beginTransaction();
                newpass_tx.replace(R.id.newpass_fragment,new NewPass_NextPage());

                newpass_tx.commit();
                /*frameLayout.setVisibility(View.INVISIBLE);*/
                relativeLayout.setVisibility(View.INVISIBLE);
                /*cardView.setVisibility(View.INVISIBLE);*/

            }
        });
        return view;

    }


   /* @Override
    public void onStart() {
        super.onStart();
        FrameLayout newpass_fragment = (FrameLayout) getView().findViewById(R.id.newpass_fragment);

        newpass_tx = newpass_fm.beginTransaction();
        newpass_tx.replace(R.id.newpass_fragment,new Newpasses());
        newpass_tx.commit();
        newpass_fragment.setVisibility(View.VISIBLE);
    }*/
}
