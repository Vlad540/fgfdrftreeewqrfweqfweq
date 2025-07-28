package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wvd  reason: default package */
public final class wvd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cwd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wvd(cwd cwd, Continuation continuation) {
        super(2, continuation);
        this.Y = cwd;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wvd wvd = new wvd(this.Y, continuation);
        wvd.X = obj;
        return wvd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        cwd cwd = this.Y;
        List list = (List) cwd.z0.updateAndGet(new at5((List) this.X, 2, cwd));
        String str = ((xvd) cwd.A0.get()).a;
        if (str == null || str.length() == 0) {
            cwd.Z.m((Object) null, new xrc(2, list));
        }
        return jue.a;
    }
}
