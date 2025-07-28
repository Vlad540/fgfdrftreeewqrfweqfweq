package androidx.biometric;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.a;
import androidx.fragment.app.c;

public class BiometricFragment extends a {
    public final Handler p1 = new Handler(Looper.getMainLooper());
    public BiometricViewModel q1;

    public final void N0() {
        int i;
        this.W0 = true;
        if (Build.VERSION.SDK_INT == 29) {
            BiometricViewModel biometricViewModel = this.q1;
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
            if (h2g.p(i)) {
                BiometricViewModel biometricViewModel2 = this.q1;
                biometricViewModel2.m = true;
                this.p1.postDelayed(new vl0(biometricViewModel2, 2), 250);
            }
        }
    }

    public final void O0() {
        this.W0 = true;
    }

    public final void f1(int i) {
        if (i == 3 || !this.q1.m) {
            h1();
            BiometricViewModel biometricViewModel = this.q1;
            if (biometricViewModel.f == null) {
                biometricViewModel.f = new mn(8);
            }
            mn mnVar = biometricViewModel.f;
            CancellationSignal cancellationSignal = (CancellationSignal) mnVar.c;
            if (cancellationSignal != null) {
                try {
                    fw1.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                mnVar.c = null;
            }
            mnVar.getClass();
        }
    }

    public final void g1() {
        BiometricViewModel biometricViewModel = this.q1;
        biometricViewModel.i = false;
        biometricViewModel.i = false;
        if (p0()) {
            c g0 = g0();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) g0.E("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.p0()) {
                    fingerprintDialogFragment.f1();
                } else {
                    hd0 hd0 = new hd0(g0);
                    hd0.h(fingerprintDialogFragment);
                    hd0.d(true);
                }
            }
        }
        if (!this.q1.k && p0()) {
            hd0 hd02 = new hd0(g0());
            hd02.h(this);
            hd02.d(true);
        }
        Context e0 = e0();
        if (e0 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29) {
                int i = nlb.delay_showing_prompt_models;
                if (str != null) {
                    for (String equals : e0.getResources().getStringArray(i)) {
                        if (str.equals(equals)) {
                            BiometricViewModel biometricViewModel2 = this.q1;
                            biometricViewModel2.l = true;
                            this.p1.postDelayed(new vl0(biometricViewModel2, 1), 600);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void h1() {
        if (c0() != null && this.q1.d != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
        }
    }

    public final void i1(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.q1;
        if (!biometricViewModel.k && biometricViewModel.j) {
            biometricViewModel.j = false;
            new Handler(Looper.getMainLooper()).post(new pl0(this, i, charSequence));
        }
        g1();
    }

    public final void j1(yl0 yl0) {
        BiometricViewModel biometricViewModel = this.q1;
        if (biometricViewModel.j) {
            biometricViewModel.j = false;
            new Handler(Looper.getMainLooper()).post(new pl0(this, yl0));
        }
        g1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k1() {
        /*
            r9 = this;
            androidx.biometric.BiometricViewModel r0 = r9.q1
            boolean r0 = r0.i
            if (r0 != 0) goto L_0x0126
            android.content.Context r0 = r9.e0()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            androidx.biometric.BiometricViewModel r0 = r9.q1
            r1 = 1
            r0.i = r1
            r0.j = r1
            r9.h1()
            android.content.Context r0 = r9.V0()
            android.content.Context r0 = r0.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r0 = defpackage.rl0.d(r0)
            androidx.biometric.BiometricViewModel r2 = r9.q1
            ex r3 = r2.c
            r4 = 0
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r3.o
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r2.getClass()
            androidx.biometric.BiometricViewModel r2 = r9.q1
            ex r2 = r2.c
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r2.X
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            defpackage.rl0.g(r0, r3)
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            defpackage.rl0.e(r0, r4)
        L_0x0048:
            androidx.biometric.BiometricViewModel r2 = r9.q1
            java.lang.CharSequence r2 = r2.e()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0071
            androidx.biometric.BiometricViewModel r3 = r9.q1
            r3.getClass()
            c27 r3 = new c27
            r4 = 1
            r3.<init>((int) r4)
            androidx.biometric.BiometricViewModel r4 = r9.q1
            cm0 r5 = r4.g
            if (r5 != 0) goto L_0x006c
            cm0 r5 = new cm0
            r5.<init>((androidx.biometric.BiometricViewModel) r4)
            r4.g = r5
        L_0x006c:
            cm0 r4 = r4.g
            defpackage.rl0.f(r0, r2, r3, r4)
        L_0x0071:
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.biometric.BiometricViewModel r3 = r9.q1
            ex r3 = r3.c
            r4 = 0
            if (r3 == 0) goto L_0x0081
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r3 = r4
            goto L_0x0082
        L_0x0081:
            r3 = r1
        L_0x0082:
            defpackage.sl0.a(r0, r3)
            androidx.biometric.BiometricViewModel r3 = r9.q1
            ex r5 = r3.c
            if (r5 == 0) goto L_0x009a
            stf r3 = r3.d
            int r4 = r5.c
            if (r4 == 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            if (r3 == 0) goto L_0x0097
            r3 = 15
            goto L_0x0099
        L_0x0097:
            r3 = 255(0xff, float:3.57E-43)
        L_0x0099:
            r4 = r3
        L_0x009a:
            r3 = 30
            if (r2 < r3) goto L_0x00a2
            defpackage.tl0.a(r0, r4)
            goto L_0x00a9
        L_0x00a2:
            boolean r2 = defpackage.h2g.p(r4)
            defpackage.sl0.b(r0, r2)
        L_0x00a9:
            android.hardware.biometrics.BiometricPrompt r0 = defpackage.rl0.c(r0)
            android.content.Context r2 = r9.e0()
            androidx.biometric.BiometricViewModel r3 = r9.q1
            stf r3 = r3.d
            android.hardware.biometrics.BiometricPrompt$CryptoObject r3 = defpackage.lp.W(r3)
            androidx.biometric.BiometricViewModel r4 = r9.q1
            mn r5 = r4.f
            if (r5 != 0) goto L_0x00c8
            mn r5 = new mn
            r6 = 8
            r5.<init>((int) r6)
            r4.f = r5
        L_0x00c8:
            mn r4 = r4.f
            java.lang.Object r5 = r4.c
            android.os.CancellationSignal r5 = (android.os.CancellationSignal) r5
            if (r5 != 0) goto L_0x00dd
            java.lang.Object r5 = r4.b
            oa2 r5 = (oa2) r5
            r5.getClass()
            android.os.CancellationSignal r5 = defpackage.fw1.b()
            r4.c = r5
        L_0x00dd:
            java.lang.Object r4 = r4.c
            android.os.CancellationSignal r4 = (android.os.CancellationSignal) r4
            ul0 r5 = new ul0
            r5.<init>()
            androidx.biometric.BiometricViewModel r6 = r9.q1
            b2b r7 = r6.e
            if (r7 != 0) goto L_0x00f8
            b2b r7 = new b2b
            bm0 r8 = new bm0
            r8.<init>(r6)
            r7.<init>((defpackage.bm0) r8)
            r6.e = r7
        L_0x00f8:
            b2b r6 = r6.e
            java.lang.Object r7 = r6.b
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r7 = (android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) r7
            if (r7 != 0) goto L_0x010a
            java.lang.Object r7 = r6.c
            m70 r7 = (defpackage.m70) r7
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r7 = defpackage.k70.a(r7)
            r6.b = r7
        L_0x010a:
            java.lang.Object r6 = r6.b
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r6 = (android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) r6
            if (r3 != 0) goto L_0x0114
            defpackage.rl0.b(r0, r4, r5, r6)     // Catch:{ NullPointerException -> 0x0118 }
            goto L_0x0126
        L_0x0114:
            defpackage.rl0.a(r0, r3, r4, r5, r6)     // Catch:{ NullPointerException -> 0x0118 }
            goto L_0x0126
        L_0x0118:
            if (r2 == 0) goto L_0x0121
            int r0 = defpackage.gtb.default_error_msg
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0123
        L_0x0121:
            java.lang.String r0 = ""
        L_0x0123:
            r9.i1(r1, r0)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.k1():void");
    }

    public final void t0(int i, int i2, Intent intent) {
        super.t0(i, i2, intent);
        if (i == 1) {
            this.q1.k = false;
            if (i2 == -1) {
                j1(new yl0((stf) null, 1));
            } else {
                i1(10, i0(gtb.generic_error_user_canceled));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v16, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v17, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v18, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v19, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v20, types: [yh7, vb9] */
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (c0() != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new fzd(c0()).a(m7c.a(BiometricViewModel.class));
            this.q1 = biometricViewModel;
            if (biometricViewModel.n == null) {
                biometricViewModel.n = new yh7();
            }
            biometricViewModel.n.e(this, new ql0(this, 0));
            BiometricViewModel biometricViewModel2 = this.q1;
            if (biometricViewModel2.o == null) {
                biometricViewModel2.o = new yh7();
            }
            biometricViewModel2.o.e(this, new ql0(this, 1));
            BiometricViewModel biometricViewModel3 = this.q1;
            if (biometricViewModel3.p == null) {
                biometricViewModel3.p = new yh7();
            }
            biometricViewModel3.p.e(this, new ql0(this, 2));
            BiometricViewModel biometricViewModel4 = this.q1;
            if (biometricViewModel4.q == null) {
                biometricViewModel4.q = new yh7();
            }
            biometricViewModel4.q.e(this, new ql0(this, 3));
            BiometricViewModel biometricViewModel5 = this.q1;
            if (biometricViewModel5.r == null) {
                biometricViewModel5.r = new yh7();
            }
            biometricViewModel5.r.e(this, new ql0(this, 4));
            BiometricViewModel biometricViewModel6 = this.q1;
            if (biometricViewModel6.s == null) {
                biometricViewModel6.s = new yh7();
            }
            biometricViewModel6.s.e(this, new ql0(this, 5));
        }
    }
}
