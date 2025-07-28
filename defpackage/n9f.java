package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: n9f  reason: default package */
public final class n9f implements View.OnClickListener, xi4 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final View b;
    public final bw9 c;

    public n9f(View view, bw9 bw9) {
        this.b = view;
        this.c = bw9;
    }

    public final void f() {
        if (!this.a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.setOnClickListener((View.OnClickListener) null);
        } else {
            de.a().b(new eq6(5, this));
        }
    }

    public final boolean h() {
        return this.a.get();
    }

    public final void onClick(View view) {
        if (!this.a.get()) {
            this.c.c(jue.a);
        }
    }
}
