package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: te0  reason: default package */
public final class te0 extends l5e implements i26 {
    public /* synthetic */ int X;
    public final /* synthetic */ ue0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public te0(ue0 ue0, Continuation continuation) {
        super(2, continuation);
        this.Y = ue0;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        jue jue = jue.a;
        ((te0) n(valueOf, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        te0 te0 = new te0(this.Y, continuation);
        te0.X = ((Number) obj).intValue();
        return te0;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = this.X;
        if (i >= 0) {
            ShortcutBadger.applyCount(this.Y.a, i);
        }
        return jue.a;
    }
}
