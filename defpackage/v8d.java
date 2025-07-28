package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: v8d  reason: default package */
public final class v8d extends jgd {
    public final lhd X;

    public v8d(lhd lhd, ExecutorService executorService) {
        super(executorService);
        this.X = lhd;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [android.view.View, n7d] */
    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View, n7d] */
    /* renamed from: H */
    public final void r(chd chd, int i) {
        if (chd instanceof u8d) {
            u8d u8d = (u8d) chd;
            pg7 pg7 = (pg7) C(i);
            if (pg7 instanceof atc) {
                u8d.A(pg7);
                boolean z = ((atc) pg7).x0;
                View view = u8d.a;
                lhd lhd = this.X;
                if (z) {
                    ((n7d) view).setEnabled(true);
                    a24.a0(view, new p7d(lhd, 2, (atc) pg7));
                } else {
                    ((n7d) view).setEnabled(false);
                    view.setOnClickListener((View.OnClickListener) null);
                }
                ((n7d) view).setOnSwitchCheckedListener(new bk(17, lhd));
                return;
            }
            return;
        }
        chd.A((pg7) C(i));
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View, n7d] */
    public final b7c t(ViewGroup viewGroup, int i) {
        if (i == vaa.t) {
            return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == vaa.s) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), textView.getPaddingBottom());
            nte.t.b(textView, yq4.b);
            urd.B(new y9(3, (Continuation) null, 23), textView);
            return new rx0(textView, 14);
        }
        String name = v8d.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.Z, name, wn6.h(i, "unknown item viewType: "), (Throwable) null);
        }
        return new rx0(new View(viewGroup.getContext()), 15);
    }
}
