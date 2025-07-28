package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q32  reason: default package */
public final class q32 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ o42 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q32(o42 o42, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = o42;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((j8b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q32 q32 = new q32(this.Z, this.w0, continuation);
        q32.Y = obj;
        return q32;
    }

    public final Object o(Object obj) {
        i22 o;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            j8b j8b = (j8b) this.Y;
            if (j8b instanceof f8b) {
                long j = ((f8b) j8b).a;
                o42 o42 = this.Z;
                int i2 = (j > o42.t.get() ? 1 : (j == o42.t.get() ? 0 : -1));
                hcd hcd = o42.f;
                if (i2 == 0) {
                    o42.w.set(false);
                    i22 o2 = o42.o();
                    if (o2 == null) {
                        return jue;
                    }
                    o42.m(o42, o2);
                    if (o42.j == c8b.CREATE && o2.G()) {
                        b6b b6b = new b6b(this.w0);
                        this.X = 1;
                        if (hcd.a(b6b, this) == pu3) {
                            return pu3;
                        }
                    }
                } else if (j == o42.v.get()) {
                    i22 o3 = o42.o();
                    if (o3 == null) {
                        return jue;
                    }
                    o42.m(o42, o3);
                    f6b f6b = new f6b(new hge(i8a.w2), new Integer(phc.A), 6);
                    this.X = 2;
                    if (hcd.a(f6b, this) == pu3) {
                        return pu3;
                    }
                } else if (j != o42.u.get() || (o = o42.o()) == null) {
                    return jue;
                } else {
                    o42.m(o42, o);
                }
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
