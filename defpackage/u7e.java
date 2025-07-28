package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: u7e  reason: default package */
public final class u7e implements Runnable {
    public final /* synthetic */ int a;
    public final w7e b;

    public /* synthetic */ u7e(w7e w7e, int i) {
        this.a = i;
        this.b = w7e;
    }

    public final void run() {
        m30 m30;
        u7e u7e;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                synchronized (this.b.Z) {
                    w7e w7e = this.b;
                    w7e.w0 = (Intent) w7e.Z.get(0);
                }
                Intent intent = this.b.w0;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.b.w0.getIntExtra("KEY_START_ID", 0);
                    a24 B = a24.B();
                    String str = w7e.y0;
                    B.t(str, "Processing command " + this.b.w0 + ", " + intExtra);
                    PowerManager.WakeLock a2 = lef.a(this.b.a, action + " (" + intExtra + ")");
                    try {
                        a24.B().t(str, "Acquiring operation wake lock (" + action + ") " + a2);
                        a2.acquire();
                        w7e w7e2 = this.b;
                        w7e2.Y.a(w7e2.w0, intExtra, w7e2);
                        a24.B().t(str, "Releasing operation wake lock (" + action + ") " + a2);
                        a2.release();
                        w7e w7e3 = this.b;
                        m30 = (m30) ((duf) w7e3.b).c;
                        u7e = new u7e(w7e3, 1);
                    } catch (Throwable th) {
                        a24.B().t(w7e.y0, "Releasing operation wake lock (" + action + ") " + a2);
                        a2.release();
                        w7e w7e4 = this.b;
                        ((m30) ((duf) w7e4.b).c).execute(new u7e(w7e4, 1));
                        throw th;
                    }
                    m30.execute(u7e);
                    return;
                }
                return;
            default:
                w7e w7e5 = this.b;
                w7e5.getClass();
                a24 B2 = a24.B();
                String str2 = w7e.y0;
                B2.t(str2, "Checking if commands are complete.");
                w7e.c();
                synchronized (w7e5.Z) {
                    try {
                        if (w7e5.w0 != null) {
                            a24.B().t(str2, "Removing command " + w7e5.w0);
                            if (((Intent) w7e5.Z.remove(0)).equals(w7e5.w0)) {
                                w7e5.w0 = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        qm qmVar = (qm) ((duf) w7e5.b).a;
                        u33 u33 = w7e5.Y;
                        synchronized (u33.c) {
                            z = !u33.b.isEmpty();
                        }
                        if (!z) {
                            if (w7e5.Z.isEmpty()) {
                                synchronized (qmVar.X) {
                                    z2 = !qmVar.b.isEmpty();
                                }
                                if (!z2) {
                                    a24.B().t(str2, "No more commands & intents.");
                                    v7e v7e = w7e5.x0;
                                    if (v7e != null) {
                                        ((SystemAlarmService) v7e).a();
                                    }
                                }
                            }
                        }
                        if (!w7e5.Z.isEmpty()) {
                            w7e5.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
