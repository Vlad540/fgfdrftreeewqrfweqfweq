package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: wte  reason: default package */
public final class wte extends fh0 {
    public boolean A0;
    public int B0;
    public final int X = 8000;
    public final byte[] Y;
    public final DatagramPacket Z;
    public Uri w0;
    public DatagramSocket x0;
    public MulticastSocket y0;
    public InetAddress z0;

    public wte() {
        super(true);
        byte[] bArr = new byte[2000];
        this.Y = bArr;
        this.Z = new DatagramPacket(bArr, 0, 2000);
    }

    public final long G(yz3 yz3) {
        Uri uri = yz3.a;
        this.w0 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.w0.getPort();
        d();
        try {
            this.z0 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.z0, port);
            if (this.z0.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.y0 = multicastSocket;
                multicastSocket.joinGroup(this.z0);
                this.x0 = this.y0;
            } else {
                this.x0 = new DatagramSocket(inetSocketAddress);
            }
            this.x0.setSoTimeout(this.X);
            this.A0 = true;
            e(yz3);
            return -1;
        } catch (SecurityException e) {
            throw new DataSourceException((Throwable) e, 2006);
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, 2001);
        }
    }

    public final void close() {
        this.w0 = null;
        MulticastSocket multicastSocket = this.y0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.z0;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.y0 = null;
        }
        DatagramSocket datagramSocket = this.x0;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.x0 = null;
        }
        this.z0 = null;
        this.B0 = 0;
        if (this.A0) {
            this.A0 = false;
            c();
        }
    }

    public final Uri getUri() {
        return this.w0;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.B0;
        DatagramPacket datagramPacket = this.Z;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.x0;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.B0 = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new DataSourceException((Throwable) e, 2002);
            } catch (IOException e2) {
                throw new DataSourceException((Throwable) e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.B0;
        int min = Math.min(i4, i2);
        System.arraycopy(this.Y, length2 - i4, bArr, i, min);
        this.B0 -= min;
        return min;
    }
}
