package defpackage;

import java.util.Arrays;

/* renamed from: dza  reason: default package */
public final class dza {
    public static final dza c = new dza(false, false);
    public static final String d = Integer.toString(0, 36);
    public static final String e = Integer.toString(1, 36);
    public final boolean a;
    public final boolean b;

    static {
        int i = oze.a;
    }

    public dza(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dza)) {
            return false;
        }
        dza dza = (dza) obj;
        return this.a == dza.a && this.b == dza.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}
