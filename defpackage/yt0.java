package defpackage;

import java.io.Serializable;

/* renamed from: yt0  reason: default package */
public final class yt0 implements Serializable {
    public final String X;
    public final boolean Y;
    public final long Z;
    public final String a;
    public final hu0 b;
    public final int c;
    public final String o;
    public final boolean w0;

    public yt0(vt0 vt0) {
        this.a = vt0.a;
        this.b = vt0.b;
        this.c = vt0.c;
        this.o = vt0.d;
        this.X = vt0.e;
        this.Y = vt0.f;
        this.w0 = vt0.g;
        this.Z = vt0.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yt0)) {
            return false;
        }
        yt0 yt0 = (yt0) obj;
        if (r1g.c(this.a, yt0.a) && r1g.c(this.X, yt0.X) && this.b == yt0.b && this.Y == yt0.Y && this.c == yt0.c && this.Z == yt0.Z) {
            return r1g.c(this.o, yt0.o);
        }
        return false;
    }
}
