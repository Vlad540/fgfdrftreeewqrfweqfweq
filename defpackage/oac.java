package defpackage;

import android.os.Process;

/* renamed from: oac  reason: default package */
public final class oac extends Thread {
    public final int a;

    public oac(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
