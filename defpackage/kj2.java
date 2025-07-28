package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;

/* renamed from: kj2  reason: default package */
public final class kj2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatNotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kj2(Continuation continuation, ChatNotificationsSettingsScreen chatNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = chatNotificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kj2 kj2 = new kj2(continuation, this.Y);
        kj2.X = obj;
        return kj2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.c.E((List) this.X);
        return jue.a;
    }
}
