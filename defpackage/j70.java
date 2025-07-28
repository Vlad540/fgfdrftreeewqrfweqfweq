package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: j70  reason: default package */
public final class j70 extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ m70 a;

    public j70(m70 m70) {
        this.a = m70;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [yh7, vb9] */
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((bm0) this.a).a;
        if (weakReference.get() != null && ((BiometricViewModel) weakReference.get()).j) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
            if (biometricViewModel.q == null) {
                biometricViewModel.q = new yh7();
            }
            BiometricViewModel.j(biometricViewModel.q, Boolean.TRUE);
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [stf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [stf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [stf, java.lang.Object] */
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b;
        stf stf = null;
        if (!(authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null)) {
            Cipher d = pw3.d(cryptoObject);
            if (d != null) {
                stf = new stf(d);
            } else {
                Signature f = pw3.f(cryptoObject);
                if (f != null) {
                    ? obj = new Object();
                    obj.a = f;
                    obj.b = null;
                    obj.c = null;
                    obj.o = null;
                    stf = obj;
                } else {
                    Mac e = pw3.e(cryptoObject);
                    if (e != null) {
                        ? obj2 = new Object();
                        obj2.a = null;
                        obj2.b = null;
                        obj2.c = e;
                        obj2.o = null;
                        stf = obj2;
                    } else if (Build.VERSION.SDK_INT >= 30 && (b = qw3.b(cryptoObject)) != null) {
                        ? obj3 = new Object();
                        obj3.a = null;
                        obj3.b = null;
                        obj3.c = null;
                        obj3.o = b;
                        stf = obj3;
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = l70.a(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.a.b(new yl0(stf, i2));
    }
}
