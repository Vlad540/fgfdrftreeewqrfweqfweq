package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: hg4  reason: default package */
public final class hg4 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment a;

    public hg4(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.A1;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
