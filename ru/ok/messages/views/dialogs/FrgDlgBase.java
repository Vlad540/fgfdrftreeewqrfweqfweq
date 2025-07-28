package ru.ok.messages.views.dialogs;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class FrgDlgBase extends DialogFragment {
    public boolean F1 = true;
    public sna G1;
    public boolean H1;
    public v2b I1;

    public final void I0() {
        this.W0 = true;
        this.H1 = false;
    }

    public final void K0(int i, String[] strArr, int[] iArr) {
        urd.A(e0(), strArr, iArr);
        if (this.H1) {
            n1(i, strArr, iArr);
        } else {
            this.G1 = new sna(i, strArr, iArr);
        }
    }

    public final void L0() {
        this.W0 = true;
        this.H1 = true;
        sna sna = this.G1;
        if (sna != null) {
            n1(sna.a, sna.b, sna.c);
            this.G1 = null;
        }
    }

    public void m1(r5 r5Var) {
        this.F1 = false;
    }

    public void n1(int i, String[] strArr, int[] iArr) {
    }

    public final void u0(Activity activity) {
        this.W0 = true;
        udd.q("ru.ok.messages.views.dialogs.FrgDlgBase", "onAttach: ".concat(getClass().getName()));
        if (activity instanceof r5) {
            this.F1 = true;
            m1((r5) activity);
            return;
        }
        throw new IllegalStateException("Use FrgDlgBase only in ActBase subclasses.");
    }

    public final void w0(Bundle bundle) {
        FrgDlgBase.super.w0(bundle);
        r5 r5Var = (c0() == null || c0().isFinishing()) ? null : (r5) c0();
        if (r5Var == null) {
            g1(false, false);
            return;
        }
        this.I1 = r5Var.O0;
        if (this.F1) {
            throw new IllegalStateException("super.onAttachBase() not called");
        }
    }
}
