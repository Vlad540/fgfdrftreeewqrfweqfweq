package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: j4c  reason: default package */
public final class j4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j4c j4c = new j4c(continuation, this.Y);
        j4c.X = obj;
        return j4c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        l3c l3c = (l3c) this.X;
        boolean f = hhd.f(l3c, j3c.a);
        rr3 rr3 = this.Y;
        if (f) {
            k77[] k77Arr = RecordControlsWidget.m1;
            String[] strArr = qna.h;
            boolean b = ((qna) rr3.o.getValue()).b(strArr);
            t97 t97 = rr3.o;
            if (!b) {
                qna qna = (qna) t97.getValue();
                jrf jrf = new jrf(rr3, 1);
                int i = baa.c;
                qna.getClass();
                int i2 = iub.permissions_audio_title;
                int i3 = baa.g;
                if (qna.i(jrf, strArr)) {
                    jrf.c(strArr, 160, i2, i, i3);
                } else {
                    qna.f(jrf, strArr, 160);
                }
            }
            if (!((qna) t97.getValue()).b(qna.l)) {
                ((qna) t97.getValue()).h(new jrf(rr3, 1));
            }
        } else if (hhd.f(l3c, k3c.a)) {
            k77[] k77Arr2 = RecordControlsWidget.m1;
            rr3.getClass();
            k77[] k77Arr3 = BottomSheetWidget.B0;
            sgc sgc = null;
            jc3 c = rf0.c(z9a.d, 6, (Bundle) null);
            c.f(new hge(z9a.c));
            c.a(new kc3(1, new hge(z9a.a), 3, false));
            c.a(new kc3(2, new hge(z9a.b), 2, false));
            ConfirmationBottomSheet e = c.e();
            e.setTargetController(rr3);
            rr3 rr32 = rr3;
            while (rr32.getParentController() != null) {
                rr32 = rr32.getParentController();
            }
            ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
            if (ygc != null) {
                sgc = ygc.S();
            }
            e.y0(rr3);
            if (sgc != null) {
                vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
