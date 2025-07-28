package ru.ok.messages.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBase;

public abstract class FrgBaseSettings extends FrgBase {
    public List F1;
    public z5d G1;
    public RecyclerView H1;

    public final void n1(r5 r5Var) {
        this.r1 = false;
        if (!(r5Var instanceof c8d)) {
            throw new IllegalStateException("FrgBaseSettings must be attach to activity that implements SettingsListener");
        }
    }

    public abstract ArrayList s1();

    public abstract String t1();

    public abstract void u1(int i);

    public abstract void v1(int i, Object obj);

    public final void w1() {
        this.F1.clear();
        this.F1.addAll(s1());
        if (this.H1.Z()) {
            this.H1.post(new oc4(25, this));
        } else {
            this.G1.m();
        }
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mif i1 = i1();
        if (i1 != null) {
            i1.l(t1());
        }
        View inflate = layoutInflater.inflate(zrb.frg_settings_base, viewGroup, false);
        inflate.setBackgroundColor(this.v1.m);
        RecyclerView findViewById = inflate.findViewById(yqb.frg_settings__rv_content);
        this.H1 = findViewById;
        e0();
        findViewById.setLayoutManager(new LinearLayoutManager(1, false));
        this.F1 = s1();
        z5d z5d = new z5d(c0(), this.F1, this);
        this.G1 = z5d;
        this.H1.setAdapter(z5d);
        return inflate;
    }
}
