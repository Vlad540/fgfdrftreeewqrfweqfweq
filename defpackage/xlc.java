package defpackage;

import android.content.DialogInterface;
import android.os.Parcelable;
import android.view.KeyEvent;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: xlc  reason: default package */
public final /* synthetic */ class xlc implements DialogInterface.OnKeyListener {
    public final /* synthetic */ ScheduledSendPickerDialogFragment a;

    public /* synthetic */ xlc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = scheduledSendPickerDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.a;
        scheduledSendPickerDialogFragment.p1(new zlc((Parcelable) scheduledSendPickerDialogFragment.J1.getValue()));
        return false;
    }
}
