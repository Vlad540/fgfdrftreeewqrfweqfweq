package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wgf  reason: default package */
public final class wgf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zgf Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wgf(zgf zgf, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = zgf;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wgf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            zgf zgf = this.Y;
            xff a = zgf.a(zgf);
            this.X = 1;
            a.getClass();
            obj = r1g.h(a.a, new ct8(a, this.Z, zgf.a, zgf.b), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
