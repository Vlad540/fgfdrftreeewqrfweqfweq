package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: uf2  reason: default package */
public final /* synthetic */ class uf2 implements UnaryOperator {
    public final /* synthetic */ ah2 a;
    public final /* synthetic */ s78 b;
    public final /* synthetic */ vo8 c;

    public /* synthetic */ uf2(ah2 ah2, s78 s78, vo8 vo8) {
        this.a = ah2;
        this.b = s78;
        this.c = vo8;
    }

    public final Object apply(Object obj) {
        s78 s78 = (s78) obj;
        ah2 ah2 = this.a;
        s78 s782 = this.b;
        if (ah2.u(ah2, s782)) {
            return s782;
        }
        long j = this.c.c;
        return new s78(j, j, ah2.L0, ah2.b);
    }
}
