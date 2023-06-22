package recharge.web.services.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import recharge.web.services.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentRecharge#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentRecharge extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Spinner spinner;

    public FragmentRecharge() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentRecharge.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentRecharge newInstance(String param1, String param2) {
        FragmentRecharge fragment = new FragmentRecharge();
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
        String[] rechargePrices={"100,000 هزارتومان","50,000 هزارتومان","20,000 هزارتومان","10,000 هزارتومان","5,000 هزرتومان","2,000 هزارتومان"};
        // Inflate the layout for this fragment
        ArrayAdapter aa = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_item,rechargePrices);
        View view=inflater.inflate(R.layout.fragment_recharge,container,false);
        spinner=view.findViewById(R.id.spinnercharge);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);

        return view;
    }
}