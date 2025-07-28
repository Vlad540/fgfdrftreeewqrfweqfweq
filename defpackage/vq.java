package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: vq  reason: default package */
public final class vq extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = appearanceSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((vq) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vq vqVar = new vq(this.Y, continuation);
        vqVar.X = obj;
        return vqVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = AppearanceSettingsScreen.Z;
        AppearanceSettingsScreen appearanceSettingsScreen = this.Y;
        appearanceSettingsScreen.getClass();
        ((c32) appearanceSettingsScreen.c.T0(appearanceSettingsScreen, AppearanceSettingsScreen.Z[0])).setThemeItems((List) this.X);
        return jue.a;
    }
}
