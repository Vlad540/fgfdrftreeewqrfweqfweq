package defpackage;

import java.util.List;

/* renamed from: uve  reason: default package */
public final class uve {
    public final long a;
    public final String b;
    public final List c;
    public final ls8 d;

    public uve(long j, String str, List list, ls8 ls8) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = ls8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uve)) {
            return false;
        }
        uve uve = (uve) obj;
        return this.a == uve.a && hhd.f(this.b, uve.b) && hhd.f(this.c, uve.c) && this.d == uve.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + c3d.f(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "UpdateTextEntity(id=" + this.a + ", text=" + this.b + ", elements=" + this.c + ", status=" + this.d + ")";
    }
}
