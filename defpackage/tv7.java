package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: tv7  reason: default package */
public class tv7 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(sv7 sv7) {
        Objects.requireNonNull(sv7);
        return new wm(1, sv7);
    }

    public void b(sv7 sv7, View view, boolean z) {
        OnBackInvokedDispatcher m;
        if (this.a == null && (m = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback a2 = a(sv7);
            this.a = a2;
            m.registerOnBackInvokedCallback(z ? 1000000 : 0, a2);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher m = view.findOnBackInvokedDispatcher();
        if (m != null) {
            m.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }
}
