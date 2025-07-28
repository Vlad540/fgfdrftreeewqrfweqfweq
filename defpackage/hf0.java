package defpackage;

import android.app.Activity;

/* renamed from: hf0  reason: default package */
public final class hf0 extends zv4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                qf0 qf0 = (qf0) this.b;
                qf0.d.e();
                qf0.e.e();
                return;
            default:
                boolean z = ((kdf) this.b).k;
                if (!((kdf) this.b).k) {
                    udd.T("kdf", "set visible=true on onActivityResumed", new Object[0]);
                    ((kdf) this.b).k = true;
                }
                boolean z2 = ((kdf) this.b).l;
                if (!((kdf) this.b).l) {
                    udd.T("kdf", "set screenOn=true on onActivityResumed", new Object[0]);
                    ((kdf) this.b).l = true;
                }
                if (!z || !z2) {
                    udd.T("kdf", "crutch! call onAppGoesForeground", new Object[0]);
                    ((kdf) this.b).b();
                    return;
                }
                return;
        }
    }

    public void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                ((kdf) this.b).f++;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "kdf", "onActivityStarted, visibleActivitiesCount: " + ((kdf) this.b).f, (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                kdf kdf = (kdf) this.b;
                kdf.f--;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "kdf", "onActivityStopped, visibleActivitiesCount: " + ((kdf) this.b).f, (Throwable) null);
                }
                if (((kdf) this.b).k) {
                    kdf kdf2 = (kdf) this.b;
                    if (kdf2.f == 0) {
                        kdf2.k = false;
                        ((kdf) this.b).a();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
