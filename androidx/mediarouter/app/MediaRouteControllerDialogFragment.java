package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import androidx.fragment.app.DialogFragment;

public class MediaRouteControllerDialogFragment extends DialogFragment {
    public final boolean F1 = false;
    public fn G1;
    public qb8 H1;

    public MediaRouteControllerDialogFragment() {
        this.v1 = true;
        Dialog dialog = this.A1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final void O0() {
        super.O0();
        fn fnVar = this.G1;
        if (fnVar != null && !this.F1) {
            ((d) fnVar).j(false);
        }
    }

    public final Dialog i1() {
        if (this.F1) {
            jb8 jb8 = new jb8(e0());
            this.G1 = jb8;
            jb8.j(this.H1);
        } else {
            this.G1 = new d(e0());
        }
        return this.G1;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.W0 = true;
        fn fnVar = this.G1;
        if (fnVar == null) {
            return;
        }
        if (this.F1) {
            ((jb8) fnVar).k();
        } else {
            ((d) fnVar).s();
        }
    }
}
