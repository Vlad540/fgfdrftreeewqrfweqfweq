package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ml6  reason: default package */
public final class ml6 extends ax {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ ml6(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    public IOException k(IOException iOException) {
        switch (this.k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.k(iOException);
        }
    }

    public final void l() {
        switch (this.k) {
            case 0:
                ((nl6) this.l).e(9);
                gl6 gl6 = ((nl6) this.l).n;
                synchronized (gl6) {
                    long j = gl6.E0;
                    long j2 = gl6.D0;
                    if (j >= j2) {
                        gl6.D0 = j2 + 1;
                        gl6.F0 = System.nanoTime() + ((long) 1000000000);
                        gl6.x0.c(new el6(wn6.l(new StringBuilder(), gl6.o, " ping"), gl6), 0);
                        return;
                    }
                    return;
                }
            case 1:
                ((y0c) this.l).d();
                return;
            default:
                Socket socket = (Socket) this.l;
                try {
                    socket.close();
                    return;
                } catch (Exception e) {
                    Logger logger = tw9.a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + socket, e);
                    return;
                } catch (AssertionError e2) {
                    Logger logger2 = tw9.a;
                    boolean z = false;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? h0e.R(message, "getsockname failed", false) : false) {
                            z = true;
                        }
                    }
                    if (z) {
                        Logger logger3 = tw9.a;
                        Level level2 = Level.WARNING;
                        logger3.log(level2, "Failed to close timed out socket " + socket, e2);
                        return;
                    }
                    throw e2;
                }
        }
    }

    public void m() {
        if (j()) {
            throw k((IOException) null);
        }
    }
}
