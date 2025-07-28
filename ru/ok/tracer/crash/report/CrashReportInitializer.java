package ru.ok.tracer.crash.report;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/crash/report/CrashReportInitializer;", "Lsw6;", "Lsne;", "<init>", "()V", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1})
public final class CrashReportInitializer implements sw6 {
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [oa2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, j3d] */
    /* JADX WARNING: type inference failed for: r12v10, types: [kv2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v12, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public final Object b(Context context) {
        nne nne = nne.a;
        Object obj = nne.c().get(gwf.a);
        ov3 ov3 = obj instanceof ov3 ? (ov3) obj : null;
        ov3 ov32 = ov3 == null ? new ov3(new g02(9)) : ov3;
        if (ov32.a) {
            doe.b(context);
        }
        i3d i3d = nne.e;
        i3d i3d2 = i3d != null ? i3d : null;
        u9e u9e = nne.f;
        u9e u9e2 = u9e != null ? u9e : null;
        mv4 mv4 = new mv4(1, context);
        yn7 yn7 = new yn7(context);
        ? obj2 = new Object();
        ? obj3 = new Object();
        ik ikVar = new ik(context, ov32.c);
        ? obj4 = new Object();
        obj4.a = mv4;
        obj4.b = i3d2;
        obj4.c = u9e2;
        obj4.o = yn7;
        obj4.X = obj3;
        obj4.Y = obj2;
        obj4.Z = new AtomicInteger();
        sne.b = obj4;
        koe.b(new rne(ov32, context, i3d2, u9e2, yn7, mv4, ikVar, obj3, obj2));
        x87.z0(new Object());
        return sne.a;
    }
}
