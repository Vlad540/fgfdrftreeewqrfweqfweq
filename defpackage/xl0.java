package defpackage;

import android.hardware.biometrics.BiometricManager;

/* renamed from: xl0  reason: default package */
public abstract class xl0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
