package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ii1  reason: default package */
public final class ii1 extends l5e implements o26 {
    public /* synthetic */ Long X;
    public /* synthetic */ u81 Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ CharSequence w0;
    public final /* synthetic */ aj1 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii1(aj1 aj1, Continuation continuation) {
        super(5, continuation);
        this.x0 = aj1;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ii1 ii1 = new ii1(this.x0, (Continuation) obj5);
        ii1.X = (Long) obj;
        ii1.Y = (u81) obj2;
        ii1.Z = booleanValue;
        ii1.w0 = (CharSequence) obj4;
        jue jue = jue.a;
        ii1.o(jue);
        return jue;
    }

    public final Object o(Object obj) {
        Object value;
        CharSequence charSequence;
        yk1 yk1;
        e07 e07;
        wx3.H(obj);
        Long l = this.X;
        u81 u81 = this.Y;
        boolean z = this.Z;
        CharSequence charSequence2 = this.w0;
        aj1 aj1 = this.x0;
        grd grd = aj1.N0;
        do {
            value = grd.getValue();
            yk1 yk12 = (yk1) value;
            y11 y11 = u81.f;
            String str = null;
            CharSequence charSequence3 = y11 != null ? y11.b : null;
            boolean u = aj1.u();
            boolean z2 = u81.d;
            b65 b65 = u81.e;
            boolean z3 = u81.m;
            boolean z4 = u81.g;
            xk1 xk1 = aj1.Y;
            if (u) {
                xk1.getClass();
                String d = xk1.d(l);
                String e = xk1.e(z4, z2, z3, b65);
                if (e != null) {
                    e07 = new nme(e);
                } else {
                    if (z4 && (b65 instanceof a65)) {
                        str = xk1.a.getString(r1a.f0);
                    } else if (z4) {
                        if (d == null || d.length() == 0) {
                            str = charSequence2;
                        } else {
                            str = d + " · " + charSequence2;
                        }
                    } else if (!(d == null || d.length() == 0)) {
                        str = d;
                    }
                    e07 = new mme(str);
                }
                charSequence = e07.w();
            } else {
                charSequence = xk1.e(z4, z2, z3, b65);
            }
            if (charSequence == null) {
                xk1.getClass();
                charSequence = xk1.d(l);
            }
            int i = 1;
            if (b65 instanceof x55) {
                if (!z4) {
                    i = yk12.a;
                }
                yk12.getClass();
                yk1 = new yk1(i, charSequence3, charSequence);
            } else {
                if (!z4 && (!z || !z3)) {
                    i = 2;
                }
                yk12.getClass();
                yk1 = new yk1(i, charSequence3, charSequence);
            }
            al1 al1 = (al1) aj1.T0.getValue();
            al1.b = yk1;
            for (zk1 x : al1.a) {
                x.x(yk1);
            }
        } while (!grd.b(value, yk1));
        return jue.a;
    }
}
