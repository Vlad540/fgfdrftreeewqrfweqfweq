package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: uq  reason: default package */
public final class uq extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = appearanceSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((uq) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uq uqVar = new uq(this.Y, continuation);
        uqVar.X = obj;
        return uqVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.X.E((List) this.X);
        return jue.a;
    }
}
