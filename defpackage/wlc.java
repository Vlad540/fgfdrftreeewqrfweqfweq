package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: wlc  reason: default package */
public final /* synthetic */ class wlc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    public /* synthetic */ wlc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, int i) {
        this.a = i;
        this.b = scheduledSendPickerDialogFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Bundle U0 = this.b.U0();
                Serializable serializable = U0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                nd4 nd4 = serializable instanceof nd4 ? (nd4) serializable : null;
                return Boolean.valueOf(nd4 != null ? nd4.b : U0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
            case 1:
                return this.b.U0().getString("ScheduledSendPickerDialogFragment:who", (String) null);
            default:
                return this.b.U0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
        }
    }
}
