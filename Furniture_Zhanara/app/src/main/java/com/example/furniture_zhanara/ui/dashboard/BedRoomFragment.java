package com.example.furniture_zhanara.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_zhanara.MAdapter;
import com.example.furniture_zhanara.R;
import com.example.furniture_zhanara.databinding.FragmentBedRoomBinding;
import com.example.furniture_zhanara.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("bed_room","Кровать", "2000",
                "Современная спальня в песочном цвете. В спальне не высокие потолки, современная люстра не утяжеляет дизайн комнаты." , R.drawable.bedroom));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать ", "3100",
                "Современная спальня в песочном цвете. В спальне не высокие потолки, современная люстра не утяжеляет дизайн комнаты." , R.drawable.bedroom2));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать", "2040",
                "Современная спальня в песочном цвете. В спальне не высокие потолки, современная люстра не утяжеляет дизайн комнаты." , R.drawable.bedroom));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать", "3000",
                "Современная спальня в песочном цвете. В спальне не высокие потолки, современная люстра не утяжеляет дизайн комнаты." , R.drawable.bedroom2));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать", "2100",
                "Современная спальня в песочном цвете. В спальне не высокие потолки, современная люстра не утяжеляет дизайн комнаты." , R.drawable.bedroom));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать ", "2100",
                "Современная спальня в песочном цвете. В спальне не высокие потолки, современная люстра не утяжеляет дизайн комнаты." , R.drawable.bedroom2));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}