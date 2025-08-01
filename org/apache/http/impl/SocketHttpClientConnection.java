package org.apache.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.io.SocketInputBuffer;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
public class SocketHttpClientConnection extends AbstractHttpClientConnection implements HttpInetConnection {
    private volatile boolean open;
    private Socket socket = null;

    public void assertNotOpen() {
        if (this.open) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    public void assertOpen() {
        if (!this.open) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    public void bind(Socket socket2, HttpParams httpParams) throws IOException {
        if (socket2 == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (httpParams != null) {
            this.socket = socket2;
            int socketBufferSize = HttpConnectionParams.getSocketBufferSize(httpParams);
            init(createSessionInputBuffer(socket2, socketBufferSize, httpParams), createSessionOutputBuffer(socket2, socketBufferSize, httpParams), httpParams);
            this.open = true;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:6:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r1 = this;
            boolean r0 = r1.open
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1.open = r0
            r1.doFlush()
            java.net.Socket r0 = r1.socket     // Catch:{ IOException -> 0x0010 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            java.net.Socket r0 = r1.socket     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
        L_0x0015:
            java.net.Socket r1 = r1.socket
            r1.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.SocketHttpClientConnection.close():void");
    }

    public SessionInputBuffer createSessionInputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        return new SocketInputBuffer(socket2, i, httpParams);
    }

    public SessionOutputBuffer createSessionOutputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        return new SocketOutputBuffer(socket2, i, httpParams);
    }

    public InetAddress getLocalAddress() {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return socket2.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return socket2.getLocalPort();
        }
        return -1;
    }

    public InetAddress getRemoteAddress() {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return socket2.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return socket2.getPort();
        }
        return -1;
    }

    public Socket getSocket() {
        return this.socket;
    }

    public int getSocketTimeout() {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            try {
                return socket2.getSoTimeout();
            } catch (SocketException unused) {
            }
        }
        return -1;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setSocketTimeout(int i) {
        assertOpen();
        Socket socket2 = this.socket;
        if (socket2 != null) {
            try {
                socket2.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public void shutdown() throws IOException {
        this.open = false;
        Socket socket2 = this.socket;
        if (socket2 != null) {
            socket2.close();
        }
    }
}
