package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ke5  reason: default package */
public final class ke5 extends l5e implements i26 {
    public qc9 X;
    public le5 Y;
    public String Z;
    public int w0;
    public final /* synthetic */ le5 x0;
    public final /* synthetic */ String y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ke5(le5 le5, String str, Continuation continuation) {
        super(2, continuation);
        this.x0 = le5;
        this.y0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ke5(this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        qc9 qc9;
        String str;
        le5 le5;
        qc9 qc92;
        pu3 pu3 = pu3.a;
        int i = this.w0;
        if (i == 0) {
            wx3.H(obj);
            le5 le52 = this.x0;
            qc92 = le52.l;
            this.X = qc92;
            this.Y = le52;
            str = this.y0;
            this.Z = str;
            this.w0 = 1;
            if (qc92.d(this) == pu3) {
                return pu3;
            }
            le5 = le52;
        } else if (i == 1) {
            String str2 = this.Z;
            le5 = this.Y;
            qc9 qc93 = this.X;
            wx3.H(obj);
            qc9 qc94 = qc93;
            str = str2;
            qc92 = qc94;
        } else if (i == 2) {
            qc9 = this.X;
            try {
                wx3.H(obj);
                ((tc9) qc9).e((Object) null);
                return jue.a;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            hcd hcd = le5.m;
            this.X = qc92;
            this.Y = null;
            this.Z = null;
            this.w0 = 2;
            if (hcd.a(str, this) == pu3) {
                return pu3;
            }
            qc9 = qc92;
            ((tc9) qc9).e((Object) null);
            return jue.a;
        } catch (Throwable th2) {
            th = th2;
            qc9 = qc92;
            ((tc9) qc9).e((Object) null);
            throw th;
        }
    }
}
