package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import java.util.concurrent.locks.ReentrantLock;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* renamed from: fq  reason: default package */
public final class fq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fq(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onClick(View view) {
        Widget widget = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((u16) obj2).invoke(((dq) obj).a);
                return;
            case 1:
                ya8 ya8 = (ya8) obj;
                xb8 xb8 = (xb8) obj2;
                ya8.N0.y0.C0 = xb8;
                xb8.l();
                ya8.K0.setVisibility(4);
                ya8.L0.setVisibility(0);
                return;
            case 2:
                PermissionBottomSheet permissionBottomSheet = (PermissionBottomSheet) obj;
                try {
                    permissionBottomSheet.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", ((LinearLayout) obj2).getContext().getPackageName(), (String) null)));
                } catch (Throwable unused) {
                }
                permissionBottomSheet.r0(true);
                return;
            case 3:
                ((PermissionBottomSheet) obj2).K0 = true;
                PermissionBottomSheet permissionBottomSheet2 = (PermissionBottomSheet) obj;
                qna qna = (qna) permissionBottomSheet2.C0.getValue();
                Widget targetController = permissionBottomSheet2.getTargetController();
                if (targetController instanceof Widget) {
                    widget = targetController;
                }
                if (widget != null) {
                    jrf jrf = new jrf(widget, 1);
                    k77[] k77Arr = PermissionBottomSheet.L0;
                    k77 k77 = k77Arr[4];
                    String[] strArr = (String[]) permissionBottomSheet2.H0.a(permissionBottomSheet2);
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                    k77 k772 = k77Arr[5];
                    qna.f(jrf, strArr, ((Number) permissionBottomSheet2.I0.a(permissionBottomSheet2)).intValue());
                    permissionBottomSheet2.r0(true);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 4:
                k77[] k77Arr2 = RecordExitBottomSheet.K0;
                RecordExitBottomSheet recordExitBottomSheet = (RecordExitBottomSheet) obj2;
                h5c h5c = (h5c) recordExitBottomSheet.D0.getValue();
                int i = (int) ((e5c) obj).c.a;
                boolean isChecked = recordExitBottomSheet.z0().isChecked();
                h5c.getClass();
                if (!(i == o1a.i1 || i == o1a.Z0)) {
                    int i2 = o1a.h1;
                    po1 po1 = h5c.o;
                    if (i == i2) {
                        ((ep1) po1.a).v();
                    } else if (i == o1a.a1) {
                        Boolean valueOf = Boolean.valueOf(isChecked);
                        e5c e5c = (e5c) h5c.w0.a.getValue();
                        if (e5c == null || !e5c.f) {
                            valueOf = null;
                        }
                        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
                        Boolean bool = h5c.c;
                        if (bool != null) {
                            ((py0) ((vx0) h5c.Z.getValue())).i(bool.booleanValue());
                        }
                        po1.getClass();
                        RecordManager.StopParams stopParams = new RecordManager.StopParams((w2d) null, booleanValue, 1, (x54) null);
                        doc doc = (doc) po1.i;
                        doc.getClass();
                        udd.P("ScreenRecordControllerTag", "stopRecordBroadcast", new Object[0]);
                        ReentrantLock reentrantLock = doc.X;
                        reentrantLock.lock();
                        try {
                            if (((eoc) doc.Z.getValue()).a != foc.a) {
                                udd.P("ScreenRecordControllerTag", "startRecordBroadcast already finished", new Object[0]);
                            } else {
                                iq1 iq1 = (iq1) doc.o.getValue();
                                iq1.getClass();
                                iq1.c(iq1, "CALL_RECORDING", (String) null, (String) null, 0, (String) null, (String) null, true, 54);
                                RecordManager b2 = doc.b();
                                if (b2 != null) {
                                    RecordManager.stopRecord$default(b2, stopParams, new nya(doc, 12, stopParams), (u16) null, 4, (Object) null);
                                }
                                reentrantLock.unlock();
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
                recordExitBottomSheet.r0(true);
                return;
            case 5:
                cme cme = (cme) obj;
                Window.Callback callback = cme.k;
                if (callback != null && cme.l) {
                    callback.onMenuItemSelected(0, (c7) obj2);
                    return;
                }
                return;
            default:
                try {
                    ((Context) obj2).startActivity((Intent) obj);
                    return;
                } catch (ActivityNotFoundException unused2) {
                    return;
                }
        }
    }

    public fq(cme cme) {
        this.a = 5;
        this.c = cme;
        this.b = new c7(cme.a.getContext(), cme.h);
    }

    public fq(ya8 ya8, xb8 xb8) {
        this.a = 1;
        this.c = ya8;
        this.b = xb8;
    }
}
