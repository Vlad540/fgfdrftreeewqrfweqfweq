package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: nw2  reason: default package */
public final /* synthetic */ class nw2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nw2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [android.view.View, n7d] */
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                ow2 ow2 = (ow2) this.b;
                FrgBaseSettings frgBaseSettings = ow2.R0;
                if (frgBaseSettings != null) {
                    frgBaseSettings.v1(ow2.Q0.a, Boolean.valueOf(z));
                    return;
                }
                return;
            case 1:
                Chip chip = (Chip) this.b;
                lhd lhd = chip.B0;
                if (lhd != null) {
                    lga lga = (lga) lhd.b;
                    if (!z ? lga.n(chip, lga.b) : lga.f(chip)) {
                        lga.m();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.A0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 2:
                ga7 ga7 = (ga7) this.b;
                FrgBaseSettings frgBaseSettings2 = ga7.K0;
                if (frgBaseSettings2 != null) {
                    frgBaseSettings2.v1(ga7.P0.a, Integer.valueOf(z ? vl.b().n().c.t() : 0));
                    return;
                }
                return;
            case 3:
                ScheduledSendPickerViewModel o1 = ((ScheduledSendPickerDialogFragment) this.b).o1();
                o1.o.o1(o1, ScheduledSendPickerViewModel.p[0], Boolean.valueOf(z));
                return;
            default:
                if (z) {
                    ((n7d) this.b).callOnClick();
                    return;
                }
                return;
        }
    }
}
