package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.sdk.arch.Widget;

/* renamed from: vha  reason: default package */
public final class vha extends pr3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public vha(as3 as3, ArrayList arrayList) {
        this.c = as3;
        this.b = arrayList;
    }

    public final void a(rr3 rr3, wr3 wr3, xr3 xr3) {
        switch (this.a) {
            case 0:
                if (((rr3) this.c) == rr3 && xr3.b && wr3.d()) {
                    View view = rr3.getView();
                    pc7 pc7 = null;
                    if ((view != null ? view.getWindowToken() : null) != null) {
                        pc7 pc72 = ((xha) this.b).a;
                        if ((pc72 == null ? null : pc72).d == ob7.o) {
                            if (pc72 != null) {
                                pc7 = pc72;
                            }
                            pc7.d(nb7.ON_RESUME);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (xr3 == xr3.POP_EXIT) {
                    List list = (List) this.b;
                    for (int size = list.size() - 1; size > 0; size--) {
                        ((sgc) this.c).z((vgc) null, (vgc) list.get(size), true, new bhd());
                    }
                    return;
                }
                return;
        }
    }

    public void b(rr3 rr3, wr3 wr3, xr3 xr3) {
        switch (this.a) {
            case 0:
                xha.a((xha) this.b, (rr3) this.c, rr3, wr3, xr3);
                for (u96 u96 : v96.a.values()) {
                    if (u96.a.contains(rr3.getInstanceId())) {
                        u96.b.invoke(rr3, wr3, xr3);
                    }
                }
                return;
            default:
                return;
        }
    }

    public void c(rr3 rr3, Bundle bundle) {
        switch (this.a) {
            case 0:
                ((xha) this.b).o = bundle.getBundle("Registry.savedState");
                return;
            default:
                return;
        }
    }

    public void e(rr3 rr3, Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.putBundle("Registry.savedState", ((xha) this.b).o);
                return;
            default:
                return;
        }
    }

    public void f(rr3 rr3) {
        switch (this.a) {
            case 0:
                xha xha = (xha) this.b;
                if (!xha.c) {
                    Bundle bundle = new Bundle();
                    xha.o = bundle;
                    ud udVar = xha.b;
                    if (udVar == null) {
                        udVar = null;
                    }
                    udVar.u(bundle);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void g(rr3 rr3) {
        switch (this.a) {
            case 0:
                pc7 pc7 = ((xha) this.b).a;
                if (pc7 == null) {
                    pc7 = null;
                }
                pc7.d(nb7.ON_RESUME);
                return;
            default:
                return;
        }
    }

    public void h(rr3 rr3) {
        switch (this.a) {
            case 0:
                xha xha = (xha) this.b;
                xha.getClass();
                LinkedHashMap linkedHashMap = v96.a;
                lg7 c2 = hwf.c();
                for (rr3 parentController = rr3.getParentController(); parentController != null; parentController = parentController.getParentController()) {
                    c2.add(parentController.getInstanceId());
                }
                v96.a.put(rr3.getInstanceId(), new u96(hwf.a(c2), new wha(xha)));
                return;
            default:
                return;
        }
    }

    public void j(rr3 rr3, View view) {
        switch (this.a) {
            case 0:
                Object tag = view.getTag(kob.view_tree_lifecycle_owner);
                xha xha = (xha) this.b;
                if (tag == null && view.getTag(kob.view_tree_saved_state_registry_owner) == null) {
                    xie.G(view, xha);
                    ete.X(view, xha);
                }
                pc7 pc7 = xha.a;
                if (pc7 == null) {
                    pc7 = null;
                }
                pc7.d(nb7.ON_START);
                return;
            default:
                return;
        }
    }

    public void p(rr3 rr3) {
        switch (this.a) {
            case 0:
                ((xha) this.b).getClass();
                v96.a.remove(rr3.getInstanceId());
                return;
            default:
                return;
        }
    }

    public void q(rr3 rr3) {
        switch (this.a) {
            case 0:
                xha xha = (xha) this.b;
                xha.c = false;
                xha.a = new pc7(xha);
                ud udVar = new ud((zkc) xha);
                xha.b = udVar;
                udVar.t(xha.o);
                pc7 pc7 = xha.a;
                if (pc7 == null) {
                    pc7 = null;
                }
                pc7.d(nb7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: pc7} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(defpackage.rr3 r3, android.view.View r4) {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r3.isBeingDestroyed()
            java.lang.Object r2 = r2.b
            xha r2 = (defpackage.xha) r2
            r1 = 0
            if (r0 == 0) goto L_0x0036
            sgc r3 = r3.getRouter()
            ie0 r3 = r3.a
            java.util.ArrayDeque r3 = r3.a
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0036
            android.view.ViewParent r3 = r4.getParent()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x002a
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L_0x002a:
            if (r1 == 0) goto L_0x0041
            q40 r3 = new q40
            r4 = 7
            r3.<init>(r1, r4, r2)
            r1.addOnAttachStateChangeListener(r3)
            goto L_0x0041
        L_0x0036:
            pc7 r2 = r2.a
            if (r2 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            nb7 r2 = defpackage.nb7.ON_DESTROY
            r1.d(r2)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vha.s(rr3, android.view.View):void");
    }

    public void t(rr3 rr3) {
        switch (this.a) {
            case 0:
                xha xha = (xha) this.b;
                pc7 pc7 = xha.a;
                pc7 pc72 = null;
                if ((pc7 == null ? null : pc7).d == ob7.X) {
                    if (pc7 == null) {
                        pc7 = null;
                    }
                    pc7.d(nb7.ON_PAUSE);
                }
                pc7 pc73 = xha.a;
                if (pc73 != null) {
                    pc72 = pc73;
                }
                pc72.d(nb7.ON_STOP);
                return;
            default:
                return;
        }
    }

    public vha(xha xha, Widget widget) {
        this.b = xha;
        this.c = widget;
    }
}
