package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;

/* renamed from: bx  reason: default package */
public final /* synthetic */ class bx implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Handler.Callback c;

    public /* synthetic */ bx(Object obj, Handler.Callback callback, int i) {
        this.a = i;
        this.b = obj;
        this.c = callback;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                ((dx) this.b).getClass();
                i38 i38 = (i38) this.c;
                i38.getClass();
                if (mze.a < 30) {
                    Handler handler = i38.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
                j38 j38 = (j38) i38.c;
                if (i38 == j38.B2) {
                    if (j == Long.MAX_VALUE) {
                        j38.N1 = true;
                        return;
                    }
                    try {
                        j38.q0(j);
                        j38.y0();
                        j38.P1.f++;
                        j38.x0();
                        j38.a0(j);
                        return;
                    } catch (ExoPlaybackException e) {
                        j38.O1 = e;
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((ex) this.b).getClass();
                i38 i382 = (i38) this.c;
                i382.getClass();
                if (oze.a < 30) {
                    Handler handler2 = i382.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                i382.a(j);
                return;
            case 2:
                ((w4g) this.b).getClass();
                i38 i383 = (i38) this.c;
                i383.getClass();
                if (mze.a < 30) {
                    Handler handler3 = i383.b;
                    handler3.sendMessageAtFrontOfQueue(Message.obtain(handler3, 0, (int) (j >> 32), (int) j));
                    return;
                }
                j38 j382 = (j38) i383.c;
                if (i383 == j382.B2) {
                    if (j == Long.MAX_VALUE) {
                        j382.N1 = true;
                        return;
                    }
                    try {
                        j382.q0(j);
                        j382.y0();
                        j382.P1.f++;
                        j382.x0();
                        j382.a0(j);
                        return;
                    } catch (ExoPlaybackException e2) {
                        j382.O1 = e2;
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((jj7) this.b).getClass();
                i38 i384 = (i38) this.c;
                i384.getClass();
                if (oze.a < 30) {
                    Handler handler4 = i384.b;
                    handler4.sendMessageAtFrontOfQueue(Message.obtain(handler4, 0, (int) (j >> 32), (int) j));
                    return;
                }
                i384.a(j);
                return;
        }
    }
}
