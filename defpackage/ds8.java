package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ds8  reason: default package */
public final class ds8 implements Serializable {
    public final long a;
    public final ym8 b;
    public final String c;
    public final List o;

    public ds8(String str, ArrayList arrayList, long j, ym8 ym8) {
        this.c = str;
        this.o = arrayList;
        this.a = j;
        this.b = ym8;
    }

    public final String toString() {
        String v = r1g.v(this.c);
        int p = ete.p(this.o);
        return "{, feedback='" + v + "', highlights=" + p + ", chatId='" + this.a + "', message=" + this.b + "}";
    }
}
