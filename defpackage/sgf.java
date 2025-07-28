package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: sgf  reason: default package */
public final class sgf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zgf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sgf(zgf zgf, Continuation continuation) {
        super(2, continuation);
        this.Y = zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sgf(this.Y, continuation);
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
            pec a2 = pec.a(2, "SELECT token FROM webapp_biometry WHERE user_id = ? AND bot_id = ?");
            a2.j(1, zgf.a);
            a2.j(2, zgf.b);
            obj = r1g.g(a.a, new CancellationSignal(), new vff(a, a2, 2), this);
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
