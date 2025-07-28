package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: xwd  reason: default package */
public final class xwd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwd(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xwd xwd = new xwd(continuation, this.Y);
        xwd.X = obj;
        return xwd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.X.E((List) this.X);
        return jue.a;
    }
}
