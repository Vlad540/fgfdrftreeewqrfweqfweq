package defpackage;

import java.io.Serializable;

/* renamed from: h62  reason: default package */
public final class h62 implements Serializable, yx2 {
    public final long a;
    public final long b;

    public h62(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j == -1) {
            udd.S("Chunk", "", new IllegalStateException("start time is -1"));
        }
        if (j2 == -1) {
            udd.S("Chunk", "", new IllegalStateException("end time is -1"));
        }
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final p7 c() {
        p7 p7Var = new p7(3, false);
        long j = this.a;
        if (j == -1) {
            udd.S("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        p7Var.b = j;
        p7Var.b(this.b);
        return p7Var;
    }
}
