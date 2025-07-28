package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: g7d  reason: default package */
public final class g7d extends jgd {
    public final f7d X;

    public g7d(f7d f7d, ExecutorService executorService) {
        super(executorService);
        this.X = f7d;
    }

    /* renamed from: J */
    public final void r(q7d q7d, int i) {
        e7d e7d = (e7d) ((pg7) C(i));
        View view = q7d.a;
        ((n7d) view).setModelItem(e7d);
        f7d f7d = this.X;
        q7d.J0 = f7d;
        if (e7d.f() instanceof z6d) {
            ((n7d) view).setOnSwitchCheckedListener(new bk(15, f7d));
        } else {
            ((n7d) view).setOnSwitchListener((k7d) null);
        }
        a24.a0(view, new p7d(f7d, 0, e7d));
    }

    public final void s(b7c b7c, int i, List list) {
        q7d q7d = (q7d) b7c;
        if (!list.isEmpty()) {
            u2 u2Var = new u2(7);
            for (Object next : list) {
                c7d c7d = next instanceof c7d ? (c7d) next : null;
                if (c7d != null) {
                    u2Var.M1(c7d);
                }
            }
            q7d.B((e7d) this.o.f.get(i), u2Var);
            return;
        }
        r(q7d, i);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View, n7d] */
    public final b7c t(ViewGroup viewGroup, int i) {
        return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
    }
}
