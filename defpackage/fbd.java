package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: fbd  reason: default package */
public final class fbd extends l5e implements i26 {
    public final /* synthetic */ View X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fbd(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        n(bool, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fbd((ViewGroup) this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ek8.g(this.X, ShareDataPickerScreen.I0, (u16) null);
        return jue.a;
    }
}
