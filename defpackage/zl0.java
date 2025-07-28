package defpackage;

import android.os.Build;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.c;

/* renamed from: zl0  reason: default package */
public final class zl0 {
    public c a;

    public final void a(ex exVar, stf stf) {
        c cVar = this.a;
        if (cVar != null && !cVar.Q()) {
            c cVar2 = this.a;
            BiometricFragment biometricFragment = (BiometricFragment) cVar2.E("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                biometricFragment = new BiometricFragment();
                hd0 hd0 = new hd0(cVar2);
                hd0.f(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
                hd0.d(true);
                cVar2.A(true);
                cVar2.F();
            }
            if (biometricFragment.c0() != null) {
                BiometricViewModel biometricViewModel = biometricFragment.q1;
                biometricViewModel.c = exVar;
                int i = exVar.c;
                if (i == 0) {
                    i = stf != null ? 15 : 255;
                }
                if (Build.VERSION.SDK_INT < 30 && i == 15 && stf == null) {
                    biometricViewModel.d = lp.k();
                } else {
                    biometricViewModel.d = stf;
                }
                BiometricViewModel biometricViewModel2 = biometricFragment.q1;
                biometricViewModel2.h = null;
                if (biometricViewModel2.l) {
                    biometricFragment.p1.postDelayed(new vl0(biometricFragment), 600);
                } else {
                    biometricFragment.k1();
                }
            }
        }
    }
}
