package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: nb2  reason: default package */
public final /* synthetic */ class nb2 implements UnaryOperator {
    public final /* synthetic */ vo8 a;
    public final /* synthetic */ v00 b;
    public final /* synthetic */ o10 c;
    public final /* synthetic */ ak4 d;

    public /* synthetic */ nb2(vo8 vo8, v00 v00, o10 o10, ak4 ak4) {
        this.a = vo8;
        this.b = v00;
        this.c = o10;
        this.d = ak4;
    }

    public final Object apply(Object obj) {
        ob2 ob2 = (ob2) obj;
        return new ob2(this.a.b, this.b.a, this.c.q, this.d, false);
    }
}
