package defpackage;

import java.nio.ByteBuffer;

/* renamed from: hke  reason: default package */
public final /* synthetic */ class hke implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cle b;
    public final /* synthetic */ mu0 c;

    public /* synthetic */ hke(cle cle, mu0 mu0, int i) {
        this.a = i;
        this.b = cle;
        this.c = mu0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                cle cle = this.b;
                ByteBuffer e = cle.i.e();
                mu0 mu0 = this.c;
                int i = mu0.c;
                return cle.a.unwrap(e, (ByteBuffer[]) mu0.e, mu0.b, i);
            default:
                cle cle2 = this.b;
                ByteBuffer e2 = cle2.j.e();
                mu0 mu02 = this.c;
                int i2 = mu02.c;
                return cle2.a.wrap((ByteBuffer[]) mu02.e, mu02.b, i2, e2);
        }
    }
}
