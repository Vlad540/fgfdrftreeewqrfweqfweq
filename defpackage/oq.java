package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: oq  reason: default package */
public final class oq extends l5e implements i26 {
    public c32 X;
    public int Y;
    public final /* synthetic */ c32 Z;
    public final /* synthetic */ AppearanceSettingsScreen w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oq(c32 c32, AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Z = c32;
        this.w0 = appearanceSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oq) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oq(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        c32 c32;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = AppearanceSettingsScreen.Z;
            dr l0 = this.w0.l0();
            c32 c322 = this.Z;
            this.X = c322;
            this.Y = 1;
            obj = l0.r(this);
            if (obj == pu3) {
                return pu3;
            }
            c32 = c322;
        } else if (i == 1) {
            c32 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c32.a((sj2) obj);
        return jue.a;
    }
}
