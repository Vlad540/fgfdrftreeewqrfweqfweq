package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.io.File;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: xq  reason: default package */
public final /* synthetic */ class xq implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;

    public /* synthetic */ xq() {
        this.a = 23;
        this.b = mqc.l;
    }

    public final Object invoke() {
        Object obj;
        switch (this.a) {
            case 0:
                return new aj7(this.b);
            case 1:
                return n1g.a(((pae) this.b.getValue()).e());
            case 2:
                return ((pae) this.b.getValue()).a().limitedParallelism(1, "call_chat_observing");
            case 3:
                return udd.C((Context) this.b.getValue());
            case 4:
                return ((o7a) this.b.getValue()).j(true);
            case 5:
                return ((Context) this.b.getValue()).getString(dtb.call_notification_name_temp);
            case 6:
                return ((Context) this.b.getValue()).getString(dtb.call_notification_incoming_call);
            case 7:
                return ((Context) this.b.getValue()).getString(dtb.call_notification_incoming_video_call);
            case 8:
                return ((Context) this.b.getValue()).getString(dtb.call_notification_active_call);
            case 9:
                return ((pae) this.b.getValue()).b();
            case 10:
                return ((c9a) this.b.getValue()).m().M();
            case 11:
                return Boolean.valueOf(((hb2) this.b.getValue()).d());
            case 12:
                return ((pae) this.b.getValue()).b();
            case 13:
                return ((xr0) this.b.getValue()).a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            case 14:
                pw9 a2 = ((qw9) this.b.getValue()).a();
                a2.f = false;
                return new qw9(a2);
            case 15:
                ((xzc) this.b.getValue()).getClass();
                return pyb.c;
            case 16:
                vqc vqc = (xzc) this.b.getValue();
                vqc.getClass();
                int i = 40;
                int o = (int) vqc.o(PmsKey.msg-get-reactions-page-size, (long) 40);
                if (o > 0) {
                    i = o;
                }
                return Integer.valueOf(i);
            case 17:
                return new pd0(this.b);
            case 18:
                return new pd0(this.b);
            case 19:
                vqc vqc2 = (xzc) this.b.getValue();
                vqc2.getClass();
                List<Integer> n = vqc2.n(PmsKey.analytics-permissions, Collections.emptyList());
                EnumSet<E> noneOf = EnumSet.noneOf(fn7.class);
                for (Integer intValue : n) {
                    lk9 lk9 = fn7.a;
                    int intValue2 = intValue.intValue();
                    lk9.getClass();
                    Iterator it = fn7.o.iterator();
                    while (true) {
                        u1 u1Var = (u1) it;
                        if (u1Var.hasNext()) {
                            obj = u1Var.next();
                            ((fn7) obj).getClass();
                            if (10 == intValue2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fn7 fn7 = (fn7) obj;
                    if (fn7 != null) {
                        noneOf.add(fn7);
                    }
                }
                return noneOf;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return ((x4a) this.b.getValue()).b();
            case 21:
                return new dy(new File(((bf5) this.b.getValue()).c(), "chats_v2"), (r34) null);
            case 22:
                return new dy(new File(((bf5) this.b.getValue()).c(), "folders_v1"), (r34) null);
            case 23:
                return new pd0(this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return (SensorManager) ((Context) this.b.getValue()).getSystemService("sensor");
            case 25:
                return (PowerManager) ((Context) this.b.getValue()).getSystemService("power");
            case 26:
                return ((mbe) this.b.getValue()).a();
            case 27:
                return (ScheduledExecutorService) ((x4a) this.b.getValue()).l.getValue();
            case 28:
                return (ScheduledExecutorService) ((x4a) this.b.getValue()).l.getValue();
            default:
                x4a x4a = (x4a) this.b.getValue();
                return x4a.h(x4a.e(1, "ONEME_FB_BLOCK", Runtime.getRuntime().availableProcessors(), 1), "ONEME_FB_BLOCK");
        }
    }

    public /* synthetic */ xq(int i, t97 t97) {
        this.a = i;
        this.b = t97;
    }
}
