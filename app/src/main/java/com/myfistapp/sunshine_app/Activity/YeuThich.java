package com.myfistapp.sunshine_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.myfistapp.sunshine_app.Model.Khachhang;
import com.myfistapp.sunshine_app.R;
import com.myfistapp.sunshine_app.Adapter.ReycyclerViewAdapter;
import com.myfistapp.sunshine_app.Class.SanPhamDomain;

import java.util.ArrayList;

public class YeuThich extends AppCompatActivity {

    private RecyclerView.Adapter  adapter;
    private RecyclerView  recyclerViewPopularList;
    private Khachhang khachhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_yeu_thich);

        Bundle bundleRecevie = getIntent().getExtras();
        if(bundleRecevie!=null){
            khachhang = (Khachhang) bundleRecevie.get("object_user");
        }
        Toast.makeText(YeuThich.this,khachhang.toString(), Toast.LENGTH_SHORT).show();

        bottomNavigation();
        recyclerViewFavorite();
    }

    private void bottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.card_btn);
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout favBtn = findViewById(R.id.favBtn);
        LinearLayout notiBtn = findViewById(R.id.notBtn);
        LinearLayout proBtn = findViewById(R.id.proBtn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GioHang.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object_user",khachhang);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TrangChu.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object_user",khachhang);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), YeuThich.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object_user",khachhang);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        notiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThongBao.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object_user",khachhang);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        proBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TrangCaNhan.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object_user",khachhang);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private void recyclerViewFavorite() {
        recyclerViewPopularList = findViewById(R.id.recycleview_danhsach_yt);
        recyclerViewPopularList.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<SanPhamDomain> danhsachsanpham = new ArrayList<>();
        danhsachsanpham.add(new SanPhamDomain("Salad Trứng","img_favorite_food_1","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","30","328","79000","4.9"));
        danhsachsanpham.add(new SanPhamDomain("Mì Ý Rigatoni","img_favorite_food_2","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","20","111","98000","4.0"));
        danhsachsanpham.add(new SanPhamDomain("Chicken Hamburger","img_favorite_food_3","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","15","33","45000","4.9"));
        danhsachsanpham.add(new SanPhamDomain("Salad Cá Hồi","img_favorite_food_4","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","35","123","23000","5"));
        danhsachsanpham.add(new SanPhamDomain("Bánh Muffin","img_favorite_food_5","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","25","532","41000","3.9"));
        danhsachsanpham.add(new SanPhamDomain("Nước ép dưa hấu","img_favorite_food_6","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","10","123","12000","4.9"));
        danhsachsanpham.add(new SanPhamDomain("Trái cây mix","img_favorite_food_7","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","30","112","44000","4.9"));
        danhsachsanpham.add(new SanPhamDomain("Nghêu sốt bơ tỏi","img_favorite_food_8","Salad trứng thơm ngon với các nguyên liệu organic phù hợp với chế độ ăn kiêng ít dầu mỡ. Thành phần: xà lách, dầu ô liu, trứng, vừng...","20","423","22000","5"));

        adapter = new ReycyclerViewAdapter(danhsachsanpham,khachhang);
        recyclerViewPopularList.setAdapter(adapter);

    }
}