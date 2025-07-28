package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: cab  reason: default package */
public final class cab extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hab Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ RectF w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cab(hab hab, String str, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
        this.Z = str;
        this.w0 = rectF;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cab(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            bs4 bs4 = this.Y.b;
            this.X = 1;
            if (bs4.h(this.Z, this.w0, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
