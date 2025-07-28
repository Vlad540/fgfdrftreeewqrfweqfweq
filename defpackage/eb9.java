package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eb9  reason: default package */
public final class eb9 implements rj5 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nb9 o;

    public eb9(long j, String str, String str2, nb9 nb9, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = nb9;
        this.X = j2;
    }

    public final Object a(Object obj, Continuation continuation) {
        if (((zj4) obj).b == 3) {
            int i = nb9.K;
            StringBuilder sb = new StringBuilder();
            long j = this.a;
            sb.append(j);
            sb.append(" | ");
            String str = this.b;
            sb.append(str);
            sb.append(" is loaded, ");
            sb.append(this.c);
            udd.q("nb9", sb.toString());
            nb9 nb9 = this.o;
            nb9.d.v(j, str, new be8(28));
            nb9.f.c(new ove(this.X, this.a, 0));
        }
        return jue.a;
    }
}
