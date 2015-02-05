package com.example.kdiaziglesias.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kdiaziglesias on 30/01/15.
 */
public class FragmentA extends Fragment{
    /**
     * A placeholder fragment containing a simple view.
     */

        public FragmentA() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);


            Button miboton = (Button)rootView.findViewById(R.id.bventana2);

            miboton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent intento = new Intent(getActivity(), Activity2.class);

                    startActivityForResult(intento, 1);


                }
            });
            return rootView;
        }


}
