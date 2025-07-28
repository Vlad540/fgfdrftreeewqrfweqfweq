package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ngf  reason: default package */
public final class ngf extends l5e implements i26 {
    public boolean X;
    public int Y;
    public final /* synthetic */ zgf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ngf(zgf zgf, Continuation continuation) {
        super(2, continuation);
        this.Z = zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ngf(this.Z, continuation);
    }

    public final Object o(Object obj) {
        boolean z;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            zgf zgf = this.Z;
            boolean f = zgf.f();
            xff a = zgf.a(zgf);
            long j = zgf.a;
            long j2 = zgf.b;
            this.X = f;
            this.Y = 1;
            obj = a.a(j, j2, this);
            if (obj == pu3) {
                return pu3;
            }
            z = f;
        } else if (i == 1) {
            z = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahf ahf = (ahf) obj;
        boolean z2 = false;
        boolean z3 = ahf != null && ahf.e;
        boolean z4 = ahf != null && ahf.f;
        String str = ahf != null ? ahf.d : null;
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        return new jm0(z, z3, z4, !z2);
    }
}
