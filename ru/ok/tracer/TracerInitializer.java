package ru.ok.tracer;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.utils.LoggerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/TracerInitializer;", "Lsw6;", "Lnne;", "<init>", "()V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1})
public final class TracerInitializer implements sw6 {
    public final List a() {
        return Collections.singletonList(LoggerInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, kd8] */
    public final Object b(Context context) {
        boolean z = false;
        nne nne = nne.a;
        if (!nne.g.getAndSet(true)) {
            nne.d = context;
            if (context instanceof ne6) {
                try {
                    List d = nne.d((ne6) context);
                    int S = ju7.S(q23.H(d, 10));
                    if (S < 16) {
                        S = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(S);
                    for (Object next : d) {
                        linkedHashMap.put(((qne) next).a(), next);
                    }
                    nne.j = linkedHashMap;
                } catch (Exception unused) {
                }
            }
            nne nne2 = nne.a;
            Object obj = nne.c().get(xie.a);
            i3d i3d = null;
            cu3 cu3 = obj instanceof cu3 ? (cu3) obj : null;
            if (cu3 == null) {
                cu3 = new cu3(new b2b(13));
            }
            PackageInfo s = n1g.s(context.getPackageManager(), context.getPackageName());
            String str = s.packageName;
            String str2 = s.versionName;
            long longVersionCode = s.getLongVersionCode();
            String A = iu7.A(context, "tracer_mapping_uuid");
            if (A != null) {
                if (A.equals("00000000-0000-0000-0000-000000000000")) {
                    A = null;
                }
                String A2 = iu7.A(context, "tracer_environment");
                ? obj2 = new Object();
                obj2.b = str;
                obj2.a = str2;
                obj2.o = longVersionCode;
                obj2.c = A;
                obj2.X = A2;
                nne.c = obj2;
                xhd.a = new v2b((s16) new mne(context, 0));
                nne.e = new i3d(context);
                nne.f = new u9e(context);
                Map map = cu3.a;
                if (true ^ map.isEmpty()) {
                    u9e u9e = nne.f;
                    if (u9e == null) {
                        u9e = null;
                    }
                    synchronized (u9e.e) {
                        for (Map.Entry entry : map.entrySet()) {
                            z |= bqc.b((String) entry.getKey(), (String) entry.getValue(), u9e.e);
                        }
                    }
                    if (z) {
                        koe.a(new pzb(25, u9e));
                    }
                }
                Application application = (Application) context.getApplicationContext();
                i3d i3d2 = nne.e;
                if (i3d2 != null) {
                    i3d = i3d2;
                }
                application.registerActivityLifecycleCallbacks(new one(i3d));
                return nne.a;
            }
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        throw new IllegalStateException("Tracer already initialized!");
    }
}
