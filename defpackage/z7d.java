package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: z7d  reason: default package */
public final class z7d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z7d(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z7d z7d = new z7d(this.Y, continuation);
        z7d.X = obj;
        return z7d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.B0.E((List) this.X);
        return jue.a;
    }
}
