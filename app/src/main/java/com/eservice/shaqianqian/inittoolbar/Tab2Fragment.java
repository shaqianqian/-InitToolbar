package com.eservice.shaqianqian.inittoolbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Tab2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.tab_layout, container, false);
        TextView ville = (TextView) view.findViewById(R.id.textView);
        ville.setText("lille");
        return view;
    }


}
