package defpackage;

import android.content.DialogInterface;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.FingerprintDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: cm0  reason: default package */
public final class cm0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public cm0(BiometricViewModel biometricViewModel) {
        this.b = new WeakReference(biometricViewModel);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.b;
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).i(true);
                    return;
                }
                return;
            default:
                ((FingerprintDialogFragment) this.b).H1.i(true);
                return;
        }
    }

    public cm0(FingerprintDialogFragment fingerprintDialogFragment) {
        this.b = fingerprintDialogFragment;
    }
}
