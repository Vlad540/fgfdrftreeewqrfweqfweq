package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: ig4  reason: default package */
public final class ig4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public ig4(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.A1;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
