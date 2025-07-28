package defpackage;

import java.io.IOException;

/* renamed from: zk6  reason: default package */
public final class zk6 extends rde {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ na1 f;
    public final /* synthetic */ Object g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk6(String str, na1 na1, l7c l7c) {
        super(str, true);
        this.f = na1;
        this.g = l7c;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                ((gl6) this.f.c).b.a((y5d) ((l7c) this.g).a);
                return -1;
            default:
                try {
                    ((gl6) this.f.c).b.b((nl6) this.g);
                } catch (IOException e2) {
                    kxa kxa = kxa.a;
                    kxa.a.getClass();
                    kxa.i(4, "Http2Connection.Listener failure for " + ((gl6) this.f.c).o, e2);
                    try {
                        ((nl6) this.g).c(2, e2);
                    } catch (IOException unused) {
                    }
                }
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk6(String str, nl6 nl6, na1 na1) {
        super(str, true);
        this.g = nl6;
        this.f = na1;
    }
}
