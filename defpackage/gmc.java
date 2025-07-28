package defpackage;

import android.os.Parcelable;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: gmc  reason: default package */
public final class gmc extends l5e implements i26 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gmc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((pg9) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gmc(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.X;
        k04 k04 = (k04) scheduledSendPickerDialogFragment.o1().f.a.getValue();
        jue jue = jue.a;
        if (k04 == null) {
            return jue;
        }
        lmc lmc = scheduledSendPickerDialogFragment.o1().o;
        k77 k77 = ScheduledSendPickerViewModel.p[0];
        scheduledSendPickerDialogFragment.p1(new amc(k04, ((Boolean) lmc.b).booleanValue(), (Parcelable) scheduledSendPickerDialogFragment.J1.getValue()));
        scheduledSendPickerDialogFragment.f1();
        return jue;
    }
}
