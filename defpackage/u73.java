package defpackage;

import androidx.fragment.app.b;

/* renamed from: u73  reason: default package */
public final /* synthetic */ class u73 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e83 b;

    public /* synthetic */ u73(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateOptionsMenu();
                return;
            default:
                try {
                    u73.super.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!hhd.f(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!hhd.f(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
