package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fj3  reason: default package */
public final class fj3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;
    public final /* synthetic */ sr4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj3(hj3 hj3, sr4 sr4, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
        this.Z = sr4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fj3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            hj3 hj3 = this.Y;
            dn3 dn3 = (dn3) hj3.v.getValue();
            sr4 sr4 = this.Z;
            String str = sr4.c;
            String str2 = null;
            String obj2 = str != null ? h0e.B0(str).toString() : null;
            String str3 = sr4.f;
            String obj3 = str3 != null ? h0e.B0(str3).toString() : null;
            this.X = 1;
            dn3.getClass();
            String name = dn3.class.getName();
            StringBuilder sb = new StringBuilder("rename, id = ");
            long j = hj3.n;
            sb.append(j);
            sb.append(" => ");
            sb.append(obj2);
            sb.append(" ");
            sb.append(obj3);
            udd.q(name, sb.toString());
            t97 t97 = dn3.a;
            tf3 i2 = ((di3) t97.getValue()).i(j, false);
            if (i2 != null) {
                ii3 ii3 = (ii3) o23.X(i2.i());
                ((di3) t97.getValue()).c(j, new ai3(obj2, obj3, 1));
                t97 t972 = dn3.d;
                ((tt0) t972.getValue()).c(new lp3(j));
                pk pkVar = (pk) dn3.c.getValue();
                String str4 = ii3 != null ? ii3.a : null;
                if (ii3 != null) {
                    str2 = ii3.b;
                }
                gy9 gy9 = (gy9) pkVar;
                long j2 = j;
                gy9.w(gy9, new on3(5, ((j2b) gy9.z()).a.n(), j, str4, str2, obj2, obj3));
                ((nae) dn3.b.getValue()).f(hr1.o(j2));
                ((tt0) t972.getValue()).c(new lp3(j2));
            }
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
