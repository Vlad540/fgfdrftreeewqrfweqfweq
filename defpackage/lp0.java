package defpackage;

import java.io.Serializable;

/* renamed from: lp0  reason: default package */
public final class lp0 implements Serializable {
    public final boolean a;
    public final boolean b;

    public lp0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return "{hasBots=" + this.a + ", suspendedBot=" + this.b + "}";
    }
}
