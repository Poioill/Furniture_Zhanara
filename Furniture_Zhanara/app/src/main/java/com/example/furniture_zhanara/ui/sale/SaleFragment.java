package com.example.furniture_zhanara.ui.sale;

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
import com.example.furniture_zhanara.databinding.FragmentSaleBinding;
import com.example.furniture_zhanara.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class SaleFragment extends Fragment {

    FragmentSaleBinding binding;
    NavController navController;
    List<FurnitureModel> list_s = new ArrayList<>();

    MAdapter adapter;

    public SaleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_s);
        binding.rvSale.setAdapter(adapter);
        return root;
    }




    private void createList() {
        list_s.add(new FurnitureModel("zal","Диван", "820",
                "Манхеттен Диван по выгодной цене", R.drawable.gostinnaya));
        list_s.add(new FurnitureModel("zal","Диван " ,
                "900", "Манхеттен Диван по выгодной цене", R.drawable.dlya_prihoz));
        list_s.add(new FurnitureModel("zal","Диван " ,
                "890", "Манхеттен Диван по выгодной цене", R.drawable.dlya_sada));
        list_s.add(new FurnitureModel("zal","Диван " ,
                "560", "Манхеттен Диван по выгодной цене", R.drawable.gostinnaya));
        list_s.add(new FurnitureModel("zal","Диван " ,
                "810", "Манхеттен Диван по выгодной цене", R.drawable.dlya_prihoz));
        list_s.add(new FurnitureModel("zal","Диван" ,
                "360", "Манхеттен Диван по выгодной цене", R.drawable.gostinnaya));


    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });

    }
}