package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: fmc  reason: default package */
public final class fmc extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fmc(View view, ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = view;
        this.Z = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return n(bool, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fmc fmc = new fmc(this.Y, this.Z, continuation);
        fmc.X = ((Boolean) obj).booleanValue();
        return fmc;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ru.ok.utils.widgets.LongRoundedTitleSubtitleButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [ru.ok.utils.widgets.LongRoundedTitleSubtitleButton, android.view.View] */
    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        View view = this.Y;
        boolean z2 = view instanceof ViewGroup;
        jue jue = jue.a;
        if (!z2) {
            return jue;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ire.b(viewGroup);
        p75 p75 = new p75(z ? 2 : 1);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Z;
        p75.c = ((k93) ((vl) ((ug) scheduledSendPickerDialogFragment.V0().getApplicationContext())).c.getValue()).c().a.i();
        ire.a(viewGroup, p75);
        dmc n1 = scheduledSendPickerDialogFragment.n1();
        n1.c().setAlpha(z ? 1.0f : 0.3f);
        n1.c().setEnabled(z);
        dmc n12 = scheduledSendPickerDialogFragment.n1();
        n12.getClass();
        ((AppCompatTextView) n12.w0.T0(n12, dmc.x0[5])).setVisibility(z ^ true ? 0 : 8);
        return jue;
    }
}
