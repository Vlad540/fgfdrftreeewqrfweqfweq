package defpackage;

import java.math.BigInteger;

/* renamed from: mxf  reason: default package */
public final class mxf extends b97 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7c b;
    public final /* synthetic */ k7c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxf(k7c k7c, k7c k7c2, int i) {
        super(1);
        this.a = i;
        this.b = k7c;
        this.c = k7c2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                aod aod = (aod) obj;
                k7c k7c = this.b;
                long j = k7c.a;
                long j2 = 0;
                BigInteger bigInteger = aod.h;
                k7c.a = j + (bigInteger != null ? bigInteger.longValue() : 0);
                k7c k7c2 = this.c;
                long j3 = k7c2.a;
                BigInteger bigInteger2 = aod.i;
                if (bigInteger2 != null) {
                    j2 = bigInteger2.longValue();
                }
                k7c2.a = j3 + j2;
                return jue.a;
            default:
                bod bod = (bod) obj;
                k7c k7c3 = this.b;
                long j4 = k7c3.a;
                long j5 = 0;
                BigInteger bigInteger3 = bod.h;
                k7c3.a = j4 + (bigInteger3 != null ? bigInteger3.longValue() : 0);
                k7c k7c4 = this.c;
                long j6 = k7c4.a;
                BigInteger bigInteger4 = bod.i;
                if (bigInteger4 != null) {
                    j5 = bigInteger4.longValue();
                }
                k7c4.a = j6 + j5;
                return jue.a;
        }
    }
}
