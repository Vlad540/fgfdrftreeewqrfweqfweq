package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: ic8  reason: default package */
public final class ic8 {
    public final pd8 a;
    public final int b;
    public final int c;
    public final hc8 d;
    public final Bundle e;

    public ic8(pd8 pd8, int i, int i2, boolean z, hc8 hc8, Bundle bundle) {
        this.a = pd8;
        this.b = i;
        this.c = i2;
        this.d = hc8;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic8)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ic8 ic8 = (ic8) obj;
        hc8 hc8 = this.d;
        return (hc8 == null && ic8.d == null) ? this.a.equals(ic8.a) : oze.a(hc8, ic8.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        pd8 pd8 = this.a;
        sb.append(pd8.a.a);
        sb.append(", uid=");
        return wn6.j(sb, pd8.a.c, "}");
    }
}
