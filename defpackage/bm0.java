package defpackage;

import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* renamed from: bm0  reason: default package */
public final class bm0 extends m70 {
    public final WeakReference a;

    public bm0(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && !((BiometricViewModel) weakReference.get()).k && ((BiometricViewModel) weakReference.get()).j) {
            ((BiometricViewModel) weakReference.get()).f(new ol0(i, charSequence));
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [yh7, vb9] */
    public final void b(yl0 yl0) {
        int i;
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && ((BiometricViewModel) weakReference.get()).j) {
            int i2 = -1;
            if (yl0.b == -1) {
                BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
                ex exVar = biometricViewModel.c;
                if (exVar != null) {
                    stf stf = biometricViewModel.d;
                    i = exVar.c;
                    if (i == 0) {
                        i = stf != null ? 15 : 255;
                    }
                } else {
                    i = 0;
                }
                if ((i & 32767) != 0 && !h2g.p(i)) {
                    i2 = 2;
                }
                yl0 = new yl0(yl0.a, i2);
            }
            BiometricViewModel biometricViewModel2 = (BiometricViewModel) weakReference.get();
            if (biometricViewModel2.n == null) {
                biometricViewModel2.n = new yh7();
            }
            BiometricViewModel.j(biometricViewModel2.n, yl0);
        }
    }
}
