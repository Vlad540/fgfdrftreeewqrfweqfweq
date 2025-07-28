package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: y7d  reason: default package */
public final class y7d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y7d(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((u9d) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y7d y7d = new y7d(this.Y, continuation);
        y7d.X = obj;
        return y7d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        u9d u9d = (u9d) this.X;
        k77[] k77Arr = SettingsListScreen.D0;
        SettingsListScreen settingsListScreen = this.Y;
        settingsListScreen.o0().setTopBarContent(u9d);
        ((nea) settingsListScreen.Z.T0(settingsListScreen, SettingsListScreen.D0[1])).setTitle((CharSequence) u9d.c);
        return jue.a;
    }
}
