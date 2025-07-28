package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: o3d  reason: default package */
public final class o3d implements l3d {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public static final String j = Integer.toString(4, 36);
    public static final String k = Integer.toString(5, 36);
    public final int a;
    public final int b = 101;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        int i2 = oze.a;
    }

    public o3d(int i2, ComponentName componentName) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        this.a = i2;
        this.c = componentName;
        this.d = packageName;
        this.e = bundle;
    }

    public final int a() {
        return this.a;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Object c() {
        return null;
    }

    public final String d() {
        ComponentName componentName = this.c;
        return componentName == null ? BuildConfig.FLAVOR : componentName.getClassName();
    }

    public final boolean e() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.o3d) r4;
        r0 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.o3d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            o3d r4 = (defpackage.o3d) r4
            int r0 = r4.b
            int r2 = r3.b
            if (r2 == r0) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 100
            if (r2 == r0) goto L_0x0021
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x0018
            return r1
        L_0x0018:
            android.content.ComponentName r3 = r3.c
            android.content.ComponentName r4 = r4.c
            boolean r3 = defpackage.oze.a(r3, r4)
            return r3
        L_0x0021:
            r3 = 0
            boolean r3 = defpackage.oze.a(r3, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3d.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return 0;
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, (Bundle) null);
        bundle.putInt(g, this.a);
        bundle.putInt(h, this.b);
        bundle.putParcelable(i, this.c);
        bundle.putString(j, this.d);
        bundle.putBundle(k, this.e);
        return bundle;
    }

    public final Bundle getExtras() {
        return new Bundle(this.e);
    }

    public final String getPackageName() {
        return this.d;
    }

    public final int getType() {
        return this.b != 101 ? 0 : 2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, null});
    }

    public final String toString() {
        return "SessionToken {legacyToken=null}";
    }
}
