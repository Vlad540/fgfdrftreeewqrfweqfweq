package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: cte  reason: default package */
public final class cte implements g1e {
    public static final cte b = new cte();
    public final List a;

    public cte(tw3 tw3) {
        this.a = Collections.singletonList(tw3);
    }

    public final int h(long j) {
        return j < 0 ? 0 : -1;
    }

    public final long k(int i) {
        swb.e(i == 0);
        return 0;
    }

    public final List q(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    public final int u() {
        return 1;
    }

    public cte() {
        this.a = Collections.emptyList();
    }
}
