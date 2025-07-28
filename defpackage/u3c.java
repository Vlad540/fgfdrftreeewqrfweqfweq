package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u3c  reason: default package */
public final class u3c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ y3c Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u3c(y3c y3c, Continuation continuation) {
        super(2, continuation);
        this.Y = y3c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u3c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            if (this.Y.A0.getValue() instanceof n3c) {
                return jue;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ((e40) this.Y.u()).e = new Long(currentTimeMillis);
            y3c y3c = this.Y;
            this.X = 1;
            obj = y3c.s(y3c, currentTimeMillis, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            y3c y3c2 = this.Y;
            h3c h3c = y3c2.c;
            z2c z2c = y3c2.b;
            h3c.getClass();
            taf.o(h3c.b, new c3c(z2c, true));
        } else {
            y3c y3c3 = this.Y;
            this.X = 2;
            if (y3c.q(y3c3, this) == pu3) {
                return pu3;
            }
        }
        return jue;
    }
}
