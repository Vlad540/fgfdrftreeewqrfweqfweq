package defpackage;

import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;

/* renamed from: kif  reason: default package */
public final /* synthetic */ class kif implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mif b;

    public /* synthetic */ kif(mif mif, int i) {
        this.a = i;
        this.b = mif;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, zl0] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new lif(this.b);
            default:
                mif mif = this.b;
                lif lif = (lif) ((t97) mif.X).getValue();
                ? obj = new Object();
                b bVar = (b) mif.a;
                if (bVar == null) {
                    throw new IllegalArgumentException("FragmentActivity must not be null.");
                } else if (lif != null) {
                    vx5 P = bVar.P();
                    BiometricViewModel a2 = new fzd(bVar).a(m7c.a(BiometricViewModel.class));
                    obj.a = P;
                    if (a2 != null) {
                        a2.b = lif;
                    }
                    return obj;
                } else {
                    throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                }
        }
    }
}
