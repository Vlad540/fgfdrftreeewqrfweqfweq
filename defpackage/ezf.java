package defpackage;

import java.util.Arrays;

/* renamed from: ezf  reason: default package */
public final class ezf {
    public final zk a;
    public final ib5 b;

    public /* synthetic */ ezf(zk zkVar, ib5 ib5) {
        this.a = zkVar;
        this.b = ib5;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ezf)) {
            ezf ezf = (ezf) obj;
            return x87.F(this.a, ezf.a) && x87.F(this.b, ezf.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(this.a, "key");
        mnVar.r(this.b, "feature");
        return mnVar.toString();
    }
}
