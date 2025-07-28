package defpackage;

import android.os.Parcelable;
import android.view.View;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: ylc  reason: default package */
public final /* synthetic */ class ylc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    public /* synthetic */ ylc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, int i) {
        this.a = i;
        this.b = scheduledSendPickerDialogFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ScheduledSendPickerViewModel o1 = this.b.o1();
                o1.getClass();
                udd.q("ScheduledSendPickerViewModel", "onSendClick");
                if (o1.h()) {
                    o1.m.m((Object) null, new pg9());
                    return;
                }
                return;
            default:
                udd.q("ScheduledSendPickerDialogFragment", "handle nav click");
                ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                scheduledSendPickerDialogFragment.p1(new zlc((Parcelable) scheduledSendPickerDialogFragment.J1.getValue()));
                scheduledSendPickerDialogFragment.f1();
                return;
        }
    }
}
