package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;

/* renamed from: lg4  reason: default package */
public final class lg4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DialogNotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lg4(Continuation continuation, DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = dialogNotificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lg4 lg4 = new lg4(continuation, this.Y);
        lg4.X = obj;
        return lg4;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.c.E((List) this.X);
        return jue.a;
    }
}
