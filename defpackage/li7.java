package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: li7  reason: default package */
public final class li7 extends f6c {
    public Object X;
    public final /* synthetic */ int o = 1;

    public li7(w6a w6a, List list) {
        this.X = list;
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return ((List) this.X).size();
            default:
                return ((List) ((zqd) this.X).getValue()).size();
        }
    }

    public final void r(b7c b7c, int i) {
        switch (this.o) {
            case 0:
                ki7 ki7 = (ki7) b7c;
                hr1.r(((List) this.X).get(i));
                throw null;
            default:
                String str = (String) o23.Y(i, (List) ((zqd) this.X).getValue());
                View view = ((tp7) b7c).a;
                ((TextView) view).setText(str);
                view.setBackgroundColor((str == null || !h0e.R(str, "exception", true)) ? (str == null || !h0e.R(str, "error", true)) ? 0 : n1g.c0(-65536, 0.75f) : n1g.c0(-65536, 0.75f));
                return;
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new ki7(this, LayoutInflater.from(viewGroup.getContext()).inflate(zrb.row_chat_location, viewGroup, false));
            default:
                TextView textView = new TextView(viewGroup.getContext());
                nte.k.b(textView, yq4.b);
                float f = (float) 6;
                float f2 = (float) 3;
                textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                textView.setTextColor(km4.y0.r(textView).getText().e);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new b7c(textView);
        }
    }

    public li7(grd grd) {
        this.X = grd;
    }
}
