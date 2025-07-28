package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: b62  reason: default package */
public final class b62 {
    public static final b62 f = new b62((h62) null, 0, 0, 0, Collections.emptyList());
    public static final b62 g = new b62((h62) null, 0, 0, 0, Collections.emptyList());
    public final h62 a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;

    public b62(h62 h62, int i, long j, long j2, List list) {
        this.a = h62;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, a62] */
    public final a62 a() {
        ? obj = new Object();
        obj.o = this.a;
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.X = this.e;
        return obj;
    }
}
