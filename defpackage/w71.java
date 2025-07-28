package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: w71  reason: default package */
public final class w71 implements qk1 {
    public final t97 A0;
    public final t97 B0;
    public final or3 C0;
    public final t97 X;
    public final t97 Y = ez3.O(3, new a01(12));
    public Activity Z;
    public final so1 a;
    public final g85 b;
    public final qz0 c;
    public final vp1 o;
    public final t97 w0;
    public final t97 x0;
    public Drawable y0;
    public boolean z0;

    public w71(so1 so1, g85 g85, qz0 qz0, vp1 vp1, t97 t97, t97 t972) {
        this.a = so1;
        this.b = g85;
        this.c = qz0;
        this.o = vp1;
        this.X = t972;
        this.w0 = t97;
        t97 O = ez3.O(3, new a01(13));
        this.x0 = O;
        this.y0 = (ColorDrawable) O.getValue();
        this.A0 = ez3.O(3, new q71(this, 0));
        this.B0 = ez3.O(3, new q71(this, 1));
        this.C0 = new or3(2, (Object) this);
    }

    public static sgc c() {
        return o2a.a.o().f().C();
    }

    public static void e(w71 w71) {
        w71.z0 = false;
        ((v75) w71.b).c(50);
        w71.C0.f(false);
    }

    public final boolean b() {
        return ((ep1) this.a).p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PictureInPictureParams d() {
        /*
            r9 = this;
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            lg7 r1 = defpackage.hwf.c()
            qz0 r2 = r9.c
            r3 = r2
            rz0 r3 = (defpackage.rz0) r3
            boolean r3 = r3.d()
            java.lang.Class<h91> r4 = defpackage.h91.class
            r5 = 0
            java.lang.String r6 = "Required value was null."
            if (r3 == 0) goto L_0x005a
            android.app.Activity r9 = r9.Z
            if (r9 == 0) goto L_0x0054
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.n1a.e0
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.r1a.i0
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            o2a r7 = defpackage.o2a.a
            w4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.c(r4)
            h91 r4 = (defpackage.h91) r4
            rz0 r2 = (defpackage.rz0) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L_0x004a
            r5.<init>(r3, r8, r9, r2)
            goto L_0x0054
        L_0x004a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L_0x0054:
            if (r5 == 0) goto L_0x0098
        L_0x0056:
            r1.add(r5)
            goto L_0x0098
        L_0x005a:
            android.app.Activity r9 = r9.Z
            if (r9 == 0) goto L_0x0095
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.n1a.f0
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.r1a.h0
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            o2a r7 = defpackage.o2a.a
            w4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.c(r4)
            h91 r4 = (defpackage.h91) r4
            rz0 r2 = (defpackage.rz0) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L_0x008b
            r5.<init>(r3, r8, r9, r2)
            goto L_0x0095
        L_0x008b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L_0x0095:
            if (r5 == 0) goto L_0x0098
            goto L_0x0056
        L_0x0098:
            lg7 r9 = defpackage.hwf.a(r1)
            android.app.PictureInPictureParams$Builder r9 = r0.setActions(r9)
            java.lang.String r0 = "2:3"
            android.util.Rational r0 = android.util.Rational.parseRational(r0)
            android.app.PictureInPictureParams$Builder r9 = r9.setAspectRatio(r0)
            android.app.PictureInPictureParams r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w71.d():android.app.PictureInPictureParams");
    }

    public final void f(boolean z) {
        Activity activity = this.Z;
        if (activity != null) {
            boolean B = o2a.a.o().f().B(z);
            udd.p("PipAppController", "try to hide call indicator hasCall=" + b(), new Object[0]);
            if (B) {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                boolean z2 = false;
                View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                if (childAt != null && km4.y0.r(childAt).getName().equals("one.me.sdk.design.OneMeThemeDark")) {
                    z2 = true;
                }
                kjd.l(activity, z2);
            }
        }
    }

    public final void g(boolean z) {
        Activity activity = this.Z;
        if (activity != null) {
            boolean b2 = b();
            vgc vgc = (vgc) o23.f0(c().e());
            rr3 rr3 = vgc != null ? vgc.a : null;
            boolean z2 = !((rr3 instanceof dk9) || rr3 == null);
            udd.p("PipAppController", "try to show call indicator hasCall=" + b2 + " canShow=" + z2 + ".", new Object[0]);
            if (z2 && b2 && o2a.a.o().f().b(new CallIndicatorWidget(), z)) {
                kjd.l(activity, true);
            }
            if (!b2) {
                udd.p("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
                f(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r8 = this;
            android.app.Activity r0 = r8.Z
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            boolean r1 = r1.isDeviceLocked()
            java.lang.String r2 = "PipAppController"
            if (r1 == 0) goto L_0x001b
            java.lang.String r8 = "can't show global pip due to device is locked"
            defpackage.udd.p(r2, r8, new java.lang.Object[0])
            return
        L_0x001b:
            android.app.Activity r1 = r8.Z
            r3 = 0
            if (r1 != 0) goto L_0x0022
            r1 = r3
            goto L_0x002c
        L_0x0022:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r4 = "android.software.picture_in_picture"
            boolean r1 = r1.hasSystemFeature(r4)
        L_0x002c:
            if (r1 != 0) goto L_0x0034
            java.lang.String r8 = "pip mode doesn't supported on current device"
            defpackage.udd.p(r2, r8, new java.lang.Object[0])
            return
        L_0x0034:
            android.app.Activity r1 = r8.Z
            r4 = 1
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r1 = r3
            goto L_0x005b
        L_0x003b:
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            java.lang.Object r5 = r1.getSystemService(r5)     // Catch:{ SecurityException -> 0x0055 }
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r6 = "android:picture_in_picture"
            int r7 = android.os.Process.myUid()     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ SecurityException -> 0x0055 }
            int r1 = r5.unsafeCheckOp(r6, r7, r1)     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x0039
            r1 = r4
            goto L_0x005b
        L_0x0055:
            java.lang.String r1 = "Can't check pip permission state in settings."
            defpackage.udd.p(r2, r1, new java.lang.Object[0])
            goto L_0x0039
        L_0x005b:
            if (r1 != 0) goto L_0x0063
            java.lang.String r8 = "doesn't have PIP permission."
            defpackage.udd.p(r2, r8, new java.lang.Object[0])
            return
        L_0x0063:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.util.List r5 = r1.getAppTasks()
            int r5 = r5.size()
            if (r5 != r4) goto L_0x0089
            java.util.List r1 = r1.getAppTasks()
            java.lang.Object r1 = defpackage.o23.V(r1)
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            int r1 = r1.numActivities
            if (r1 != r4) goto L_0x0089
            r1 = r4
            goto L_0x008a
        L_0x0089:
            r1 = r3
        L_0x008a:
            sgc r5 = c()
            java.util.ArrayList r5 = r5.e()
            java.lang.Object r5 = defpackage.o23.f0(r5)
            vgc r5 = (defpackage.vgc) r5
            r6 = 0
            if (r5 == 0) goto L_0x009e
            rr3 r5 = r5.a
            goto L_0x009f
        L_0x009e:
            r5 = r6
        L_0x009f:
            boolean r7 = r5 instanceof defpackage.dk9
            if (r7 != 0) goto L_0x00a8
            if (r5 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r5 = r3
            goto L_0x00a9
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            so1 r7 = r8.a
            if (r5 == 0) goto L_0x00c7
            t97 r5 = r8.Y
            java.lang.Object r5 = r5.getValue()
            xh1 r5 = (defpackage.xh1) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x00c5
            r5 = r7
            ep1 r5 = (defpackage.ep1) r5
            boolean r5 = r5.q()
            if (r5 == 0) goto L_0x00c5
            r3 = r4
        L_0x00c5:
            r8.z0 = r3
        L_0x00c7:
            if (r1 == 0) goto L_0x0136
            boolean r3 = r8.z0
            if (r3 == 0) goto L_0x0136
            java.lang.String r1 = "start show global pip"
            defpackage.udd.p(r2, r1, new java.lang.Object[0])
            r8.i(r4)
            sgc r1 = c()
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = defpackage.o23.f0(r1)
            vgc r1 = (defpackage.vgc) r1
            if (r1 == 0) goto L_0x00f4
            rr3 r1 = r1.a
            if (r1 == 0) goto L_0x00f4
            rr3 r1 = r1.getParentController()
            if (r1 == 0) goto L_0x00f4
            sgc r1 = r1.getRouter()
            goto L_0x00f5
        L_0x00f4:
            r1 = r6
        L_0x00f5:
            if (r1 == 0) goto L_0x0106
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = defpackage.o23.f0(r1)
            vgc r1 = (defpackage.vgc) r1
            if (r1 == 0) goto L_0x0106
            rr3 r1 = r1.a
            goto L_0x0107
        L_0x0106:
            r1 = r6
        L_0x0107:
            boolean r3 = r1 instanceof one.me.sdk.bottomsheet.BottomSheetWidget
            if (r3 == 0) goto L_0x010e
            one.me.sdk.bottomsheet.BottomSheetWidget r1 = (one.me.sdk.bottomsheet.BottomSheetWidget) r1
            goto L_0x010f
        L_0x010e:
            r1 = r6
        L_0x010f:
            if (r1 == 0) goto L_0x0119
            java.lang.String r3 = "hide last bottom sheet dialog before pip mode"
            defpackage.udd.p(r2, r3, new java.lang.Object[0])
            r1.r0(r4)
        L_0x0119:
            sgc r1 = c()
            java.lang.String r2 = ":call-pip"
            rr3 r1 = r1.g(r2)
            if (r1 != 0) goto L_0x012e
            sr7 r1 = defpackage.sr7.c
            d34 r1 = r1.P1()
            r1.b(r2, r6)
        L_0x012e:
            android.app.PictureInPictureParams r8 = r8.d()
            r0.enterPictureInPictureMode(r8)
            goto L_0x015f
        L_0x0136:
            boolean r8 = r8.z0
            ep1 r7 = (defpackage.ep1) r7
            boolean r0 = r7.q()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "can't show global pip isMainTask="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " isPipAvailable="
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = " isCallAvailable="
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            defpackage.udd.T(r2, r8, new java.lang.Object[0])
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w71.h():void");
    }

    public final void i(boolean z) {
        Activity activity = this.Z;
        if (activity != null) {
            if (z) {
                this.y0 = activity.getWindow().getDecorView().getBackground();
                activity.getWindow().setBackgroundDrawable((ColorDrawable) this.x0.getValue());
                return;
            }
            activity.getWindow().setBackgroundDrawable(this.y0);
        }
    }

    public final void j() {
        Activity activity = this.Z;
        if (activity != null) {
            vgc vgc = (vgc) o23.f0(c().e());
            hoc hoc = null;
            boolean z = (vgc != null ? vgc.a : null) instanceof dk9;
            vgc vgc2 = (vgc) o23.f0(c().e());
            hoc hoc2 = vgc2 != null ? vgc2.a : null;
            if (hoc2 instanceof hoc) {
                hoc = hoc2;
            }
            boolean z2 = hoc != null && hoc.O();
            if (z) {
                kjd.l(activity, true);
                kjd.k(activity, true);
            } else if (!z && !b() && !z2) {
                kjd.l(activity, false);
                kjd.k(activity, false);
            } else if (b()) {
                kjd.l(activity, true);
                kjd.k(activity, false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [i26, l5e] */
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        w71.super.onDestroyed(conversationDestroyedInfo);
        this.C0.f(false);
        ConversationEndReason reason = conversationDestroyedInfo.getReason();
        if ((reason instanceof ConversationEndReason.Hangup) || (reason instanceof ConversationEndReason.EndedForAll)) {
            Object unused = xs7.M(bw4.a, new l5e(2, (Continuation) null));
        }
    }

    public final void onParticipantsChanged(List list) {
        Activity activity = this.Z;
        if (activity != null) {
            if (activity != null ? activity.isInPictureInPictureMode() : false) {
                activity.setPictureInPictureParams(d());
            }
        }
    }
}
