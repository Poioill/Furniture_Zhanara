package com.example.furniture_zhanara.ui.garden;

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
import com.example.furniture_zhanara.databinding.FragmentGardenBinding;
import com.example.furniture_zhanara.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    FragmentGardenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentGardenBinding
              .inflate(inflater,container,false);
      View root = binding.getRoot();
      createList();
      adapter = new MAdapter();
      adapter.setList_m(list_g);
      binding.rvGarden.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_gardenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Для сада", "стулья ", "700",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "50%",R.drawable.dlya_sada2));
        list_g.add(new FurnitureModel("Для сада", "стулья ", "500",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "80%",R.drawable.dlya_sada));
        list_g.add(new FurnitureModel("Для сада", "стулья ", "120",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "65%",R.drawable.dlya_sada2));
        list_g.add(new FurnitureModel("Для сада", "Cтол", "500",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "60%",R.drawable.dlya_sada));
        list_g.add(new FurnitureModel("Для сада", "стулья ", "680",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "15%",R.drawable.dlya_sada2));
        list_g.add(new FurnitureModel("Для сада", "стулья ", "900",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "50%",R.drawable.dlya_sada));
        list_g.add(new FurnitureModel("Для сада", "Cтол", "860",
                "Проект по дизайну интерьера в ЖК Клевер парк для Валерии! Мы создали уютное и стильное пространство", "65%",R.drawable.dlya_sada2));

    }
}