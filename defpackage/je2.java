package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;

/* renamed from: je2  reason: default package */
public final /* synthetic */ class je2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ je2(long j, int i) {
        this.a = i;
        this.b = j;
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    public final Object invoke(Object obj) {
        StackTraceElement[] stackTrace;
        jue jue = jue.a;
        boolean z = false;
        long j = this.b;
        switch (this.a) {
            case 0:
                y52 y52 = (y52) obj;
                b62 b62 = y52.r;
                if (b62 == null) {
                    b62 = b62.g;
                }
                a62 a2 = b62.a();
                a2.c = j;
                y52.r = a2.a();
                return jue;
            case 1:
                return Long.valueOf(j);
            case 2:
                if (((i22) obj).b.a == j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                Context context = (Context) obj;
                int i = ActProfilePhoto.c1;
                i22 i22 = (i22) ((aw2) ((bv2) ((k93) vl.o.c.getValue()).getAccessor().c(bv2.class))).m(j).a.getValue();
                if (i22 != null) {
                    fj0 fj0 = fj0.c;
                    ej0 ej0 = ej0.a;
                    o62 o62 = i22.b;
                    o62.b(fj0, ej0);
                    String str = o62.i;
                    boolean p = r1g.p(str);
                    ej0 ej02 = ej0.b;
                    fj0 fj02 = fj0.X;
                    if (!p) {
                        vx3.t(str, fj02, ej02);
                    }
                    fj0 fj03 = fj0.a;
                    lg7 c = hwf.c();
                    zcc it = new nv7(ij0.a).iterator();
                    while (true) {
                        ListIterator listIterator = it.b;
                        if (listIterator.hasPrevious()) {
                            fj0 fj04 = (fj0) listIterator.previous();
                            if (fj04.compareTo(fj03) >= 0 && fj04.compareTo(fj02) <= 0) {
                                String f = i22.f(fj04, ej02);
                                if (f != null) {
                                    c.add(f);
                                }
                                String f2 = i22.f(fj04, ej0);
                                if (f2 != null) {
                                    c.add(f2);
                                }
                            }
                        } else {
                            i6 i6Var = new i6(hwf.a(c), i22.p());
                            Intent intent = new Intent(context, ActProfilePhoto.class);
                            intent.putExtra("ru.ok.tamtam.extra.PHOTO_HOLDER", i6Var);
                            context.startActivity(intent);
                        }
                    }
                }
                return jue;
            case 4:
                Context context2 = (Context) obj;
                int i2 = ActContactAvatars.l1;
                Intent intent2 = new Intent(context2, ActContactAvatars.class);
                intent2.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
                context2.startActivity(intent2);
                return jue;
            case 5:
                return Boolean.valueOf(hhd.f(hhd.E((RLottieImageView) obj, xqb.tag_reaction_effects_view), Long.valueOf(j)));
            case 6:
                if (((zta) obj).a == j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                pef pef = (pef) obj;
                int i3 = ThreadExecutorStuckException.a;
                StringBuilder sb = new StringBuilder("WatchdogTask(\n\tsubmitThread='");
                sb.append(pef.a);
                sb.append("',\n\trunningThread='");
                String str2 = null;
                Thread thread = pef.d;
                String name = thread != null ? thread.getName() : null;
                if (name == null) {
                    name = "";
                }
                sb.append(name);
                long b2 = pef.b(j);
                int i4 = zp4.o;
                if (zp4.c(b2, mt0.P(0, eq4.b)) > 0) {
                    sb.append("',\n\texecutionTime=");
                    sb.append(zp4.e(b2));
                }
                long j2 = pef.c;
                long j3 = pef.b;
                if (!zp4.d(j2, j3)) {
                    j = j2;
                }
                long e = zp4.e(zp4.g(j, j3));
                if (e > 0) {
                    sb.append(",\n\tqueueTime=");
                    sb.append(e);
                }
                if (thread != Thread.currentThread()) {
                    sb.append(",\n\tstate=" + (thread != null ? thread.getState() : null));
                    sb.append(",\n\tlocked_stacktrace=\n");
                    if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (!p0e.Q(stackTraceElement.getClassName(), "java.util.concurrent", false) && !p0e.Q(stackTraceElement.getClassName(), "kotlinx.coroutines", false)) {
                                arrayList.add(stackTraceElement);
                            }
                        }
                        str2 = o23.c0(o23.n0(arrayList, 3), "\n\t\t\t", "\t\t", (String) null, (u16) null, 60);
                    }
                    sb.append(str2);
                }
                List list = pef.e;
                if (!list.isEmpty()) {
                    sb.append("\n\tsubmit_stacktrace=\n\t");
                    sb.append(o23.c0(o23.n0(list, 5), "\n\t\t", (String) null, (String) null, (u16) null, 62));
                }
                sb.append("\n)");
                return sb.toString();
        }
    }
}
