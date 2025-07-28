package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: za7  reason: default package */
public final class za7 extends l5e implements i26 {
    public qc9 X;
    public ab7 Y;
    public lte Z;
    public int w0;
    public final /* synthetic */ ab7 x0;
    public final /* synthetic */ lte y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public za7(ab7 ab7, lte lte, Continuation continuation) {
        super(2, continuation);
        this.x0 = ab7;
        this.y0 = lte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new za7(this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        qc9 qc9;
        lte lte;
        ab7 ab7;
        qc9 qc92;
        jue jue = pu3.a;
        int i = this.w0;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ab7 ab72 = this.x0;
            qc92 = ab72.f;
            this.X = qc92;
            this.Y = ab72;
            lte = this.y0;
            this.Z = lte;
            this.w0 = 1;
            if (qc92.d(this) == jue) {
                return jue;
            }
            ab7 = ab72;
        } else if (i != 1) {
            if (i == 2) {
                qc9 = this.X;
            } else if (i == 3) {
                qc9 = this.X;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                wx3.H(obj);
                ((tc9) qc9).e((Object) null);
                return jue2;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            lte lte2 = this.Z;
            ab7 = this.Y;
            qc9 qc93 = this.X;
            wx3.H(obj);
            qc9 qc94 = qc93;
            lte = lte2;
            qc92 = qc94;
        }
        try {
            try {
                boolean containsKey = ab7.a.k.containsKey(Long.valueOf(lte.b));
                long j = lte.b;
                if (containsKey) {
                    this.X = qc92;
                    this.Y = null;
                    this.Z = null;
                    this.w0 = 2;
                    ab7.a(ab7, j);
                    if (jue2 == jue) {
                        return jue;
                    }
                } else {
                    this.X = qc92;
                    this.Y = null;
                    this.Z = null;
                    this.w0 = 3;
                    ab7.b(ab7, j);
                    if (jue2 == jue) {
                        return jue;
                    }
                }
                qc9 = qc92;
                ((tc9) qc9).e((Object) null);
                return jue2;
            } catch (Throwable th2) {
                th = th2;
                qc9 = qc92;
                ((tc9) qc9).e((Object) null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            qc9 = qc92;
            ((tc9) qc9).e((Object) null);
            throw th;
        }
    }
}
