package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: dj9  reason: default package */
public final class dj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dj9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dj9 dj9 = new dj9(continuation, this.Y);
        dj9.X = obj;
        return dj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ec0 ec0 = (ec0) this.X;
        boolean f = hhd.f(ec0, bc0.a);
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (f) {
            k77[] k77Arr = NeuroAvatarsScreen.Q0;
            ((qna) neuroAvatarsScreen.D0.getValue()).g(new jrf(neuroAvatarsScreen, 1));
        } else if (ec0 instanceof cc0) {
            try {
                neuroAvatarsScreen.startActivityForResult(((cc0) ec0).a, 555);
                xg9.g((xg9) neuroAvatarsScreen.E0.getValue(), mnc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                udd.s(neuroAvatarsScreen.getClass().getName(), "failed open camera", (Throwable) null);
                neuroAvatarsScreen.q0().b.a();
            }
        } else if (ec0 instanceof dc0) {
            neuroAvatarsScreen.startActivityForResult(((dc0) ec0).a, 666);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
