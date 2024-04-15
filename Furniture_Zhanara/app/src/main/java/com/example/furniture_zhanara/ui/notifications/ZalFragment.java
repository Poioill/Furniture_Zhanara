package com.example.furniture_zhanara.ui.notifications;

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
import com.example.furniture_zhanara.databinding.FragmentZalBinding;
import com.example.furniture_zhanara.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;

NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("zal","Мягкая мебель", "1700",
                "Манхеттен Диван по выгодной цене", R.drawable.divan));
        list_zal.add(new FurnitureModel("zal","Диван Flow" ,
                "2160", "Манхеттен Диван по выгодной цене", R.drawable.divan2));
        list_zal.add(new FurnitureModel("zal","Диван Flow" ,
                "3000", "Манхеттен Диван по выгодной цене", R.drawable.divan));
        list_zal.add(new FurnitureModel("zal","Диван Flow" ,
                "1500", "Манхеттен Диван по выгодной цене", R.drawable.divan2));
        list_zal.add(new FurnitureModel("zal","Диван Flow" ,
                "1700", "Манхеттен Диван по выгодной цене", R.drawable.divan));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            binding.btnBack.setOnClickListener(v->{
                navController = Navigation.findNavController(requireActivity(),
                        R.id.nav_host_fragment_activity_main);
                navController.navigate(R.id.action_navigation_zal_to_navigation_home);
            });

          

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}