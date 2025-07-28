package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: em3  reason: default package */
public final class em3 extends f6c {
    public List X = Collections.emptyList();
    public long Y;
    public cm3 Z;
    public final di3 o;

    public em3(di3 di3) {
        this.o = di3;
    }

    public final int j() {
        return this.X.size();
    }

    public final long k(int i) {
        return ((av7) this.X.get(i)).c;
    }

    public final void r(b7c b7c, int i) {
        dm3 dm3 = (dm3) b7c;
        av7 av7 = (av7) this.X.get(i);
        boolean z = av7.h;
        ImageView imageView = dm3.J0;
        TamAvatarView tamAvatarView = dm3.K0;
        em3 em3 = dm3.N0;
        long j = av7.b;
        if (z) {
            imageView.setVisibility(4);
            tamAvatarView.setVisibility(0);
            tamAvatarView.a(em3.o.i(j, false), false);
            if (av7.k) {
                tamAvatarView.setAlpha(1.0f);
            } else {
                tamAvatarView.setAlpha(0.5f);
            }
        } else {
            imageView.setVisibility(0);
            tamAvatarView.setVisibility(8);
            tamAvatarView.a(em3.o.i(j, false), false);
        }
        int i2 = (av7.c > em3.Y ? 1 : (av7.c == em3.Y ? 0 : -1));
        View view = dm3.L0;
        if (i2 == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        dm3.M0 = av7;
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        return new dm3(this, LayoutInflater.from(viewGroup.getContext()).inflate(zrb.row_contact_location, viewGroup, false));
    }
}
