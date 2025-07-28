package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: e8d  reason: default package */
public final class e8d extends jgd {
    public final e3 X;

    public e8d(e3 e3Var, ExecutorService executorService) {
        super(executorService);
        this.X = e3Var;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.View, n7d] */
    /* renamed from: H */
    public final void r(chd chd, int i) {
        if (chd instanceof d8d) {
            d8d d8d = (d8d) chd;
            pg7 pg7 = (pg7) C(i);
            if (pg7 instanceof htc) {
                d8d.A(pg7);
                ? r3 = (n7d) d8d.a;
                boolean z = ((htc) pg7).Z instanceof z6d;
                e3 e3Var = this.X;
                if (z) {
                    r3.setOnSwitchCheckedListener(new bk(16, e3Var));
                } else {
                    r3.setOnSwitchListener((k7d) null);
                }
                a24.a0(r3, new p7d(e3Var, 1, (htc) pg7));
                return;
            }
            return;
        }
        chd.A((pg7) C(i));
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View, n7d] */
    public final b7c t(ViewGroup viewGroup, int i) {
        if (i == saa.D) {
            return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == saa.C) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), textView.getPaddingBottom());
            nte.t.b(textView, yq4.b);
            urd.B(new y9(3, (Continuation) null, 22), textView);
            return new rx0(textView, 12);
        }
        String name = e8d.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.Z, name, wn6.h(i, "unknown item viewType: "), (Throwable) null);
        }
        return new rx0(new View(viewGroup.getContext()), 13);
    }
}
