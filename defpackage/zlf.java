package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zlf  reason: default package */
public final class zlf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kmf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zlf(kmf kmf, Continuation continuation) {
        super(2, continuation);
        this.Y = kmf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zlf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        u12 u12;
        Long l;
        pu3 pu3 = pu3.a;
        int i = this.X;
        Long l2 = null;
        if (i == 0) {
            wx3.H(obj);
            kmf kmf = this.Y;
            p86 p86 = kmf.x0;
            long j = kmf.b;
            Long l3 = kmf.o;
            if (l3 != null) {
                i22 i22 = (i22) ((aw2) ((bv2) kmf.z0.getValue())).m(l3.longValue()).a.getValue();
                Long valueOf = i22 != null ? Long.valueOf(i22.b.a) : null;
                if (valueOf != null && valueOf.longValue() == 0) {
                    valueOf = null;
                }
                l = valueOf;
            } else {
                l = null;
            }
            String str = this.Y.X;
            this.X = 1;
            obj = p86.a(j, l, str, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f49 f49 = (f49) obj;
        jue jue = jue.a;
        if (f49 == null) {
            this.Y.w0.a((String) null, new Exception(us8.j(this.Y.b, "Root url for ", " not found")));
            this.Y.H0.m((Object) null, oia.o);
            return jue;
        }
        this.Y.M0 = f49.c;
        kmf kmf2 = this.Y;
        String str2 = f49.b;
        kmf2.getClass();
        taf.o(kmf2.O0, new mlf(str2));
        this.Y.K0.setValue(f49.a);
        kmf kmf3 = this.Y;
        long j2 = kmf3.b;
        String str3 = f49.a;
        bff bff = kmf3.c;
        if (bff == bff.FOLDER) {
            u12 = new u12(5, 2L);
        } else {
            u12 u122 = gff.c;
            Long l4 = kmf3.o;
            if (l4 != null) {
                i22 i222 = (i22) ((aw2) ((bv2) kmf3.z0.getValue())).m(l4.longValue()).a.getValue();
                if (i222 != null) {
                    if (i222.F()) {
                        tf3 k = i222.k();
                        if (k != null) {
                            l2 = Long.valueOf(k.n());
                        }
                        if (l2 != null) {
                            u122 = new eff(l2.longValue());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (i222.J()) {
                        tf3 k2 = i222.k();
                        if (k2 != null) {
                            l2 = Long.valueOf(k2.n());
                        }
                        if (l2 != null) {
                            u122 = new fff(l2.longValue());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        boolean G = i222.G();
                        o62 o62 = i222.b;
                        u122 = G ? new cff(o62.a) : new dff(o62.a);
                    }
                }
            }
            u12 = u122;
        }
        jff jff = new jff(j2, str3, bff, u12);
        ((iff) kmf3.B0.getValue()).a(1, j2, str3, bff, u12, (String) null);
        for (q57 d : (List) kmf3.G0.o) {
            d.d(jff);
        }
        kmf3.E0 = jff;
        return jue;
    }
}
