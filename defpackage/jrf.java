package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* renamed from: jrf  reason: default package */
public final class jrf {
    public final /* synthetic */ int a;
    public final Widget b;
    public final t97 c;

    public jrf(Widget widget, int i) {
        this.a = i;
        switch (i) {
            case 1:
                r7e d = ena.a.getAccessor().d(x0f.class);
                this.b = widget;
                this.c = d;
                return;
            default:
                this.b = widget;
                this.c = ez3.O(3, new q6e(14, this));
                return;
        }
    }

    private final void d(String[] strArr, int i, int i2, int i3, int i4) {
    }

    public void a() {
        hba hba = new hba(this.b);
        hba.h(new hge(l1a.a));
        hba.j();
    }

    public void b() {
        tc tcVar = new tc(this.b.getContext(), 16974128);
        int i = l1a.g;
        pc pcVar = tcVar.a;
        pcVar.f = pcVar.a.getText(i);
        tcVar.setPositiveButton(l1a.h, new h00(3));
        tcVar.a();
    }

    public final void c(String[] strArr, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return;
            default:
                k77[] k77Arr = BottomSheetWidget.B0;
                rr3 permissionBottomSheet = new PermissionBottomSheet(strArr, i, i2, i3, i4);
                rr3 rr3 = this.b;
                permissionBottomSheet.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                sgc sgc = null;
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                permissionBottomSheet.y0(rr3);
                if (sgc != null) {
                    vgc vgc = new vgc(permissionBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                    return;
                }
                return;
        }
    }

    public final void e(int i, String[] strArr) {
        Object obj;
        t97 t97 = this.c;
        switch (this.a) {
            case 0:
                ((jrf) t97.getValue()).e(i, strArr);
                return;
            default:
                Widget widget = this.b;
                if (i == 180) {
                    x0f x0f = (x0f) t97.getValue();
                    Context context = widget.getContext();
                    x0f.getClass();
                    String str = oyb.g;
                    try {
                        context.startActivity(oyb.E(context, x0f.a));
                        obj = jue.a;
                    } catch (Throwable th) {
                        obj = new kcc(th);
                    }
                    Throwable a2 = mcc.a(obj);
                    if (a2 != null) {
                        String str2 = oyb.g;
                        udd.s(oyb.g, "showFsiSettings getOpenFsiSettingsIntent error " + a2, (Throwable) null);
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        String packageName = context.getPackageName();
                        intent.setData(Uri.parse("package:" + packageName));
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                widget.requestPermissions(strArr, i);
                return;
        }
    }

    public final boolean f(String str) {
        switch (this.a) {
            case 0:
                return ((jrf) this.c.getValue()).f(str);
            default:
                String[] strArr = qna.d;
                if (cs.N(qna.o, str)) {
                    return true;
                }
                return this.b.shouldShowRequestPermissionRationale(str);
        }
    }

    public final void g(int i, int i2) {
        switch (this.a) {
            case 0:
                ((jrf) this.c.getValue()).g(i, i2);
                return;
            default:
                k77[] k77Arr = BottomSheetWidget.B0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(i, i2);
                rr3 rr3 = this.b;
                permissionBottomSheet.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                sgc sgc = null;
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                permissionBottomSheet.y0(rr3);
                if (sgc != null) {
                    vgc vgc = new vgc(permissionBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                    return;
                }
                return;
        }
    }
}
