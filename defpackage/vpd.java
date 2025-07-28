package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: vpd  reason: default package */
public final class vpd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ StartConversationScreen Y;
    public final /* synthetic */ z96 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vpd(StartConversationScreen startConversationScreen, z96 z96, Continuation continuation) {
        super(2, continuation);
        this.Y = startConversationScreen;
        this.Z = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vpd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        z96 z96 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = StartConversationScreen.L0;
            dqd m0 = this.Y.m0();
            uj3 uj3 = z96.Y;
            this.X = 1;
            Object U = xs7.U(((pae) m0.o.getValue()).b(), new bqd(m0, uj3, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mpd mpd = mpd.c;
        long j = z96.a;
        mpd.getClass();
        mpd.P1().b(":profile?id=" + j + "&type=contact", (Bundle) null);
        return jue;
    }
}
