package defpackage;

import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;

/* renamed from: m38  reason: default package */
public final /* synthetic */ class m38 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaConnectionManagerImpl b;

    public /* synthetic */ m38(MediaConnectionManagerImpl mediaConnectionManagerImpl, int i) {
        this.a = i;
        this.b = mediaConnectionManagerImpl;
    }

    public final void run() {
        int i = this.a;
        MediaConnectionManagerImpl mediaConnectionManagerImpl = this.b;
        switch (i) {
            case 0:
                MediaConnectionManagerImpl.disconnectRunnable$lambda$0(mediaConnectionManagerImpl);
                return;
            default:
                MediaConnectionManagerImpl.noDataRunnable$lambda$1(mediaConnectionManagerImpl);
                return;
        }
    }
}
