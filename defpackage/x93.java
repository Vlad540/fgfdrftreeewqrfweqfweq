package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.lang.Thread;
import org.json.JSONObject;

/* renamed from: x93  reason: default package */
public final /* synthetic */ class x93 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ x93(int i) {
        this.a = i;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                g15.b(nqc.a.i(), th);
                return;
        }
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause != null && cause != th) {
                th = cause;
            } else {
                return;
            }
        }
        ff6 ff6 = ff6.a;
        if (!nne.b && (context = ff6.c) != null && ff6.b.getAndSet(false)) {
            kd8 kd8 = nne.c;
            if (kd8 == null) {
                kd8 = null;
            }
            String str2 = (String) kd8.c;
            String B = xs7.B();
            if (B.equals(context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(B.replace(':', '-'));
            }
            File file = new File(context.getCacheDir(), str);
            File N = ng5.N(file, "dump-tmp.hprof");
            File N2 = ng5.N(file, "dump-tmp-meta.json");
            try {
                h2g.t(file);
                Debug.dumpHprofData(N.getAbsolutePath());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("buildUuid", str2);
                jSONObject.put("tag", (Object) null);
                ng5.O(N2, jSONObject.toString());
            } catch (Exception unused) {
                ff6.a(N);
                ff6.a(N2);
            }
            File N3 = ng5.N(file, "dump.hprof");
            File N4 = ng5.N(file, "dump-meta.json");
            try {
                if (N3.exists()) {
                    h2g.h(N3);
                }
                if (N4.exists()) {
                    h2g.h(N4);
                }
                h2g.y(N, N3);
                h2g.y(N2, N4);
            } catch (Exception unused2) {
                ff6.a(N3);
                ff6.a(N4);
            }
        }
    }
}
