package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* renamed from: ux0  reason: default package */
public final class ux0 extends jgd {
    public final u5g X;

    public ux0(u5g u5g, ExecutorService executorService) {
        super(executorService);
        this.X = u5g;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, tx0, b7c] */
    /* renamed from: H */
    public final void r(chd chd, int i) {
        if (chd instanceof tx0) {
            ? r5 = (tx0) chd;
            vy0 vy0 = (pg7) C(i);
            if (vy0 instanceof vy0) {
                n7d n7d = r5.a;
                n7d n7d2 = n7d;
                n7d2.setThemeDepended(j7d.b);
                r5.A(vy0);
                boolean z = vy0.x0;
                u5g u5g = this.X;
                if (z) {
                    n7d2.setEnabled(true);
                    a24.Z(n7d, 300, new sx0(r5, u5g, vy0, 0));
                } else {
                    n7d2.setEnabled(false);
                    n7d.setOnClickListener((View.OnClickListener) null);
                }
                n7d2.setOnSwitchCheckedListener(new bk(2, u5g));
                return;
            }
            return;
        }
        chd.A((pg7) C(i));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [rx0, b7c] */
    /* JADX WARNING: type inference failed for: r1v6, types: [rx0, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        if (i == o1a.g) {
            return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == o1a.f) {
            TextView textView = new TextView(viewGroup.getContext());
            nge.d(nte.t, textView);
            textView.setTextColor(1895825407);
            return new rx0(textView, 1);
        } else if (i == o1a.e) {
            TextView textView2 = new TextView(viewGroup.getContext());
            nge.d(nte.m, textView2);
            textView2.setTextColor(1895825407);
            return new rx0(textView2, 0);
        } else {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
    }
}
