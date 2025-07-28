package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: emc  reason: default package */
public final class emc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public emc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((vlc) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        emc emc = new emc(this.Y, continuation);
        emc.X = obj;
        return emc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        vlc vlc = (vlc) this.X;
        udd.q("ScheduledSendPickerDialogFragment", "new data " + vlc);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Y;
        DateTimePicker b = scheduledSendPickerDialogFragment.n1().b();
        List list = vlc.a;
        b.R0 = true;
        z04 adapter = b.K0.getAdapter();
        bje bje = null;
        z04 z04 = adapter instanceof z04 ? adapter : null;
        if (z04 != null) {
            z04.F(list, new q04(b, vlc.d, 0));
        }
        DateTimePicker b2 = scheduledSendPickerDialogFragment.n1().b();
        b2.S0 = true;
        bje adapter2 = b2.L0.getAdapter();
        bje bje2 = adapter2 instanceof bje ? adapter2 : null;
        if (bje2 != null) {
            bje2.F(vlc.b, new q04(b2, vlc.e, 2));
        }
        DateTimePicker b3 = scheduledSendPickerDialogFragment.n1().b();
        b3.T0 = true;
        bje adapter3 = b3.M0.getAdapter();
        if (adapter3 instanceof bje) {
            bje = adapter3;
        }
        if (bje != null) {
            bje.F(vlc.c, new q04(b3, vlc.f, 1));
        }
        return jue.a;
    }
}
