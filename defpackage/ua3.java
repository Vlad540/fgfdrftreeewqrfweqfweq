package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ua3  reason: default package */
public final class ua3 {
    public static final int c;
    public static final int d;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public Configuration b;

    static {
        int i = Build.VERSION.SDK_INT;
        c = i >= 31 ? 268451204 : 15748;
        d = i >= 31 ? 1342177280 : 1073741824;
    }

    public ua3(Context context) {
        this.b = new Configuration(context.getResources().getConfiguration());
        context.registerComponentCallbacks(new ga2(this, context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = new java.util.HashSet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r2, defpackage.ta3 r3) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r1 = r1.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0019
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Object r1 = r1.putIfAbsent(r2, r0)
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua3.a(int, ta3):void");
    }
}
