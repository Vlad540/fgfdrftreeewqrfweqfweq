package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.b;

public class FingerprintDialogFragment extends DialogFragment {
    public final Handler F1 = new Handler(Looper.getMainLooper());
    public final re G1 = new re(21, this);
    public BiometricViewModel H1;
    public int I1;
    public int J1;
    public ImageView K1;
    public TextView L1;

    public final void I0() {
        this.W0 = true;
        this.F1.removeCallbacksAndMessages((Object) null);
    }

    public final void L0() {
        this.W0 = true;
        BiometricViewModel biometricViewModel = this.H1;
        biometricViewModel.t = 0;
        biometricViewModel.h(1);
        this.H1.g(i0(gtb.fingerprint_dialog_touch_sensor));
    }

    public final Dialog i1() {
        int i;
        tc tcVar = new tc(V0());
        ex exVar = this.H1.c;
        CharSequence charSequence = null;
        tcVar.setTitle(exVar != null ? (CharSequence) exVar.o : null);
        View inflate = LayoutInflater.from(tcVar.getContext()).inflate(rrb.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(apb.fingerprint_subtitle);
        if (textView != null) {
            this.H1.getClass();
            if (TextUtils.isEmpty((CharSequence) null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(apb.fingerprint_description);
        if (textView2 != null) {
            ex exVar2 = this.H1.c;
            if (exVar2 != null) {
                charSequence = (CharSequence) exVar2.X;
            }
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence);
            }
        }
        this.K1 = (ImageView) inflate.findViewById(apb.fingerprint_icon);
        this.L1 = (TextView) inflate.findViewById(apb.fingerprint_error);
        BiometricViewModel biometricViewModel = this.H1;
        ex exVar3 = biometricViewModel.c;
        if (exVar3 != null) {
            stf stf = biometricViewModel.d;
            i = exVar3.c;
            if (i == 0) {
                i = stf != null ? 15 : 255;
            }
        } else {
            i = 0;
        }
        CharSequence i0 = h2g.p(i) ? i0(gtb.confirm_device_credential_password) : this.H1.e();
        cm0 cm0 = new cm0(this);
        pc pcVar = tcVar.a;
        pcVar.i = i0;
        pcVar.j = cm0;
        tcVar.setView(inflate);
        uc create = tcVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public final int m1(int i) {
        Context e0 = e0();
        b c0 = c0();
        if (e0 == null || c0 == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        e0.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = c0.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [yh7, vb9] */
    public final void onCancel(DialogInterface dialogInterface) {
        BiometricViewModel biometricViewModel = this.H1;
        if (biometricViewModel.s == null) {
            biometricViewModel.s = new yh7();
        }
        BiometricViewModel.j(biometricViewModel.s, Boolean.TRUE);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v6, types: [yh7, vb9] */
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        b c0 = c0();
        if (c0 != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new fzd(c0).a(m7c.a(BiometricViewModel.class));
            this.H1 = biometricViewModel;
            if (biometricViewModel.u == null) {
                biometricViewModel.u = new yh7();
            }
            biometricViewModel.u.e(this, new wg5(this, 0));
            BiometricViewModel biometricViewModel2 = this.H1;
            if (biometricViewModel2.v == null) {
                biometricViewModel2.v = new yh7();
            }
            biometricViewModel2.v.e(this, new wg5(this, 1));
        }
        this.I1 = m1(yg5.a());
        this.J1 = m1(16842808);
    }
}
