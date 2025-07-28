package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: l44  reason: default package */
public final class l44 extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l44(Object obj, ConditionVariable conditionVariable, int i) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = i;
        this.c = obj;
        this.b = conditionVariable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                b54 b54 = (b54) this.c;
                AudioTrack audioTrack = (AudioTrack) this.b;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    return;
                } finally {
                    b54.h.open();
                }
            case 1:
                synchronized (((lgd) this.c)) {
                    ((ConditionVariable) this.b).open();
                    lgd.a((lgd) this.c);
                    ((lgd) this.c).b.getClass();
                }
                return;
            default:
                synchronized (((mgd) this.c)) {
                    ((ConditionVariable) this.b).open();
                    mgd.a((mgd) this.c);
                    ((mgd) this.c).b.getClass();
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l44(b54 b54, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.a = 0;
        this.c = b54;
        this.b = audioTrack;
    }
}
