package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: tq9  reason: default package */
public final class tq9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tq9 tq9 = new tq9(continuation, this.Y);
        tq9.X = obj;
        return tq9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.X.E((List) this.X);
        return jue.a;
    }
}
