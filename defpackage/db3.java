package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: db3  reason: default package */
public final class db3 extends er3 {
    public boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ConfirmPhoneScreen Z;
    public TextView o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(continuation);
        this.Z = confirmPhoneScreen;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        k77[] k77Arr = ConfirmPhoneScreen.G0;
        return this.Z.m0((TextView) null, 0, false, this);
    }
}
