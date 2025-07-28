package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tq4  reason: default package */
public final class tq4 implements g1e {
    public final /* synthetic */ int a = 1;
    public final List b;

    public tq4(List list) {
        this.b = list;
    }

    public final int h(long j) {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return j < 0 ? 0 : -1;
        }
    }

    public final long k(int i) {
        switch (this.a) {
            case 0:
                return 0;
            default:
                swb.e(i == 0);
                return 0;
        }
    }

    public final List q(long j) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return j >= 0 ? this.b : Collections.emptyList();
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

    public tq4(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }
}
