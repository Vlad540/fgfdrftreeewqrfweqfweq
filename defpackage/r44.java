package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;

/* renamed from: r44  reason: default package */
public final class r44 {
    public final vu5 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final i50[] i;

    public r44(vu5 vu5, int i2, int i3, int i4, int i5, int i6, int i7, int i8, i50[] i50Arr) {
        this.a = vu5;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i50Arr;
    }

    public final AudioTrack a(boolean z, j20 j20, int i2) {
        int i3 = this.c;
        try {
            AudioTrack b2 = b(z, j20, i2);
            int state = b2.getState();
            if (state == 1) {
                return b2;
            }
            try {
                b2.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, this.e, this.f, this.h, this.a, i3 == 1, (RuntimeException) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new AudioSink$InitializationException(0, this.e, this.f, this.h, this.a, i3 == 1, e2);
        }
    }

    public final AudioTrack b(boolean z, j20 j20, int i2) {
        int i3 = mze.a;
        boolean z2 = true;
        int i4 = this.g;
        int i5 = this.f;
        int i6 = this.e;
        if (i3 >= 29) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : j20.a()).setAudioFormat(b54.e(i6, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i2);
            if (this.c != 1) {
                z2 = false;
            }
            return sessionId.setOffloadedPlayback(z2).build();
        } else if (i3 >= 21) {
            return new AudioTrack(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : j20.a(), b54.e(i6, i5, i4), this.h, 1, i2);
        } else {
            int x = mze.x(j20.c);
            if (i2 == 0) {
                return new AudioTrack(x, this.e, this.f, this.g, this.h, 1);
            }
            return new AudioTrack(x, this.e, this.f, this.g, this.h, 1, i2);
        }
    }
}
