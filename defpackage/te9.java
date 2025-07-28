package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: te9  reason: default package */
public final class te9 extends v2 implements xhe, ge9 {
    public RecyclerView X;
    public ProgressBar Y;
    public TextView Z;
    public final w6a o;
    public li7 w0;

    public te9(Context context, ViewGroup viewGroup, w6a w6a) {
        super(context);
        this.o = w6a;
        m(viewGroup, zrb.frg_live_location_settings);
    }

    public final void A(boolean z) {
        if (z) {
            this.Y.setVisibility(0);
        } else {
            this.Y.setVisibility(8);
        }
    }

    public final void B(List list) {
        if (list.isEmpty()) {
            this.Z.setVisibility(0);
            this.X.setVisibility(8);
            return;
        }
        li7 li7 = this.w0;
        li7.X = list;
        li7.m();
        this.Z.setVisibility(8);
        this.X.setVisibility(0);
    }

    public final void c() {
        Context context = ((View) this.c).getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        ((View) this.c).setBackgroundColor(E.m);
        js.E(this.Y, E.k);
        this.Z.setTextColor(E.F);
    }

    public final void n() {
        this.X = ((View) this.c).findViewById(yqb.frg_live_location_settings__rv_chats);
        this.Y = (ProgressBar) ((View) this.c).findViewById(yqb.frg_live_location_settings__pb_loading);
        this.Z = (TextView) ((View) this.c).findViewById(yqb.frg_live_location_settings__tv_empty);
        li7 li7 = new li7(this.o, Collections.emptyList());
        this.w0 = li7;
        this.X.setAdapter(li7);
        this.X.setLayoutManager(new LinearLayoutManager(1, false));
        this.X.setHasFixedSize(true);
    }
}
