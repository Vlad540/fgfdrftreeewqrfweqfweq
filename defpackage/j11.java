package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j11  reason: default package */
public final class j11 extends ch {
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final int z0;

    public j11() {
        this(0, 3);
    }

    public static boolean o(View view) {
        return view != null && view.getId() == o1a.P0;
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        boolean o = o(view2);
        t97 t97 = this.D0;
        int i = this.z0;
        if (o && i == 2) {
            return ((e31) t97.getValue()).l(viewGroup, view, view2, z, z2);
        }
        boolean o2 = o(view2);
        t97 t972 = this.B0;
        if (o2 && i == 1) {
            return ((gg1) t972.getValue()).l(viewGroup, view, view2, z, z2);
        }
        t97 t973 = this.A0;
        if (view != null && view.getId() == o1a.Q0 && o(view2)) {
            return (AnimatorSet) t973.getValue();
        }
        t97 t974 = this.C0;
        if ((view2 != null && view2.getId() == o1a.Q0) || (view != null && view.getId() == o1a.Q0)) {
            return ((wj1) t974.getValue()).l(viewGroup, view, view2, z, z2);
        }
        if ((view != null && view.getId() == o1a.p0) || (view2 != null && view2.getId() == o1a.p0)) {
            return (AnimatorSet) t973.getValue();
        }
        boolean o3 = o(view);
        t97 t975 = this.E0;
        return (!o3 || !((ep1) ((so1) t975.getValue())).p() || !((ep1) ((so1) t975.getValue())).y()) ? (!o(view) || !((ep1) ((so1) t975.getValue())).p()) ? ((ep1) ((so1) t975.getValue())).p() ? ((wj1) t974.getValue()).l(viewGroup, view, view2, z, z2) : ((e31) t97.getValue()).l(viewGroup, view, view2, z, z2) : ((wj1) t974.getValue()).l(viewGroup, view, view2, z, z2) : ((gg1) t972.getValue()).l(viewGroup, view, view2, z, z2);
    }

    public final void n(View view) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j11(int i, int i2) {
        super(0);
        i = (i2 & 1) != 0 ? 3 : i;
        this.z0 = i;
        this.A0 = ez3.O(3, new a01(3));
        this.B0 = ez3.O(3, new i11(250, 0));
        this.C0 = ez3.O(3, new i11(250, 1));
        this.D0 = ez3.O(3, new i11(250, 2));
        this.E0 = ez3.O(3, new a01(4));
    }
}
