package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

/* renamed from: bb5  reason: default package */
public final class bb5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bb5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void m(Activity activity) {
    }

    private final void n(Activity activity) {
    }

    private final void o(Activity activity, Bundle bundle) {
    }

    private final void p(Activity activity, Bundle bundle) {
    }

    private final void q(Activity activity, Bundle bundle) {
    }

    private final void r(Activity activity, Bundle bundle) {
    }

    private final void s(Activity activity) {
    }

    private final void t(Activity activity) {
    }

    private final void u(Activity activity) {
    }

    private final void v(Activity activity) {
    }

    private final void w(Activity activity) {
    }

    private final void x(Activity activity) {
    }

    private final void y(Activity activity) {
    }

    private final void z(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                } else {
                                    return;
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                            ih5 b2 = ih5.b();
                            b2.a();
                            hr1.r(b2.d.a(cd.class));
                        }
                        h2g.r("_no", bundle2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                mfc mfc = mfc.a;
                mfc.b.add(new mt3(2, (o4a) this.b));
                View decorView = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    viewGroup.setOnHierarchyChangeListener(mfc);
                }
                rg5 rg5 = new rg5(hhd.Q(cs.K(new View[]{activity.getWindow().getDecorView().getRootView()}), new qq9(7), new qq9()));
                while (rg5.hasNext()) {
                    View view = (View) rg5.next();
                    ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup2 != null) {
                        viewGroup2.setOnHierarchyChangeListener(mfc);
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.a;
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ((dna) this.b).b.e();
                return;
            default:
                int i = Build.VERSION.SDK_INT;
                mna mna = (mna) this.b;
                if (i >= 33) {
                    mna.d.e();
                }
                mna.e.e();
                mna.f.e();
                if (i >= 34) {
                    mna.g.e();
                }
                mna.h.e();
                mna.i.e();
                mna.j.e();
                return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    public final void onActivityStarted(Activity activity) {
        int i = this.a;
    }

    public final void onActivityStopped(Activity activity) {
        int i = this.a;
    }

    public bb5() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }
}
