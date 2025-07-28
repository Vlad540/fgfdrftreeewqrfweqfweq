package com.google.android.material.bottomsheet;

import android.app.Dialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import java.util.ArrayList;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean F1;

    public final void f1() {
        Dialog dialog = this.A1;
        if (dialog instanceof fq0) {
            fq0 fq0 = (fq0) dialog;
            BottomSheetBehavior h = fq0.h();
            if (h.I && fq0.y0) {
                this.F1 = true;
                if (h.L == 5) {
                    m1();
                    return;
                }
                Dialog dialog2 = this.A1;
                if (dialog2 instanceof fq0) {
                    fq0 fq02 = (fq0) dialog2;
                    BottomSheetBehavior bottomSheetBehavior = fq02.Y;
                    bottomSheetBehavior.W.remove(fq02.F0);
                }
                dq0 dq0 = new dq0(1, (ScheduledSendPickerDialogFragment) this);
                ArrayList arrayList = h.W;
                if (!arrayList.contains(dq0)) {
                    arrayList.add(dq0);
                }
                h.K(5);
                return;
            }
        }
        super.f1();
    }

    public Dialog i1() {
        return new fq0(e0(), h1());
    }

    public final void m1() {
        if (this.F1) {
            super.f1();
        } else {
            g1(false, false);
        }
    }
}
