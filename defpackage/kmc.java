package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: kmc  reason: default package */
public final class kmc extends l5e implements i26 {
    public final /* synthetic */ ScheduledSendPickerViewModel X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kmc(ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kmc(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.X;
        scheduledSendPickerViewModel.g(ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel));
        return jue.a;
    }
}
