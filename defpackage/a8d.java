package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: a8d  reason: default package */
public final class a8d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a8d(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((h05) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a8d a8d = new a8d(this.Y, continuation);
        a8d.X = obj;
        return a8d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        h05 h05 = (h05) this.X;
        v7d v7d = h05 instanceof v7d ? (v7d) h05 : null;
        boolean z = v7d instanceof v7d;
        jue jue = jue.a;
        if (z) {
            SettingsListScreen settingsListScreen = this.Y;
            hhd.q(settingsListScreen.getContext(), v7d.a);
            CharSequence a = v7d.b.a(settingsListScreen.getContext());
            if (a != null && hhd.y()) {
                hba hba = (hba) settingsListScreen.w0.getValue();
                hba.f(new vba(phc.s));
                hba.i(a);
                hba.j();
            }
        }
        return jue;
    }
}
