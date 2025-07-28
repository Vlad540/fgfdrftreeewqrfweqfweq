package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

/* renamed from: qc7  reason: default package */
public abstract class qc7 extends Service implements nc7 {
    public final it4 a;

    /* JADX WARNING: type inference failed for: r0v0, types: [it4, java.lang.Object] */
    public qc7() {
        ? obj = new Object();
        obj.a = new pc7(this);
        obj.b = new Handler();
        this.a = obj;
    }

    public final pc7 R() {
        return (pc7) this.a.a;
    }

    public final IBinder onBind(Intent intent) {
        this.a.t(nb7.ON_START);
        return null;
    }

    public void onCreate() {
        this.a.t(nb7.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        nb7 nb7 = nb7.ON_STOP;
        it4 it4 = this.a;
        it4.t(nb7);
        it4.t(nb7.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        this.a.t(nb7.ON_START);
        super.onStart(intent, i);
    }
}
