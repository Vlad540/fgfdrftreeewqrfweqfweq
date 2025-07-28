package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;

/* renamed from: ql0  reason: default package */
public final class ql0 implements cw9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ ql0(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r3v19, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r3v35, types: [yh7, vb9] */
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                yl0 yl0 = (yl0) obj;
                if (yl0 != null) {
                    BiometricFragment biometricFragment = this.b;
                    biometricFragment.j1(yl0);
                    BiometricViewModel biometricViewModel = biometricFragment.q1;
                    if (biometricViewModel.n == null) {
                        biometricViewModel.n = new yh7();
                    }
                    BiometricViewModel.j(biometricViewModel.n, (Object) null);
                    return;
                }
                return;
            case 1:
                ol0 ol0 = (ol0) obj;
                if (ol0 != null) {
                    BiometricFragment biometricFragment2 = this.b;
                    biometricFragment2.getClass();
                    int i = ol0.a;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            i = 8;
                            break;
                    }
                    biometricFragment2.e0();
                    biometricFragment2.h1();
                    CharSequence charSequence = ol0.b;
                    if (charSequence == null) {
                        charSequence = biometricFragment2.i0(gtb.default_error_msg) + " " + i;
                    }
                    biometricFragment2.i1(i, charSequence);
                    biometricFragment2.q1.f((ol0) null);
                    return;
                }
                return;
            case 2:
                if (((CharSequence) obj) != null) {
                    BiometricFragment biometricFragment3 = this.b;
                    biometricFragment3.h1();
                    biometricFragment3.q1.f((ol0) null);
                    return;
                }
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    BiometricFragment biometricFragment4 = this.b;
                    biometricFragment4.h1();
                    if (biometricFragment4.q1.j) {
                        new Handler(Looper.getMainLooper()).post(new pl0(biometricFragment4));
                    }
                    BiometricViewModel biometricViewModel2 = biometricFragment4.q1;
                    if (biometricViewModel2.q == null) {
                        biometricViewModel2.q = new yh7();
                    }
                    BiometricViewModel.j(biometricViewModel2.q, Boolean.FALSE);
                    return;
                }
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    BiometricFragment biometricFragment5 = this.b;
                    biometricFragment5.getClass();
                    CharSequence e = biometricFragment5.q1.e();
                    if (e == null) {
                        e = biometricFragment5.i0(gtb.default_error_msg);
                    }
                    biometricFragment5.i1(13, e);
                    biometricFragment5.f1(2);
                    biometricFragment5.q1.i(false);
                    return;
                }
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    BiometricFragment biometricFragment6 = this.b;
                    biometricFragment6.f1(1);
                    biometricFragment6.g1();
                    BiometricViewModel biometricViewModel3 = biometricFragment6.q1;
                    if (biometricViewModel3.s == null) {
                        biometricViewModel3.s = new yh7();
                    }
                    BiometricViewModel.j(biometricViewModel3.s, Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}
