package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: gy1  reason: default package */
public final class gy1 implements h1e, g1e {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ gy1(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final int h(long j) {
        switch (this.a) {
            case 0:
                return j < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    public final long k(int i) {
        switch (this.a) {
            case 0:
                oyb.d(i == 0);
                return 0;
            default:
                return 0;
        }
    }

    public final List q(long j) {
        switch (this.a) {
            case 0:
                return j >= 0 ? this.b : Collections.emptyList();
            default:
                return this.b;
        }
    }

    public final int u() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}
