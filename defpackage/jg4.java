package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: jg4  reason: default package */
public final class jg4 extends ek8 {
    public final /* synthetic */ ek8 A0;
    public final /* synthetic */ DialogFragment B0;

    public jg4(DialogFragment dialogFragment, dx5 dx5) {
        this.B0 = dialogFragment;
        this.A0 = dx5;
    }

    public final View O(int i) {
        ek8 ek8 = this.A0;
        if (ek8.P()) {
            return ek8.O(i);
        }
        Dialog dialog = this.B0.A1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean P() {
        return this.A0.P() || this.B0.E1;
    }
}
