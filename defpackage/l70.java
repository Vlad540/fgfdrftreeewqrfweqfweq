package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: l70  reason: default package */
public abstract class l70 {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
