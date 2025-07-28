package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: w0f  reason: default package */
public final class w0f implements SystemServicesManager$PushTokenGeneratedListener {
    public final t97 a;
    public final t97 b;

    public w0f(w4 w4Var) {
        this.a = w4Var.d(zy9.class);
        this.b = w4Var.d(pk.class);
    }

    public final void onPushTokenGenerated(String str) {
        kp0 c = ((zy9) this.a.getValue()).c();
        if (c.a && !c.b) {
            ((gy9) ((pk) this.b.getValue())).s();
        }
    }
}
