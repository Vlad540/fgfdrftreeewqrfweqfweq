package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: rb2  reason: default package */
public final /* synthetic */ class rb2 implements UnaryOperator {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ak4 d;

    public /* synthetic */ rb2(long j, long j2, String str, ak4 ak4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = ak4;
    }

    public final Object apply(Object obj) {
        ob2 ob2 = (ob2) obj;
        return new ob2(this.a, this.b, this.c, this.d, false);
    }
}
