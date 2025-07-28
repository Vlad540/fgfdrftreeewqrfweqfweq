package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: ej7  reason: default package */
public final class ej7 extends Handler implements Runnable {
    public int X;
    public Thread Y;
    public boolean Z;
    public final /* synthetic */ int a;
    public final int b;
    public final long c;
    public IOException o;
    public volatile boolean w0;
    public final Object x0;
    public Object y0;
    public final /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej7(Object obj, Looper looper, Object obj2, Object obj3, int i, long j, int i2) {
        super(looper);
        this.a = i2;
        this.z0 = obj;
        this.x0 = obj2;
        this.y0 = obj3;
        this.b = i;
        this.c = j;
    }

    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                this.w0 = z;
                this.o = null;
                if (!hasMessages(0)) {
                    synchronized (this) {
                        try {
                            this.Z = true;
                            ((fj7) this.x0).a();
                            Thread thread = this.Y;
                            if (thread != null) {
                                thread.interrupt();
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    this.Z = true;
                    removeMessages(0);
                    if (!z) {
                        sendEmptyMessage(1);
                    }
                }
                if (z) {
                    ((jj7) this.z0).b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    cj7 cj7 = (cj7) this.y0;
                    cj7.getClass();
                    cj7.g((fj7) this.x0, elapsedRealtime, elapsedRealtime - this.c, true);
                    this.y0 = null;
                    return;
                }
                return;
            default:
                this.w0 = z;
                this.o = null;
                if (!hasMessages(1)) {
                    synchronized (this) {
                        try {
                            this.Z = true;
                            ((gj7) this.x0).a();
                            Thread thread2 = this.Y;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                } else {
                    this.Z = true;
                    removeMessages(1);
                    if (!z) {
                        sendEmptyMessage(2);
                    }
                }
                if (z) {
                    ((ul7) this.z0).b = null;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    dj7 dj7 = (dj7) this.y0;
                    dj7.getClass();
                    dj7.x((gj7) this.x0, elapsedRealtime2, elapsedRealtime2 - this.c, true);
                    this.y0 = null;
                    return;
                }
                return;
        }
    }

    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (!this.w0) {
                    int i = message.what;
                    if (i == 0) {
                        this.o = null;
                        jj7 jj7 = (jj7) this.z0;
                        ej7 ej7 = (ej7) jj7.b;
                        ej7.getClass();
                        ((ExecutorService) jj7.a).execute(ej7);
                        return;
                    } else if (i != 3) {
                        ((jj7) this.z0).b = null;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = elapsedRealtime - this.c;
                        cj7 cj7 = (cj7) this.y0;
                        cj7.getClass();
                        if (this.Z) {
                            cj7.g((fj7) this.x0, elapsedRealtime, j, false);
                            return;
                        }
                        int i2 = message.what;
                        boolean z = true;
                        if (i2 == 1) {
                            try {
                                cj7.q((fj7) this.x0, elapsedRealtime, j);
                                return;
                            } catch (RuntimeException e) {
                                oyb.b("Unexpected exception handling load completed", e);
                                ((jj7) this.z0).c = new Loader$UnexpectedLoaderException(e);
                                return;
                            }
                        } else if (i2 == 2) {
                            IOException iOException = (IOException) message.obj;
                            this.o = iOException;
                            int i3 = this.X + 1;
                            this.X = i3;
                            sz0 y = cj7.y((fj7) this.x0, elapsedRealtime, j, iOException, i3);
                            int i4 = y.b;
                            if (i4 == 3) {
                                ((jj7) this.z0).c = this.o;
                                return;
                            } else if (i4 != 2) {
                                if (i4 == 1) {
                                    this.X = 1;
                                }
                                long j2 = y.c;
                                if (j2 == -9223372036854775807L) {
                                    j2 = (long) Math.min((this.X - 1) * 1000, 5000);
                                }
                                jj7 jj72 = (jj7) this.z0;
                                if (((ej7) jj72.b) != null) {
                                    z = false;
                                }
                                swb.h(z);
                                jj72.b = this;
                                if (j2 > 0) {
                                    sendEmptyMessageDelayed(0, j2);
                                    return;
                                }
                                this.o = null;
                                ((ExecutorService) jj72.a).execute(this);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw ((Error) message.obj);
                    }
                } else {
                    return;
                }
            default:
                if (!this.w0) {
                    int i5 = message.what;
                    if (i5 == 1) {
                        this.o = null;
                        ul7 ul7 = (ul7) this.z0;
                        ej7 ej72 = (ej7) ul7.b;
                        ej72.getClass();
                        ((ExecutorService) ul7.a).execute(ej72);
                        return;
                    } else if (i5 != 4) {
                        ((ul7) this.z0).b = null;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        long j3 = elapsedRealtime2 - this.c;
                        dj7 dj7 = (dj7) this.y0;
                        dj7.getClass();
                        if (this.Z) {
                            dj7.x((gj7) this.x0, elapsedRealtime2, j3, false);
                            return;
                        }
                        int i6 = message.what;
                        if (i6 == 2) {
                            try {
                                dj7.E((gj7) this.x0, elapsedRealtime2, j3);
                                return;
                            } catch (RuntimeException e2) {
                                ez3.B("Unexpected exception handling load completed", e2);
                                ((ul7) this.z0).c = new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e2);
                                return;
                            }
                        } else if (i6 == 3) {
                            IOException iOException2 = (IOException) message.obj;
                            this.o = iOException2;
                            int i7 = this.X + 1;
                            this.X = i7;
                            sz0 U = dj7.U((gj7) this.x0, elapsedRealtime2, j3, iOException2, i7);
                            int i8 = U.b;
                            if (i8 == 3) {
                                ((ul7) this.z0).c = this.o;
                                return;
                            } else if (i8 != 2) {
                                if (i8 == 1) {
                                    this.X = 1;
                                }
                                long j4 = U.c;
                                if (j4 == -9223372036854775807L) {
                                    j4 = (long) Math.min((this.X - 1) * 1000, 5000);
                                }
                                ul7 ul72 = (ul7) this.z0;
                                oyb.k(((ej7) ul72.b) == null);
                                ul72.b = this;
                                if (j4 > 0) {
                                    sendEmptyMessageDelayed(1, j4);
                                    return;
                                }
                                this.o = null;
                                ((ExecutorService) ul72.a).execute(this);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw ((Error) message.obj);
                    }
                } else {
                    return;
                }
        }
    }

    public final void run() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                try {
                    synchronized (this) {
                        z = !this.Z;
                        this.Y = Thread.currentThread();
                    }
                    if (z) {
                        String simpleName = ((fj7) this.x0).getClass().getSimpleName();
                        xs7.e(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                        ((fj7) this.x0).load();
                        xs7.l();
                    }
                    synchronized (this) {
                        this.Y = null;
                        Thread.interrupted();
                    }
                    if (!this.w0) {
                        sendEmptyMessage(1);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (!this.w0) {
                        obtainMessage(2, e).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    if (!this.w0) {
                        oyb.b("Unexpected exception loading stream", e2);
                        obtainMessage(2, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
                        return;
                    }
                    return;
                } catch (OutOfMemoryError e3) {
                    if (!this.w0) {
                        oyb.b("OutOfMemory error loading stream", e3);
                        obtainMessage(2, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
                        return;
                    }
                    return;
                } catch (Error e4) {
                    if (!this.w0) {
                        oyb.b("Unexpected error loading stream", e4);
                        obtainMessage(3, e4).sendToTarget();
                    }
                    throw e4;
                } catch (Throwable th) {
                    xs7.l();
                    throw th;
                }
            default:
                try {
                    synchronized (this) {
                        z2 = !this.Z;
                        this.Y = Thread.currentThread();
                    }
                    if (z2) {
                        Trace.beginSection("load:".concat(((gj7) this.x0).getClass().getSimpleName()));
                        ((gj7) this.x0).load();
                        Trace.endSection();
                    }
                    synchronized (this) {
                        this.Y = null;
                        Thread.interrupted();
                    }
                    if (!this.w0) {
                        sendEmptyMessage(2);
                        return;
                    }
                    return;
                } catch (IOException e5) {
                    if (!this.w0) {
                        obtainMessage(3, e5).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    if (!this.w0) {
                        ez3.B("Unexpected exception loading stream", e6);
                        obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e6)).sendToTarget();
                        return;
                    }
                    return;
                } catch (OutOfMemoryError e7) {
                    if (!this.w0) {
                        ez3.B("OutOfMemory error loading stream", e7);
                        obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e7)).sendToTarget();
                        return;
                    }
                    return;
                } catch (Error e8) {
                    if (!this.w0) {
                        ez3.B("Unexpected error loading stream", e8);
                        obtainMessage(4, e8).sendToTarget();
                    }
                    throw e8;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
