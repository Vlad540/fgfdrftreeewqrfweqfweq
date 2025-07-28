package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rc9  reason: default package */
public final class rc9 extends l5e implements i26 {
    public qc9 X;
    public u16 Y;
    public int Z;
    public final /* synthetic */ qc9 w0;
    public final /* synthetic */ u16 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc9(qc9 qc9, k3a k3a, Continuation continuation) {
        super(2, continuation);
        this.w0 = qc9;
        this.x0 = k3a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rc9(this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        Throwable th;
        tc9 tc9;
        tc9 tc92;
        u16 u16;
        pu3 pu3 = pu3.a;
        int i = this.Z;
        if (i == 0) {
            wx3.H(obj);
            qc9 qc9 = this.w0;
            this.X = qc9;
            u16 = this.x0;
            this.Y = u16;
            this.Z = 1;
            tc92 = (tc9) qc9;
            if (tc92.d(this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            u16 = this.Y;
            tc9 tc93 = this.X;
            wx3.H(obj);
            tc92 = tc93;
        } else if (i == 2) {
            tc9 = this.X;
            try {
                wx3.H(obj);
                tc9.e((Object) null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            this.X = tc92;
            this.Y = null;
            this.Z = 2;
            Object invoke = u16.invoke(this);
            if (invoke == pu3) {
                return pu3;
            }
            tc9 tc94 = tc92;
            obj = invoke;
            tc9 = tc94;
            tc9.e((Object) null);
            return obj;
        } catch (Throwable th3) {
            tc9 tc95 = tc92;
            th = th3;
            tc9 = tc95;
            tc9.e((Object) null);
            throw th;
        }
    }
}
