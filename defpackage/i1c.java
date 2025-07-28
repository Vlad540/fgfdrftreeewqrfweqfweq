package defpackage;

import java.io.IOException;

/* renamed from: i1c  reason: default package */
public final class i1c extends rde {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ k1c f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1c(String str, k1c k1c) {
        super(str, true);
        this.f = k1c;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                k1c k1c = this.f;
                try {
                    return k1c.h() ? 0 : -1;
                } catch (IOException e2) {
                    k1c.c(e2);
                }
            default:
                this.f.b.d();
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1c(k1c k1c) {
        super(wn6.l(new StringBuilder(), k1c.g, " writer"), true);
        this.f = k1c;
    }
}
