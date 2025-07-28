package defpackage;

import java.util.UUID;

/* renamed from: adf  reason: default package */
public final class adf extends mw5 {
    public final String b;
    public int c;

    public adf(fu1 fu1) {
        super(fu1);
        this.b = "virtual-" + fu1.d() + "-" + UUID.randomUUID().toString();
    }

    public final int b() {
        return l(0);
    }

    public final String d() {
        return this.b;
    }

    public final int l(int i) {
        return hqe.i(this.a.l(i) - this.c);
    }
}
