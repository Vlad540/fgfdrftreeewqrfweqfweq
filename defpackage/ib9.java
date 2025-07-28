package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: ib9  reason: default package */
public final class ib9 extends l5e implements i26 {
    public final /* synthetic */ nb9 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ m68 w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ String y0;
    public final /* synthetic */ Bundle z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ib9(nb9 nb9, String str, String str2, m68 m68, String str3, String str4, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.X = nb9;
        this.Y = str;
        this.Z = str2;
        this.w0 = m68;
        this.x0 = str3;
        this.y0 = str4;
        this.z0 = bundle;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ib9(this.X, this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = nb9.K;
        nb9 nb9 = this.X;
        nb9.getClass();
        l68 j = nb9.j(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0);
        r38 r38 = nb9.m;
        if (r38 != null) {
            r38.K();
            q38 q38 = r38.c;
            if (!q38.isConnected()) {
                ez3.j0("The controller is not connected. Ignoring setMediaItem().");
            } else {
                q38.U0(j);
            }
        }
        nb9.r();
        return jue.a;
    }
}
