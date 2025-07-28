package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* renamed from: d6d  reason: default package */
public final class d6d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsBlacklistScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d6d(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.Y = settingsBlacklistScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d6d d6d = new d6d(continuation, this.Y);
        d6d.X = obj;
        return d6d;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.view.View, p4a] */
    public final Object o(Object obj) {
        wx3.H(obj);
        Map map = (Map) this.X;
        k77[] k77Arr = SettingsBlacklistScreen.Z;
        SettingsBlacklistScreen settingsBlacklistScreen = this.Y;
        settingsBlacklistScreen.getClass();
        ((p4a) settingsBlacklistScreen.X.T0(settingsBlacklistScreen, SettingsBlacklistScreen.Z[1])).setVisibility(map.values().isEmpty() ? 0 : 8);
        settingsBlacklistScreen.Y.E(o23.s0(map.values()));
        return jue.a;
    }
}
