package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: ovd  reason: default package */
public final class ovd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ovd(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.Y = stickersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ovd ovd = new ovd(continuation, this.Y);
        ovd.X = obj;
        return ovd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wxd wxd = (wxd) this.X;
        k77[] k77Arr = StickersScreen.z0;
        StickersScreen stickersScreen = this.Y;
        nea m0 = stickersScreen.m0();
        CharSequence a = wxd.a.a(stickersScreen.getContext());
        if (a == null) {
            a = "";
        }
        m0.setTitle(a);
        String str = wxd.b;
        if (str != null) {
            stickersScreen.m0().setSubtitle((CharSequence) str);
        }
        return jue.a;
    }
}
