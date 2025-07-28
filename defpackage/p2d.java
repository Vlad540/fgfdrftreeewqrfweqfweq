package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: p2d  reason: default package */
public final class p2d {
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public static final String h = Integer.toString(3, 36);
    public final int a;
    public final Bundle b;
    public final long c;
    public final f2d d;

    static {
        int i = oze.a;
    }

    public p2d(int i) {
        this(i, Bundle.EMPTY);
    }

    public static p2d a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        f2d a2 = bundle3 != null ? f2d.a(bundle3) : i != 0 ? new f2d(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new p2d(i, bundle2, j, a2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        f2d f2d = this.d;
        if (f2d != null) {
            bundle.putBundle(h, f2d.b());
        }
        return bundle;
    }

    public p2d(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), (f2d) null);
    }

    public p2d(int i, Bundle bundle, long j, f2d f2d) {
        oyb.d(f2d == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (f2d == null && i < 0) {
            f2d = new f2d(i);
        }
        this.d = f2d;
    }
}
