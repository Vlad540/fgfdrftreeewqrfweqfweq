package defpackage;

import android.content.Context;

/* renamed from: ja2  reason: default package */
public final class ja2 extends kr7 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja2(int i, int i2, Object obj) {
        super(i);
        this.g = i2;
        this.h = obj;
    }

    public final Object a(Object obj) {
        switch (this.g) {
            case 0:
                i22 i22 = ((ha2) obj).a;
                xm8 xm8 = i22.c;
                if (xm8 == null) {
                    return null;
                }
                return ((ma2) this.h).d(i22, xm8, 2, false);
            case 1:
                wia wia = (wia) obj;
                return new tb0(dz9.a, new ub0((CharSequence) wia.a, ((Number) wia.b).longValue()), km4.y0.n((Context) this.h).g());
            default:
                return null;
        }
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 2:
                v1f v1f = (v1f) obj3;
                v1f v1f2 = (v1f) obj2;
                String str = (String) obj;
                w1f w1f = (w1f) this.h;
                if (z) {
                    String str2 = w1f.d;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        tn7 tn7 = tn7.X;
                        long j = v1f2.b;
                        String str3 = v1f2.a;
                        int g2 = w1f.o.g();
                        boolean a = v1f2.c.a();
                        StringBuilder j2 = m4b.j("Player autoplay. State evicted, should free player, \n                                |msgId:", j, ", \n                                |attachId:", str3);
                        j2.append("\n                                |states count:");
                        j2.append(g2);
                        j2.append("\n                                |playing:");
                        j2.append(a);
                        fn6.d(tn7, str2, i0e.E(j2.toString()), (Throwable) null);
                    }
                    v1f2.o.a(v1f2.c);
                    h9f h9f = (h9f) v1f2.Y.get();
                    if (h9f != null) {
                        h9f.t();
                        return;
                    }
                    return;
                }
                w1f.getClass();
                return;
            default:
                return;
        }
    }

    public int h(Object obj) {
        switch (this.g) {
            case 2:
                return 1;
            default:
                return super.h(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ja2(ma2 ma2) {
        super(500);
        this.g = 0;
        this.h = ma2;
    }
}
