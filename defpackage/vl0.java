package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* renamed from: vl0  reason: default package */
public final class vl0 implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public vl0(BiometricFragment biometricFragment) {
        this.a = 0;
        this.b = new WeakReference(biometricFragment);
    }

    public final void run() {
        switch (this.a) {
            case 0:
                WeakReference weakReference = this.b;
                if (weakReference.get() != null) {
                    ((BiometricFragment) weakReference.get()).k1();
                    return;
                }
                return;
            case 1:
                WeakReference weakReference2 = this.b;
                if (weakReference2.get() != null) {
                    ((BiometricViewModel) weakReference2.get()).l = false;
                    return;
                }
                return;
            default:
                WeakReference weakReference3 = this.b;
                if (weakReference3.get() != null) {
                    ((BiometricViewModel) weakReference3.get()).m = false;
                    return;
                }
                return;
        }
    }

    public vl0(BiometricViewModel biometricViewModel, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(biometricViewModel);
                return;
            default:
                this.b = new WeakReference(biometricViewModel);
                return;
        }
    }
}
