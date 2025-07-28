package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: bz9  reason: default package */
public final class bz9 {
    public static final vb0 a = new vb0();
    public static final wb0 b = new Object();

    public static ii0 a(gz9 gz9) {
        if (gz9 instanceof dz9) {
            return a;
        }
        if (gz9 instanceof fz9) {
            return b;
        }
        if (gz9.equals(ez9.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static tr6 b(String str, gz9 gz9, int i) {
        if ((i & 2) != 0) {
            gz9 = dz9.a;
        }
        Uri d = ez3.d(str);
        if (d == null) {
            d = Uri.EMPTY;
        }
        ur6 d2 = ur6.d(d);
        d2.g = rr6.b;
        d2.l = a(gz9);
        d2.k = u3b.c;
        return d2.a();
    }
}
