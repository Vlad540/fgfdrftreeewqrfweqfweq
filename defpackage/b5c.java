package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: b5c  reason: default package */
public final class b5c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b5c(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((b5c) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b5c b5c = new b5c(continuation, this.Y);
        b5c.X = obj;
        return b5c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        e5c e5c = (e5c) this.X;
        k77[] k77Arr = RecordExitBottomSheet.K0;
        RecordExitBottomSheet recordExitBottomSheet = this.Y;
        recordExitBottomSheet.E0().setText(e5c.a.a(recordExitBottomSheet.getContext()));
        TextView D0 = recordExitBottomSheet.D0();
        mge mge = e5c.b;
        D0.setText(mge != null ? mge.a(recordExitBottomSheet.getContext()) : null);
        int i = 0;
        recordExitBottomSheet.D0().setVisibility(mge != null ? 0 : 8);
        CharSequence a = e5c.e.a(recordExitBottomSheet.getContext());
        recordExitBottomSheet.C0().setTitle(a);
        recordExitBottomSheet.C0().setVisibility((a == null || a.length() == 0) ^ true ? 0 : 8);
        pw2 z0 = recordExitBottomSheet.z0();
        if (!e5c.f) {
            i = 8;
        }
        z0.setVisibility(i);
        OneMeButton A0 = recordExitBottomSheet.A0();
        d5c d5c = e5c.c;
        A0.setMode(d5c.c);
        A0.setText(d5c.b.a(A0.getContext()));
        a24.Z(A0, 300, new fq(recordExitBottomSheet, 4, e5c));
        OneMeButton B0 = recordExitBottomSheet.B0();
        d5c d5c2 = e5c.d;
        B0.setMode(d5c2.c);
        B0.setText(d5c2.b.a(B0.getContext()));
        a24.Z(B0, 300, new jsc(12, recordExitBottomSheet));
        return jue.a;
    }
}
