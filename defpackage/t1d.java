package defpackage;

import java.io.Serializable;

/* renamed from: t1d  reason: default package */
public final class t1d implements Serializable {
    public final boolean X;
    public final long a;
    public final String b;
    public final String c;
    public final String o;

    public t1d(long j, String str, String str2, String str3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{=");
        sb.append(this.a);
        sb.append(", current=");
        return hr1.j(sb, this.X, "}");
    }
}
