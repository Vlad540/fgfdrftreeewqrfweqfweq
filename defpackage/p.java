package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* renamed from: p  reason: default package */
public final class p extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AboutAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.Y = aboutAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((p) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p pVar = new p(continuation, this.Y);
        pVar.X = obj;
        return pVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.b.E((List) this.X);
        return jue.a;
    }
}
