package defpackage;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: px6  reason: default package */
public final class px6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px6(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((kx6) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        px6 px6 = new px6(continuation, this.Y);
        px6.X = obj;
        return px6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kx6 kx6 = (kx6) this.X;
        if (kx6 instanceof kx6) {
            InputNameScreen inputNameScreen = this.Y;
            bm3.p(inputNameScreen);
            k77[] k77Arr = InputNameScreen.F0;
            sz6 sz6 = (sz6) inputNameScreen.w0.getValue();
            z7c z7c = kx6.b;
            Class<y2b> cls = y2b.class;
            Object E = ek8.E(inputNameScreen.getArgs(), "screen:input_name:avatars", cls);
            if (E != null) {
                sz6.getClass();
                sz6.a(n06.f(new NeuroAvatarsScreen(z7c, (y2b) ((Parcelable) E)), (wr3) null, (wr3) null), "InputNameScreen");
                return jue.a;
            }
            throw new IllegalArgumentException(wn6.i("No value passed for key screen:input_name:avatars of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
