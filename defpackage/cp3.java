package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cp3  reason: default package */
public final class cp3 extends l5e implements i26 {
    public final /* synthetic */ fp3 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cp3(fp3 fp3, String str, Continuation continuation) {
        super(2, continuation);
        this.X = fp3;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cp3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cp3(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        fp3 fp3 = this.X;
        List list = ((bk3) fp3.b.getValue()).a;
        if (list != null) {
            return fp3.a(fp3, list, this.Y);
        }
        return null;
    }
}
