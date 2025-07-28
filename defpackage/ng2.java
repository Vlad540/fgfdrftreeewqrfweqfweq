package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ng2  reason: default package */
public final class ng2 extends l5e implements i26 {
    public final /* synthetic */ ah2 X;
    public final /* synthetic */ int Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng2(ah2 ah2, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ah2;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ng2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ng2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ah2.h1;
        ah2 ah2 = this.X;
        k68 x = ah2.x();
        jue jue = jue.a;
        if (x == null) {
            return jue;
        }
        int i = a2a.l;
        l05 l05 = ah2.R0;
        int i2 = this.Y;
        if (i2 == i) {
            boolean z = x instanceof b68;
            taf.o(l05, new g05(x.j(), x.h(), x.x(), (!z || !((b68) x).X) ? z ? ak4.X : ak4.c : ak4.Z));
        } else if (i2 == a2a.m) {
            boolean z2 = x instanceof b68;
            taf.o(l05, new g05(x.j(), x.h(), x.x(), (!z2 || !((b68) x).X) ? z2 ? ak4.o : ak4.b : ak4.Y));
        } else {
            int i3 = a2a.j;
            l05 l052 = ah2.S0;
            if (i2 == i3) {
                hf2 hf2 = hf2.c;
                long j = x.j();
                Long l = new Long(x.h());
                hf2.getClass();
                taf.o(l052, hf2.Z1(j, l));
            } else if (i2 == a2a.k) {
                hf2 hf22 = hf2.c;
                long j2 = x.j();
                hf22.getClass();
                rf0.j(":chats?id=" + ah2.b + "&type=local&message_id=" + j2, l052);
            } else if (i2 == a2a.c) {
                hf2 hf23 = hf2.c;
                long j3 = x.j();
                hf23.getClass();
                taf.o(l052, hf2.Z1(j3, (Long) null));
            }
        }
        return jue;
    }
}
