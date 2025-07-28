package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yk3  reason: default package */
public final /* synthetic */ class yk3 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ yk3(kl3 kl3, long j, int i) {
        this.a = i;
        this.b = kl3;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        jba jba = (jba) obj;
        switch (this.a) {
            case 0:
                int ordinal = jba.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    kl3 kl3 = this.b;
                    xs7.D(kl3.a, kl3.c.b().plus(sk9.a), ru3.c, new jl3(kl3, this.c, (Continuation) null));
                }
                return jue.a;
            case 1:
                if (zk3.$EnumSwitchMapping$1[jba.ordinal()] == 1) {
                    kl3 kl32 = this.b;
                    xs7.E(kl32.a, kl32.c.b(), (ru3) null, new bl3(kl32, this.c, (Continuation) null), 2);
                }
                return jue.a;
            default:
                if (zk3.$EnumSwitchMapping$1[jba.ordinal()] == 1) {
                    kl3 kl33 = this.b;
                    xs7.E(kl33.a, kl33.c.b(), (ru3) null, new al3(kl33, this.c, (Continuation) null), 2);
                }
                return jue.a;
        }
    }
}
