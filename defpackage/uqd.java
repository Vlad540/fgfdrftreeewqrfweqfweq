package defpackage;

import java.util.LinkedHashSet;

/* renamed from: uqd  reason: default package */
public final /* synthetic */ class uqd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf8 b;
    public final /* synthetic */ rxf c;

    public /* synthetic */ uqd(pf8 pf8, rxf rxf, int i) {
        this.a = i;
        this.b = pf8;
        this.c = rxf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c);
                return;
            default:
                ((LinkedHashSet) this.b.f).remove(this.c);
                return;
        }
    }
}
