package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: uq1  reason: default package */
public final /* synthetic */ class uq1 implements au {
    public final /* synthetic */ int X;
    public final /* synthetic */ zq1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ uq1(zq1 zq1, ArrayList arrayList, int i, int i2, int i3) {
        this.a = zq1;
        this.b = arrayList;
        this.c = i;
        this.o = i2;
        this.X = i3;
    }

    public final ch7 apply(Object obj) {
        Void voidR = (Void) obj;
        w30 w30 = this.a.n;
        int i = this.X;
        int i2 = this.c;
        int i3 = this.o;
        yr1 e = w30.e(i2, i3, i);
        j36 a2 = j36.a(e.a(i3));
        ph0 ph0 = new ph0(e, (ArrayList) this.b, i3, 1);
        a2.getClass();
        Executor executor = e.b;
        oy1 N = ct0.N(a2, ph0, executor);
        N.c(new b(29, e), executor);
        return ct0.A(N);
    }
}
