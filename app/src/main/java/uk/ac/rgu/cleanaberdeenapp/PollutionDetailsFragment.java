package uk.ac.rgu.cleanaberdeenapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PollutionDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PollutionDetailsFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PollutionDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PollutionDetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PollutionDetailsFragment newInstance(String param1, String param2) {
        PollutionDetailsFragment fragment = new PollutionDetailsFragment();
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
        View view = inflater.inflate(R.layout.fragment_pollution_details, container, false);

        Button takePhotoButton = view.findViewById(R.id.btnAddPhoto);
        takePhotoButton.setOnClickListener(this);

        Button allowButton = view.findViewById(R.id.btnAddPollutionLocation);
        allowButton.setOnClickListener(this);

        Button submitoButton = view.findViewById(R.id.btnSubmitForm);
        submitoButton.setOnClickListener(this);

        Button returnHomeButton = view.findViewById(R.id.btnTakeMeHome);
        returnHomeButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnAddPhoto){

            Navigation.findNavController(v).navigate(R.id.pollutionForm_to_wasteCamera);

        }
        else if(v.getId() == R.id.btnAddPollutionLocation){

            Navigation.findNavController(v).navigate(R.id.pollutionForm_to_locationSet);

        }

        else if(v.getId() == R.id.btnSubmitForm){

            Navigation.findNavController(v).navigate(R.id.pollutionForm_to_Success);

        }

        else if(v.getId() == R.id.btnTakeMeHome){

            Navigation.findNavController(v).navigate(R.id.pollutionDetails_to_home);

        }
    }
}