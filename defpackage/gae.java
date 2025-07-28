package defpackage;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import kotlin.coroutines.Continuation;
import ru.ok.TamBottomSheetDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: gae  reason: default package */
public final class gae extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ TamBottomSheetDialogFragment Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gae(TamBottomSheetDialogFragment tamBottomSheetDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = tamBottomSheetDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((wce) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gae gae = new gae(this.Y, continuation);
        gae.X = obj;
        return gae;
    }

    public final Object o(Object obj) {
        Window window;
        wx3.H(obj);
        wce wce = (wce) this.X;
        TamBottomSheetDialogFragment tamBottomSheetDialogFragment = this.Y;
        Dialog dialog = tamBottomSheetDialogFragment.A1;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.addFlags(Integer.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(wce.c ? systemUiVisibility & -17 : systemUiVisibility | 16);
            window.setNavigationBarColor(wce.H);
        }
        View view = tamBottomSheetDialogFragment.Y0;
        ViewGroup viewGroup = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundTintList(ColorStateList.valueOf(wce.m));
        }
        ((ScheduledSendPickerDialogFragment) tamBottomSheetDialogFragment).z(wce);
        return jue.a;
    }
}
