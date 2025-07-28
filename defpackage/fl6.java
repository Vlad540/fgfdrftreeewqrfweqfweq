package defpackage;

import java.io.IOException;

/* renamed from: fl6  reason: default package */
public final class fl6 extends rde {
    public final /* synthetic */ gl6 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fl6(String str, gl6 gl6, int i, long j) {
        super(str, true);
        this.e = gl6;
        this.f = i;
        this.g = j;
    }

    public final long a() {
        gl6 gl6 = this.e;
        try {
            gl6.N0.S(this.f, this.g);
            return -1;
        } catch (IOException e2) {
            gl6.d(e2);
            return -1;
        }
    }
}
