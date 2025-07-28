package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: f7  reason: default package */
public final class f7 extends bm8 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ i7 n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7(i7 i7Var, Context context, pl8 pl8, View view) {
        super(ylb.actionOverflowMenuStyle, 0, pl8, context, view, true);
        this.n = i7Var;
        this.g = 8388613;
        lhd lhd = i7Var.L0;
        this.i = lhd;
        zl8 zl8 = this.j;
        if (zl8 != null) {
            zl8.e(lhd);
        }
    }

    public final void c() {
        switch (this.m) {
            case 0:
                this.n.I0 = null;
                super.c();
                return;
            default:
                i7 i7Var = this.n;
                pl8 pl8 = i7Var.c;
                if (pl8 != null) {
                    pl8.c(true);
                }
                i7Var.H0 = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7(i7 i7Var, Context context, w0e w0e, View view) {
        super(ylb.actionOverflowMenuStyle, 0, w0e, context, view, false);
        this.n = i7Var;
        if (!w0e.P0.f()) {
            View view2 = i7Var.x0;
            this.f = view2 == null ? (View) i7Var.w0 : view2;
        }
        lhd lhd = i7Var.L0;
        this.i = lhd;
        zl8 zl8 = this.j;
        if (zl8 != null) {
            zl8.e(lhd);
        }
    }
}
