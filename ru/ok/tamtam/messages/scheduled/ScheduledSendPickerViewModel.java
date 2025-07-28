package ru.ok.tamtam.messages.scheduled;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Ls04;", "Landroid/app/Application;", "app", "Ltkc;", "savedStateHandle", "<init>", "(Landroid/app/Application;Ltkc;)V", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class ScheduledSendPickerViewModel extends AndroidViewModel implements s04 {
    public static final /* synthetic */ k77[] p;
    public final grd c;
    public final t0c d;
    public final grd e;
    public final t0c f;
    public final r7e g;
    public final r7e h = new r7e(new vfc(2));
    public final r7e i = new r7e(new vfc(3));
    public final r7e j = new r7e(new u5b(17, this));
    public final grd k;
    public final t0c l;
    public final grd m;
    public final t0c n;
    public final lmc o;

    static {
        Class<ScheduledSendPickerViewModel> cls = ScheduledSendPickerViewModel.class;
        p = new k77[]{new hc9(cls, "sendWithNotification", "getSendWithNotification()Z"), c3d.g(m7c.a, cls, "allowWorkHours", "getAllowWorkHours()Z")};
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [lmc, u2] */
    public ScheduledSendPickerViewModel(Application application, tkc tkc) {
        super(application);
        grd a = hrd.a((Object) null);
        this.c = a;
        this.d = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.e = a2;
        this.f = new t0c(a2);
        this.g = new r7e(new u5b(16, application));
        xs7.E(am7.r(this), oi4.a, (ru3) null, new jmc(tkc, this, (Continuation) null), 2);
        Boolean bool = Boolean.TRUE;
        grd a3 = hrd.a(bool);
        this.k = a3;
        this.l = new t0c(a3);
        grd a4 = hrd.a((Object) null);
        this.m = a4;
        this.n = new t0c(a4);
        this.o = new u2(9, (Object) bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r4 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.vlc e(ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel r13) {
        /*
            r13.getClass()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            android.app.Application r1 = r13.b
            android.content.res.Resources r1 = r1.getResources()
            int r2 = defpackage.cmb.small_time_offset
            boolean r1 = r1.getBoolean(r2)
            r2 = 12
            if (r1 == 0) goto L_0x002b
            r1 = 13
            int r1 = r0.get(r1)
            r3 = 35
            if (r1 <= r3) goto L_0x0026
            r1 = 2
            r0.add(r2, r1)
            goto L_0x002f
        L_0x0026:
            r1 = 1
            r0.add(r2, r1)
            goto L_0x002f
        L_0x002b:
            r1 = 5
            r0.add(r2, r1)
        L_0x002f:
            r1 = 11
            int r1 = r0.get(r1)
            grd r3 = r13.e
            java.lang.Object r4 = r3.getValue()
            k04 r4 = (defpackage.k04) r4
            r5 = 0
            if (r4 == 0) goto L_0x0047
            zie r4 = r4.b
            if (r4 == 0) goto L_0x0047
            int r4 = r4.a
            goto L_0x0048
        L_0x0047:
            r4 = r5
        L_0x0048:
            if (r4 < r1) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r4 = r1
        L_0x004c:
            java.util.ArrayList r8 = z3d.C(r1)
            java.util.Iterator r6 = r8.iterator()
            r7 = r5
        L_0x0055:
            boolean r9 = r6.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x006b
            java.lang.Object r9 = r6.next()
            zie r9 = (defpackage.zie) r9
            int r9 = r9.a
            if (r9 != r4) goto L_0x0068
            r11 = r7
            goto L_0x006c
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x0055
        L_0x006b:
            r11 = r10
        L_0x006c:
            int r0 = r0.get(r2)
            java.lang.Object r2 = r3.getValue()
            k04 r2 = (defpackage.k04) r2
            if (r2 == 0) goto L_0x007f
            zie r2 = r2.c
            if (r2 == 0) goto L_0x007f
            int r2 = r2.a
            goto L_0x0080
        L_0x007f:
            r2 = r5
        L_0x0080:
            if (r4 == r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r0
        L_0x0084:
            if (r4 == r1) goto L_0x0087
            r0 = r5
        L_0x0087:
            java.util.ArrayList r9 = z3d.G(r0)
            java.util.Iterator r0 = r9.iterator()
        L_0x008f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            zie r1 = (defpackage.zie) r1
            int r1 = r1.a
            if (r1 != r2) goto L_0x00a1
            r12 = r5
            goto L_0x00a5
        L_0x00a1:
            int r5 = r5 + 1
            goto L_0x008f
        L_0x00a4:
            r12 = r10
        L_0x00a5:
            vlc r0 = new vlc
            r7e r13 = r13.j
            java.lang.Object r13 = r13.getValue()
            r7 = r13
            java.util.List r7 = (java.util.List) r7
            r10 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel.e(ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel):vlc");
    }

    public final void f() {
        v04 v04;
        zie zie;
        zie zie2;
        grd grd = this.e;
        k04 k04 = (k04) grd.getValue();
        if (k04 != null && (v04 = k04.a) != null) {
            Integer num = null;
            if (p0e.M(v04.X, this.b.getString(whc.u), true)) {
                xs7.E(am7.r(this), oi4.a, (ru3) null, new kmc(this, (Continuation) null), 2);
                return;
            }
            k04 k042 = (k04) grd.getValue();
            v04 v042 = k042 != null ? k042.a : null;
            r7e r7e = this.j;
            int i2 = 0;
            if (v042 != null) {
                int indexOf = ((List) r7e.getValue()).indexOf(v042);
                Integer valueOf = Integer.valueOf(indexOf);
                if (indexOf >= 0) {
                    num = valueOf;
                }
            } else {
                num = 0;
            }
            k04 k043 = (k04) grd.getValue();
            int i3 = (k043 == null || (zie2 = k043.b) == null) ? 0 : zie2.a;
            k04 k044 = (k04) grd.getValue();
            int i4 = (k044 == null || (zie = k044.c) == null) ? 0 : zie.a;
            List list = (List) r7e.getValue();
            List list2 = (List) this.h.getValue();
            List list3 = (List) this.i.getValue();
            if (num != null) {
                i2 = num.intValue();
            }
            g(new vlc(list, list2, list3, i2, i3, i4));
        }
    }

    public final void g(vlc vlc) {
        udd.p("ScheduledSendPickerViewModel", "setData %s", new Object[]{vlc});
        this.c.m((Object) null, vlc);
        this.e.m((Object) null, new k04((v04) vlc.a.get(vlc.d), (zie) vlc.b.get(vlc.e), (zie) vlc.c.get(vlc.f)));
        h();
    }

    public final boolean h() {
        udd.q("ScheduledSendPickerViewModel", "validateSelectedTime");
        k04 k04 = (k04) this.e.getValue();
        boolean z = false;
        if (k04 == null) {
            return false;
        }
        if (System.currentTimeMillis() < k04.b()) {
            z = true;
        }
        udd.q("ScheduledSendPickerViewModel", "validateSelectedTime: " + z);
        this.k.m((Object) null, Boolean.valueOf(z));
        return z;
    }
}
