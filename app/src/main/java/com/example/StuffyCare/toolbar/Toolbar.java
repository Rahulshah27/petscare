package com.example.StuffyCare.toolbar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.StuffyCare.Cart;
import com.example.StuffyCare.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Toolbar#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Toolbar extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Toolbar() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Toolbar.
     */
    // TODO: Rename and change types and number of parameters
    public static Toolbar newInstance(String param1, String param2) {
        Toolbar fragment = new Toolbar();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_toolbar, container, false);

        ImageButton imgCart = view.findViewById(R.id.imgBtnCart);

        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCartFromToolbar();
            }
        });
        return view;
    }

    private void goToCartFromToolbar() {
        Intent intent = new Intent(getActivity(), Cart.class);
        startActivity(intent);
    }
}