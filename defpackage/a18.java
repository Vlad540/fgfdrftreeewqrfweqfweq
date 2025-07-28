package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: a18  reason: default package */
public final class a18 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a18(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((a18) n((ez7) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a18 a18 = new a18(continuation, this.Y);
        a18.X = obj;
        return a18;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ez7 ez7 = (ez7) this.X;
        boolean z = ez7 instanceof yy7;
        ygc ygc = this.Y;
        sgc sgc = null;
        int i = 0;
        if (z) {
            k77[] k77Arr = MediaBarWidget.h1;
            ygc.v0().setText(ygc.X.f.k);
            ygc.C0((jxc) ygc.A0().J0.a.getValue());
            boolean z2 = ((Boolean) ygc.A0().H0.a.getValue()).booleanValue() || ygc.A0().s();
            ygc.v0().setVisibility(z2 ? 0 : 8);
            k77 k77 = MediaBarWidget.h1[16];
            az1 az1 = (az1) ygc.T0.getValue();
            if (!(!z2)) {
                i = 8;
            }
            az1.setVisibility(i);
            ygc.D0((qz) ygc.A0().w0.getValue());
            z0b w0 = ygc.w0();
            if (!w0.isLaidOut() || w0.isLayoutRequested()) {
                w0.addOnLayoutChangeListener(new d18(ygc, 1));
            } else if (ygc.A0().s()) {
                ygc.w0().k();
            } else {
                ygc.w0().setHalfScreen((i26) null);
            }
            xg9.g(ygc.o, mnc.R0);
        } else if (ez7 instanceof vy7) {
            if (((vy7) ez7).a) {
                k77[] k77Arr2 = MediaBarWidget.h1;
                ygc.v0().setText((CharSequence) null);
            }
            k77[] k77Arr3 = MediaBarWidget.h1;
            ygc.w0().j(true);
        } else if (ez7 instanceof wy7) {
            k77[] k77Arr4 = MediaBarWidget.h1;
            ygc.v0().e(false);
        } else if (ez7 instanceof zy7) {
            k77[] k77Arr5 = MediaBarWidget.h1;
            ygc.getClass();
            k77[] k77Arr6 = BottomSheetWidget.B0;
            jc3 c = rf0.c(k2a.B, 6, (Bundle) null);
            c.a(new kc3[]{new kc3(1, new hge(k2a.z), 1, false)});
            c.a(new kc3[]{new kc3(2, new hge(k2a.A), 2, false)});
            ConfirmationBottomSheet e = c.e();
            e.setTargetController(ygc);
            ygc ygc2 = ygc;
            while (ygc2.getParentController() != null) {
                ygc2 = ygc2.getParentController();
            }
            ygc ygc3 = ygc2 instanceof ygc ? ygc2 : null;
            if (ygc3 != null) {
                sgc = ygc3.S();
            }
            e.y0(ygc);
            if (sgc != null) {
                vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else if (ez7 instanceof uy7) {
            k77[] k77Arr7 = MediaBarWidget.h1;
            taf.o(ygc.t0().o, u46.a);
        } else if (ez7 instanceof xy7) {
            k77[] k77Arr8 = MediaBarWidget.h1;
            f56 t0 = ygc.t0();
            qwc qwc = ((xy7) ez7).a;
            t0.getClass();
            taf.o(t0.o, new w46(qwc));
        } else if (ez7 instanceof bz7) {
            bz7 bz7 = (bz7) ez7;
            tk7 N = kjd.N(bz7.a.a);
            k77[] k77Arr9 = MediaBarWidget.h1;
            ygc.B0(N, bz7.b, "SELECTED_MEDIA_ALBUM");
        } else if (ez7 instanceof cz7) {
            MediaBarWidget.l0(ygc, i2a.k, k2a.V);
        } else if (ez7 instanceof az7) {
            MediaBarWidget.l0(ygc, i2a.j, k2a.U);
        } else if (ez7 instanceof dz7) {
            MediaBarWidget.m0(ygc, ((dz7) ez7).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
