package androidx.appcompat.app;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog i1() {
        return new fn(e0(), h1());
    }

    public final void k1(Dialog dialog, int i) {
        if (dialog instanceof fn) {
            fn fnVar = (fn) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            fnVar.d().g(1);
            return;
        }
        super.k1(dialog, i);
    }
}
