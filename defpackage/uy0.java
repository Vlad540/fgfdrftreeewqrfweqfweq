package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: uy0  reason: default package */
public final class uy0 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallAdminSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uy0(Continuation continuation, CallAdminSettingsScreen callAdminSettingsScreen) {
        super(2, continuation);
        this.Y = callAdminSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((uy0) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uy0 uy0 = new uy0(continuation, this.Y);
        uy0.X = obj;
        return uy0;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        uh1 uh1 = (sg9) this.X;
        boolean z = uh1 instanceof ph1;
        ygc ygc = this.Y;
        if (z) {
            k77[] k77Arr = BottomSheetWidget.B0;
            BottomSheetWidget recordExitBottomSheet = new RecordExitBottomSheet(y4c.b, Boolean.FALSE);
            recordExitBottomSheet.setTargetController(ygc);
            ygc ygc2 = ygc;
            while (ygc2.getParentController() != null) {
                ygc2 = ygc2.getParentController();
            }
            sgc sgc = null;
            ygc ygc3 = ygc2 instanceof ygc ? ygc2 : null;
            if (ygc3 != null) {
                sgc = ygc3.S();
            }
            sgc sgc2 = sgc;
            recordExitBottomSheet.y0(ygc);
            if (sgc2 != null) {
                vgc vgc = new vgc(recordExitBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc2.G(vgc);
            }
        } else if (uh1 instanceof uh1) {
            k77[] k77Arr2 = CallAdminSettingsScreen.x0;
            ((oed) ygc.Y.getValue()).getClass();
            oed.b(fh1.a, new mz4((Object) uh1, (Object) ygc, 0, 1));
        }
        return jue.a;
    }
}
