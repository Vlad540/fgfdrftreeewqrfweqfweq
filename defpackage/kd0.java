package defpackage;

import java.io.Serializable;

/* renamed from: kd0  reason: default package */
public final class kd0 implements Serializable {
    public final long a;
    public final String b;
    public final String c;

    public kd0(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Background{id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", color=");
        return wn6.l(sb, this.c, "}");
    }
}
