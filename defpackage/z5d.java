package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.b;
import java.util.List;
import ru.ok.messages.settings.FrgBaseSettings;

/* renamed from: z5d  reason: default package */
public final class z5d extends f6c {
    public final LayoutInflater X;
    public final FrgBaseSettings Y;
    public final List o;

    public z5d(b bVar, List list, FrgBaseSettings frgBaseSettings) {
        this.o = list;
        this.X = LayoutInflater.from(bVar);
        this.Y = frgBaseSettings;
    }

    public final int j() {
        return this.o.size();
    }

    public final int l(int i) {
        return ((e4d) this.o.get(i)).Y;
    }

    public final void r(b7c b7c, int i) {
        int i2 = b7c.Y;
        boolean z = false;
        List list = this.o;
        if (i2 == 4) {
            ga7 ga7 = (ga7) b7c;
            e4d e4d = (e4d) list.get(i);
            ga7.P0 = e4d;
            ga7.O0.setText(e4d.b);
            SwitchCompat switchCompat = ga7.L0;
            switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            switchCompat.setChecked(((Integer) ga7.P0.X).intValue() != 0);
            switchCompat.setOnCheckedChangeListener(new nw2(2, ga7));
            ga7.P0.getClass();
            switchCompat.setEnabled(true);
            int intValue = ((Integer) ga7.P0.X).intValue();
            boolean z2 = intValue != 0;
            ga7.N0.setVisibility(z2 ? 0 : 8);
            if (z2) {
                ga7.J0.setColor(intValue);
            }
            ga7.P0.getClass();
            View view = ga7.a;
            view.setEnabled(true);
            ga7.P0.getClass();
            view.setAlpha(1.0f);
            if (!ga7.P0.Z) {
                z = true;
            }
            ga7.M0.setVisibility(z ? 1 : 0);
        } else if (i2 == 9) {
            sq0 sq0 = (sq0) b7c;
            e4d e4d2 = (e4d) list.get(i);
            sq0.K0 = e4d2;
            if (!sq0.L0) {
                sq0.J0.setProgress(((Integer) e4d2.X).intValue());
            }
            e4d2.getClass();
        } else {
            g4d g4d = (g4d) b7c;
            e4d e4d3 = (e4d) list.get(i);
            if (i == list.size() - 1) {
                z = true;
            }
            g4d.A(e4d3, z);
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 3) {
            return new g4d(layoutInflater.inflate(zrb.row_setting_header, viewGroup, false), (FrgBaseSettings) null);
        }
        if (i == 6) {
            return new g4d(layoutInflater.inflate(zrb.row_setting_progress, viewGroup, false), (FrgBaseSettings) null);
        }
        FrgBaseSettings frgBaseSettings = this.Y;
        if (i == 4) {
            return new ga7(layoutInflater.inflate(zrb.row_setting_led, viewGroup, false), frgBaseSettings);
        }
        if (i == 7) {
            return new ow2(layoutInflater.inflate(zrb.row_setting_contact, viewGroup, false), frgBaseSettings, 1);
        }
        if (i == 9) {
            return new sq0(layoutInflater.inflate(zrb.row_setting_brightness, viewGroup, false), frgBaseSettings);
        }
        if (i == 8) {
            return new ow2(layoutInflater.inflate(zrb.row_setting_theme, viewGroup, false), frgBaseSettings, 3);
        }
        View inflate = layoutInflater.inflate(zrb.row_setting, viewGroup, false);
        return i == 2 ? new ow2((ViewGroup) inflate, layoutInflater, frgBaseSettings, 0) : i == 1 ? new bge((ViewGroup) inflate, layoutInflater, frgBaseSettings) : i == 10 ? new ow2((ViewGroup) inflate, layoutInflater, frgBaseSettings, 2) : new g4d(inflate, frgBaseSettings);
    }
}
