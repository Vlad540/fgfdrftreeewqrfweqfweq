package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: w3c  reason: default package */
public final class w3c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ y3c Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w3c(y3c y3c, Continuation continuation) {
        super(2, continuation);
        this.Y = y3c;
    }

    public final Object invoke(Object obj, Object obj2) {
        n((ou3) obj, (Continuation) obj2).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w3c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ek8.q(50, this) == pu3) {
                return pu3;
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            k77[] k77Arr = y3c.N0;
            y3c y3c = this.Y;
            o60 o60 = (o60) y3c.z0.getValue();
            if (o60 != null) {
                int a = y3c.v().a();
                ArrayList arrayList = o60.a;
                double log10 = a == 0 ? -45.0d : Math.log10(((double) a) / ((double) 32768)) * 20.0d;
                if (log10 < -45.0d) {
                    log10 = -45.0d;
                }
                arrayList.add(Integer.valueOf((int) (((log10 - -45.0d) * ((double) 32768)) / 45.0d)));
                o60.a();
            }
            y3c.C0.m((Object) null, new Long((System.currentTimeMillis() - y3c.Y) + y3c.X));
            this.X = 2;
        } while (ek8.q(50, this) != pu3);
        return pu3;
    }
}
