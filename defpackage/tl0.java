package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: tl0  reason: default package */
public abstract class tl0 {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
