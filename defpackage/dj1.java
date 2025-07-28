package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.calls.impl.service.CallServiceImpl;

/* renamed from: dj1  reason: default package */
public final class dj1 {
    public static final String a(int i) {
        dj1 dj1 = CallServiceImpl.w0;
        if (i == -1) {
            return "manifest";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CallServiceImpl.y0.iterator();
        while (((gt7) it).hasNext()) {
            int intValue = ((Number) ((et7) it).next()).intValue();
            if (!(intValue == -1 || (i & intValue) == 0)) {
                arrayList.add(intValue != -1 ? intValue != 2 ? intValue != 32 ? intValue != 64 ? intValue != 128 ? rf0.f(intValue, "unknown(", ")") : "microphone" : "camera" : "mediaProjection" : "mediaPlayback" : "manifest");
            }
        }
        return o23.c0(arrayList, "|", (String) null, (String) null, (u16) null, 62);
    }

    public static void b(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (Throwable th) {
            String message = th.getMessage();
            udd.s("CallServiceTag", "cant start service... handle exception: " + message, th);
            c().post(new c(context, 16, intent));
        }
    }

    public static Handler c() {
        if (CallServiceImpl.x0 == null) {
            CallServiceImpl.x0 = new Handler(Looper.getMainLooper());
        }
        Handler handler = CallServiceImpl.x0;
        if (handler != null) {
            return handler;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void d(Context context) {
        Intent intent = new Intent(context, CallServiceImpl.class);
        cj1 cj1 = cj1.a;
        b(context, intent.putExtra("ACTION", 3));
    }
}
