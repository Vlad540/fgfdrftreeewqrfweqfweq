package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: sq9  reason: default package */
public final class sq9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sq9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sq9 sq9 = new sq9(continuation, this.Y);
        sq9.X = obj;
        return sq9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.Z.E((List) this.X);
        return jue.a;
    }
}
