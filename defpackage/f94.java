package defpackage;

import android.content.Context;

/* renamed from: f94  reason: default package */
public final class f94 implements h28 {
    public final Context a;

    public /* synthetic */ f94(Context context) {
        this.a = context;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, lk9] */
    public j28 b(f28 f28) {
        Context context;
        int i = oze.a;
        if (i < 23 || (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new Object().b(f28);
        }
        int g = c49.g(f28.c.n);
        ez3.M("Creating an asynchronous MediaCodec adapter for track type " + oze.H(g));
        ud udVar = new ud(g);
        udVar.b = true;
        return udVar.b(f28);
    }
}
