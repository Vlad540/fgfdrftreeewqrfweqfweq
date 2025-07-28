package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: gq  reason: default package */
public final class gq extends chd {
    /* JADX WARNING: type inference failed for: r3v0, types: [gq, b7c] */
    /* renamed from: F */
    public final void A(dq dqVar) {
        int i;
        int ordinal = dqVar.a.ordinal();
        if (ordinal == 0) {
            i = ky9.i;
        } else if (ordinal == 1) {
            i = ky9.e;
        } else if (ordinal == 2) {
            i = ky9.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view = this.a;
        eq eqVar = (eq) view;
        eqVar.setTitle(d8.u(eqVar.getContext(), i));
        eq eqVar2 = (eq) view;
        Boolean bool = dqVar.b;
        eqVar2.setSelected(bool != null ? bool.booleanValue() : false);
    }
}
