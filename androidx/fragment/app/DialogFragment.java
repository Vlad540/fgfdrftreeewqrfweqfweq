package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class DialogFragment extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Dialog A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public boolean E1 = false;
    public Handler p1;
    public final re q1 = new re(15, this);
    public final hg4 r1 = new hg4(this);
    public final ig4 s1 = new ig4(this);
    public int t1 = 0;
    public int u1 = 0;
    public boolean v1 = true;
    public boolean w1 = true;
    public int x1 = -1;
    public boolean y1;
    public final wg5 z1 = new wg5(this, 2);

    public final void A0() {
        this.W0 = true;
        Dialog dialog = this.A1;
        if (dialog != null) {
            this.B1 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.A1.dismiss();
            if (!this.C1) {
                onDismiss(this.A1);
            }
            this.A1 = null;
            this.E1 = false;
        }
    }

    public final void C0() {
        this.W0 = true;
        if (!this.D1 && !this.C1) {
            this.C1 = true;
        }
        this.j1.j(this.z1);
    }

    public final LayoutInflater D0(Bundle bundle) {
        LayoutInflater D0 = super.D0(bundle);
        boolean z = this.w1;
        if (!z || this.y1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return D0;
        }
        if (z && !this.E1) {
            try {
                this.y1 = true;
                Dialog i1 = i1();
                this.A1 = i1;
                if (this.w1) {
                    k1(i1, this.t1);
                    Context e0 = e0();
                    if (e0 instanceof Activity) {
                        this.A1.setOwnerActivity((Activity) e0);
                    }
                    this.A1.setCancelable(this.v1);
                    this.A1.setOnCancelListener(this.r1);
                    this.A1.setOnDismissListener(this.s1);
                    this.E1 = true;
                } else {
                    this.A1 = null;
                }
            } finally {
                this.y1 = false;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.A1;
        return dialog != null ? D0.cloneInContext(dialog.getContext()) : D0;
    }

    public void M0(Bundle bundle) {
        Dialog dialog = this.A1;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.t1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.u1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.v1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.w1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.x1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void N0() {
        this.W0 = true;
        Dialog dialog = this.A1;
        if (dialog != null) {
            this.B1 = false;
            dialog.show();
            View decorView = this.A1.getWindow().getDecorView();
            xie.G(decorView, this);
            decorView.setTag(frb.view_tree_view_model_store_owner, this);
            ete.X(decorView, this);
        }
    }

    public void O0() {
        this.W0 = true;
        Dialog dialog = this.A1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void Q0(Bundle bundle) {
        Bundle bundle2;
        this.W0 = true;
        if (this.A1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A1.onRestoreInstanceState(bundle2);
        }
    }

    public final void R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.R0(layoutInflater, viewGroup, bundle);
        if (this.Y0 == null && this.A1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A1.onRestoreInstanceState(bundle2);
        }
    }

    public final ek8 Z() {
        return new jg4(this, new dx5(this));
    }

    public void f1() {
        g1(true, false);
    }

    public final void g1(boolean z, boolean z2) {
        if (!this.C1) {
            this.C1 = true;
            this.D1 = false;
            Dialog dialog = this.A1;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.A1.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.p1.getLooper()) {
                        onDismiss(this.A1);
                    } else {
                        this.p1.post(this.q1);
                    }
                }
            }
            this.B1 = true;
            if (this.x1 >= 0) {
                c g0 = g0();
                int i = this.x1;
                if (i >= 0) {
                    g0.y(new tx5(g0, i, 1), z);
                    this.x1 = -1;
                    return;
                }
                throw new IllegalArgumentException(wn6.h(i, "Bad id: "));
            }
            hd0 hd0 = new hd0(g0());
            hd0.o = true;
            hd0.h(this);
            if (z) {
                hd0.d(true);
            } else {
                hd0.d(false);
            }
        }
    }

    public int h1() {
        return this.u1;
    }

    public Dialog i1() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new g83(V0(), h1());
    }

    public final Dialog j1() {
        Dialog dialog = this.A1;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void k1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void l1(c cVar, String str) {
        this.C1 = false;
        this.D1 = true;
        cVar.getClass();
        hd0 hd0 = new hd0(cVar);
        hd0.o = true;
        hd0.f(0, this, str, 1);
        hd0.d(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.B1) {
            if (Log.isLoggable("FragmentManager", 3)) {
                toString();
            }
            g1(true, true);
        }
    }

    public final void s0(Bundle bundle) {
        this.W0 = true;
    }

    public final void v0(Context context) {
        super.v0(context);
        this.j1.f(this.z1);
        if (!this.D1) {
            this.C1 = false;
        }
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        this.p1 = new Handler();
        this.w1 = this.O0 == 0;
        if (bundle != null) {
            this.t1 = bundle.getInt("android:style", 0);
            this.u1 = bundle.getInt("android:theme", 0);
            this.v1 = bundle.getBoolean("android:cancelable", true);
            this.w1 = bundle.getBoolean("android:showsDialog", this.w1);
            this.x1 = bundle.getInt("android:backStackId", -1);
        }
    }
}
