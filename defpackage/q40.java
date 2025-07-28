package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: q40  reason: default package */
public final class q40 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q40(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        xa4 xa4;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                r40 r40 = (r40) this.b;
                g37 g37 = r40.X0;
                m40 m40 = (m40) obj;
                if (g37 == null || !g37.isActive()) {
                    r40.X0 = ez3.N(new ck5(m40.k, new o40(r40, (Continuation) null), 5), paf.b(view));
                }
                g37 g372 = r40.W0;
                if (g372 == null || !g372.isActive()) {
                    r40.W0 = ez3.N(new ck5(m40.l, new p40(r40, (Continuation) null), 5), paf.b(view));
                    return;
                }
                return;
            case 1:
                ua2 ua2 = (ua2) this.b;
                g37 g373 = ua2.P0;
                if (g373 == null || !g373.isActive()) {
                    ua2.P0 = ez3.N(new ck5((zqd) obj, new ta2(ua2, (Continuation) null), 5), paf.b(view));
                    return;
                }
                return;
            case 2:
                qe5 qe5 = (qe5) this.b;
                g37 g374 = qe5.J0;
                if (g374 == null || !g374.isActive()) {
                    qe5.J0 = ez3.N(new ck5(((pc5) obj).n, new pe5(qe5, (Continuation) null), 5), paf.b(view));
                    return;
                }
                return;
            case 3:
                e eVar = (e) this.b;
                a aVar = eVar.c;
                eVar.k();
                ViewGroup viewGroup = (ViewGroup) aVar.Y0.getParent();
                ((jx5) obj).a.K();
                Object tag = viewGroup.getTag(sqb.special_effects_controller_view_tag);
                if (tag instanceof xa4) {
                    xa4 = (xa4) tag;
                } else {
                    xa4 = new xa4(viewGroup);
                    viewGroup.setTag(sqb.special_effects_controller_view_tag, xa4);
                }
                xa4.h();
                return;
            case 4:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = eaf.a;
                r9f.c((View) obj);
                return;
            case 5:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ng8 ng8 = (ng8) obj;
                ng8.setPadding(ng8.getPaddingLeft(), ng8.getPaddingTop(), ng8.getPaddingRight(), a24.X((nsf.f((View) null, ng8.getRootWindowInsets()).a.f(2).d > 0 ? (float) 2 : (float) 8) * dh4.c().getDisplayMetrics().density));
                return;
            case 6:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((b7e) obj).requestApplyInsets();
                return;
            case 7:
                return;
            case 8:
                zid zid = (zid) this.b;
                g37 g375 = zid.J0;
                if (g375 == null || !g375.isActive()) {
                    zid.J0 = ez3.N(new ck5(((wid) obj).d, new yid(zid, (Continuation) null), 5), paf.b(view));
                    return;
                }
                return;
            case 9:
                bjd bjd = (bjd) this.b;
                g37 g376 = bjd.R0;
                if (g376 == null || !g376.isActive()) {
                    bjd.R0 = ez3.N(new ck5(((wid) obj).d, new ajd(bjd, (Continuation) null), 5), paf.b(view));
                    return;
                }
                return;
            case 10:
                kme kme = (kme) this.b;
                if (kme != null) {
                    kme.B((RecyclerView) view);
                }
                this.b = gp0.l((RecyclerView) obj);
                return;
            case 11:
                ha4 ha4 = oi4.a;
                ContextScope a2 = n1g.a(MainDispatcherLoader.dispatcher);
                this.b = a2;
                ez3.N(new ck5(new ck5(new ik5(wce.d0, 2), new yce(view, (Continuation) null)), new zce((ade) obj, view, (Continuation) null), 5), a2);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return;
            case 13:
                ac7 b2 = paf.b(view);
                a6f a6f = (a6f) this.b;
                qod qod = a6f.L0;
                h5f h5f = (h5f) obj;
                if (qod == null || !qod.isActive()) {
                    a6f.L0 = ez3.N(new ck5(h5f.f, new z5f(a6f, (Continuation) null), 5), b2);
                }
                ac7 b3 = paf.b(view);
                qod qod2 = a6f.K0;
                if (qod2 == null || !qod2.isActive()) {
                    a6f.K0 = ez3.N(new ck5(h5f.d, new y5f(a6f, (Continuation) null), 5), b3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                pc7 pc7 = ((xha) this.c).a;
                if (pc7 == null) {
                    pc7 = null;
                }
                pc7.d(nb7.ON_DESTROY);
                return;
            case 8:
            case 9:
                return;
            case 10:
                kme kme = (kme) this.b;
                if (kme != null) {
                    kme.B((RecyclerView) view);
                }
                this.b = null;
                return;
            case 11:
                try {
                    ContextScope contextScope = (ContextScope) this.b;
                    if (contextScope != null) {
                        n1g.c(contextScope, (CancellationException) null);
                    }
                    this.b = null;
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                m3f m3f = (m3f) this.c;
                f9f f9f = (f9f) m3f.Q();
                if (f9f.b != null && f9f.getChildCount() > 0) {
                    m3f.t();
                    return;
                }
                return;
            case 13:
                return;
            default:
                udd.q(xie.w((Widget) this.b), "lifecycle: postCreateView invoke onViewDetachedFromWindow");
                view.removeOnAttachStateChangeListener(this);
                ((irf) this.c).a = true;
                return;
        }
    }

    public /* synthetic */ q40(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public q40(jx5 jx5, e eVar) {
        this.a = 3;
        this.c = jx5;
        this.b = eVar;
    }
}
