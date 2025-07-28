package defpackage;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* renamed from: l60  reason: default package */
public final class l60 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final Object g;

    public l60(AudioTrack audioTrack, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.g = new k60(audioTrack);
                a();
                return;
            default:
                if (mze.a >= 19) {
                    this.g = new j60(audioTrack);
                    a();
                    return;
                }
                this.g = null;
                b(3);
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                if (((j60) this.g) != null) {
                    b(0);
                    return;
                }
                return;
            default:
                if (((k60) this.g) != null) {
                    b(0);
                    return;
                }
                return;
        }
    }

    public final void b(int i) {
        switch (this.a) {
            case 0:
                this.b = i;
                if (i == 0) {
                    this.e = 0;
                    this.f = -1;
                    this.c = System.nanoTime() / 1000;
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 1) {
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 2 || i == 3) {
                    this.d = 10000000;
                    return;
                } else if (i == 4) {
                    this.d = 500000;
                    return;
                } else {
                    throw new IllegalStateException();
                }
            default:
                this.b = i;
                if (i == 0) {
                    this.e = 0;
                    this.f = -1;
                    this.c = System.nanoTime() / 1000;
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 1) {
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                } else if (i == 2 || i == 3) {
                    this.d = 10000000;
                    return;
                } else if (i == 4) {
                    this.d = 500000;
                    return;
                } else {
                    throw new IllegalStateException();
                }
        }
    }
}
