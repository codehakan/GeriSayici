package com.hakanbey.gerisayici;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.hakanbey.gerisayici.adapter.ZamanBilgileriAdapter;
import com.hakanbey.gerisayici.entity.ZamanBilgileri;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_item = findViewById(R.id.list_item);
        List<ZamanBilgileri> zaman_List = new ArrayList<ZamanBilgileri>();
        ZamanBilgileri zamanBilgileri1 = new ZamanBilgileri();
        zamanBilgileri1.setBaslik("KPSS'ye Kalan Süre");
        zamanBilgileri1.setGun(51);
        zamanBilgileri1.setSaat(16);
        zamanBilgileri1.setDakika(51);
        zamanBilgileri1.setSaniye(49);
        zaman_List.add(zamanBilgileri1);
        zamanBilgileri1 = new ZamanBilgileri();
        zamanBilgileri1.setBaslik("ALES'e Kalan Süre");
        zamanBilgileri1.setGun(34);
        zamanBilgileri1.setSaat(11);
        zamanBilgileri1.setDakika(32);
        zamanBilgileri1.setSaniye(22);
        zaman_List.add(zamanBilgileri1);
        zamanBilgileri1 = new ZamanBilgileri();
        zamanBilgileri1.setBaslik("Doğum Günüm");
        zamanBilgileri1.setGun(76);
        zamanBilgileri1.setSaat(19);
        zamanBilgileri1.setDakika(56);
        zamanBilgileri1.setSaniye(44);
        zaman_List.add(zamanBilgileri1);
        zamanBilgileri1 = new ZamanBilgileri();
        zamanBilgileri1.setBaslik("Nişanım");
        zamanBilgileri1.setGun(278);
        zamanBilgileri1.setSaat(7);
        zamanBilgileri1.setDakika(6);
        zamanBilgileri1.setSaniye(17);
        zaman_List.add(zamanBilgileri1);
        ZamanBilgileriAdapter zamanBilgileriAdapter = new ZamanBilgileriAdapter(this,zaman_List);
        list_item.setAdapter(zamanBilgileriAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.menu_paylas:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}