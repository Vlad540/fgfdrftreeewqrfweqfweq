package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import java.util.Objects;

/* renamed from: wg5  reason: default package */
public final class wg5 implements cw9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogFragment b;

    public /* synthetic */ wg5(DialogFragment dialogFragment, int i) {
        this.a = i;
        this.b = dialogFragment;
    }

    public final void a(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.b;
                Handler handler = fingerprintDialogFragment.F1;
                re reVar = fingerprintDialogFragment.G1;
                handler.removeCallbacks(reVar);
                int intValue = num.intValue();
                if (fingerprintDialogFragment.K1 != null) {
                    int i2 = fingerprintDialogFragment.H1.t;
                    Context e0 = fingerprintDialogFragment.e0();
                    Drawable drawable = null;
                    if (e0 != null) {
                        if (i2 == 0 && intValue == 1) {
                            i = wnb.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && intValue == 2) {
                            i = wnb.fingerprint_dialog_error;
                        } else if (i2 == 2 && intValue == 1) {
                            i = wnb.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && intValue == 3) {
                            i = wnb.fingerprint_dialog_fp_icon;
                        }
                        drawable = gq3.b(e0, i);
                    }
                    if (drawable != null) {
                        fingerprintDialogFragment.K1.setImageDrawable(drawable);
                        if (!(i2 == 0 && intValue == 1) && ((i2 == 1 && intValue == 2) || (i2 == 2 && intValue == 1))) {
                            xg5.a(drawable);
                        }
                        fingerprintDialogFragment.H1.t = intValue;
                    }
                }
                int intValue2 = num.intValue();
                TextView textView = fingerprintDialogFragment.L1;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? fingerprintDialogFragment.I1 : fingerprintDialogFragment.J1);
                }
                fingerprintDialogFragment.F1.postDelayed(reVar, 2000);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                FingerprintDialogFragment fingerprintDialogFragment2 = (FingerprintDialogFragment) this.b;
                Handler handler2 = fingerprintDialogFragment2.F1;
                re reVar2 = fingerprintDialogFragment2.G1;
                handler2.removeCallbacks(reVar2);
                TextView textView2 = fingerprintDialogFragment2.L1;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                fingerprintDialogFragment2.F1.postDelayed(reVar2, 2000);
                return;
            default:
                if (((nc7) obj) != null) {
                    DialogFragment dialogFragment = this.b;
                    if (dialogFragment.w1) {
                        View W0 = dialogFragment.W0();
                        if (W0.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (dialogFragment.A1 != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(dialogFragment.A1);
                            }
                            dialogFragment.A1.setContentView(W0);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
