package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;

/* renamed from: sga  reason: default package */
public final class sga extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OtherNotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sga(Continuation continuation, OtherNotificationsSettingsScreen otherNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = otherNotificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sga sga = new sga(continuation, this.Y);
        sga.X = obj;
        return sga;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.c.E((List) this.X);
        return jue.a;
    }
}
