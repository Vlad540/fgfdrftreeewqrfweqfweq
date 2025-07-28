package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ly  reason: default package */
public final class ly extends l5e implements i26 {
    public final /* synthetic */ ny X;
    public final /* synthetic */ vo8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ly(ny nyVar, vo8 vo8, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = nyVar;
        this.Y = vo8;
        this.Z = l;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ly(this.X, this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        o10 o10;
        String str;
        String t;
        Object obj2;
        boolean z;
        wx3.H(obj);
        ny nyVar = this.X;
        nyVar.getClass();
        vo8 vo8 = this.Y;
        if (vo8.o()) {
            vo8 = vo8.G0;
        }
        jj7 jj7 = vo8.D0;
        Integer num = null;
        if (jj7 == null || jj7.v() <= 0) {
            jj7 = null;
        }
        boolean z2 = this.w0;
        if (jj7 == null) {
            return new wia((Object) null, z2 ? Integer.valueOf(uhc.d) : null);
        }
        boolean z3 = false;
        Long l = this.Z;
        int i = -1;
        if (l != null) {
            Iterator it = ((List) jj7.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                o10 o102 = (o10) obj2;
                j10 j10 = o102.a;
                int i2 = j10 == null ? -1 : jy.$EnumSwitchMapping$0[j10.ordinal()];
                if (i2 == 1) {
                    a10 a10 = o102.b;
                    z = hhd.f(a10 != null ? Long.valueOf(a10.w0) : null, l);
                    continue;
                } else if (i2 == 2) {
                    n10 n10 = o102.d;
                    z = hhd.f(n10 != null ? Long.valueOf(n10.a) : null, l);
                    continue;
                } else if (i2 == 3) {
                    f10 f10 = o102.g;
                    z = hhd.f(f10 != null ? Long.valueOf(f10.a) : null, l);
                    continue;
                } else if (i2 == 4) {
                    v00 v00 = o102.j;
                    z = hhd.f(v00 != null ? Long.valueOf(v00.a) : null, l);
                    continue;
                } else if (i2 == 5) {
                    l00 l00 = o102.e;
                    z = hhd.f(l00 != null ? Long.valueOf(l00.a) : null, l);
                    continue;
                } else {
                    throw new IllegalStateException(("Attach with given id = " + l + " not found").toString());
                }
                if (z) {
                    break;
                }
            }
            if (obj2 != null) {
                o10 = (o10) obj2;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            o10 = jj7.u(0);
            if (o10 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (o10.f()) {
            a10 a102 = o10.b;
            if (a102.X) {
                str = a102.z0;
                if (str == null) {
                    str = a102.a();
                }
            } else {
                str = a102.a();
            }
        } else if (o10.i()) {
            str = o10.d.d;
        } else {
            if (o10.h()) {
                i10 i10 = o10.f;
                str = i10.h;
                if (r1g.p(str)) {
                    t = i10.b;
                }
            } else {
                if (o10.g()) {
                    a10 a103 = o10.g.f;
                    if (a103 != null) {
                        z3 = true;
                    }
                    if (z3 && a103 != null) {
                        str = a103.a();
                    }
                } else if (o10.c()) {
                    o10 o103 = o10.j.d;
                    if (o103 != null) {
                        j10 j102 = o103.a;
                        if (j102 != null) {
                            i = jy.$EnumSwitchMapping$0[j102.ordinal()];
                        }
                        if (i == 1) {
                            a10 a104 = o103.b;
                            if (!a104.X) {
                                String str2 = a104.b;
                                if (str2 == null || str2.length() == 0) {
                                    String str3 = a104.a;
                                    if (!(str3 == null || str3.length() == 0)) {
                                        t = vx3.t(str3, fj0.b, ej0.a);
                                    }
                                } else {
                                    t = str2;
                                }
                            }
                        } else if (i == 2) {
                            t = o103.d.d;
                        }
                        t = null;
                    }
                } else if (o10.b()) {
                    t97 t97 = nyVar.g;
                    q00 q00 = o10.k;
                    str = ((zf3) t97.getValue()).a(((zf3) t97.getValue()).b(q00), q00);
                }
                str = null;
            }
            str = t;
        }
        if (o10.e()) {
            num = Integer.valueOf(uhc.b);
        } else if (o10.c()) {
            num = Integer.valueOf(uhc.a);
        } else if (o10.a()) {
            num = Integer.valueOf(uhc.c);
        } else if (z2) {
            num = Integer.valueOf(uhc.d);
        }
        return new wia(str, num);
    }
}
