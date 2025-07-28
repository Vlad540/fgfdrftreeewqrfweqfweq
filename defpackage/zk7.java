package defpackage;

import android.content.Context;

/* renamed from: zk7  reason: default package */
public final class zk7 {
    public final Context a;
    public final xwb b;
    public volatile boolean c;
    public volatile boolean d;

    public zk7(Context context, xwb xwb) {
        this.a = context;
        this.b = xwb;
        boolean z = false;
        this.c = d8.d(context, "android.permission.RECORD_AUDIO") == 0;
        this.d = d8.d(context, "android.permission.CAMERA") == 0 ? true : z;
    }

    public final boolean a() {
        boolean z = false;
        boolean z2 = d8.d(this.a, "android.permission.RECORD_AUDIO") == 0;
        boolean z3 = d8.d(this.a, "android.permission.CAMERA") == 0;
        this.b.log("LocalMediaPermissionProvider", "call permissions state updated, audio: " + this.c + "->" + z2 + ", video: " + this.d + "->" + z3);
        if (this.c != z2) {
            this.c = z2;
            z = true;
        }
        if (this.d == z3) {
            return z;
        }
        this.d = z3;
        return true;
    }
}
