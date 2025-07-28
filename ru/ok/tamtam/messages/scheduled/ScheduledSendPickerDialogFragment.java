package ru.ok.tamtam.messages.scheduled;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.TamBottomSheetDialogFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment;", "Lru/ok/TamBottomSheetDialogFragment;", "<init>", "()V", "dmc", "bmc", "cmc", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class ScheduledSendPickerDialogFragment extends TamBottomSheetDialogFragment {
    public final t97 H1 = ez3.O(2, new wlc(this, 0));
    public final t97 I1 = ez3.O(2, new wlc(this, 1));
    public final t97 J1 = ez3.O(2, new wlc(this, 2));
    public final xaf K1;
    public final t97 L1;

    public ScheduledSendPickerDialogFragment() {
        super(qrb.scheduled_send_picker_fragment);
        t97 O = ez3.O(3, new ae6(1, new ke(5, this)));
        this.K1 = new xaf(m7c.a(ScheduledSendPickerViewModel.class), new imc(0, O), new pxa(this, 2, O), new imc(1, O));
        this.L1 = ez3.O(2, new vfc(this));
    }

    public static final void q1(String str, vx5 vx5, nc7 nc7, qf3 qf3) {
        ka kaVar = new ka((Object) null, 27, qf3);
        String i = wn6.i("ScheduledSendPickerDialogFragment:", str, ":result");
        rx5 rx5 = (rx5) vx5.m.remove(i);
        if (rx5 != null) {
            rx5.a.f(rx5.c);
        }
        vx5.f0(i, nc7, new xp(7, kaVar));
    }

    public static final void r1(String str, vx5 vx5) {
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = new ScheduledSendPickerDialogFragment();
        scheduledSendPickerDialogFragment.Y0(jjd.j(new wia[]{new wia("ScheduledSendPickerDialogFragment:who", str), new wia("ScheduledSendPickerDialogFragment:send_with_notification", Boolean.TRUE), new wia("ScheduledSendPickerDialogFragment:arg_input", (Object) null), new wia("ScheduledSendPickerViewModel:delayed_attrs", (Object) null)}));
        scheduledSendPickerDialogFragment.l1(vx5, "ScheduledSendPickerDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [ru.ok.utils.widgets.LongRoundedTitleSubtitleButton, android.view.View] */
    public final void P0(View view, Bundle bundle) {
        dmc n1 = n1();
        fy5 m0 = m0();
        n1.a = view;
        fy5 fy5 = m0;
        fy5.b();
        fy5.X.a(new d6c(3, n1));
        ez3.N(new ck5(ez3.x(new ik5(new ck5(wce.d0, new l5e(2, (Continuation) null)), 2), 100), new gae(this, (Continuation) null), 5), xs7.A(m0()));
        ez3.N(new ck5(new ik5(o1().d, 2), new emc(this, (Continuation) null), 5), xs7.A(m0()));
        ez3.N(new ck5(o1().l, new fmc(view, this, (Continuation) null), 5), xs7.A(m0()));
        ez3.N(new ck5(new ik5(new ik5(o1().n, 2), 12), new gmc(this, (Continuation) null), 5), xs7.A(m0()));
        n1().b().setListener$scheduled_send_picker_dialog_release(o1());
        a24.a0(n1().c(), new ylc(this, 0));
        dmc n12 = n1();
        n12.getClass();
        k77[] k77Arr = dmc.x0;
        int i = 0;
        MaterialToolbar materialToolbar = (MaterialToolbar) n12.c.T0(n12, k77Arr[0]);
        materialToolbar.setBackground((Drawable) null);
        materialToolbar.setNavigationOnClickListener(new c14((View.OnClickListener) new ylc(this, 1), 0));
        dmc n13 = n1();
        n13.getClass();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) n13.Y.T0(n13, k77Arr[3]);
        if (!((Boolean) this.H1.getValue()).booleanValue()) {
            i = 8;
        }
        appCompatCheckBox.setVisibility(i);
        appCompatCheckBox.setOnCheckedChangeListener(new nw2(3, this));
        ez3.N(new ck5(new ik5(o1().f, 2), new hmc(this, (Continuation) null), 5), xs7.A(m0()));
    }

    public final Dialog i1() {
        fq0 fq0 = new fq0(V0(), pvb.UiUtils_LightBottomSheetDialog);
        fq0.y0 = true;
        fq0.h().K(3);
        fq0.h().I(true);
        fq0.h().J = true;
        BottomSheetBehavior h = fq0.h();
        h.K = false;
        h.H(true);
        fq0.setOnKeyListener(new xlc(this));
        return fq0;
    }

    public final dmc n1() {
        return (dmc) this.L1.getValue();
    }

    public final ScheduledSendPickerViewModel o1() {
        return (ScheduledSendPickerViewModel) this.K1.getValue();
    }

    public final void p1(bmc bmc) {
        t97 t97 = this.I1;
        g0().e0(wn6.i("ScheduledSendPickerDialogFragment:", (String) t97.getValue(), ":result"), jjd.j(new wia[]{new wia(wn6.i("ScheduledSendPickerDialogFragment:", (String) t97.getValue(), ":result"), bmc)}));
    }

    public final void w0(Bundle bundle) {
        ScheduledSendPickerDialogFragment.super.w0(bundle);
        vx3.y(T0());
    }

    public final void z(wce wce) {
        n1().z(wce);
    }
}
