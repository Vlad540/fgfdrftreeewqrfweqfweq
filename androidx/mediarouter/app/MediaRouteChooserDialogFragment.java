package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import java.util.List;

public class MediaRouteChooserDialogFragment extends DialogFragment {
    public final boolean F1 = false;
    public fn G1;
    public qb8 H1;

    public MediaRouteChooserDialogFragment() {
        this.v1 = true;
        Dialog dialog = this.A1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final Dialog i1() {
        if (this.F1) {
            ab8 ab8 = new ab8(e0());
            this.G1 = ab8;
            m1();
            ab8.h(this.H1);
        } else {
            ka8 ka8 = new ka8(e0());
            this.G1 = ka8;
            m1();
            ka8.h(this.H1);
        }
        return this.G1;
    }

    public final void m1() {
        if (this.H1 == null) {
            Bundle bundle = this.Z;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("selector");
                qb8 qb8 = null;
                if (bundle2 != null) {
                    qb8 = new qb8((List) null, bundle2);
                } else {
                    qb8 qb82 = qb8.c;
                }
                this.H1 = qb8;
            }
            if (this.H1 == null) {
                this.H1 = qb8.c;
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.W0 = true;
        fn fnVar = this.G1;
        if (fnVar != null) {
            int i = -2;
            if (this.F1) {
                ab8 ab8 = (ab8) fnVar;
                Context context = ab8.w0;
                int p = !context.getResources().getBoolean(zlb.is_tablet) ? -1 : pfa.p(context);
                if (!context.getResources().getBoolean(zlb.is_tablet)) {
                    i = -1;
                }
                ab8.getWindow().setLayout(p, i);
                return;
            }
            ka8 ka8 = (ka8) fnVar;
            ka8.getWindow().setLayout(pfa.p(ka8.getContext()), -2);
        }
    }
}
