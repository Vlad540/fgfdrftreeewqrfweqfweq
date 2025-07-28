package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: fl2  reason: default package */
public final class fl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((fl2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fl2 fl2 = new fl2(continuation, this.Y);
        fl2.X = obj;
        return fl2;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final Object o(Object obj) {
        wx3.H(obj);
        wz7 wz7 = (wz7) this.X;
        String name = this.Y.getClass().getName();
        fn6 fn6 = udd.e;
        jv5 jv5 = null;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            ob7 ob7 = this.Y.lifecycleOwner.R().d;
            ob7 ob72 = this.Y.getViewLifecycleOwner().R().d;
            fn6.d(tn7, name, "got mediaBarViewModel.upEvents " + wz7 + " " + ob7 + "," + ob72, (Throwable) null);
        }
        if (hhd.f(wz7, rz7.a)) {
            MessageWriteWidget C0 = this.Y.C0();
            if (C0 != null) {
                C0.p0().setText(C0.X.f.k);
            }
        } else if (hhd.f(wz7, qz7.a)) {
            MessageWriteWidget C02 = this.Y.C0();
            if (C02 != null) {
                C02.p0().setText(C02.X.f.k);
            }
            ChatScreen chatScreen = this.Y;
            chatScreen.getClass();
            ((az1) chatScreen.T0.T0(chatScreen, ChatScreen.n1[10])).setVisibility(8);
        } else if (hhd.f(wz7, sz7.a)) {
            nx8 D0 = this.Y.D0();
            taf.o(D0.w0, gx8.a);
        } else if (wz7 instanceof vz7) {
            nn2 L0 = this.Y.L0();
            vz7 vz7 = (vz7) wz7;
            CharSequence charSequence = vz7.a;
            List list = vz7.b;
            boolean z = vz7.c;
            Long w = this.Y.B0().w();
            pt8 v = this.Y.B0().v();
            if (v != null) {
                jv5 = v.a();
            }
            L0.B(charSequence, list, z, w, jv5);
        } else if (wz7 instanceof tz7) {
            nn2 L02 = this.Y.L0();
            Uri uri = ((tz7) wz7).a;
            Long w2 = this.Y.B0().w();
            pt8 v2 = this.Y.B0().v();
            if (v2 != null) {
                jv5 = v2.a();
            }
            jv5 jv52 = jv5;
            i22 i22 = (i22) L02.Z0.a.getValue();
            if (i22 != null) {
                qod D = xs7.D(L02.a, L02.u().b(), ru3.b, new wm2(uri, i22.a, L02, w2, jv52, (Continuation) null));
                L02.M0.o1(L02, nn2.g1[0], D);
            }
        } else if (wz7 instanceof uz7) {
            nn2 L03 = this.Y.L0();
            uz7 uz7 = (uz7) wz7;
            dm7 dm7 = uz7.a;
            float f = uz7.b;
            long j = uz7.c;
            Long w3 = this.Y.B0().w();
            pt8 v3 = this.Y.B0().v();
            if (v3 != null) {
                jv5 = v3.a();
            }
            L03.A(dm7, f, j, w3, jv5);
        } else if (wz7 instanceof pz7) {
            pz7 pz7 = (pz7) wz7;
            this.Y.L0().t(pz7.a, this.Y.B0().u(), pz7.b, pz7.c);
            nu8.C(this.Y.B0(), (Long) null, (CharSequence) null, (Integer) null, 14);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
