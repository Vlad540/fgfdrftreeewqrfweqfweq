package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: hmc  reason: default package */
public final class hmc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hmc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((k04) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hmc hmc = new hmc(this.Y, continuation);
        hmc.X = obj;
        return hmc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k04 k04 = (k04) this.X;
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Y;
        LongRoundedTitleSubtitleButton c = scheduledSendPickerDialogFragment.n1().c();
        Context V0 = scheduledSendPickerDialogFragment.V0();
        k04.getClass();
        int i = whc.r;
        String str = k04.a.X;
        c.setSubtitle(V0.getString(i, new Object[]{str, k04.b + ":" + k04.c}));
        return jue.a;
    }
}
