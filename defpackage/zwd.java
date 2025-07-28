package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: zwd  reason: default package */
public final class zwd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwd(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zwd zwd = new zwd(continuation, this.Y);
        zwd.X = obj;
        return zwd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        k77[] k77Arr = StickersSettingsScreen.Y;
        StickersSettingsScreen stickersSettingsScreen = this.Y;
        stickersSettingsScreen.getClass();
        if (a34 instanceof v03) {
            stickersSettingsScreen.getRouter().C();
        } else if (a34 instanceof a34) {
            vwd.c.R1(a34);
        }
        return jue.a;
    }
}
