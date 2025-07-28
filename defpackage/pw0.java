package defpackage;

import android.os.SystemClock;

/* renamed from: pw0  reason: default package */
public final /* synthetic */ class pw0 implements bc9 {
    public final /* synthetic */ gx0 a;

    public /* synthetic */ pw0(gx0 gx0) {
        this.a = gx0;
    }

    public final void j(cc9 cc9) {
        u7 u7Var = this.a.W1.m;
        boolean z = cc9.f;
        w7 w7Var = u7Var.b;
        if (!z) {
            w7Var.a();
        } else if (!w7Var.b) {
            w7Var.b = true;
            ((fje) ((eje) w7Var.c)).getClass();
            w7Var.a = SystemClock.elapsedRealtime();
        }
    }
}
