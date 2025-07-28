package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;

/* renamed from: pl0  reason: default package */
public final class pl0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BiometricFragment b;

    public pl0(BiometricFragment biometricFragment, yl0 yl0) {
        this.b = biometricFragment;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [a06, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [a06, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [a06, java.lang.Object] */
    public final void run() {
        switch (this.a) {
            case 0:
                BiometricViewModel biometricViewModel = this.b.q1;
                if (biometricViewModel.b == null) {
                    biometricViewModel.b = new Object();
                }
                biometricViewModel.b.x();
                return;
            case 1:
                BiometricViewModel biometricViewModel2 = this.b.q1;
                if (biometricViewModel2.b == null) {
                    biometricViewModel2.b = new Object();
                }
                biometricViewModel2.b.y();
                return;
            default:
                BiometricViewModel biometricViewModel3 = this.b.q1;
                if (biometricViewModel3.b == null) {
                    biometricViewModel3.b = new Object();
                }
                biometricViewModel3.b.z();
                return;
        }
    }

    public pl0(BiometricFragment biometricFragment, int i, CharSequence charSequence) {
        this.b = biometricFragment;
    }

    public pl0(BiometricFragment biometricFragment) {
        this.b = biometricFragment;
    }
}
