package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: d7  reason: default package */
public final class d7 extends sw5 {
    public final /* synthetic */ int y0 = 0;
    public final /* synthetic */ View z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d7(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.z0 = actionMenuItemView;
    }

    public final ped b() {
        f7 f7Var;
        switch (this.y0) {
            case 0:
                e7 e7Var = ((ActionMenuItemView) this.z0).D0;
                if (e7Var == null || (f7Var = ((g7) e7Var).a.I0) == null) {
                    return null;
                }
                return f7Var.a();
            default:
                f7 f7Var2 = ((h7) this.z0).o.H0;
                if (f7Var2 == null) {
                    return null;
                }
                return f7Var2.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r3 = b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r3 = this;
            int r0 = r3.y0
            switch(r0) {
                case 0: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.View r3 = r3.z0
            h7 r3 = (defpackage.h7) r3
            i7 r3 = r3.o
            r3.l()
            r3 = 1
            return r3
        L_0x0010:
            android.view.View r0 = r3.z0
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            ol8 r1 = r0.B0
            r2 = 0
            if (r1 == 0) goto L_0x002e
            ul8 r0 = r0.y0
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L_0x002e
            ped r3 = r3.b()
            if (r3 == 0) goto L_0x002e
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x002e
            r2 = 1
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7.c():boolean");
    }

    public boolean d() {
        switch (this.y0) {
            case 1:
                i7 i7Var = ((h7) this.z0).o;
                if (i7Var.J0 != null) {
                    return false;
                }
                i7Var.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d7(h7 h7Var, View view) {
        super(view);
        this.z0 = h7Var;
    }
}
