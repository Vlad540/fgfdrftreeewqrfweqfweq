package ru.ok.tamtam.android.calls;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/tamtam/android/calls/MediaProjectionService;", "Landroid/app/Service;", "<init>", "()V", "x98", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MediaProjectionService extends Service {
    public static final /* synthetic */ int X = 0;
    public final r7e a = new r7e(new w98(this, 0));
    public final r7e b = new r7e(new w98(this, 1));
    public final x98 c = new Binder();
    public final String o = MediaProjectionService.class.getName();

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final void onCreate() {
        super.onCreate();
        String str = this.o;
        udd.q(str, "onCreate");
        ((rf4) this.a.getValue()).f(str);
        v98 v98 = (v98) ((fp) ((pbe) this.b.getValue())).o.getValue();
        un9 h = ((o7a) v98.b.getValue()).h(v98.a, true, true);
        ep epVar = v98.c;
        epVar.getClass();
        h.f = un9.c(epVar.a.getString(cic.u2));
        startForeground(12, h.b());
    }

    public final void onDestroy() {
        super.onDestroy();
        String str = this.o;
        udd.q(str, "onDestroy");
        ((rf4) this.a.getValue()).g(str);
    }
}
