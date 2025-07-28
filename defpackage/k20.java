package defpackage;

import android.os.Bundle;

/* renamed from: k20  reason: default package */
public final class k20 {
    public static final k20 g = new k20(0, 0, 1, 1, 0);
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public x3a f;

    static {
        int i2 = oze.a;
    }

    public k20(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static k20 a(Bundle bundle) {
        String str = h;
        int i2 = 0;
        int i3 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = i;
        int i4 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = j;
        int i5 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = k;
        int i6 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = l;
        if (bundle.containsKey(str5)) {
            i2 = bundle.getInt(str5);
        }
        return new k20(i3, i4, i5, i6, i2);
    }

    public final x3a b() {
        if (this.f == null) {
            this.f = new x3a(this);
        }
        return this.f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k20.class != obj.getClass()) {
            return false;
        }
        k20 k20 = (k20) obj;
        return this.a == k20.a && this.b == k20.b && this.c == k20.c && this.d == k20.d && this.e == k20.e;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
