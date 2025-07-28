package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Executor;

public final class x {
    protected w a;
    boolean b = false;

    public interface c {
        void a();

        void a(String str);
    }

    public w a(Context context) {
        if (this.b) {
            return this.a;
        }
        p0 a2 = p0.a(context);
        String h = a2.h();
        if (!TextUtils.isEmpty(h)) {
            y0.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + h);
        }
        if (!b.a) {
            y0.a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + h + "'");
            w wVar = new w(h);
            this.a = wVar;
            return wVar;
        }
        b.a(context, (c) new a(a2));
        this.b = true;
        return this.a;
    }

    public class a implements c {
        final /* synthetic */ p0 a;

        public a(p0 p0Var) {
            this.a = p0Var;
        }

        public void a(String str) {
            x.this.a = new w(str);
            this.a.j(str);
            y0.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + x.this.a.a);
        }

        public void a() {
            y0.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }
    }

    public static final class b {
        public static final boolean a;

        static {
            boolean z;
            try {
                z = FirebaseAnalytics.class.equals(Class.forName("com.google.firebase.analytics.FirebaseAnalytics"));
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    y0.a("FirebaseHelper: FirebaseAnalytics is not found");
                } else {
                    y0.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                }
                z = false;
            }
            a = z;
        }

        public static void a(Context context, c cVar) {
            Executor a2 = h.a();
            if (a2 == null) {
                y0.b("FirebaseHelper: background executor is not found");
                cVar.a();
                return;
            }
            try {
                y0.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().b(a2, new xle(23, cVar));
            } catch (Throwable th) {
                y0.a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (!task.g() || !task.h()) {
                cVar.a();
            } else {
                cVar.a((String) task.f());
            }
        }
    }
}
