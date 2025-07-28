package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* renamed from: iv4  reason: default package */
public final class iv4 extends nt4 {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public iv4(EditText editText) {
        this.b = new WeakReference(editText);
    }

    public void h(Throwable th) {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void i() {
        switch (this.a) {
            case 0:
                kv4.a((EditText) this.b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.d();
                    return;
                }
                return;
        }
    }

    public iv4(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
