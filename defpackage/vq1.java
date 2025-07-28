package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vq1  reason: default package */
public final /* synthetic */ class vq1 implements au, m48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vq1(Object obj, int i, int i2, int i3) {
        this.o = obj;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public ch7 apply(Object obj) {
        Void voidR = (Void) obj;
        w30 w30 = ((zq1) this.o).n;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        return ct0.w(new vr1(w30.e(i2, i3, i), (Executor) w30.g, i3));
    }

    public void f(nn6 nn6, int i) {
        nn6 nn62 = nn6;
        int i2 = i;
        nn62.A0(((o48) this.o).c, i2, this.a, this.b, this.c);
    }
}
