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
 * Use the {@link ActionTriggerOverviewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActionTriggerOverviewFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ActionTriggerOverviewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ActionTriggerOverviewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActionTriggerOverviewFragment newInstance(String param1, String param2) {
        ActionTriggerOverviewFragment fragment = new ActionTriggerOverviewFragment();
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
        View view = inflater.inflate(R.layout.fragment_action_trigger_overview, container, false);

        Button reportButton = view.findViewById(R.id.btnAddPollutedSpot);
        reportButton.setOnClickListener(this);

        Button markCleanButton = view.findViewById(R.id.btnMarkAsClean);
        markCleanButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnAddPollutedSpot){
            Navigation.findNavController(v).navigate(R.id.home_to_pollutionForm);
        }
        else if(v.getId() == R.id.btnMarkAsClean){
            Navigation.findNavController(v).navigate(R.id.home_to_pollutedSpot);
        }
    }
}