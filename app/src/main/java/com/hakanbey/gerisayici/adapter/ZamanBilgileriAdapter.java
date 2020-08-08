package com.hakanbey.gerisayici.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hakanbey.gerisayici.R;
import com.hakanbey.gerisayici.entity.ZamanBilgileri;

import org.w3c.dom.Text;

import java.util.List;

public class ZamanBilgileriAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<ZamanBilgileri> zamanBilgileris;

    public ZamanBilgileriAdapter(Activity activity, List<ZamanBilgileri> zamanBilgileris) {
        layoutInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.zamanBilgileris = zamanBilgileris;
    }

    @Override
    public int getCount() {
        return zamanBilgileris.size();
    }

    @Override
    public Object getItem(int i) {
        return zamanBilgileris.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View lineView;
        lineView = layoutInflater.inflate(R.layout.single_listgerisayim, null);
        TextView lbl_baslik = lineView.findViewById(R.id.lbl_baslik);
        TextView lbl_gun = lineView.findViewById(R.id.lbl_gun);
        TextView lbl_saat = lineView.findViewById(R.id.lbl_saat);
        TextView lbl_dakika = lineView.findViewById(R.id.lbl_dakika);
        TextView lbl_saniye = lineView.findViewById(R.id.lbl_saniye);

        final ZamanBilgileri zamanBilgileri = zamanBilgileris.get(i);
        lbl_baslik.setText(zamanBilgileri.getBaslik() + "");
        if (zamanBilgileri.getGun() < 10)
            lbl_gun.setText("0" + zamanBilgileri.getGun());
        else
            lbl_gun.setText(zamanBilgileri.getGun() + "");

        if (zamanBilgileri.getSaat() < 10)
            lbl_saat.setText("0" + zamanBilgileri.getSaat());
        else
            lbl_saat.setText(zamanBilgileri.getSaat() + "");

        if (zamanBilgileri.getDakika() < 10)
            lbl_dakika.setText("0" + zamanBilgileri.getDakika());
        else
            lbl_dakika.setText(zamanBilgileri.getDakika() + "");

        if (zamanBilgileri.getSaniye() < 10)
            lbl_saniye.setText("0" + zamanBilgileri.getSaniye());
        else
            lbl_saniye.setText(zamanBilgileri.getSaniye() + "");
        return lineView;
    }
}
