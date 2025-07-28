package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;

/* renamed from: js0  reason: default package */
public final /* synthetic */ class js0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls0 b;

    public /* synthetic */ js0(ls0 ls0, int i) {
        this.a = i;
        this.b = ls0;
    }

    public final void run() {
        int i = this.a;
        ls0 ls0 = this.b;
        switch (i) {
            case 0:
                ls0.k.set(false);
                ls0.g.stop();
                synchronized (ls0.e) {
                    ls0.f = null;
                    ls0.c.clear();
                }
                return;
            case 1:
                ls0.getClass();
                try {
                    ls0.g.start();
                    if (!ls0.k.getAndSet(true)) {
                        ls0.c();
                        return;
                    }
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            case 2:
                ls0.c();
                return;
            default:
                ls0.k.set(false);
                ls0.g.release();
                synchronized (ls0.e) {
                    ls0.f = null;
                    ls0.c.clear();
                }
                return;
        }
    }
}
