package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: ucb  reason: default package */
public final class ucb extends jgd {
    public final tcb X;

    public ucb(ExecutorService executorService, tcb tcb) {
        super(executorService);
        this.X = tcb;
    }

    /* renamed from: J */
    public final void r(w9b w9b, int i) {
        w9b w9b2 = w9b;
        q8b q8b = (q8b) ((pg7) C(i));
        w9b2.A(q8b);
        if (q8b instanceof b7) {
            r6 r6Var = w9b2 instanceof r6 ? (r6) w9b2 : null;
            if (r6Var != null) {
                ((n7d) r6Var.a).setOnSwitchListener(new qe4(new tg9(2, this.X, tcb.class, "onChecked", "onChecked(JZ)V", 0, 12), 2, new h87(1, this.X, tcb.class, "onDisabledClick", "onDisabledClick(J)V", 0, 12)));
            }
        }
    }

    public final int l(int i) {
        return ((q8b) ((pg7) C(i))).l();
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (jjd.m(i2, 1024)) {
            return new r6(viewGroup.getContext());
        }
        if (jjd.m(i2, 2048)) {
            return new axa(viewGroup.getContext(), 1);
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
